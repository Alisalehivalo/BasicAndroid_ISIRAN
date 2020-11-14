package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SharePrefActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_pref)
        val edtShare=findViewById<EditText>(R.id.edtShare)
        val btnSave=findViewById<Button>(R.id.btnSave)
        val btnShow=findViewById<Button>(R.id.btnShow)
        btnSave.setOnClickListener {
            val data=edtShare.text.toString()
            val prefences=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("shareData",data).apply()
            Toast.makeText(this,"Saved!!!",Toast.LENGTH_LONG).show()
        }
        btnShow.setOnClickListener {
            val result=PreferenceManager.getDefaultSharedPreferences(this).getString("shareData","Unknown")
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }
    }
}