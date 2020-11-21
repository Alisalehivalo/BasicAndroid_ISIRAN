package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.JsonHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject

class AssyncHTTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assync_h_t_t_p)
        val txtTiming=findViewById<TextView>(R.id.txtTiming)

        val client=AsyncHttpClient()
        val url="http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8"
        client.get(url,object :JsonHttpResponseHandler(){

            override fun onSuccess(statusCode: Int, headers: Array<out Header>?, response: JSONObject?) {
                super.onSuccess(statusCode, headers, response)
                val gson=Gson()
                val pray=gson.fromJson(response.toString(),PrayJson::class.java)
                println(pray.data.timings.Isha)
                txtTiming.text=pray.data.timings.Isha
            }

            override fun onFailure(statusCode: Int, headers: Array<out Header>?, throwable: Throwable?, errorResponse: JSONObject?) {
                super.onFailure(statusCode, headers, throwable, errorResponse)
                println(throwable?.message)
            }
        })


        
    }
}