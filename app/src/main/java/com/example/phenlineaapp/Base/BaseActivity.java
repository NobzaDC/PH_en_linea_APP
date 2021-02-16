package com.example.phenlineaapp.Base;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.phenlineaapp.Views.Activitys.HomeActivity;

public class BaseActivity extends AppCompatActivity {

    public static final String LOG = "log_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void createToast(Context context, String message, int duration){
        Toast.makeText(context, message, duration).show();
    }

    protected void setLog(String message){
        Log.i(LOG, message);
    }

    protected void goToHome(Context context){
        startActivity(new Intent(context, HomeActivity.class));
    }
}