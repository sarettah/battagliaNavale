package com.example.dalsa.battaglianavale.Helpers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalsa.battaglianavale.PlayerNameSelect.MainActivity;
import com.example.dalsa.battaglianavale.R;

public class VittoriaActivity extends AppCompatActivity {

    private Button btn_vittoria;
    private String nomePlayer;
    private TextView tv_nomeVincitore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vittoria);

        btn_vittoria = findViewById(R.id.btn_vittoria);
        btn_vittoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VittoriaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            nomePlayer = bundle.get("player") + "";
        }

        tv_nomeVincitore = findViewById(R.id.tv_nomeVincitore);
        tv_nomeVincitore.setText(nomePlayer);
    }
}
