package de.mara.horoskop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

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

        HttpTransport httpTransport = new NetHttpTransport();
        HttpRequestFactory requestFactory = httpTransport.createRequestFactory();

        GenericUrl url = new GenericUrl("http://theastrologer-api.herokuapp.com/api/horoscope/aquaris/today");


        Log.i("TAG$LOGGING","URL erzeugt: " + url);

        HttpRequest request = requestFactory.buildGetRequest(url);
        HttpResponse httpResponse = request.execute();

















        /*

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
            client.setRequestProperty("description","String");
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

    */


    }

}

