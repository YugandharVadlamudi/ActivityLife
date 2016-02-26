package com.example.kiran.activitylife;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home_screen);
        TextView tv=(TextView)findViewById(R.id.Tv);
        Button btn=(Button)findViewById(R.id.btn);
        String msg="instrutions:" +
                "0. New Instance (Oncreate,onStart,Onresume)\n"
                +"1. back arrow (Onpause,onstop,ondestroy)\n"
                +"2. Finish (Onpause,onstop,ondestroy)\n"
                +"3.  Home(Onpause,onstop)\n"
                +"4. After 3>AppTab> reexcute current app (ORestart,onstart,onresume)\n"
                +"5. Run DDMs > Receive a phone call or sms(onrestart,onstart,onresume\n"
                +"6. enter some data -repeat step 1to 5\n";

        tv.setText(msg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }

}
