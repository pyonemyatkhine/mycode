package com.akt.dims;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AKTDroidAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    public void onLogInClick(View view)
    {
    	/*Button btnLogin=(Button)findViewById(R.id.btnLogin);
    	btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});*/
    	Intent intent = new Intent(this,MainFunctionActivity.class);
		startActivity(intent);
    }
}