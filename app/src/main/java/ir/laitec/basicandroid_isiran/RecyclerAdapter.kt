package ir.laitec.basicandroid_isiran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val myList : ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txtRecyclerview=itemView.findViewById<TextView>(R.id.txtRecycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_items,parent,false)
        val holder=RecyclerViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
       holder.txtRecyclerview.text=myList[position]
    }

    override fun getItemCount(): Int {
        return myList.size
    }
}