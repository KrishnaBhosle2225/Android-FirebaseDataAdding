package com.krishna.firebase_adddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.EnumMap;

public class MainActivity extends AppCompatActivity {

    EditText edtRoll,edtName,edtEmail,edtMobile;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRoll = findViewById(R.id.edtRoll);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtMobile = findViewById(R.id.edtMobile);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Roll = edtRoll.getText().toString().trim();
                String Name = edtName.getText().toString().trim();
                String Email = edtEmail.getText().toString().trim();
                String Mobile = edtMobile.getText().toString().trim();

                DataHolder data = new DataHolder(Name, Email,Mobile);

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("student").push();
                node.child(Roll).setValue(data);

                edtRoll.setText("");
                edtName.setText("");
                edtEmail.setText("");
                edtMobile.setText("");
                Toast.makeText(MainActivity.this, "Data inserted", Toast.LENGTH_SHORT).show();




            }
        });
    }
}