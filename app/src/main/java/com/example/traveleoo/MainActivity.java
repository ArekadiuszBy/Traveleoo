package com.example.traveleoo;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttontimer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimer();
            }
        });

        Button buttonmap = (Button) findViewById(R.id.mapsbutton);
        buttonmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaps();
            }
        });

        Button notepad = (Button) findViewById(R.id.notes);
        notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotepad();
            }
        });

    }

    public void helpbutton(View view) {
        String number = "112112112";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent);
    }

    public void openTimer(){
        Intent intent = new Intent(this, Timerr.class);
        startActivity(intent);
    }


    public void openMaps()
    {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openNotepad()
    {
        Intent intent = new Intent(this, Notepad.class);
        startActivity(intent);
    }

    
}
