package ir.laitec.basicandroid_isiran

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_intent)
        val edtTextSend=findViewById<EditText>(R.id.edtTextSend)
        val btnSendText=findViewById<Button>(R.id.btnSendText)
        btnSendText.setOnClickListener(View.OnClickListener {
            val sendText=edtTextSend.text.toString()
            val intent=Intent(this,SecondIntentActivity::class.java)
            intent.putExtra("sendText",sendText)
            startActivityForResult(intent,150)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 150){
            if(resultCode == Activity.RESULT_OK){
                val result=data?.getStringExtra("edtTextNew")
                Toast.makeText(this,result,Toast.LENGTH_LONG).show()
            }
        }
    }
}