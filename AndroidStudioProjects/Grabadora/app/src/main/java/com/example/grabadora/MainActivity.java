package com.example.grabadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    //Variables
    private MediaRecorder grabacion;
    private String archivoSalida = null;
    private Button btn_recorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_recorder = (Button) findViewById(R.id.btn_rec);

        //Asignamos permisos
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}
                    , 1000);
        }
    }

    public void recorder(View view) {
         if (grabacion == null) { //No se está grabando nada
             archivoSalida = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Grabacion.mp3";
             grabacion = new MediaRecorder();

             //Grabamos audio

             //Aqui le decimos que use el microfono del movil
             grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
             //Aqui el formato de salida (3GP)
             grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
             //Aquí transformamos
             grabacion.setAudioEncoder(MediaRecorder.OutputFormat.THREE_GPP);
             //Archivo de salida
             grabacion.setOutputFile(archivoSalida);

             try {
                 grabacion.prepare();
                 grabacion.start();
             } catch (IOException e) {
                 e.printStackTrace();
             }

             //Cambiamos la apariencia del boton a rojo cuando este grabando
             btn_recorder.setBackgroundResource(R.drawable.rec);
             Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
         } else if (grabacion != null) { //Está grabando
             grabacion.stop();
             grabacion.release(); //Estado de finalizado
             grabacion = null;

             //Cuando deje de grabar el boton se pondra blanco
             btn_recorder.setBackgroundResource(R.drawable.stop_rec);
             Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
         }
    }

    public void reproducir(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(archivoSalida);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();
    }
}