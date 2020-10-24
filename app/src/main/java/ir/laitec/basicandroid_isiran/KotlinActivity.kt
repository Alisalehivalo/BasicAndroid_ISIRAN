package ir.laitec.basicandroid_isiran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {
    //safe call
    val name : String? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val list:ArrayList<String> = ArrayList()
        list.add("salehi")
        list.add("shirazi")
        list.add("motevalian")
        list.add("jamshidi")
        val number1 = 10
        val list1= ArrayList<String>()
        val list2= arrayListOf<String>("SALEHI","JAMSHIDI","MOTEVALIYAN","SHIRAZI")
        NewKotlinClass(this).show()
        Toast.makeText(this,multiNum(20),Toast.LENGTH_LONG).show()

        if (number1 ==10){
          "salam"
        }else{
            "bye"
        }
        val age=if(number1>10) "old" else "young"

        val pop=when(number1){
            number1+1 -> "gfhf"
            1 -> "one"
            2 -> "two"
            in 3 .. 5 -> "medium"
            in 7 ..10 -> "high"
            else -> "no"
        }

        for(i in 7 .. 10){    }
        for (j in 0 .. 10 step 2){}
        for (k in 10 downTo 0){}
        for (l in 0 until 10){}

        for (m in list){}
        list.forEach {  }

        list[2]





        // var ,    val

        var person :String="Salehi"
        person="Shirazi"
        val cal : Int
        cal=1236
        //cal=5266



        showToast()
        showToast1("SHIRAZI/JAMSHIDI/MOTEVALIAN")


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