package com.serverproject.facedetection.testaysnctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsave,btnload;

    ProgressDialog progressDialog;
    String d = "rtc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog=new ProgressDialog(this);

        progressDialog.setMessage("Please Wait");

        btnsave=(Button)findViewById(R.id.btnsave);
        btnload=(Button)findViewById(R.id.btnload);

        btnsave.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {

                                                 mytask mytask = new mytask();
                                                   mytask.execute("");
                                               }
                                           });


        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"load",Toast.LENGTH_SHORT).show();

            }
        });
    }

    //param Interger
    //progress
    //result
    class mytask extends AsyncTask<String,String,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {

            d = params[0];
            for (long i = 0; i < 100001; i++) {
            }

            return d;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(), "save", Toast.LENGTH_SHORT).show();

          //  progressDialog.dismiss();
        }
    }
}
