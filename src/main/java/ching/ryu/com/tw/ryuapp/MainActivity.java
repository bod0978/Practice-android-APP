package ching.ryu.com.tw.ryuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sip phone
        ImageButton sphone = (ImageButton)findViewById(R.id.sphone);
        sphone.setOnClickListener ( new Button.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent();
                 intent = getPackageManager().getLaunchIntentForPackage("com.zoiper.android.app");
                 //
                 //intent = getPackageManager().getLaunchIntentForPackage("org.abtollc.videosoftphone");
                 startActivity(intent);


               //  intent  = getPackageManager().getLeanbackLaunchIntentForPackage("com.abtotest.voiptest");
             }
        });

        //video1
        ImageButton video1=(ImageButton)findViewById(R.id.video);
        video1.setOnClickListener (new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent = getPackageManager().getLaunchIntentForPackage("com.rcreations.ipcamviewer");
                startActivity(intent);
            }
        });

        //Line
        ImageButton line = (ImageButton)findViewById(R.id.line);
        line.setOnClickListener( new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //w
                intent = getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                //intent = getPackageManager().getLaunchIntentForPackage("jp.naver.line.android");
                startActivity(intent);
            }
        });

        //billboard
        ImageButton billboard =  (ImageButton)findViewById(R.id.billboard);
        billboard.setOnClickListener ( new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://telecommunications-equipment-supplier-151.business.site/");
                //Uri uri=Uri.parse("https://telecommunications-equipment-supplier-151.business.site/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

    }
}
