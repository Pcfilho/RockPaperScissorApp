package com.androidlearn.example.apppedropapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choseRock(View view) {
        this.selectedOption("Rock");
    }

    public void chosePaper(View view) {
        this.selectedOption("Paper");
    }

    public void choseScissor(View view) {
        this.selectedOption("Scissor");
    }

    @SuppressLint("SetTextI18n")
    public void selectedOption(String usOption) {
        int number = new Random().nextInt(3);
        String[] options = {"Rock", "Paper", "Scissor"};
        String appOption = options[number];

        ImageView imageResult = findViewById(R.id.imageResult);
        TextView textResult = findViewById(R.id.textResult);

        switch (appOption) {
            case "Rock":
                imageResult.setImageResource(R.drawable.pedra);
                break;
            case "Paper":
                imageResult.setImageResource(R.drawable.papel);
                break;
            case "Scissor":
                imageResult.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((appOption.equals("Rock") && usOption.equals("Scissor")) ||
                (appOption.equals("Paper") && usOption.equals("Rock")) ||
                (appOption.equals("Scissor") && usOption.equals("Paper"))) {
            textResult.setText("Você perdeu!! XD");
        } else if ((appOption.equals("Rock") && usOption.equals("Paper")) ||
                (appOption.equals("Paper") && usOption.equals("Scissor")) ||
                (appOption.equals("Scissor") && usOption.equals("Rock"))) {
            textResult.setText("Você ganhou!! :D");
        } else {
            textResult.setText("Houve um empate!!");
        }
    }

}