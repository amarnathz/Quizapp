package com.example.android.educationalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class viewFlipper extends AppCompatActivity {
    private ViewFlipper simpleViewFlipper;
    private Button submit;
    private RadioGroup radiogrp,radiogrp1;
    private RadioButton radiobut;
    private LinearLayout lay;
    String ans[]=new String[5];
    public static int count=0,u=1,v=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewflipper);
        simpleViewFlipper = (ViewFlipper) findViewById(R.id.simpleViewFlipper);
        radiogrp=(RadioGroup)findViewById(R.id.radiogrp);
        radiogrp1=(RadioGroup)findViewById(R.id.radiogrp1);
        submit=(Button)findViewById(R.id.submitbutton);
        submit.setVisibility(View.GONE);
    }


    public void nextfunc(View view) {

        simpleViewFlipper.showNext();
    }

    public void prefunc(View view) {
      simpleViewFlipper.showPrevious();
    }

    public void radiofunc(View view) {
        int selectid = radiogrp.getCheckedRadioButtonId();

        radiobut = (RadioButton) findViewById(selectid);


        if (radiobut.getText().equals("Oreo")) {

            if (u == 1) {
                count += 1;
            }
            u++;
        } else {
            if (u > 1) {
                count -= 1;
            }

        }
        ans[0]=radiobut.getText().toString();
    }
    public void radiofunc1(View view) {
        int selectid1=radiogrp1.getCheckedRadioButtonId();

        radiobut= (RadioButton) findViewById(selectid1);

        if(radiobut.getText().equals("View")){
            if(v==1)
            {count+=1;}
            v++;

        }
        else{
            if(u>1){
                count-=1;
            }

    }
    ans[4]=radiobut.getText().toString();
        Button pre = (Button) findViewById(R.id.prebutton);
        Button next= (Button) findViewById(R.id.nextbutton);

        pre.setVisibility(View.GONE);

        next.setVisibility(View.GONE);
        submit.setVisibility(View.VISIBLE);
    }


    public void submitbutton(View view) {
        String s;
        s="Correct Answer :"+count+"/5\t    your Answer\n\n" +
                "1.Oreo               \t  "+ans[0]+"\n2.logcat             \t  " + ans[1] + "\n3.px,dp,sp       \t     " + ans[2] +"\n4.Pancake \t         " +
                "   " + ans[3] + "\n5.View\t                   " + ans[4];
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
count=0;
    }

    public void quesclick2(View view) throws InterruptedException {

        EditText q2 = (EditText) findViewById(R.id.q2);
        String s1;
        s1 = q2.getText().toString();
        q2.setText(s1);


        if (s1.equals("Logcat") || s1.equals("logcat")) {
            Toast.makeText(this, q2.getText(), Toast.LENGTH_SHORT).show();
            count += 1;
            q2.setText("Correct:" + s1);
            q2.setEnabled(false);

        } else {q2.setText("");}  ans[1]=q2.getText().toString();   }

    public void quesclick3(View view) {
        CheckBox c1,c2,c3,c4;
        c1=(CheckBox)findViewById(R.id.ques31);
        c2=(CheckBox)findViewById(R.id.ques32);
        c3=(CheckBox)findViewById(R.id.ques33);
        c4=(CheckBox)findViewById(R.id.ques34);
        ans[2]=" ";
        if(c1.isChecked()==true&&c3.isChecked()==true&&c4.isChecked()==true)
        {
            count+=1;
        }
        if(c1.isChecked()==true){ans[2]+=c1.getText().toString()+" ";}
        if(c2.isChecked()==true){ans[2]+=c2.getText().toString()+" ";}
        if(c3.isChecked()==true){ans[2]+=c3.getText().toString()+" ";}
        if(c4.isChecked()==true){ans[2]+=c4.getText().toString()+" ";}



    }

    public void quesclick4(View view) {
        EditText q2 = (EditText) findViewById(R.id.ques4);
        String s = q2.getText().toString();
        q2.setText(s);

        if (s.equals("Pancake") || s.equals("pancake")) {
            Toast.makeText(this, q2.getText(), Toast.LENGTH_SHORT).show();
            count += 1;
            q2.setText("Correct:" + s);
            q2.setEnabled(false);

        } else
            q2.setText("");

        ans[3]=q2.getText().toString();
    }
}




