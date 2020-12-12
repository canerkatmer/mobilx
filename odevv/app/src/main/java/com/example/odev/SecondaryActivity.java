package com.example.odev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondaryActivity extends Activity {
    private TextView textView;
    Button b1;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);
        b1=(Button) findViewById(R.id.button);
        ed1=(EditText) findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("kullanici") &&
                        ed2.getText().toString().equals("123")) {
                    Intent i = new Intent(SecondaryActivity.this, MainActivity.class);
                    i.putExtra("id", ed1.getText().toString());
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Hatalı Kullanıcı adı veya şifre girdiniz", Toast.LENGTH_SHORT).show();
                }
            }
            });
        }
    }