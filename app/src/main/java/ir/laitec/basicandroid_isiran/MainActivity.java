package ir.laitec.basicandroid_isiran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","in On Create!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTag","in on Start!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyTag","in on Resume!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTag","in on Pause!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTag","in on Stop!!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyTag","in on Restart!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTag","in on Destroy!!!");
    }
}