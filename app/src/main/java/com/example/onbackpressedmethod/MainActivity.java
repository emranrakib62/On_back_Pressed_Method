package com.example.onbackpressedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button = findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Confirm Exit")
                .setMessage("Do you want to really Exit?")
                .setIcon(R.drawable.emer)
                .setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })

                .setPositiveButton("yes Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finishAndRemoveTask();
                    }
                })
                .show();
    }


    //......................................................................//
    //......................................................................//
}