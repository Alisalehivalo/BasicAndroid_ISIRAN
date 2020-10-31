package ir.laitec.basicandroid_isiran

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_intent)
        val txtRec=findViewById<TextView>(R.id.txtReceiver)
        val edtSender2=findViewById<EditText>(R.id.edtSendText2)
        val btnRet=findViewById<Button>(R.id.btnRetern)
        val intent=getIntent()
        val recText=intent.getStringExtra("sendText")
        txtRec.text=recText
        btnRet.setOnClickListener(View.OnClickListener {
            val edtTxt2=edtSender2.text.toString()
            intent.putExtra("edtTextNew",edtTxt2)
            setResult(Activity.RESULT_OK,intent)
            finish()
        })
    }
}