package com.intruder.httpasynctaskmodule;

import android.content.Context;
import android.os.AsyncTask;

public class HttpAsyncTask extends AsyncTask<String, Integer, String> {
    private Context context;
    public HttpAsyncTask(Context context){
            this.context =context;
    }
    @Override
    protected void onPreExecute() {
    	
    }
    @Override
    protected void onProgressUpdate(Integer... progress){
    	
    }
	@Override
	protected String doInBackground(String... params) {
		// TODO Auto-generated method stub
		return null;
	}
    @Override
    protected void onPostExecute(String str){
    	
    }
}
