package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SQLiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_q_lite)
        val edtName=findViewById<EditText>(R.id.edtName)
        val edtFamily=findViewById<EditText>(R.id.edtFamily)
        val edtCode=findViewById<EditText>(R.id.edtCode)
        val btnSaveDB=findViewById<Button>(R.id.btnSaveDB)
        val btnShowDB=findViewById<Button>(R.id.btnShowDB)
        val btnDeleteDB=findViewById<Button>(R.id.btnDeleteDB)

        val database=SQLiteHelper(this,"IsIranDB",null,1)

        btnSaveDB.setOnClickListener {
            database.InsertData(edtName.text.toString(),edtFamily.text.toString(),edtCode.text.toString().toInt())
            Toast.makeText(this,"Saved data in Database",Toast.LENGTH_LONG).show()
        }
        btnShowDB.setOnClickListener {
            val result=database.ReadTable()
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }
        btnDeleteDB.setOnClickListener {
            database.DeleteTable(edtName.text.toString())
            Toast.makeText(this,"Delete data from Database",Toast.LENGTH_LONG).show()
        }

    }
}