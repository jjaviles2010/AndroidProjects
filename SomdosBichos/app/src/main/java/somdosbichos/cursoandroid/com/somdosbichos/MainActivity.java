package somdosbichos.cursoandroid.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imgCao , imgGato, imgLeao, imgMacaco, imgOvelha, imgVaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCao = (ImageView)findViewById(R.id.imgCao);
        imgGato = (ImageView)findViewById(R.id.imgGato);
        imgLeao = (ImageView)findViewById(R.id.imgLeao);
        imgMacaco = (ImageView)findViewById(R.id.imgMacaco);
        imgOvelha = (ImageView)findViewById(R.id.imgOvelha);
        imgVaca = (ImageView)findViewById(R.id.imgVaca);

        imgCao.setOnClickListener(this);
        imgGato.setOnClickListener(this);
        imgLeao.setOnClickListener(this);
        imgMacaco.setOnClickListener(this);
        imgOvelha.setOnClickListener(this);
        imgVaca.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int idButton = view.getId();

        switch (idButton){
            case R.id.imgCao:
               mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
               tocarSom();
               break;
            case R.id.imgGato:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSom();
                break;
            case R.id.imgLeao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSom();
                break;
            case R.id.imgMacaco:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSom();
                break;
            case R.id.imgOvelha:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSom();
                break;
            case R.id.imgVaca:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSom();
                break;
            default:
                break;
        }

    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null)
        {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
