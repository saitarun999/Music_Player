package com.example.music_player

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var currentStatus: TextView
    private lateinit var play: Button
    private lateinit var pause: Button
    private lateinit var stop: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        currentStatus = findViewById<TextView>(R.id.status)
        play = findViewById<Button>(R.id.play)
        pause = findViewById<Button>(R.id.pause)
        stop = findViewById<Button>(R.id.stop)
        val filter = IntentFilter("Music_Status")
        registerReceiver(musicReceiver,filter)
        play.setOnClickListener{
            val intent = Intent(this,MusicService::class.java)
            intent.action = "PLAY"
            startService(intent)
        }
        pause.setOnClickListener{
            val intent = Intent(this,MusicService::class.java)
            intent.action = "PAUSE"
            startService(intent)
        }
        stop.setOnClickListener{
            val intent = Intent(this,MusicService::class.java)
            intent.action = "STOP"
            startService(intent)
            stopService(intent)
            finish()
        }

    }
    private val musicReceiver=object:BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            val status = intent?.getStringExtra("STATUS")?:"Idle"
            println(status)
            currentStatus.text = status
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(musicReceiver)
    }
}