package lamaatech.com.timerasyncproject;

import android.os.AsyncTask;

public class TimerAsyncTask extends AsyncTask<Integer, Void, Integer>{

    private IView iView;

    public TimerAsyncTask(IView iView) {
        this.iView = iView;
    }

    @Override
    protected Integer doInBackground(Integer... num) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num[0];
    }

    @Override
    protected void onPostExecute(Integer num) {

        iView.updateUI(num);

        super.onPostExecute(num);

    }

}
