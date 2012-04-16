package carShare.androidAplication;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   
        setContentView(R.layout.menu);         
        
        if (Resources.getIdUser()==null)
    		MenuActivity.this.startActivity(new Intent(MenuActivity.this,CarShareAndroidAplicationActivity.class));
       
        Button searchBtn = (Button) findViewById(R.id.menuSearchBtn);
        Button createBtn = (Button) findViewById(R.id.menuCreateBtn);
        Button updateBtn = (Button) findViewById(R.id.menuUpdateBtn);
        Button logoutBtn = (Button) findViewById(R.id.menuLogoutBtn);
        
        searchBtn.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		MenuActivity.this.startActivity(new Intent(MenuActivity.this,FilterActivity.class));
        	}
        });
        
        createBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	MenuActivity.this.startActivity(new Intent(MenuActivity.this,NewTripActivity.class));
            }
        });  
        
        updateBtn.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		MenuActivity.this.startActivity(new Intent(MenuActivity.this,EditProfileActivity.class));
        	}
        });
        
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              	try 
            	{       	
                    DefaultHttpClient httpPostclient = new DefaultHttpClient();
                    HttpConnectionParams.setConnectionTimeout(httpPostclient.getParams(), 10000);
                    HttpPost httpPostRequest = new HttpPost(Resources.getServer()+"/service/account/logout");
                    httpPostRequest.setHeader("Accept", "application/xml");
                    httpPostRequest.setHeader("Content-type", "application/xml");
                    httpPostRequest.addHeader("AuthToken", Resources.getIdUser());		
                    HttpResponse responsePost = (HttpResponse) httpPostclient.execute(httpPostRequest);
                    if (responsePost.getStatusLine().getStatusCode()==HttpStatus.SC_OK)
                    {
                    	Resources.setIdUser(null);
                    	MenuActivity.this.startActivity(new Intent(MenuActivity.this,CarShareAndroidAplicationActivity.class));
                    }
            	} 
            	catch (Exception e)
            	{
            		ExitMsbox("Fatal Error!");
            	}
            }
        });  
	}
	
	public void ExitMsbox(String message)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);  
        dlgAlert.setTitle("Info"); 
        dlgAlert.setMessage(message);
        dlgAlert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int whichButton) {
        	System.exit(1);	
        }});
        dlgAlert.create().show();
    }
}