package com.example.falepormim;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

import java.util.Locale;

public class TTS implements TextToSpeech.OnInitListener {

    //TTS é um serviço do android, necessitamos do Context para inicializar o serviço

    TextToSpeech textToSpeech;
    Context mContext;

    public TTS(Context c) {
        mContext = c;
        textToSpeech = new TextToSpeech(c, this);
    }

    public void speak(String str) {
        textToSpeech.speak(str, TextToSpeech.QUEUE_FLUSH, null, null);
    }

    public void onInit(int status) {
        //Quando o status for igual TexToSpeech.SUCCESS
        if (status == TextToSpeech.SUCCESS) {
            //Configurar a fala
            textToSpeech.setLanguage(Locale.getDefault());
        } else {
            String msg = "Erro na carga do serviço";
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
