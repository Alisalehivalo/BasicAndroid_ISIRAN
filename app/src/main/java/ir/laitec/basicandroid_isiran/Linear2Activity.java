package ir.laitec.basicandroid_isiran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Linear2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);
        TextView txtSalam=findViewById(R.id.txtSalam);
        txtSalam.setText("Hello ISIRAN");
        Log.d("Tag","This is for Test!!!");
        //final EditText editText=findViewById(R.id.edtTest);
       // Button button=findViewById(R.id.btnPress);
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast=editText.getText().toString();
                Toast.makeText(Linear2Activity.this,toast,Toast.LENGTH_LONG).show();
            }
        });

        */
    }
}