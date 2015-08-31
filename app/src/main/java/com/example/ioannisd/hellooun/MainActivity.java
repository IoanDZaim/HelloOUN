package com.example.ioannisd.hellooun;

import com.example.ioannisd.hellooun.Cards.CardAdapter;
import com.example.ioannisd.hellooun.Cards.TeliStaff;
import com.google.android.glass.media.Sounds;
import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

/**
* ****************************************************************************
        * Copyright (C) 2015 Open Universiteit Nederland
        * <p/>
        * This library is free software: you can redistribute it and/or modify
        * it under the terms of the GNU Lesser General Public License as published by
        * the Free Software Foundation, either version 3 of the License, or
        * (at your option) any later version.
        * <p/>
        * This library is distributed in the hope that it will be useful,
        * but WITHOUT ANY WARRANTY; without even the implied warranty of
        * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        * GNU Lesser General Public License for more details.
        * <p/>
        * You should have received a copy of the GNU Lesser General Public License
        * along with this library.  If not, see <http://www.gnu.org/licenses/>.
        * <p/>
        * Contributors: Stefaan Ternier
        * ****************************************************************************
        */
public class MainActivity extends Activity {

    /**
     * {@link CardScrollView} to use as the main content view.
     */
    private CardScrollView mCardScroller;
    static final int TITLE_CARD = 0;
    static final int OUN_LINK = 1;
    static final int OPEN_LINK = 2;

    private View mView;
    private CardScrollAdapter mAdapter;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle bundle) {

        super.onCreate(bundle);

        mAdapter = new CardAdapter(createCards(this));
        mCardScroller = new CardScrollView(this);
        mCardScroller.setAdapter(mAdapter);
        setContentView(mCardScroller);
        setCardScrollerListener();
    } //onCreate
    private List<CardBuilder> createCards(Context context) {
        ArrayList<CardBuilder> cards = new ArrayList<CardBuilder>();
        cards.add(TITLE_CARD, new CardBuilder(context, CardBuilder.Layout.MENU)
                .setText(R.string.CardTitle)
                .setIcon(R.drawable.ic_oun_bw));

        cards.add(OUN_LINK, new CardBuilder(context, CardBuilder.Layout.MENU)
                .setText(R.string.CardTitle2)
                .setIcon(R.drawable.ic_wifi_150));
        cards.add(OPEN_LINK, new CardBuilder(context, CardBuilder.Layout.MENU)
                .setText(R.string.CardTitle3)
                .setIcon(R.drawable.ic_wifi_150));

        return cards;
    }


    private void setCardScrollerListener() {
        mCardScroller.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "Clicked view at position " + position + ", row-id " + id);
                int soundEffect = Sounds.TAP;
                switch (position) {
                    case TITLE_CARD:
                        startActivity(new Intent(MainActivity.this, TeliStaff.class));
                        break;

                    case OUN_LINK:
                        String url = "http://www.ou.nl";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                        break;

                    case OPEN_LINK:
                        String url2 = "https://en.wikipedia.org/wiki/Open_education";
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(url2));
                        startActivity(intent2);
                        break;


                    default:
                        soundEffect = Sounds.ERROR;
                        Log.d(TAG, "Don't show anything");
                }
                // Play sound.
                AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                am.playSoundEffect(soundEffect);
            }
            });
    }
    @Override
    protected void onResume() {
        super.onResume();
        mCardScroller.activate();
    }//onResume

    @Override
    protected void onPause() {
        mCardScroller.deactivate();
        super.onPause();
    }//onPause

    /**
     * Builds a Glass styled "Hello World!" view using the {@link CardBuilder} class.
     */
    private View buildView() {
        CardBuilder card = new CardBuilder(this, CardBuilder.Layout.COLUMNS_FIXED);
        card.addImage(R.drawable.ic_oun);
        card.setText(R.string.CardTitle);
        card.setFootnote(R.string.Footnote);
        return card.getView();
    }

}
