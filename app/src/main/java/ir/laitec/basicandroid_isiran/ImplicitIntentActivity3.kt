package ir.laitec.basicandroid_isiran

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ImplicitIntentActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent3)
        val edtBrows=findViewById<EditText>(R.id.edtBrowser)
        val btnBrowse=findViewById<Button>(R.id.btnBrws)
        val edtCall=findViewById<EditText>(R.id.edtCall)
        val btnCall=findViewById<Button>(R.id.btnCall)
        val edtCallSms=findViewById<EditText>(R.id.edtCallSms)
        val edtSmsText=findViewById<EditText>(R.id.edtTextSms)
        val btnSMS=findViewById<Button>(R.id.btnSms)
        btnBrowse.setOnClickListener(View.OnClickListener {
            val edttext=edtBrows.text.toString()
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://"+edttext))
            startActivity(intent)
        })
        btnCall.setOnClickListener(View.OnClickListener {
            val edtCall=edtCall.text.toString()
            val intent2=Intent(Intent.ACTION_DIAL)
            intent2.data= Uri.parse("tel:"+edtCall)
            startActivity(intent2)
        })
        btnSMS.setOnClickListener(View.OnClickListener {
            val edtSMSNum=edtCallSms.text.toString()
            val edtSmsText=edtSmsText.text.toString()
            val intent3=Intent(Intent.ACTION_SENDTO)
            intent3.data= Uri.parse("smsto:"+edtSMSNum)
            intent3.putExtra("sms_body",edtSmsText)
            startActivity(intent3)
        })
    }
}