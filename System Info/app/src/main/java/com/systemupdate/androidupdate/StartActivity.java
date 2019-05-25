package com.systemupdate.androidupdate;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends Activity {

    AlertDialog.Builder builder;
    Button device,info,sys;
    Button share,privacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);



        device = (Button)findViewById(R.id.button1);
        privacy=(Button)findViewById(R.id.privacy);
        info=(Button)findViewById(R.id.button);
        share=(Button) findViewById(R.id.imageButton);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=com.systemupdate.androidupdate";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download our app from below link");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),HomeActivity.class);

                startActivity(i);
            }
        });

        device.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent device=new Intent(getApplicationContext(),DeviceinfoActivity.class);

                startActivity(device);

            }
        });
        sys=(Button)findViewById(R.id.My_btn);
        sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Settings.ACTION_DEVICE_INFO_SETTINGS);
                startActivity(i);
            }
        });
        privacy=(Button)findViewById(R.id.privacy);
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(getApplicationContext(),PrivacyActivity.class);

                startActivity(p);
            }
        });

    }
    public void onBackPressed()
    {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("System and Software(info)");
        builder.setCancelable(false);
        builder.setMessage("Thank You For Using Our Application Please Give Us Your Suggestions and Feedback ");
        builder.setNegativeButton("RATE US",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.systemupdate.androidupdate")); // Add package name of your application
                        startActivity(intent);
                        Toast.makeText(StartActivity.this, "Thank you for your Rating",
                                Toast.LENGTH_SHORT).show();

                    }
                });
        builder.setPositiveButton("QUIT",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        finish();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}