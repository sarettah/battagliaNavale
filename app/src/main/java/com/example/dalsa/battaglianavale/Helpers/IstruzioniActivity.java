package com.example.dalsa.battaglianavale.Helpers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalsa.battaglianavale.PlayerNameSelect.MainActivity;
import com.example.dalsa.battaglianavale.R;

public class IstruzioniActivity extends AppCompatActivity {

    private TextView tv_istruzioni;
    private Button btn_indietroIstruzioni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istruzioni);

        tv_istruzioni = findViewById(R.id.tv_istruzioni);
        btn_indietroIstruzioni = findViewById(R.id.btn_indietroIstruzioni);

        tv_istruzioni.setText("1. inserire il nome dei giocatori \n2. premere il tasto 'start game' " +
                "\n3. prima il giocatore 1, poi il giocatore 2, devono disporre 4 barche (1 da 2, 2 da 3, 1 da 4) " +
                "\n4. a turno i giocatori hanno a disposizione una sola mossa per trovare le barche dell'avversario " +
                "\n5. se si vuole vedere le proprie barche basta schiacciare il tasto 'show your ships'" +
                "\n6. vince il giocatore che per primo trova tutte le barche dell'avversario");

        btn_indietroIstruzioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IstruzioniActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
