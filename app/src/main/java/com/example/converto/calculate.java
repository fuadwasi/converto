package com.example.converto;

public class calculate {
    //Area
    public static double ac_sm(double value) { return value*4046.856422; }
    public static double sm_ac(double value) { return value*0.000247; }
    public static double he_sm(double value) { return value*10000.000000; }
    public static double sm_he(double value) { return value*0.000100; }

    //Currency
    public static double tk_dol(double value) { return value*0.012; }
    public static double dol_tk(double value) { return value*84.63; }
    public static double tk_rup(double value) { return value*00.84; }
    public static double rup_tk(double value) { return value*01.19; }

    //Length
    public static double in_me(double value) { return value*0.025400; }
    public static double me_in(double value) { return value*39.370079; }
    public static double ya_fe(double value) { return value*03.00; }
    public static double fe_ya(double value) { return value*0.333333; }


    //Weight
    public static double kg_to(double value) { return value*0.001000; }
    public static double to_kg(double value) { return value*1000.000000; }
    public static double po_kg(double value) { return value*0.453592; }
    public static double kg_po(double value) { return value*2.204623; }


}
