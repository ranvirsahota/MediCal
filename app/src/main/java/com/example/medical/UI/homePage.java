package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.medical.R;

import java.util.Calendar;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Test for the notification to create one an open a new activity after clicking it
        createNotificationChannel();

        ImageButton buttonShowNotif = findViewById(R.id.imageButton8);

        Intent notificationIntent = new Intent(this, ListOfEvents.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendintIntent = PendingIntent.getActivity(this, 0,
                notificationIntent , PendingIntent.FLAG_UPDATE_CURRENT);

        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "CHANNEL_ID")
                .setSmallIcon(R.drawable.ambulanceicon)
                .setContentTitle("Test")
                .setContentText("Playing with notification")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendintIntent)
                .setAutoCancel(true);

        final NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        buttonShowNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager.notify(1,  builder.build());

            }
        });

    }

    //Test for the notification
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.username);
            String description = getString(R.string.text);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("CHANNEL_ID", name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            assert notificationManager != null;
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void calendarBtn(View view) {

        Intent calBtn = new Intent(homePage.this, Calender.class);
        startActivity(calBtn);
    }

    public void createBtn(View view) {

        Intent createBtn = new Intent(homePage.this, CreateEvent.class);
        startActivity(createBtn);
    }

    public void signIn(View view) {

        Intent signIn = new Intent(homePage.this, Login.class);
        startActivity(signIn);
    }

}
