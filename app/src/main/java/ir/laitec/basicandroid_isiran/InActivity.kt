package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in)
        val txtResult1 = findViewById<TextView>(R.id.txtResult)
        val name=intent.getStringExtra("my")
        txtResult1.text=name


    }
}