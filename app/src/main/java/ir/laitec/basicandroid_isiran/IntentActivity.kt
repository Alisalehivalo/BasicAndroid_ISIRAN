package ir.laitec.basicandroid_isiran

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val btnNext=findViewById<Button>(R.id.btnNext)
        val edtName=findViewById<EditText>(R.id.edtName)
        val btnSend=findViewById<Button>(R.id.btnSender)
        val edtFName=findViewById<EditText>(R.id.edtFName)

        btnNext.setOnClickListener(View.OnClickListener {
            val intent : Intent=Intent(this,NextActivity::class.java)
            startActivity(intent)
        })
        btnSend.setOnClickListener(View.OnClickListener {
            val i : Intent= Intent(this,NextActivity::class.java)
            val name=edtName.text.toString()
            val fName=edtFName.text.toString()
            i.putExtra("name",name)
            i.putExtra("Fname",fName)
            startActivity(i)
        })

    }
}