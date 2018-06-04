package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class GabaritoActivity extends AppCompatActivity {

    private Quiz quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gabarito);
        carregarTela();

        //Prosseguir
        TextView refazer = findViewById(R.id.refazer);

        refazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i = new Intent(GabaritoActivity.this, MainActivity.class);
                    startActivity(i);
            }
        });
    }

    private void carregarTela() {
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");

        TextView resultado = findViewById(R.id.resultado);
        resultado.setText("Resultado de " + quiz.getNome());

        TextView resposta1 = findViewById(R.id.resposta_1);
        resposta1.setText(quiz.getPrimeiraPergunta().getResposta());

        TextView resposta2 = findViewById(R.id.resposta_2);
        resposta2.setText(quiz.getSegundaPergunta().getResposta());

        TextView resposta3 = findViewById(R.id.resposta_3);
        resposta3.setText(quiz.getTerceiraPergunta().getResposta());

        TextView resposta4 = findViewById(R.id.resposta_4);
        resposta4.setText(quiz.getQuartaPergunta().getResposta());

        TextView resposta5 = findViewById(R.id.resposta_5);
        resposta5.setText(quiz.getQuintaPergunta().getResposta());

        TextView resposta6 = findViewById(R.id.resposta_6);
        resposta6.setText(quiz.getSextaPergunta().getResposta());


        if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getGabarito().getPrimeiraPergunta())) {
            resposta1.setTextColor(getResources().getColor(R.color.correto));
        }
        if (quiz.getSegundaPergunta().getResposta().equals(quiz.getGabarito().getSegundaPergunta())) {
            resposta2.setTextColor(getResources().getColor(R.color.correto));
        }
        if (quiz.getTerceiraPergunta().getResposta().equals(quiz.getGabarito().getTerceiraPergunta())) {
            resposta3.setTextColor(getResources().getColor(R.color.correto));
        }
        if (quiz.getQuartaPergunta().getResposta().equals(quiz.getGabarito().getQuartaPergunta())) {
            resposta4.setTextColor(getResources().getColor(R.color.correto));
        }
        if (quiz.getQuintaPergunta().getResposta().equals(quiz.getGabarito().getQuintaPergunta())) {
            resposta5.setTextColor(getResources().getColor(R.color.correto));
        }
        if (quiz.getSextaPergunta().getResposta().equals(quiz.getGabarito().getSextaPergunta())) {
            resposta6.setTextColor(getResources().getColor(R.color.correto));
        }

    }
}
