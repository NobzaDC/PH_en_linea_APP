package com.example.phenlineaapp.Methods;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.MVP.Interfaces.Methods.MethodCall;

public class Calls extends BaseActivity implements MethodCall {

    private static final int REQUEST_PERMISSION_CALL = 100;
    private final Context context;
    private final Activity activity;

    public Calls(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    @Override
    public void call(String phone) {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startCall(context, phone);
        } else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {

            } else {

            }
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PERMISSION_CALL);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION_CALL) {
            if (permissions.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            } else {
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {

                } else {
                    createToast(context, "Debe habilitar los permisos de forma manual.Debe habilitar los permisos de forma manual.",
                            Toast.LENGTH_LONG);
                }
            }
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void startCall(Context context, String phone) {
        context.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone)));
    }
}
