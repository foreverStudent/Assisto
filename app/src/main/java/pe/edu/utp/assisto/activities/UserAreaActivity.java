package pe.edu.utp.assisto.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import pe.edu.utp.assisto.R;

/**
 * Created by Gonza on 15/07/2017.
 */

public class UserAreaActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");

        TextView helloWorldTextView = (TextView) findViewById(R.id.helloWorldTextView);
        TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView emailTextView = (TextView) findViewById(R.id.emailTextView);

        // Display user details
        String message = name + " welcome to your user area";
        helloWorldTextView.setText(message);
        usernameTextView.setText(username);
        emailTextView.setText(email);

    }
}
