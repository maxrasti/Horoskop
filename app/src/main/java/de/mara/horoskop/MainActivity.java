package de.mara.horoskop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    protected Button testbutton=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testbutton=(Button) findViewById(R.id.button);

        testbutton.setOnClickListener(this);
    }

    public void onClick (View v) {

        Toast toast = Toast.makeText(this, "string", Toast.LENGTH_LONG);

        toast.show();

        URL url = null;

        HttpURLConnection client = null;

        String sign = "aries";
        String day = "day";

        try {
            url = new URL("https://aztro.herokuapp.com?sign="+sign+"&day="+day);
            client = (HttpURLConnection) url.openConnection();
            client.setRequestMethod("POST");
           // client.setRequestProperty();
            client.setDoOutput(true);

            OutputStream outputPost = new BufferedOutputStream(client.getOutputStream());


            //writeStream(outputPost);


            Toast toast2 = Toast.makeText(this,outputPost.toString(), Toast.LENGTH_LONG);

            toast2.show();

            outputPost.flush();
            outputPost.close();



        } catch (IOException e){

        }

        finally {
            if(client != null) // Stelle sicher, dass die Verbindung nicht null ist.
                client.disconnect();
        }




    }

    }

