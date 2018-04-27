package lamaatech.com.timerasyncproject;

import android.os.AsyncTask;

import java.util.ArrayList;

public class TimerAsyncTask extends AsyncTask<Void, Void, ArrayList<String>> {

    private IView iView;

    public TimerAsyncTask(IView iView) {
        this.iView = iView;
    }

    @Override
    protected ArrayList<String> doInBackground(Void... num) {

        ArrayList<String> names = new ArrayList<>();


        //get names
        names.add("Osama");
        names.add("bassam");
        names.add("Ahmed");
        names.add("MOhamed");

        return names;
    }

    @Override
    protected void onPostExecute(ArrayList<String> names) {

        iView.updateUI(names);

        super.onPostExecute(names);

    }

}
