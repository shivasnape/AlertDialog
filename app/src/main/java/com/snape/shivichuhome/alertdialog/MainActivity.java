package com.snape.shivichuhome.alertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText city;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casting
        city = (EditText) findViewById(R.id.editText);
        search = (Button) findViewById(R.id.button);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final android.app.AlertDialog.Builder alertDialog = new android.app.AlertDialog.Builder(MainActivity.this);

                alertDialog.setTitle("Confirm City...");
                alertDialog.setMessage("You Entered " + city.getText().toString());
                alertDialog.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(getApplicationContext(), "You CLicked On NO!!!", Toast.LENGTH_SHORT).show();

                    }
                });


                alertDialog.setPositiveButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "You Clicked On YES!!!", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.show();

            }
        });

    }
}


