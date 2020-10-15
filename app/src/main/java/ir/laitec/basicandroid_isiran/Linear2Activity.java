package ir.laitec.basicandroid_isiran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Linear2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);
        TextView txtSalam=findViewById(R.id.txtSalam);
        txtSalam.setText("Hello ISIRAN");
    }
}