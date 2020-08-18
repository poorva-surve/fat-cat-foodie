package com.android.fcf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.fcf.dummy.TipsNTricksContent;

/**
 * A fragment representing a single Tip detail screen.
 * This fragment is either contained in a {@link TipListActivity}
 * in two-pane mode (on tablets) or a {@link TipDetailActivity}
 * on handsets.
 */
public class TipDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private TipsNTricksContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public TipDetailFragment() {
    }

    String share_content=" ";
    String title,detail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = TipsNTricksContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }

            title=mItem.content;
            detail=mItem.details;
            share_content="\n\n"+title+"\n\n"+detail;
            FloatingActionButton shr = (FloatingActionButton) activity.findViewById(R.id.fab);
            shr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    shr_tip();
                }
            });

        }

    }
    public void shr_tip()
    {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey did you know about this awesome kitchen hack?!\n"+share_content+
                "\n\n You can find many such great tips and recipes on the app- 'Fat Cat Foodie' ;)");
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, "Share via"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tip_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.tip_detail)).setText(mItem.details);
        }

        return rootView;
    }


}
