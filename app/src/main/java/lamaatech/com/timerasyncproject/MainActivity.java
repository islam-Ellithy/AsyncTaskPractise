package lamaatech.com.timerasyncproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IView {

    ArrayList<String> names ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TimerAsyncTask(this).execute();
    }

    @Override
    public void updateUI(ArrayList<String> names) {
        this.names = names;
        //set recyclerview names
    }
}
