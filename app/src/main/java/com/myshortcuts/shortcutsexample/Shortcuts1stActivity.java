package com.myshortcuts.shortcutsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.myshortcuts.shortcutsexample.MainActivity.execCommand;

public class Shortcuts1stActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String command = Shortcuts1stActivity.this.getString(R.string.shell_1st);
        execCommand(command);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
