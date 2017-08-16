package com.myshortcuts.shortcutsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.myshortcuts.shortcutsexample.MainActivity.execCommand;

public class Shortcuts5thActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String command = Shortcuts5thActivity.this.getString(R.string.shell_5th);
        execCommand(command);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
