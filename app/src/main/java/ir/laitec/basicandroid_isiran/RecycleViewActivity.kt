package ir.laitec.basicandroid_isiran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        val list=generateList(50)

        //val myList=generateList(100)
        val adapter=RecycleAdapter(list)
        recycler.adapter=adapter
        recycler.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)

    }
    fun generateList(size : Int) : List<NewList>{
        val list=ArrayList<NewList>()
        for (i in 0 until size){

            val image=when(i % 3){
                0 -> R.drawable.ic_baseline_add_circle_24
                1 -> R.drawable.ic_baseline_add_shopping_cart_24
                2 -> R.drawable.ic_baseline_add_shopping_cart_24
                else -> R.drawable.ic_baseline_add_circle_24
            }


            val txt1="Item $i"
            val txt2=when(i % 3){
                0 -> "ALI"
                1 -> "Hasan"
                2 -> "Hossein"
                else -> "Unknown"
            }
            val items=NewList(image,txt1,txt2)
            list+=items
        }
        return list
    }
}