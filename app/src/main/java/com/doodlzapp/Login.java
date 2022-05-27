package com.doodlzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button btnIngreso;
    private EditText editUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editUsuario = findViewById(R.id.editTextUsuario);
        btnIngreso = findViewById(R.id.btnIngresar);

    }
    public void onclickIniciar(View view){
        String usuario = editUsuario.getText().toString();
        if(usuario.equals("edisson")){
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }else if(usuario.equals("danilo")){
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}