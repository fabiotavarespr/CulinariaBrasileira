package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class SextaPerguntaActivity extends AppCompatActivity {

    private Quiz quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta_pergunta);
        carregarTela();

        //Retornar
        TextView retornar = findViewById(R.id.retornar);

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SextaPerguntaActivity.this, QuintaPerguntaActivity.class);
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
                    Intent i = new Intent(SextaPerguntaActivity.this, GabaritoActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });
    }

    private void carregarTela() {
        quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");
        TextView pergunta = findViewById(R.id.pergunta);
        pergunta.setText(quiz.getSextaPergunta().getPergunta());

        CheckBox opcaoA = findViewById(R.id.opcaoA);
        opcaoA.setText(quiz.getSextaPergunta().getOpcaoA());

        CheckBox opcaoB = findViewById(R.id.opcaoB);
        opcaoB.setText(quiz.getSextaPergunta().getOpcaoB());

        CheckBox opcaoC = findViewById(R.id.opcaoC);
        opcaoC.setText(quiz.getSextaPergunta().getOpcaoC());

        CheckBox opcaoD = findViewById(R.id.opcaoD);
        opcaoD.setText(quiz.getSextaPergunta().getOpcaoD());

        CheckBox opcaoE = findViewById(R.id.opcaoE);
        opcaoE.setText(quiz.getSextaPergunta().getOpcaoE());

        if (!quiz.getSextaPergunta().getResposta().equals("")) {
            if (quiz.getSextaPergunta().getResposta().contains(quiz.getSextaPergunta().getOpcaoA())) {
                opcaoA.setChecked(true);
            }
            if (quiz.getSextaPergunta().getResposta().contains(quiz.getSextaPergunta().getOpcaoB())) {
                opcaoB.setChecked(true);
            }
            if (quiz.getSextaPergunta().getResposta().contains(quiz.getSextaPergunta().getOpcaoC())) {
                opcaoC.setChecked(true);
            }
            if (quiz.getSextaPergunta().getResposta().contains(quiz.getSextaPergunta().getOpcaoD())) {
                opcaoD.setChecked(true);
            }
            if (quiz.getSextaPergunta().getResposta().contains(quiz.getSextaPergunta().getOpcaoE())) {
                opcaoE.setChecked(true);
            }
        }

    }

    private boolean validaTela() {

        if (quiz.getSextaPergunta().getResposta().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.toast_escolha_opcao, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }


    public void onCheckBoxClick(View view) {
        quiz.getSextaPergunta().setResposta("");

        CheckBox opcaoA = findViewById(R.id.opcaoA);
        opcaoA.setText(quiz.getSextaPergunta().getOpcaoA());

        CheckBox opcaoB = findViewById(R.id.opcaoB);
        opcaoB.setText(quiz.getSextaPergunta().getOpcaoB());

        CheckBox opcaoC = findViewById(R.id.opcaoC);
        opcaoC.setText(quiz.getSextaPergunta().getOpcaoC());

        CheckBox opcaoD = findViewById(R.id.opcaoD);
        opcaoD.setText(quiz.getSextaPergunta().getOpcaoD());

        CheckBox opcaoE = findViewById(R.id.opcaoE);
        opcaoE.setText(quiz.getSextaPergunta().getOpcaoE());

        if (opcaoA.isChecked()) {
            adicionaHifen();
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + quiz.getSextaPergunta().getOpcaoA());
        }
        if (opcaoB.isChecked()) {
            adicionaHifen();
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + quiz.getSextaPergunta().getOpcaoB());
        }
        if (opcaoC.isChecked()) {
            adicionaHifen();
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + quiz.getSextaPergunta().getOpcaoC());
        }
        if (opcaoD.isChecked()) {
            adicionaHifen();
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + quiz.getSextaPergunta().getOpcaoD());
        }
        if (opcaoE.isChecked()) {
            adicionaHifen();
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + quiz.getSextaPergunta().getOpcaoE());
        }
    }

    private void adicionaHifen(){
        if(!quiz.getSextaPergunta().getResposta().equals("")){
            quiz.getSextaPergunta().setResposta(quiz.getSextaPergunta().getResposta() + " - ");
        }
    }
}


