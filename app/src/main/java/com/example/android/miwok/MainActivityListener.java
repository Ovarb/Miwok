package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static android.support.v4.app.ActivityCompat.startActivity;

public class MainActivityListener implements View.OnClickListener {

    Activity activity;
    Bundle bundle;

    MainActivityListener (Activity activity, Bundle bundle) {
        this.activity = activity;
        this.bundle = bundle;
    }



    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case (R.id.numbers):
                intent = new Intent(activity, NumbersActivity.class);
                break;
            case (R.id.family):
                intent = new Intent(activity, FamilyActivity.class);
                break;
            case (R.id.phrases):
                intent = new Intent(activity, PhrasesActivity.class);
                break;
            case (R.id.colors):
                intent = new Intent(activity, ColorsActivity.class);
                break;
            default:
                intent = null;
                break;
        }
        startActivity(activity, intent, bundle);
    }
}
