package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val txtReceiver=findViewById<TextView>(R.id.txtReceiver)
        val intent=intent
        val nameReciver =intent.getStringExtra("name")
        val familyReceiver=intent.getStringExtra("Fname")
        txtReceiver.text=nameReciver+" "+familyReceiver
    }
}