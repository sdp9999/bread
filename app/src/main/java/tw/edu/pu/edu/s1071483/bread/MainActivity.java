package tw.edu.pu.edu.s1071483.bread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton one = (ImageButton) findViewById(R.id.one);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, one.class);
                startActivity(intent);
            }
        });

        ImageButton two = (ImageButton) findViewById(R.id.two);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, two.class);
                startActivity(intent);
            }
        });

        ImageButton three = (ImageButton) findViewById(R.id.three);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, three.class);
                startActivity(intent);
            }
        });

        ImageButton four = (ImageButton) findViewById(R.id.four);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, four.class);
                startActivity(intent);
            }
        });

        ImageButton five = (ImageButton) findViewById(R.id.five);

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, five.class);
                startActivity(intent);
            }
        });

        ImageButton six = (ImageButton) findViewById(R.id.six);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, six.class);
                startActivity(intent);
            }
        });
    }
}