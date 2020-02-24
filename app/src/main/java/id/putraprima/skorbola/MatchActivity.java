package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.putraprima.skorbola.Model.Model;

public class MatchActivity extends AppCompatActivity {
    private TextView homeName;
    private TextView awayName;
    private TextView homeScore;
    private TextView awayScore;
    private ImageView homeLogo;
    private  ImageView awayLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        //bind view
        homeName = findViewById(R.id.txt_home);
        awayName = findViewById(R.id.txt_away);
        homeScore = findViewById(R.id.score_home);
        awayScore = findViewById(R.id.score_away);
        awayLogo = findViewById(R.id.away_logo);
        homeLogo = findViewById(R.id.home_logo);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            Model model = extras.getParcelable(MainActivity.USER_KEY);
            homeName.setText(model.getHomeName());
            awayName.setText(model.getAwayName());
//            homeScore.setText(model.getHomeScore());
//            awayScore.setText(model.getAwayScore());
            Bitmap bmp = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("homeLogo"), 0, getIntent().getByteArrayExtra("homeLogo").length);
            homeLogo.setImageBitmap(bmp);
            Bitmap bmpAway = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("awayLogo"), 0, getIntent().getByteArrayExtra("awayLogo").length);
            awayLogo.setImageBitmap(bmpAway);
        }
        //TODO
        //1.Menampilkan detail match sesuai data dari main activity
        //2.Tombol add score menambahkan satu angka dari angka 0, setiap kali di tekan
        //3.Tombol Cek Result menghitung pemenang dari kedua tim dan mengirim nama pemenang ke ResultActivity, jika seri di kirim text "Draw"
    }

    public void handleAddHomeScore(View view) {

    }

    public void handleAddAwayScore(View view) {
    }

    public void handleCekHasil(View view) {
    }
}
