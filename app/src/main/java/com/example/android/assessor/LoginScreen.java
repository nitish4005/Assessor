package com.example.android.assessor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "nameKey";
    public static final String Password = "passKey";
    SharedPreferences sharedPreferences;
    EditText et1, et2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button1);
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String val = sharedPreferences.getString(Name, null);
        if (val != null) {

            Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
            intent.putExtra("Name", val);
            startActivity(intent);
            finish();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString();
                String pass = et2.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_LONG).show();
                    return;
                }
                if (pass.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG).show();
                    return;
                }

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Name, name);
                editor.putString(Password, pass);
                editor.commit();
                Intent i = new Intent(getApplicationContext(), HomeScreen.class);
                i.putExtra("Name", name);
                startActivity(i);
                finish();
            }
        });
    }
}
