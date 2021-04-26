package com.example.notification

import android.app.Notification
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnNotification1 : Button
    private lateinit var btnNotification2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNotification1 = findViewById(R.id.btnNotification1)
        btnNotification2 = findViewById(R.id.btnNotification2)

        btnNotification1.setOnClickListener {
            showHighPriorityNotification()
        }

        btnNotification2.setOnClickListener {
            lowPriorityNotification()
        }
    }

    private fun showHighPriorityNotification() {
        val notificationManager = NotificationManagerCompat.from(this)

        val notificationChannels = NotificationChannels(this)
        notificationChannels.createNotificationChannels()

        val notification = NotificationCompat.Builder(this, notificationChannels.CHANNEL_1)
            .setSmallIcon(R.drawable.ic_baseline_add_alert_24)
            .setContentTitle("High priority notification")
            .setContentText("Notification body")
            .setColor(Color.CYAN)
            .build()

        notificationManager.notify(1, notification)
    }

    private fun lowPriorityNotification() {
        val notificationManager = NotificationManagerCompat.from(this)

        val notificationChannels = NotificationChannels(this)
        notificationChannels.createNotificationChannels()

        val notification = NotificationCompat.Builder(this, notificationChannels.CHANNEL_2)
            .setSmallIcon(R.drawable.ic_baseline_add_alert_24)
            .setContentTitle("low priority notification")
            .setContentText("Notification body")
            .setColor(Color.GREEN)
            .build()

        notificationManager.notify(2, notification)
    }
}