package com.example.dalsa.battaglianavale.Player1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dalsa.battaglianavale.R;

public class Fragment2G1 extends Fragment {

    private int contaBarche_f2g1 = 0;

    private boolean doppioClickA1_f2g1 = true, doppioClickA2_f2g1 = true, doppioClickA3_f2g1 = true,
            doppioClickA4_f2g1 = true, doppioClickA5_f2g1 = true, doppioClickA6_f2g1 = true, doppioClickA7_f2g1 = true;
    private boolean doppioClickB1_f2g1 = true, doppioClickB2_f2g1 = true, doppioClickB3_f2g1 = true,
            doppioClickB4_f2g1 = true, doppioClickB5_f2g1 = true, doppioClickB6_f2g1 = true, doppioClickB7_f2g1 = true;
    private boolean doppioClickC1_f2g1 = true, doppioClickC2_f2g1 = true, doppioClickC3_f2g1 = true,
            doppioClickC4_f2g1 = true, doppioClickC5_f2g1 = true, doppioClickC6_f2g1 = true, doppioClickC7_f2g1 = true;
    private boolean doppioClickD1_f2g1 = true, doppioClickD2_f2g1 = true, doppioClickD3_f2g1 = true,
            doppioClickD4_f2g1 = true, doppioClickD5_f2g1 = true, doppioClickD6_f2g1 = true, doppioClickD7_f2g1 = true;
    private boolean doppioClickE1_f2g1 = true, doppioClickE2_f2g1 = true, doppioClickE3_f2g1 = true,
            doppioClickE4_f2g1 = true, doppioClickE5_f2g1 = true, doppioClickE6_f2g1 = true, doppioClickE7_f2g1 = true;
    private boolean doppioClickF1_f2g1 = true, doppioClickF2_f2g1 = true, doppioClickF3_f2g1 = true,
            doppioClickF4_f2g1 = true, doppioClickF5_f2g1 = true, doppioClickF6_f2g1 = true, doppioClickF7_f2g1 = true;
    private boolean doppioClickG1_f2g1 = true, doppioClickG2_f2g1 = true, doppioClickG3_f2g1 = true,
            doppioClickG4_f2g1 = true, doppioClickG5_f2g1 = true, doppioClickG6_f2g1 = true, doppioClickG7_f2g1 = true;

    private interfaceFragment iListener_f2g1;

    private Button f2g1_A1, f2g1_A2, f2g1_A3, f2g1_A4, f2g1_A5, f2g1_A6, f2g1_A7;
    private Button f2g1_B1, f2g1_B2, f2g1_B3, f2g1_B4, f2g1_B5, f2g1_B6, f2g1_B7;
    private Button f2g1_C1, f2g1_C2, f2g1_C3, f2g1_C4, f2g1_C5, f2g1_C6, f2g1_C7;
    private Button f2g1_D1, f2g1_D2, f2g1_D3, f2g1_D4, f2g1_D5, f2g1_D6, f2g1_D7;
    private Button f2g1_E1, f2g1_E2, f2g1_E3, f2g1_E4, f2g1_E5, f2g1_E6, f2g1_E7;
    private Button f2g1_F1, f2g1_F2, f2g1_F3, f2g1_F4, f2g1_F5, f2g1_F6, f2g1_F7;
    private Button f2g1_G1, f2g1_G2, f2g1_G3, f2g1_G4, f2g1_G5, f2g1_G6, f2g1_G7;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof Fragment2G1.interfaceFragment) {
            iListener_f2g1 = (Fragment2G1.interfaceFragment) activity;
        } else {
            iListener_f2g1 = null;
        }
    }

    //Interfaccia
    public interface interfaceFragment {
        public void indietro_f2g1();

        public void selezionatoTrue_f2g1(int i);

        public void avanti_f2g1();

        public void setTextAct_f2g1();

        public void toastLimiteBarche_f2g1();

        public void selezionatoFalse_f2g1(int i);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        //Per salvare il fragment
        if (view != null) {
            if ((ViewGroup) view.getParent() != null)
                ((ViewGroup) view.getParent()).removeView(view);
            return view;
        }
        view = inflater.inflate(R.layout.fragment2g1, container, false);


        //Creo i bottoni F2G1
        f2g1_A1 = view.findViewById(R.id.f2g1_A1);
        f2g1_A2 = view.findViewById(R.id.f2g1_A2);
        f2g1_A3 = view.findViewById(R.id.f2g1_A3);
        f2g1_A4 = view.findViewById(R.id.f2g1_A4);
        f2g1_A5 = view.findViewById(R.id.f2g1_A5);
        f2g1_A6 = view.findViewById(R.id.f2g1_A6);
        f2g1_A7 = view.findViewById(R.id.f2g1_A7);

        f2g1_B1 = view.findViewById(R.id.f2g1_B1);
        f2g1_B2 = view.findViewById(R.id.f2g1_B2);
        f2g1_B3 = view.findViewById(R.id.f2g1_B3);
        f2g1_B4 = view.findViewById(R.id.f2g1_B4);
        f2g1_B5 = view.findViewById(R.id.f2g1_B5);
        f2g1_B6 = view.findViewById(R.id.f2g1_B6);
        f2g1_B7 = view.findViewById(R.id.f2g1_B7);

        f2g1_C1 = view.findViewById(R.id.f2g1_C1);
        f2g1_C2 = view.findViewById(R.id.f2g1_C2);
        f2g1_C3 = view.findViewById(R.id.f2g1_C3);
        f2g1_C4 = view.findViewById(R.id.f2g1_C4);
        f2g1_C5 = view.findViewById(R.id.f2g1_C5);
        f2g1_C6 = view.findViewById(R.id.f2g1_C6);
        f2g1_C7 = view.findViewById(R.id.f2g1_C7);

        f2g1_D1 = view.findViewById(R.id.f2g1_D1);
        f2g1_D2 = view.findViewById(R.id.f2g1_D2);
        f2g1_D3 = view.findViewById(R.id.f2g1_D3);
        f2g1_D4 = view.findViewById(R.id.f2g1_D4);
        f2g1_D5 = view.findViewById(R.id.f2g1_D5);
        f2g1_D6 = view.findViewById(R.id.f2g1_D6);
        f2g1_D7 = view.findViewById(R.id.f2g1_D7);

        f2g1_E1 = view.findViewById(R.id.f2g1_E1);
        f2g1_E2 = view.findViewById(R.id.f2g1_E2);
        f2g1_E3 = view.findViewById(R.id.f2g1_E3);
        f2g1_E4 = view.findViewById(R.id.f2g1_E4);
        f2g1_E5 = view.findViewById(R.id.f2g1_E5);
        f2g1_E6 = view.findViewById(R.id.f2g1_E6);
        f2g1_E7 = view.findViewById(R.id.f2g1_E7);

        f2g1_F1 = view.findViewById(R.id.f2g1_F1);
        f2g1_F2 = view.findViewById(R.id.f2g1_F2);
        f2g1_F3 = view.findViewById(R.id.f2g1_F3);
        f2g1_F4 = view.findViewById(R.id.f2g1_F4);
        f2g1_F5 = view.findViewById(R.id.f2g1_F5);
        f2g1_F6 = view.findViewById(R.id.f2g1_F6);
        f2g1_F7 = view.findViewById(R.id.f2g1_F7);

        f2g1_G1 = view.findViewById(R.id.f2g1_G1);
        f2g1_G2 = view.findViewById(R.id.f2g1_G2);
        f2g1_G3 = view.findViewById(R.id.f2g1_G3);
        f2g1_G4 = view.findViewById(R.id.f2g1_G4);
        f2g1_G5 = view.findViewById(R.id.f2g1_G5);
        f2g1_G6 = view.findViewById(R.id.f2g1_G6);
        f2g1_G7 = view.findViewById(R.id.f2g1_G7);

        final Button btn_avanti_f2g1 = view.findViewById(R.id.btn_avanti_f2g1);
        final Button btn_indietro_f2g1 = view.findViewById(R.id.btn_indietro_f2g1);
        btn_indietro_f2g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.indietro_f2g1();
            }
        });

        btn_avanti_f2g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contaBarche_f2g1 == 12) {
                    iListener_f2g1.avanti_f2g1();
                    iListener_f2g1.setTextAct_f2g1();

                    f2g1_A1.setEnabled(false);
                    f2g1_A2.setEnabled(false);
                    f2g1_A3.setEnabled(false);
                    f2g1_A4.setEnabled(false);
                    f2g1_A5.setEnabled(false);
                    f2g1_A6.setEnabled(false);
                    f2g1_A7.setEnabled(false);
                    f2g1_B1.setEnabled(false);
                    f2g1_B2.setEnabled(false);
                    f2g1_B3.setEnabled(false);
                    f2g1_B4.setEnabled(false);
                    f2g1_B5.setEnabled(false);
                    f2g1_B6.setEnabled(false);
                    f2g1_B7.setEnabled(false);
                    f2g1_C1.setEnabled(false);
                    f2g1_C2.setEnabled(false);
                    f2g1_C3.setEnabled(false);
                    f2g1_C4.setEnabled(false);
                    f2g1_C5.setEnabled(false);
                    f2g1_C6.setEnabled(false);
                    f2g1_C7.setEnabled(false);
                    f2g1_D1.setEnabled(false);
                    f2g1_D2.setEnabled(false);
                    f2g1_D3.setEnabled(false);
                    f2g1_D4.setEnabled(false);
                    f2g1_D5.setEnabled(false);
                    f2g1_D6.setEnabled(false);
                    f2g1_D7.setEnabled(false);
                    f2g1_E1.setEnabled(false);
                    f2g1_E2.setEnabled(false);
                    f2g1_E3.setEnabled(false);
                    f2g1_E4.setEnabled(false);
                    f2g1_E5.setEnabled(false);
                    f2g1_E6.setEnabled(false);
                    f2g1_E7.setEnabled(false);
                    f2g1_F1.setEnabled(false);
                    f2g1_F2.setEnabled(false);
                    f2g1_F3.setEnabled(false);
                    f2g1_F4.setEnabled(false);
                    f2g1_F5.setEnabled(false);
                    f2g1_F6.setEnabled(false);
                    f2g1_F7.setEnabled(false);
                    f2g1_G1.setEnabled(false);
                    f2g1_G2.setEnabled(false);
                    f2g1_G3.setEnabled(false);
                    f2g1_G4.setEnabled(false);
                    f2g1_G5.setEnabled(false);
                    f2g1_G6.setEnabled(false);
                    f2g1_G7.setEnabled(false);

                    btn_indietro_f2g1.setVisibility(View.VISIBLE);
                    btn_avanti_f2g1.setVisibility(View.INVISIBLE);
                } else {
                    iListener_f2g1.toastLimiteBarche_f2g1();
                }
            }
        });

        //Uso i bottoni F2G1
        f2g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA1_f2g1) {
                    //Metodo per controllare se f2g1_A1 è selezionato o no
                    iListener_f2g1.selezionatoTrue_f2g1(0);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(0);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(1);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(1);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(2);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(2);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(3);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(3);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(4);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(4);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(5);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(5);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickA7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(6);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(6);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickA7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(7);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(7);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(8);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(8);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(9);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(9);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(10);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(10);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(11);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(11);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(12);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(12);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickB7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(13);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickB7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(13);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickB7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(14);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(14);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(15);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(15);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(16);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(16);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(17);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(17);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(18);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(18);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(19);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(19);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickC7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(20);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickC7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(20);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickC7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(21);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(21);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(22);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(22);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(23);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(23);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(24);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(24);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(25);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(25);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(26);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(26);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickD7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(27);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickD7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(27);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickD7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(28);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(28);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(29);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(29);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(30);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(30);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(31);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(31);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(32);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(32);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(33);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(33);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickE7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(34);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickE7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(34);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickE7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(35);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(35);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(36);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(36);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(37);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(37);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(38);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(38);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(39);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(39);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(40);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(40);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickF7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(41);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickF7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(41);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickF7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG1_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(42);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG1_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(42);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG1_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG2_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(43);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG2_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(43);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG2_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG3_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(44);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG3_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(44);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG3_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG4_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(45);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG4_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(45);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG4_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG5_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(46);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG5_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(46);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG5_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG6_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(47);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG6_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(47);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG6_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        f2g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doppioClickG7_f2g1) {
                    iListener_f2g1.selezionatoTrue_f2g1(48);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickG7_f2g1 = false;
                } else {
                    iListener_f2g1.selezionatoFalse_f2g1(48);
                    v.setBackgroundResource(R.drawable.my_button_g1);
                    contaBarche_f2g1--;
                    doppioClickG7_f2g1 = true;
                }
                bloccaButtons_f2g1();
            }
        });

        return view;
    }

    public void bloccaButtons_f2g1() {
        if (contaBarche_f2g1 == 12) {
            f2g1_A1.setEnabled(false);
            f2g1_A2.setEnabled(false);
            f2g1_A3.setEnabled(false);
            f2g1_A4.setEnabled(false);
            f2g1_A5.setEnabled(false);
            f2g1_A6.setEnabled(false);
            f2g1_A7.setEnabled(false);
            f2g1_B1.setEnabled(false);
            f2g1_B2.setEnabled(false);
            f2g1_B3.setEnabled(false);
            f2g1_B4.setEnabled(false);
            f2g1_B5.setEnabled(false);
            f2g1_B6.setEnabled(false);
            f2g1_B7.setEnabled(false);
            f2g1_C1.setEnabled(false);
            f2g1_C2.setEnabled(false);
            f2g1_C3.setEnabled(false);
            f2g1_C4.setEnabled(false);
            f2g1_C5.setEnabled(false);
            f2g1_C6.setEnabled(false);
            f2g1_C7.setEnabled(false);
            f2g1_D1.setEnabled(false);
            f2g1_D2.setEnabled(false);
            f2g1_D3.setEnabled(false);
            f2g1_D4.setEnabled(false);
            f2g1_D5.setEnabled(false);
            f2g1_D6.setEnabled(false);
            f2g1_D7.setEnabled(false);
            f2g1_E1.setEnabled(false);
            f2g1_E2.setEnabled(false);
            f2g1_E3.setEnabled(false);
            f2g1_E4.setEnabled(false);
            f2g1_E5.setEnabled(false);
            f2g1_E6.setEnabled(false);
            f2g1_E7.setEnabled(false);
            f2g1_F1.setEnabled(false);
            f2g1_F2.setEnabled(false);
            f2g1_F3.setEnabled(false);
            f2g1_F4.setEnabled(false);
            f2g1_F5.setEnabled(false);
            f2g1_F6.setEnabled(false);
            f2g1_F7.setEnabled(false);
            f2g1_G1.setEnabled(false);
            f2g1_G2.setEnabled(false);
            f2g1_G3.setEnabled(false);
            f2g1_G4.setEnabled(false);
            f2g1_G5.setEnabled(false);
            f2g1_G6.setEnabled(false);
            f2g1_G7.setEnabled(false);
            iListener_f2g1.toastLimiteBarche_f2g1();
        }
    }
}
