package com.example.dalsa.battaglianavale.Helpers;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dalsa.battaglianavale.R;

public class FragmentCambioTurno extends Fragment {

    interfaceFrag iListener_fi;
    Button btn_intermedio;
    boolean sceltaFrag;
    int contaBarche_f1g1, contaBarche_f1g2;
    String namePlayer1, namePlayer2;

    TextView barcheRestanti_g1, barcheRestanti_g2, tv_nomePlayer1, tv_nomePlayer2;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof FragmentCambioTurno.interfaceFrag) {
            iListener_fi = (FragmentCambioTurno.interfaceFrag) activity;
        } else {
            iListener_fi = null;
        }
    }

    //Interfaccia
    public interface interfaceFrag {
        public void passaTurno(boolean frag);

        public boolean fragmentG1orG2();

        public int returnContaBarche_f1g1();

        public int returnContaBarche_f1g2();

        public String returnNomePlayer1();

        public String returnNomePlayer2();
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        //Per salvare il fragment
        if (view != null) {
            if ((ViewGroup) view.getParent() != null)
                ((ViewGroup) view.getParent()).removeView(view);
            return view;
        }
        view = inflater.inflate(R.layout.frag_intermedio, container, false);

        sceltaFrag = true;

        contaBarche_f1g1 = iListener_fi.returnContaBarche_f1g1();
        barcheRestanti_g1 = view.findViewById(R.id.barcheRestanti_g1);
        barcheRestanti_g1.setText("Ships block left: "+(12-contaBarche_f1g1));

        contaBarche_f1g2 = iListener_fi.returnContaBarche_f1g2();
        barcheRestanti_g2 = view.findViewById(R.id.barcheRestanti_g2);
        barcheRestanti_g2.setText("Ships block left: "+(12-contaBarche_f1g2));

        namePlayer1 = iListener_fi.returnNomePlayer1();
        tv_nomePlayer1 = view.findViewById(R.id.tv_nomePlayer1);
        tv_nomePlayer1.setText(namePlayer1);

        namePlayer2 = iListener_fi.returnNomePlayer2();
        tv_nomePlayer2 = view.findViewById(R.id.tv_nomePlayer2);
        tv_nomePlayer2.setText(namePlayer2);



        btn_intermedio = view.findViewById(R.id.btn_intermedio);
        btn_intermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sceltaFrag = iListener_fi.fragmentG1orG2();
                iListener_fi.passaTurno(sceltaFrag);
            }
        });

        return view;
    }
}
