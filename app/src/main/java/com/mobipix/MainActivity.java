package com.mobipix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*

Below are types of Components :-
-----------------------------------

Service

Broad cast Receivers

Content providers

intents

 */

public class MainActivity extends AppCompatActivity {
        //extends SingleFragmentActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mCheatButton;
    private TextView mQuestionTextView;
    private static final String KEY_INDEX = "index";
    private final int REQUEST_CODE_CHEAT = 0;
    private boolean mIsCheater;



    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        /*FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }*/

    }

    /*@Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }*/

}


