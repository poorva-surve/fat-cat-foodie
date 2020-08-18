package com.android.fcf;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    private RadioGroup type;
    private RadioButton selectedType;
    private EditText feed;
    private RatingBar ratingBar;
    private Button send;

    String to, subject, message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        send=findViewById(R.id.fb_submit);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateFeedback();
            }
        });
    }
    private void generateFeedback() {
        type=findViewById(R.id.fb_type);
        feed=findViewById(R.id.fb_text);
        ratingBar=findViewById(R.id.app_ratings);
        int tp= type.getCheckedRadioButtonId();
        selectedType=findViewById(tp);
        String feedtype=selectedType.getText().toString();
        String feedback=feed.getText().toString();
        float rating=ratingBar.getRating();
        View focusView = null;
        boolean cancel = false;

        feed.setError(null);


        if (TextUtils.isEmpty(feedback)) {
            feed.setError(getString(R.string.error_field_required));
            focusView = feed;
            cancel = true;
        }
        if (cancel) {
            focusView.requestFocus();
        }
        /*else
        {
            DB_FCF fb=new DB_FCF();
            fb.setFb_type(feedtype);
            fb.setFb_msg(feedback);
            fb.setFb_email(email);

            boolean state=helper.insertFeedback(fb);
            if (state) {
                Toast t = Toast.makeText(Feedback.this, "Thank you for your feedback!", Toast.LENGTH_SHORT);
                t.show();
            }
            else
            {
                Toast t = Toast.makeText(Feedback.this, "Sorry, failed to submit your feedback. Please try again after some time.", Toast.LENGTH_SHORT);
                t.show();
            }

        }*/
        else
        {
            to="poorvadsurve@gmail.com";
            subject=feedtype+" regarding Fat Cat Foodie!";
            message=feedback +"\n\nRating : "+rating;
            Intent sendmail = new Intent(Intent.ACTION_SEND);
            sendmail.setData(Uri.parse("mailto:"));
            sendmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
            sendmail.putExtra(Intent.EXTRA_SUBJECT, subject);
            sendmail.putExtra(Intent.EXTRA_TEXT, message);


            //need this to prompts email client only
            sendmail.setType("message/rfc822");

//            startActivity(Intent.createChooser(sendmail, "Choose an Email client :"));
            try {
                startActivityForResult(Intent.createChooser(sendmail, "Send mail..."),0);
                //finish();
                Log.i("Thank you", "");
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(Feedback.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Feedback.this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Feedback.this, Menu.class);
        startActivity(intent);
    }

    private boolean isEmailValid(String email) {
        return (email.contains("@")&& ((email.endsWith(".com"))||(email.endsWith(".co.in"))||(email.endsWith(".in"))));
    }
}
