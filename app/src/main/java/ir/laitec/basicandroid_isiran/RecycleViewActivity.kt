package ir.laitec.basicandroid_isiran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        //val recyclerView2=findViewById<RecyclerView>(R.id.recycler2)
        val list=ArrayList<String>()
        list.add("Jamshidi")
        list.add("Shirazi")
        list.add("Motevalian")
        list.add("Salehi")
        list.add("Laitec")
        list.add("IsIran")
        list.add("Jamshidi")
        list.add("Shirazi")
        list.add("Motevalian")
        list.add("Salehi")
        list.add("Laitec")
        list.add("IsIran")
        list.add("Jamshidi")
        list.add("Shirazi")
        list.add("Motevalian")
        list.add("Salehi")
        list.add("Laitec")
        list.add("IsIran")
        list.add("Jamshidi")
        list.add("Shirazi")
        list.add("Motevalian")
        list.add("Salehi")
        list.add("Laitec")
        list.add("IsIran")
        val adapter=RecyclerAdapter(list)
        recyclerView.adapter=adapter
        //recyclerView2.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        //recyclerView2.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
    }
}