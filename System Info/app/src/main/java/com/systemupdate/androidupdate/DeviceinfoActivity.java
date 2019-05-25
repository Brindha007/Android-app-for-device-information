package com.systemupdate.androidupdate;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DeviceinfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deviceinfo);


        final TextView textView = (TextView)findViewById(R.id.info_display);

        textView.setText(
                                  "MANUFACTURER : "+Build.MANUFACTURER
                                 +"\nMODEL : "+Build.MODEL
                                 +"\nPRODUCT : "+Build.PRODUCT
                                 +"\nSERIAL : "+Build.SERIAL
                                 +"\nVERSION.INCREMENTAL : "+Build.VERSION.INCREMENTAL
                                 +"\nVERSION.RELEASE : "+Build.VERSION.RELEASE
                                    +"\nVERSION.SDK.NUMBER : "+Build.VERSION.SDK_INT
                                    +"\nBOARD : "+Build.BOARD
                                    +"\nBRAND : "+Build.BRAND
                                    +"\nCPU_ABI : "+Build.CPU_ABI
                                    +"\nDISPLAY : "+Build.DISPLAY
                                    +"\nFINGERPRINT : "+Build.FINGERPRINT
                                    +"\nHARDWARE : "+Build.HARDWARE
                                    +"\nHOST : "+Build.HOST
                                    +"\nID : "+Build.ID
                                    +"\nTAGS : "+Build.TAGS
                                    +"\nTIME : "+Build.TIME
                                    +"\nTYPE : "+Build.TYPE
                                    +"\nUSER : "+Build.USER


        );
            }
    }
