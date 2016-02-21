package com.example.crugnola.testalertdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(v ->
            new android.support.v7.app.AlertDialog
                .Builder(MainActivity.this, R.style.AlertDialogLight)
                .setTitle("Title")
                .setMessage(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed pretium auctor magna ut pulvinar. Curabitur "
                        + "consectetur volutpat, sapien nibh rutrum nulla, ut euismod tellus tortor vel mauris. Sed non lectus "
                        + "pretium velit finibus feugiat. Curabitur efficitur lorem congue nisl sodales mollis.")
                .setPositiveButton(android.R.string.ok, null)
                .setNegativeButton(android.R.string.cancel, null)
                .show());
    }
}
