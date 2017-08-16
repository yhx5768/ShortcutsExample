package com.myshortcuts.shortcutsexample;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.DataOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String apkRoot="chmod 777 "+getPackageCodePath();
        execCommand(apkRoot);
        String pkgname = MainActivity.this.getString(R.string.package_name);
        PackageManager packageManager = getPackageManager();
        Intent LaunchIntent = packageManager.getLaunchIntentForPackage(pkgname);
        startActivity(LaunchIntent);
        finish();
    }


    public static String execCommand(String command) {
        Process process = null;
        DataOutputStream os = null;
        try {
            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            os.write(command.getBytes());
            os.writeBytes("\n");
            os.writeBytes("exit\n");
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
