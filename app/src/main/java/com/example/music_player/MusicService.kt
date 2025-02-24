package com.example.music_player

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService: Service() {
    var mediaPlayer: MediaPlayer?=null
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action){
            "PLAY"-> playMusic()
            "PAUSE"-> pauseMusic()
            "STOP"-> stopMusic()
        }
        return START_STICKY
    }
    private fun playMusic(){
        if(mediaPlayer==null){
            mediaPlayer = MediaPlayer.create(this,R.raw.shape_of_you)
            mediaPlayer?.isLooping = true
        }
        mediaPlayer?.start()
        sendStatus("Playing")
    }
    private fun pauseMusic() {
        if (mediaPlayer?.isPlaying == true) {
            mediaPlayer?.pause()
            sendStatus("Paused")
        }
    }

    private fun stopMusic() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
        sendStatus("Stopped")
    }
    private fun sendStatus(status: String) {
        val intent = Intent("Music_Status")
        intent.putExtra("STATUS", status)
        sendBroadcast(intent)
    }
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
    }
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

}