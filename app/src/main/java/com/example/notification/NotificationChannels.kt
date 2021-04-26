package com.example.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class NotificationChannels( val context : Context) {
    val CHANNEL_1: String = "Channel1"
    val CHANNEL_2: String = "Channel2"

    fun createNotificationChannels (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel1 = NotificationChannel(
                CHANNEL_1,
                "Channel 1",
                NotificationManager.IMPORTANCE_HIGH
            )
            channel1.description = "Channel 1"

            val channel2 = NotificationChannel(
                CHANNEL_2,
                "Channel 2",
                NotificationManager.IMPORTANCE_HIGH
            )
            channel2.description = "Channel 2"

            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            notificationManager.createNotificationChannel(channel1)
            notificationManager.createNotificationChannel(channel2)
        }
    }
}