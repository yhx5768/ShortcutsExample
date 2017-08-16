package com.myshortcuts.shortcutsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.myshortcuts.shortcutsexample.MainActivity.execCommand;

public class Shortcuts2ndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String command = Shortcuts2ndActivity.this.getString(R.string.shell_2nd);
        execCommand(command);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
