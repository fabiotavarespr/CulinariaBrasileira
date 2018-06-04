package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class QuintaPerguntaActivity extends AppCompatActivity {

    private Quiz quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_pergunta);
        carregarTela();

        //Retornar
        TextView retornar = findViewById(R.id.retornar);

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QuintaPerguntaActivity.this, QuartaPerguntaActivity.class);
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
                    Intent i = new Intent(QuintaPerguntaActivity.this, SextaPerguntaActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });
    }

    private void carregarTela() {
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");
        TextView pergunta = findViewById(R.id.pergunta);
        pergunta.setText(quiz.getQuintaPergunta().getPergunta());

        RadioButton opcaoA = findViewById(R.id.opcaoA);
        opcaoA.setText(quiz.getQuintaPergunta().getOpcaoA());

        RadioButton opcaoB = findViewById(R.id.opcaoB);
        opcaoB.setText(quiz.getQuintaPergunta().getOpcaoB());

        RadioButton opcaoC = findViewById(R.id.opcaoC);
        opcaoC.setText(quiz.getQuintaPergunta().getOpcaoC());

        RadioButton opcaoD = findViewById(R.id.opcaoD);
        opcaoD.setText(quiz.getQuintaPergunta().getOpcaoD());

        RadioButton opcaoE = findViewById(R.id.opcaoE);
        opcaoE.setText(quiz.getQuintaPergunta().getOpcaoE());

        if (!quiz.getQuintaPergunta().getResposta().equals("")) {
            if (quiz.getQuintaPergunta().getResposta().equals(quiz.getQuintaPergunta().getOpcaoA())) {
                opcaoA.setChecked(true);
            } else if (quiz.getQuintaPergunta().getResposta().equals(quiz.getQuintaPergunta().getOpcaoB())) {
                opcaoB.setChecked(true);
            } else if (quiz.getQuintaPergunta().getResposta().equals(quiz.getQuintaPergunta().getOpcaoC())) {
                opcaoC.setChecked(true);
            } else if (quiz.getQuintaPergunta().getResposta().equals(quiz.getQuintaPergunta().getOpcaoD())) {
                opcaoD.setChecked(true);
            } else if (quiz.getQuintaPergunta().getResposta().equals(quiz.getQuintaPergunta().getOpcaoE())) {
                opcaoE.setChecked(true);
            }

        }

    }

    private boolean validaTela() {

        if (quiz.getQuintaPergunta().getResposta().equals("")) {
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
                    quiz.getQuintaPergunta().setResposta(quiz.getQuintaPergunta().getOpcaoA());
                    break;
                }
            case R.id.opcaoB:
                if (checked) {
                    quiz.getQuintaPergunta().setResposta(quiz.getQuintaPergunta().getOpcaoB());
                    break;
                }
            case R.id.opcaoC:
                if (checked) {
                    quiz.getQuintaPergunta().setResposta(quiz.getQuintaPergunta().getOpcaoC());
                    break;
                }
            case R.id.opcaoD:
                if (checked) {
                    quiz.getQuintaPergunta().setResposta(quiz.getQuintaPergunta().getOpcaoD());
                    break;
                }
            case R.id.opcaoE:
                if (checked) {
                    quiz.getQuintaPergunta().setResposta(quiz.getQuintaPergunta().getOpcaoE());
                    break;
                }
        }
    }
}
