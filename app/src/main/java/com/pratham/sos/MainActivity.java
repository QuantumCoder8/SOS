package com.pratham.sos;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button openSosActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSosActivityButton = findViewById(R.id.openSosActivityButton);

        openSosActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SoS Activity
                Intent intent = new Intent(MainActivity.this, SosActivity.class);
                startActivity(intent);
            }
        });
    }
}
