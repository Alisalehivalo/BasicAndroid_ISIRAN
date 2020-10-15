package ir.laitec.basicandroid_isiran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Placeholder placeholder;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        constraintLayout=findViewById(R.id.layout1);
                placeholder=findViewById(R.id.place);


    }
    public void placeChange(View view){
        TransitionManager.beginDelayedTransition(constraintLayout);
        placeholder.setContentId(view.getId());

    }
}