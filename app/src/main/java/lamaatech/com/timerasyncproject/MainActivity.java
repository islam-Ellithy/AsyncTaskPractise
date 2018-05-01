package lamaatech.com.timerasyncproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 100; i++) {
            new TimerAsyncTask(this).execute(i);
        }
    }

    @Override
    public void updateUI(Integer num) {
        //set recyclerview names

        TextView textView = findViewById(R.id.textview);

        textView.setText("" + num);

    }

    public void showToast(View view) {

        Toast.makeText(this, "Hi Toast", Toast.LENGTH_SHORT).show();
    }
}
