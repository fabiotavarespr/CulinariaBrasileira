package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class SegundaPerguntaActivity extends AppCompatActivity {

    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pergunta);

        carregarTela();

        //Retornar
        TextView retornar = findViewById(R.id.retornar);

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundaPerguntaActivity.this, PrimeiraPerguntaActivity.class);
                i.putExtra("obj_quiz", quiz);
                startActivity(i);
            }
        });

        //Prosseguir
        TextView proximo = findViewById(R.id.proximo);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validaTela()) {
                    Intent i = new Intent(SegundaPerguntaActivity.this, TerceiraPerguntaActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });
    }

    private void carregarTela(){
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");

        TextView pergunta = findViewById(R.id.pergunta);
        pergunta.setText(quiz.getSegundaPergunta().getPergunta());

        TextView resposta = findViewById(R.id.resposta_field);
        resposta.setText(quiz.getSegundaPergunta().getResposta());
    }

    private boolean validaTela() {
        TextView resposta = findViewById(R.id.resposta_field);
        quiz.getSegundaPergunta().setResposta(resposta.getText().toString());

        if (quiz.getSegundaPergunta().getResposta().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.toast_escolha_opcao, Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;

    }
}
