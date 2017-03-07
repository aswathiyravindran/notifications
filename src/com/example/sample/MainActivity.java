package com.example.sample;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    b = (Button)findViewById(R.id.b1);
    b.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
          addNotification();
       }

	
    });
    }
    private void addNotification() {
		// TODO Auto-generated method stub
		
    	NotificationCompat.Builder builder =
    	         new NotificationCompat.Builder(this)
    	         .setSmallIcon(R.drawable.abc)
    	         .setContentTitle("Notifications Example")
    	         .setContentText("This is a test notification");

    	      Intent notificationIntent = new Intent(this, MainActivity.class);
    	      PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
    	         PendingIntent.FLAG_UPDATE_CURRENT);
    	      builder.setContentIntent(contentIntent);

    	      // Add as notification
    	      NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    	      manager.notify(0, builder.build());
		
	}
 }

