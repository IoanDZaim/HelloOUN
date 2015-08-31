package com.example.ioannisd.hellooun.Cards;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.example.ioannisd.hellooun.R;
import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ioannis.D on 18-Aug-15.
 */
public final class TeliStaff extends Activity {

    private CardScrollView mCardScroller;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mCardScroller = new CardScrollView(this);
        mCardScroller.setAdapter(new CardAdapter(createCards(this)));
        setContentView(mCardScroller);
    }//onCreate


    private List<CardBuilder> createCards(Context context) {
        ArrayList<CardBuilder> cards = new ArrayList<CardBuilder>();


        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name1)
                        .setSubheading(R.string.SubHeading1)
                        .setIcon(R.drawable.author_angel)
                        .setText(R.string.AuthorText1)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name2)
                        .setSubheading(R.string.SubHeading2)
                        .setIcon(R.drawable.author_christian)
                        .setText(R.string.AuthorText2)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name3)
                        .setSubheading(R.string.SubHeading3)
                        .setIcon(R.drawable.author_dirk)
                        .setText(R.string.AuthorText3)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name17)
                        .setSubheading(R.string.SubHeading17)
                        .setIcon(R.drawable.author_ellen)
                        .setText(R.string.AuthorText17)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name4)
                        .setSubheading(R.string.SubHeading4)
                        .setIcon(R.drawable.author_fleur)
                        .setText(R.string.AuthorText4)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name16)
                        .setSubheading(R.string.SubHeading16)
                        .setIcon(R.drawable.author_guido)
                        .setText(R.string.AuthorText16)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name5)
                        .setSubheading(R.string.SubHeading5)
                        .setIcon(R.drawable.author_hendrik)
                        .setText(R.string.AuthorText5)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name6)
                        .setSubheading(R.string.SubHeading6)
                        .setIcon(R.drawable.author_jan)
                        .setText(R.string.AuthorText6)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name7)
                        .setSubheading(R.string.SubHeading7)
                        .setIcon(R.drawable.author_kamaksi)
                        .setText(R.string.AuthorText7)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name8)
                        .setSubheading(R.string.SubHeading8)
                        .setIcon(R.drawable.author_maarten)
                        .setText(R.string.AuthorText8)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name9)
                        .setSubheading(R.string.SubHeading9)
                        .setIcon(R.drawable.author_marco)
                        .setText(R.string.AuthorText9)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name10)
                        .setSubheading(R.string.SubHeading10)
                        .setIcon(R.drawable.author_marcus)
                        .setText(R.string.AuthorText10)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name11)
                        .setSubheading(R.string.SubHeading11)
                        .setIcon(R.drawable.author_maren)
                        .setText(R.string.AuthorText11)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name12)
                        .setSubheading(R.string.SubHeading12)
                        .setIcon(R.drawable.author_peter)
                        .setText(R.string.AuthorText12)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name13)
                        .setSubheading(R.string.SubHeading13)
                        .setIcon(R.drawable.author_roland)
                        .setText(R.string.AuthorText13)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name14)
                        .setSubheading(R.string.SubHeading14)
                        .setIcon(R.drawable.author_soude)
                        .setText(R.string.AuthorText14)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.AUTHOR)
                        .setHeading(R.string.Name15)
                        .setSubheading(R.string.SubHeading15)
                        .setIcon(R.drawable.author_stefaan)
                        .setText(R.string.AuthorText15)
                        .setFootnote(R.string.Footnote)
                        .setTimestamp(R.string.Timestamp)
        );
        return cards;
    }//card builder class



    @Override
    protected void onResume() {
        super.onResume();
        mCardScroller.activate();
    }

    @Override
    protected void onPause() {
        mCardScroller.deactivate();
        super.onPause();
    }

}//TeliStaff
