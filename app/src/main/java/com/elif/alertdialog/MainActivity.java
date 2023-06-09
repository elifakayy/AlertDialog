package com.elif.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Toast massage", Toast.LENGTH_LONG).show();

    }

    public void alertd(View view) {
        AlertDialog.Builder alert =new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure ?");
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override //hazır metodun üstüne yazıyoruz
            public void onClick(DialogInterface dialog, int which) {
                //kaydetme işlemi yapılacak , pop up mesaj olcak
                Toast.makeText(MainActivity.this,"Saved", Toast.LENGTH_LONG).show();

            }
        });

        alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override //hazır metodun üstüne yazıyoruz
            public void onClick(DialogInterface dialog, int which) {
                //kaydetme işlemi yapılacak , pop up mesaj olcak
                Toast.makeText(MainActivity.this,"Not Saved", Toast.LENGTH_LONG).show();

            }
        });
        alert.show();
    }
}