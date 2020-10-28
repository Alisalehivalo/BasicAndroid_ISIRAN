package ir.laitec.basicandroid_isiran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TestKotlinActivity : AppCompatActivity() {
    val k:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin)
        val edtSender = findViewById<EditText>(R.id.edtKotlin)
        val btnSend = findViewById<Button>(R.id.btnSend)


        btnSend.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,edtSender.text,Toast.LENGTH_LONG).show()

        })

        //showToast()
        //showToast1("ali")

        var call : Int=10
        val call1 :Int=10


        call=11
        //call1=11
        TestKotlinClass("ali","akbar")
        val test=TestKotlinClass("saeed","sae")
        val list:ArrayList<String> = ArrayList()
        list.add("1")
        list.add("2")
        val list2 = ArrayList<String>()
        val list3 = arrayListOf<String>("1","2")
        list[1]
    }

    fun showToast(){
        Toast.makeText(this,"Test Kotlin1...",Toast.LENGTH_LONG).show()
    }
    fun showToast1(name : String){
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
    }
    fun incrementByOne(num:Int): Int{
        return num+1
    }
    fun incrementByOne1(num:Int)=num+1


}