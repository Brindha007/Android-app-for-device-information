package com.systemupdate.androidupdate;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ExitActivity extends AppCompatActivity {


    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
    }
    @Override
    public void onBackPressed()
    {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            builder = new AlertDialog.Builder(ExitActivity.this);
        }
        else
        {
            builder = new AlertDialog.Builder(ExitActivity.this, AlertDialog.BUTTON_NEUTRAL);
        }
        builder.setTitle("Thank You");
        builder.setMessage("Thank You For Using Our Application Please Give Us Your Suggestions and Feedback ");
        builder.setNegativeButton("RATE US",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=ADD YOUR APPS PACKAGE NAME")); // Add package name of your application
                        startActivity(intent);
                        Toast.makeText(ExitActivity.this, "Thank you for your Rating",
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

        builder.show();
    }
}
