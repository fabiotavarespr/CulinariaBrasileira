package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class TerceiraPerguntaActivity extends AppCompatActivity {

    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_pergunta);
        carregarTela();

        //Retornar
        TextView retornar = findViewById(R.id.retornar);

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TerceiraPerguntaActivity.this, SegundaPerguntaActivity.class);
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
                    Intent i = new Intent(TerceiraPerguntaActivity.this, QuartaPerguntaActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });
    }

    private void carregarTela() {
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");
        TextView pergunta = findViewById(R.id.pergunta);
        pergunta.setText(quiz.getTerceiraPergunta().getPergunta());

        RadioButton opcaoA = findViewById(R.id.opcaoA);
        opcaoA.setText(quiz.getTerceiraPergunta().getOpcaoA());

        RadioButton opcaoB = findViewById(R.id.opcaoB);
        opcaoB.setText(quiz.getTerceiraPergunta().getOpcaoB());


        if (!quiz.getTerceiraPergunta().getResposta().equals("")) {
            if (quiz.getTerceiraPergunta().getResposta().equals(quiz.getTerceiraPergunta().getOpcaoA())) {
                opcaoA.setChecked(true);
            } else if (quiz.getTerceiraPergunta().getResposta().equals(quiz.getTerceiraPergunta().getOpcaoB())) {
                opcaoB.setChecked(true);
            }

        }

    }

    private boolean validaTela() {

        if (quiz.getTerceiraPergunta().getResposta().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.toast_escolha_opcao, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.opcaoA:
                if (checked) {
                    quiz.getTerceiraPergunta().setResposta(quiz.getTerceiraPergunta().getOpcaoA());
                    break;
                }
            case R.id.opcaoB:
                if (checked) {
                    quiz.getTerceiraPergunta().setResposta(quiz.getTerceiraPergunta().getOpcaoB());
                    break;
                }
        }
    }
}

