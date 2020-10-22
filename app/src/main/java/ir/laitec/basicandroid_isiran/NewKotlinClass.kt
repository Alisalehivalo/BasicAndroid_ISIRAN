package ir.laitec.basicandroid_isiran

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewKotlinClass(val context : Context) : AppCompatActivity() {
    fun show(){
        Toast.makeText(context,"New Kotlin class",Toast.LENGTH_LONG).show()
    }



}