package ir.laitec.basicandroid_isiran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*

class TasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tas)
        val btnTas=findViewById<Button>(R.id.btnTas)
        val imgTas=findViewById<ImageView>(R.id.imgTas)
        btnTas.setOnClickListener(View.OnClickListener {
            var random=Random().nextInt(6)+1
            when(random){
                1 -> imgTas.setImageResource(R.drawable.num1)
                2 -> imgTas.setImageResource(R.drawable.num2)
                3 -> imgTas.setImageResource(R.drawable.num3)
                4 -> imgTas.setImageResource(R.drawable.num4)
                5 -> imgTas.setImageResource(R.drawable.num5)
                6 -> imgTas.setImageResource(R.drawable.num6)
                else -> imgTas.setImageResource(R.drawable.ic_baseline_camera_24)

            }
        })


    }
}