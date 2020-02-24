package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.putraprima.skorbola.Model.Model;

public class ResultActivity extends AppCompatActivity {

    private TextView winner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //bind view
        winner = findViewById(R.id.text_winner);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            String model = extras.getParcelable("winnerName");
            winner.setText(model);
        }



    }
}
