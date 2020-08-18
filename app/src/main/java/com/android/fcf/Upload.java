package com.android.fcf;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Upload extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

   // DBMyHelper helper=new DBMyHelper(this);

    DatabaseHelper helper = new DatabaseHelper(this);
    Spinner spin1,spin2;
    String[] preptime={"Less than 20 mins.","30 mins.","45 mins.","1 hour","More than 1 hour"};
    String[] servings={"1\t","2\t","4\t"};
    public static final int IMAGE_GALLERY_REQUEST = 20;
    // UI references.
    private EditText uName,rName,ingred,method;

    TextView addr,agree;
    CheckBox tnc;
    Button submit;
    boolean confirmTnC;

    String to, subject, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addr=(TextView)findViewById( R.id.pic_path);

        spin1=(Spinner) findViewById(R.id.prep_time);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter aa=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,preptime);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spin1.setAdapter(aa);

        spin2=(Spinner) findViewById(R.id.servings);
        spin2.setOnItemSelectedListener(this);
        ArrayAdapter aa2=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,servings);
        aa2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spin2.setAdapter(aa2);

        tnc=(CheckBox)findViewById(R.id.upload_agree) ;
        String tnc_link="I agree to the terms & conditions related to uploading my recipe on Fat Cat Foodie";
        SpannableString ss=new SpannableString(tnc_link);
        ClickableSpan clickableSpan=new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent tnc=new Intent(Upload.this,Terms.class);
                startActivity(tnc);
            }
        };
        ss.setSpan(clickableSpan,15,33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tnc.setText(ss);
        tnc.setMovementMethod(LinkMovementMethod.getInstance());


        uName=(EditText)findViewById(R.id.up_name);
        rName=(EditText)findViewById(R.id.up_recipe_name);
        ingred=(EditText)findViewById(R.id.up_recipe_ingr);
        method=(EditText)findViewById(R.id.up_recipe_method);
        confirmTnC=tnc.isChecked();
        agree=(TextView)findViewById(R.id.upload_agree);

        submit=(Button)findViewById(R.id.upload_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptSubmit();
            }
        });

    }

    public void attemptSubmit() {

        String name= uName.getText().toString();
        String rname = rName.getText().toString();
        String prtime= spin1.getSelectedItem().toString();
        String srv= spin2.getSelectedItem().toString();
        String ingr= ingred.getText().toString();
        String meth= method.getText().toString();


        // Reset errors.
        uName.setError(null);
        rName.setError(null);
        ingred.setError(null);
        method.setError(null);
        tnc.setError(null);
        boolean cancel = false;
        View focusView = null;


        if (TextUtils.isEmpty(rname))
        {
            rName.setError(getString(R.string.error_field_required));
            focusView = rName;
            cancel = true;
        }
        if (TextUtils.isEmpty(ingr))
        {
            ingred.setError(getString(R.string.error_field_required));
            focusView = ingred;
            cancel = true;
        }
        if (TextUtils.isEmpty(meth))
        {
            method.setError(getString(R.string.error_field_required));
            focusView = method;
            cancel = true;
        }

        if (TextUtils.isEmpty(name)) {
            uName.setError(getString(R.string.error_field_required));
            focusView = uName;
            cancel = true;
        }

        if(!tnc.isChecked()){
            agree.setError("You should first agree to the terms and conditions");
            focusView=tnc;
            cancel=true;
        }

        if (cancel) {
            // There was an error; don't attempt submit and focus the first
            // form field with an error.
            focusView.requestFocus();
        }
        /*else
        {
            DB_FCF up=new DB_FCF();
            up.setUp_name(name);
            up.setUp_rec_name(rname);
            up.setUp_time(prtime);
            up.setUp_serv(srv);
            up.setUp_ingr(ingr);
            up.setUp_method(meth);



            boolean state=helper.insertUpload(up);
            if (state) {
                Toast t = Toast.makeText(Upload.this, "Thank you! Your recipe has been received successfully and will be reviewed soon.", Toast.LENGTH_SHORT);
                t.show();
            }
            else
            {
                Toast t = Toast.makeText(Upload.this, "Sorry, failed to submit recipe. Please try after some time.", Toast.LENGTH_SHORT);
                t.show();
            }
        }*/
        else
        {
            to="poorvadsurve@gmail.com";
            subject="My recipe for Fat Cat Foodie!";
            message="NAME: "+name+
                    "\n\nRECIPE NAME: "+rname+
                    "\n\nTIME TO PREPARE: "+prtime+
                    "\n\nSERVINGS: "+srv+
                    "\n\nINGREDIENTS:\n"+ingr+
                    "\n\nDIRECTIONS:\n"+meth+
                    "\n\n" ;
            Intent sendmail = new Intent(Intent.ACTION_SEND);
            sendmail.setData(Uri.parse("mailto:"));
            sendmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
            sendmail.putExtra(Intent.EXTRA_SUBJECT, subject);
            sendmail.putExtra(Intent.EXTRA_TEXT, message);

            //need this to prompts email client only
            sendmail.setType("message/rfc822");

            startActivity(Intent.createChooser(sendmail, "Choose an Email client :"));
        }
        //SAVE UPLOADED RECIPES DIRECTLY TO DATABASE
        /*{
            boolean n = helper.uploadRecipe(rname,ingr,meth,srv,prtime,name);
            if (n){
                Toast.makeText(Upload.this, "Thank you! Your recipe has been recorded!", Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(Upload.this, "Sorry, an error occurred", Toast.LENGTH_LONG).show();
        }*/

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Upload.this, "Thank you for your response!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Upload.this, Menu.class);
        startActivity(intent);
    }

    private boolean isEmailValid(String email) {
        return (email.contains("@")&& ((email.endsWith(".com"))||(email.endsWith(".co.in"))||(email.endsWith(".in"))));
    }

    // YOUTUBE VIDEO: Invoking Image Gallery with Implicit Intent, Android Studio (Brandan Jones)
//    public void onPicClick(View v)
//    {
//        Intent imgPicker=new Intent(Intent.ACTION_PICK);
//        File picGallery= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
//        String picPath=picGallery.getPath();
//        Uri data=Uri.parse(picPath);
//        imgPicker.setDataAndType(data,"image/*");
//        startActivityForResult(imgPicker,IMAGE_GALLERY_REQUEST);
//        String pic=data.getPath();
//        addr.setText(pic);
//
//    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
