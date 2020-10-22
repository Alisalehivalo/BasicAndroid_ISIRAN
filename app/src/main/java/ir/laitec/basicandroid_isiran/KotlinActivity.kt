package ir.laitec.basicandroid_isiran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        //showToast()
        //showToast1("SHIRAZI/JAMSHIDI/MOTEVALIAN")
        val resultNum=incrementbyOne(23)
        Toast.makeText(this,resultNum.toString(),Toast.LENGTH_LONG).show()
        NewKotlinClass(this).show()

    }
    fun showToast(){
        Toast.makeText(this,"wellcome",Toast.LENGTH_LONG).show()
    }

    fun showToast1(Fname : String){

        Toast.makeText(this,Fname,Toast.LENGTH_LONG).show()
    }

    fun incrementbyOne(num : Int) = num+1

    fun incrementByOne(num1 : Int)= num1+1

    fun multiNum(num2 : Int) =  num2*2

}