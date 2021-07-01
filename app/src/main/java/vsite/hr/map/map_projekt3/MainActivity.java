package vsite.hr.map.map_projekt3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    int brbod = 0;
    Button gmb1, gmb2, gmb3, gmb4, gmb5;
    TextView pitanjetv, bodovi;

    private Question pitanje = new Question();

    private String odg;
    
    private int pitanjee = pitanje.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        gmb1 = (Button)findViewById(R.id.gmb1);
        gmb1.setOnClickListener(this);

        gmb2 = (Button)findViewById(R.id.gmb2);
        gmb2.setOnClickListener(this);

        gmb3 = (Button)findViewById(R.id.gmb3);
        gmb3.setOnClickListener(this);

        gmb4 = (Button)findViewById(R.id.gmb4);
        gmb4.setOnClickListener(this);

        gmb5 = (Button)findViewById(R.id.gmb5);
        gmb5.setOnClickListener(this);

        pitanjetv = (TextView)findViewById(R.id.pitanjetv);

        bodovi = (TextView)findViewById(R.id.bodovi);

        sljedece(random.nextInt(pitanjee));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gmb1:
                if(gmb1.getText() == odg){
                    tocno();
                }else{
                    kraj();
                }
                break;

            case R.id.gmb2:
                if(gmb2.getText() == odg){
                    tocno();
                }else{
                    kraj();
                }

                break;

            case R.id.gmb3:
                if(gmb3.getText() == odg){
                    tocno();
                }else{
                    kraj();
                }
                break;

            case R.id.gmb4:
                if(gmb4.getText() == odg){
                    tocno();
                }
                else{
                    kraj();
                }
                break;

            case R.id.gmb5:
                if(gmb5.getText() == odg){
                    tocno();
                }
                else {
                    kraj();
                }
                break;
        }
    }

    private void tocno(){
        Toast.makeText(MainActivity.this, R.string.tocan, Toast.LENGTH_SHORT).show();
        brbod++;
        bodovi.setText("Broj bodova je: " + String.valueOf(brbod));
        sljedece(random.nextInt(pitanjee));
    }

    private void kraj(){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert
                .setMessage(R.string.pogresno)
                .setCancelable(false)
                .setPositiveButton(R.string.nova, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton(R.string.izlaz, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alert.show();
    }

    private void sljedece(int a){
        pitanjetv.setText(pitanje.getQuestion(a));

        gmb1.setText(pitanje.getchoice1(a));
        gmb2.setText(pitanje.getchoice2(a));
        gmb3.setText(pitanje.getchoice3(a));
        gmb4.setText(pitanje.getchoice4(a));
        gmb5.setText(pitanje.getchoice5(a));

        odg = pitanje.getCorrectAnswer(a);
    }
}