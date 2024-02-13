package com.example.helpers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // initialize the views and buttons
    lateinit var name: EditText
    lateinit var pass: EditText
    lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // link all our views and buttons
        name = findViewById(R.id.etName)
        pass = findViewById(R.id.etPass)
        login = findViewById(R.id.btnLogin)

        login.setOnClickListener {
            // check asign the text from our edit text boxes to variables when you click the button
            var userName = name.text.toString()
            var userPass = pass.text.toString()

            // check if there were things entered into our edit text boxes
            if(userName == ""){
                name.requestFocus()
                Toast.makeText(this, "Enter user name", Toast.LENGTH_SHORT).show()
            } else if(userPass == ""){
                pass.requestFocus()
                Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }

    }
}