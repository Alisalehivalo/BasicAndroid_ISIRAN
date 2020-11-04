package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class NavigationDrawerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        val imgMenu=findViewById<ImageView>(R.id.imgMenu)
        val drawer=findViewById<DrawerLayout>(R.id.drawer)
        imgMenu.setOnClickListener(View.OnClickListener {
            drawer.openDrawer(GravityCompat.START)
        })
    }
}