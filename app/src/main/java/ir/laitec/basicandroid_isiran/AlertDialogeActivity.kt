package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlertDialogeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialoge)
        val btnAlert=findViewById<Button>(R.id.btnAlert)
        btnAlert.setOnClickListener {
            val alertDialoge=AlertDialog.Builder(this)
                    .setTitle("توجه")
                    .setMessage("آیا مطمئن هستید؟")
                    //.setIcon(R.drawable.alarm)
                    .setPositiveButton("بله"){
                        alertDialoge,which -> Toast.makeText(this,"you click on Yes !!!!",Toast.LENGTH_LONG).show()
                    }
                    .setNegativeButton("خیر"){
                        alertDialoge,which -> Toast.makeText(this,"you click on No !!!!",Toast.LENGTH_LONG).show()
                    }
                    .setNeutralButton("بعدا یادآوری کن!"){
                        alertDialoge,which -> Toast.makeText(this,"Remind you later !!!!",Toast.LENGTH_LONG).show()
                    }.create()
            alertDialoge.show()

        }
    }
}