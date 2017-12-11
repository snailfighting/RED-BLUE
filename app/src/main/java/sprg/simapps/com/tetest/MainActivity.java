package sprg.simapps.com.tetest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button red = (Button)findViewById(R.id.red);
        Button blue= (Button)findViewById(R.id.blue);
        layout = findViewById(R.id.back);

        Redlistener r = new Redlistener();
        red.setOnClickListener(r);

        blue.setOnClickListener(new Bluelistener());

    }
    class Redlistener implements View.OnClickListener {

        @Override

        public void onClick(View view) {
            layout.setBackgroundColor(Color.RED);
        }
    }

    class Bluelistener implements View.OnClickListener {

        @Override

        public void onClick(View view) {
            layout.setBackgroundColor(Color.BLUE);
        }
    }


}


