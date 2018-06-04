package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class PrimeiraPerguntaActivity extends AppCompatActivity {

    private Quiz quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_pergunta);
        carregarTela();

        //Retornar
        TextView retornar = findViewById(R.id.retornar);

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PrimeiraPerguntaActivity.this, MainActivity.class);
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
                    Intent i = new Intent(PrimeiraPerguntaActivity.this, SegundaPerguntaActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });
    }

    private void carregarTela() {
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");
        TextView pergunta = findViewById(R.id.pergunta);
        pergunta.setText(quiz.getPrimeiraPergunta().getPergunta());

        RadioButton opcaoA = findViewById(R.id.opcaoA);
        opcaoA.setText(quiz.getPrimeiraPergunta().getOpcaoA());

        RadioButton opcaoB = findViewById(R.id.opcaoB);
        opcaoB.setText(quiz.getPrimeiraPergunta().getOpcaoB());

        RadioButton opcaoC = findViewById(R.id.opcaoC);
        opcaoC.setText(quiz.getPrimeiraPergunta().getOpcaoC());

        RadioButton opcaoD = findViewById(R.id.opcaoD);
        opcaoD.setText(quiz.getPrimeiraPergunta().getOpcaoD());

        RadioButton opcaoE = findViewById(R.id.opcaoE);
        opcaoE.setText(quiz.getPrimeiraPergunta().getOpcaoE());

        if (!quiz.getPrimeiraPergunta().getResposta().equals("")) {
            if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getPrimeiraPergunta().getOpcaoA())) {
                opcaoA.setChecked(true);
            } else if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getPrimeiraPergunta().getOpcaoB())) {
                opcaoB.setChecked(true);
            } else if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getPrimeiraPergunta().getOpcaoC())) {
                opcaoC.setChecked(true);
            } else if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getPrimeiraPergunta().getOpcaoD())) {
                opcaoD.setChecked(true);
            } else if (quiz.getPrimeiraPergunta().getResposta().equals(quiz.getPrimeiraPergunta().getOpcaoE())) {
                opcaoE.setChecked(true);
            }

        }

    }

    private boolean validaTela() {

        if (quiz.getPrimeiraPergunta().getResposta().equals("")) {
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
                    quiz.getPrimeiraPergunta().setResposta(quiz.getPrimeiraPergunta().getOpcaoA());
                    break;
                }
            case R.id.opcaoB:
                if (checked) {
                    quiz.getPrimeiraPergunta().setResposta(quiz.getPrimeiraPergunta().getOpcaoB());
                    break;
                }
            case R.id.opcaoC:
                if (checked) {
                    quiz.getPrimeiraPergunta().setResposta(quiz.getPrimeiraPergunta().getOpcaoC());
                    break;
                }
            case R.id.opcaoD:
                if (checked) {
                    quiz.getPrimeiraPergunta().setResposta(quiz.getPrimeiraPergunta().getOpcaoD());
                    break;
                }
            case R.id.opcaoE:
                if (checked) {
                    quiz.getPrimeiraPergunta().setResposta(quiz.getPrimeiraPergunta().getOpcaoE());
                    break;
                }
        }
    }
}
