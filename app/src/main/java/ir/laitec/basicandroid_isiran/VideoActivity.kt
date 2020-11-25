package ir.laitec.basicandroid_isiran

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val videoView=findViewById<VideoView>(R.id.videoView)
        videoView.setMediaController(MediaController(this))
        videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.video))
        videoView.start()
    }
}