package jermainewaju.example.org.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPlaySngle = (Button) findViewById(R.id.btnPlaySingle);
        Button btnStandAlone = (Button) findViewById(R.id.btnStandAlone);

        btnPlaySngle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlaySingle :
                intent = new Intent(this,YoutubeActivity.class);
                break;
            case R.id.btnStandAlone :
                intent = new Intent(this,Standalone.class);
                break;
                default:
        }
            if (intent != null) {
                startActivity(intent);
            }
    }
}
