package com.myshortcuts.shortcutsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.myshortcuts.shortcutsexample.MainActivity.execCommand;

public class Shortcuts3rdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String command = Shortcuts3rdActivity.this.getString(R.string.shell_3rd);
        execCommand(command);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
