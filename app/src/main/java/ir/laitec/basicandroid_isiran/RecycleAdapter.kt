package ir.laitec.basicandroid_isiran

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(val myList:List<NewList>) : RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder>() {
    class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img=itemView.findViewById<ImageView>(R.id.imgRecycler)
        val txt1=itemView.findViewById<TextView>(R.id.txtTitle)
        val txt2=itemView.findViewById<TextView>(R.id.txtDesc)
        val layout=itemView.findViewById<LinearLayout>(R.id.layout)
        init {
            layout.setOnClickListener {
                val position=adapterPosition
                Toast.makeText(itemView.context,"Item: "+position,Toast.LENGTH_LONG).show()
                val i=Intent(itemView.context,DescriptActivity::class.java)
                itemView.context.startActivity(i)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_items,parent,false)
        val holder=RecycleViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        val currentItem =myList[position]
        holder.img.setImageResource(currentItem.img)
        holder.txt1.text=currentItem.title
        holder.txt2.text=currentItem.desc

    }

    override fun getItemCount(): Int {
        return myList.size
    }
}