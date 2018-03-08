package de.mara.horoskop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    protected Button testbutton=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testbutton=(Button) findViewById(R.id.button);

        testbutton.setOnClickListener(this);
    }

    public void onClick (View v){

        Toast toast = Toast.makeText(this,"string", Toast.LENGTH_LONG);

        toast.show();

    }
}
