package br.com.fabiotavares.culinariabrasileira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.fabiotavares.culinariabrasileira.domain.PrimeiraPergunta;
import br.com.fabiotavares.culinariabrasileira.domain.Quiz;

public class MainActivity extends AppCompatActivity {

    private Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicia um pedido
        Button iniciar = findViewById(R.id.iniciar);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validaTela()) {
                    Intent i = new Intent(MainActivity.this, PrimeiraPerguntaActivity.class);
                    i.putExtra("obj_quiz", quiz);
                    startActivity(i);
                }
            }
        });

        try {
            quiz = (Quiz) getIntent().getSerializableExtra("obj_quiz");
            setNome(quiz.getNome());

        } catch (Exception e) {
            quiz = new Quiz();
        }

    }

    private boolean validaTela() {
        if (getNome().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.toast_digite_nome, Toast.LENGTH_SHORT).show();
            return false;
        } else {
            quiz.setNome(getNome());
            return true;
        }

    }

    private String getNome() {
        TextView textView = findViewById(R.id.nome_field);
        return textView.getText().toString();
    }

    private void setNome(String nome) {
        TextView textView = findViewById(R.id.nome_field);
        textView.setText(nome);
    }
}
