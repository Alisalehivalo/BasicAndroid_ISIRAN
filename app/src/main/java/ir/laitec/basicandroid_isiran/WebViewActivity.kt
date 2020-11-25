package ir.laitec.basicandroid_isiran

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val webView=findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled=true
        webView.settings.setSupportZoom(true)
        webView.webViewClient= WebViewClient()
        webView.loadUrl("https://www.google.com")
    }
}