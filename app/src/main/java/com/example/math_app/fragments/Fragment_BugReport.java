package com.example.math_app.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.math_app.MainActivity;
import com.example.math_app.R;
import com.example.math_app.fragments.calculators.Fragment_Interest_Calculator;
import com.example.math_app.fragments.calculators.Fragment_quad_calc;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_1;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_10;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_11;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_2;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_3;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_4;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_5;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_6;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_7;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_8;
import com.example.math_app.fragments.gymnaasium.Fragment_Gymnaasium_9;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_1;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_2;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_3;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_4;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_5;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_6;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_7;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_8;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_9;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_1;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_10;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_11;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_12;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_13;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_14;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_15;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_16;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_17;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_18;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_19;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_2;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_20;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_3;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_4;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_5;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_6;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_7;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_8;
import com.example.math_app.fragments.klass_2.Fragment_Klass_2_9;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_1;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_10;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_11;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_12;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_13;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_14;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_15;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_16;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_17;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_2;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_3;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_4;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_5;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_6;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_7;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_8;
import com.example.math_app.fragments.klass_3.Fragment_Klass_3_9;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_1;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_10;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_11;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_12;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_13;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_14;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_15;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_2;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_3;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_4;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_5;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_6;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_7;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_8;
import com.example.math_app.fragments.klass_4.Fragment_Klass_4_9;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_1;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_10;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_11;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_12;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_13;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_14;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_15;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_16;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_17;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_18;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_19;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_2;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_20;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_21;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_22;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_23;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_24;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_25;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_26;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_27;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_28;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_29;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_3;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_30;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_31;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_32;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_4;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_5;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_6;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_7;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_8;
import com.example.math_app.fragments.klass_5.Fragment_Klass_5_9;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_1;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_10;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_11;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_12;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_13;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_14;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_15;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_16;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_17;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_18;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_19;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_2;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_20;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_21;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_22;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_23;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_24;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_3;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_4;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_5;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_6;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_7;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_8;
import com.example.math_app.fragments.klass_6.Fragment_Klass_6_9;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_1;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_10;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_11;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_12;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_13;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_14;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_15;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_16;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_17;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_18;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_19;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_2;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_20;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_21;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_22;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_23;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_3;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_4;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_5;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_6;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_7;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_8;
import com.example.math_app.fragments.klass_7.Fragment_Klass_7_9;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_1;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_10;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_11;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_12;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_13;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_14;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_15;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_16;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_17;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_18;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_19;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_2;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_20;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_21;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_22;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_23;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_24;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_25;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_26;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_3;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_4;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_5;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_6;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_7;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_8;
import com.example.math_app.fragments.klass_8.Fragment_Klass_8_9;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_1;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_10;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_11;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_12;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_13;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_14;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_15;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_16;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_17;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_18;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_2;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_3;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_4;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_5;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_6;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_7;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_8;
import com.example.math_app.fragments.klass_9.Fragment_Klass_9_9;

import org.json.JSONObject;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import static android.widget.Toast.LENGTH_SHORT;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_BugReport.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_BugReport#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_BugReport extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    TextView defText;
    String definitsioon;
    EditText selgitus;
    Button button;
    String status;
    String fragmentStringName;
    int counter;

    boolean state = false;

    Fragment_quad_calc quad_calc = new Fragment_quad_calc();
    Fragment_Interest_Calculator interest_calculator = new Fragment_Interest_Calculator();

    Fragment_Klass_1_1 klass_1_1 = new Fragment_Klass_1_1();
    Fragment_Klass_1_2 klass_1_2 = new Fragment_Klass_1_2();
    Fragment_Klass_1_3 klass_1_3 = new Fragment_Klass_1_3();
    Fragment_Klass_1_4 klass_1_4 = new Fragment_Klass_1_4();
    Fragment_Klass_1_5 klass_1_5 = new Fragment_Klass_1_5();
    Fragment_Klass_1_6 klass_1_6 = new Fragment_Klass_1_6();
    Fragment_Klass_1_7 klass_1_7 = new Fragment_Klass_1_7();
    Fragment_Klass_1_8 klass_1_8 = new Fragment_Klass_1_8();
    Fragment_Klass_1_9 klass_1_9 = new Fragment_Klass_1_9();
    Fragment_Klass_2_1 klass_2_1 = new Fragment_Klass_2_1();
    Fragment_Klass_2_2 klass_2_2 = new Fragment_Klass_2_2();
    Fragment_Klass_2_3 klass_2_3 = new Fragment_Klass_2_3();
    Fragment_Klass_2_4 klass_2_4 = new Fragment_Klass_2_4();
    Fragment_Klass_2_5 klass_2_5 = new Fragment_Klass_2_5();
    Fragment_Klass_2_6 klass_2_6 = new Fragment_Klass_2_6();
    Fragment_Klass_2_7 klass_2_7 = new Fragment_Klass_2_7();
    Fragment_Klass_2_8 klass_2_8 = new Fragment_Klass_2_8();
    Fragment_Klass_2_9 klass_2_9 = new Fragment_Klass_2_9();
    Fragment_Klass_2_10 klass_2_10 = new Fragment_Klass_2_10();
    Fragment_Klass_2_11 klass_2_11 = new Fragment_Klass_2_11();
    Fragment_Klass_2_12 klass_2_12 = new Fragment_Klass_2_12();
    Fragment_Klass_2_13 klass_2_13 = new Fragment_Klass_2_13();
    Fragment_Klass_2_14 klass_2_14 = new Fragment_Klass_2_14();
    Fragment_Klass_2_15 klass_2_15 = new Fragment_Klass_2_15();
    Fragment_Klass_2_16 klass_2_16 = new Fragment_Klass_2_16();
    Fragment_Klass_2_17 klass_2_17 = new Fragment_Klass_2_17();
    Fragment_Klass_2_18 klass_2_18 = new Fragment_Klass_2_18();
    Fragment_Klass_2_19 klass_2_19 = new Fragment_Klass_2_19();
    Fragment_Klass_2_20 klass_2_20 = new Fragment_Klass_2_20();
    Fragment_Klass_3_1 klass_3_1 = new Fragment_Klass_3_1();
    Fragment_Klass_3_2 klass_3_2 = new Fragment_Klass_3_2();
    Fragment_Klass_3_3 klass_3_3 = new Fragment_Klass_3_3();
    Fragment_Klass_3_4 klass_3_4 = new Fragment_Klass_3_4();
    Fragment_Klass_3_5 klass_3_5 = new Fragment_Klass_3_5();
    Fragment_Klass_3_6 klass_3_6 = new Fragment_Klass_3_6();
    Fragment_Klass_3_7 klass_3_7 = new Fragment_Klass_3_7();
    Fragment_Klass_3_8 klass_3_8 = new Fragment_Klass_3_8();
    Fragment_Klass_3_9 klass_3_9 = new Fragment_Klass_3_9();
    Fragment_Klass_3_10 klass_3_10 = new Fragment_Klass_3_10();
    Fragment_Klass_3_11 klass_3_11 = new Fragment_Klass_3_11();
    Fragment_Klass_3_12 klass_3_12 = new Fragment_Klass_3_12();
    Fragment_Klass_3_13 klass_3_13 = new Fragment_Klass_3_13();
    Fragment_Klass_3_14 klass_3_14 = new Fragment_Klass_3_14();
    Fragment_Klass_3_15 klass_3_15 = new Fragment_Klass_3_15();
    Fragment_Klass_3_16 klass_3_16 = new Fragment_Klass_3_16();
    Fragment_Klass_3_17 klass_3_17 = new Fragment_Klass_3_17();
    Fragment_Klass_4_1 klass_4_1 = new Fragment_Klass_4_1();
    Fragment_Klass_4_2 klass_4_2 = new Fragment_Klass_4_2();
    Fragment_Klass_4_3 klass_4_3 = new Fragment_Klass_4_3();
    Fragment_Klass_4_4 klass_4_4 = new Fragment_Klass_4_4();
    Fragment_Klass_4_5 klass_4_5 = new Fragment_Klass_4_5();
    Fragment_Klass_4_6 klass_4_6 = new Fragment_Klass_4_6();
    Fragment_Klass_4_7 klass_4_7 = new Fragment_Klass_4_7();
    Fragment_Klass_4_8 klass_4_8 = new Fragment_Klass_4_8();
    Fragment_Klass_4_9 klass_4_9 = new Fragment_Klass_4_9();
    Fragment_Klass_4_10 klass_4_10 = new Fragment_Klass_4_10();
    Fragment_Klass_4_11 klass_4_11 = new Fragment_Klass_4_11();
    Fragment_Klass_4_12 klass_4_12 = new Fragment_Klass_4_12();
    Fragment_Klass_4_13 klass_4_13 = new Fragment_Klass_4_13();
    Fragment_Klass_4_14 klass_4_14 = new Fragment_Klass_4_14();
    Fragment_Klass_4_15 klass_4_15 = new Fragment_Klass_4_15();
    Fragment_Klass_5_1 klass_5_1 = new Fragment_Klass_5_1();
    Fragment_Klass_5_2 klass_5_2 = new Fragment_Klass_5_2();
    Fragment_Klass_5_3 klass_5_3 = new Fragment_Klass_5_3();
    Fragment_Klass_5_4 klass_5_4 = new Fragment_Klass_5_4();
    Fragment_Klass_5_5 klass_5_5 = new Fragment_Klass_5_5();
    Fragment_Klass_5_6 klass_5_6 = new Fragment_Klass_5_6();
    Fragment_Klass_5_7 klass_5_7 = new Fragment_Klass_5_7();
    Fragment_Klass_5_8 klass_5_8 = new Fragment_Klass_5_8();
    Fragment_Klass_5_9 klass_5_9 = new Fragment_Klass_5_9();
    Fragment_Klass_5_10 klass_5_10 = new Fragment_Klass_5_10();
    Fragment_Klass_5_11 klass_5_11 = new Fragment_Klass_5_11();
    Fragment_Klass_5_12 klass_5_12 = new Fragment_Klass_5_12();
    Fragment_Klass_5_13 klass_5_13 = new Fragment_Klass_5_13();
    Fragment_Klass_5_14 klass_5_14 = new Fragment_Klass_5_14();
    Fragment_Klass_5_15 klass_5_15 = new Fragment_Klass_5_15();
    Fragment_Klass_5_16 klass_5_16 = new Fragment_Klass_5_16();
    Fragment_Klass_5_17 klass_5_17 = new Fragment_Klass_5_17();
    Fragment_Klass_5_18 klass_5_18 = new Fragment_Klass_5_18();
    Fragment_Klass_5_19 klass_5_19 = new Fragment_Klass_5_19();
    Fragment_Klass_5_20 klass_5_20 = new Fragment_Klass_5_20();
    Fragment_Klass_5_21 klass_5_21 = new Fragment_Klass_5_21();
    Fragment_Klass_5_22 klass_5_22 = new Fragment_Klass_5_22();
    Fragment_Klass_5_23 klass_5_23 = new Fragment_Klass_5_23();
    Fragment_Klass_5_24 klass_5_24 = new Fragment_Klass_5_24();
    Fragment_Klass_5_25 klass_5_25 = new Fragment_Klass_5_25();
    Fragment_Klass_5_26 klass_5_26 = new Fragment_Klass_5_26();
    Fragment_Klass_5_27 klass_5_27 = new Fragment_Klass_5_27();
    Fragment_Klass_5_28 klass_5_28 = new Fragment_Klass_5_28();
    Fragment_Klass_5_29 klass_5_29 = new Fragment_Klass_5_29();
    Fragment_Klass_5_30 klass_5_30 = new Fragment_Klass_5_30();
    Fragment_Klass_5_31 klass_5_31 = new Fragment_Klass_5_31();
    Fragment_Klass_5_32 klass_5_32 = new Fragment_Klass_5_32();
    Fragment_Klass_6_1 klass_6_1 = new Fragment_Klass_6_1();
    Fragment_Klass_6_2 klass_6_2 = new Fragment_Klass_6_2();
    Fragment_Klass_6_3 klass_6_3 = new Fragment_Klass_6_3();
    Fragment_Klass_6_4 klass_6_4 = new Fragment_Klass_6_4();
    Fragment_Klass_6_5 klass_6_5 = new Fragment_Klass_6_5();
    Fragment_Klass_6_6 klass_6_6 = new Fragment_Klass_6_6();
    Fragment_Klass_6_7 klass_6_7 = new Fragment_Klass_6_7();
    Fragment_Klass_6_8 klass_6_8 = new Fragment_Klass_6_8();
    Fragment_Klass_6_9 klass_6_9 = new Fragment_Klass_6_9();
    Fragment_Klass_6_10 klass_6_10 = new Fragment_Klass_6_10();
    Fragment_Klass_6_11 klass_6_11 = new Fragment_Klass_6_11();
    Fragment_Klass_6_12 klass_6_12 = new Fragment_Klass_6_12();
    Fragment_Klass_6_13 klass_6_13 = new Fragment_Klass_6_13();
    Fragment_Klass_6_14 klass_6_14 = new Fragment_Klass_6_14();
    Fragment_Klass_6_15 klass_6_15 = new Fragment_Klass_6_15();
    Fragment_Klass_6_16 klass_6_16 = new Fragment_Klass_6_16();
    Fragment_Klass_6_17 klass_6_17 = new Fragment_Klass_6_17();
    Fragment_Klass_6_18 klass_6_18 = new Fragment_Klass_6_18();
    Fragment_Klass_6_19 klass_6_19 = new Fragment_Klass_6_19();
    Fragment_Klass_6_20 klass_6_20 = new Fragment_Klass_6_20();
    Fragment_Klass_6_21 klass_6_21 = new Fragment_Klass_6_21();
    Fragment_Klass_6_22 klass_6_22 = new Fragment_Klass_6_22();
    Fragment_Klass_6_23 klass_6_23 = new Fragment_Klass_6_23();
    Fragment_Klass_6_24 klass_6_24 = new Fragment_Klass_6_24();
    Fragment_Klass_7_1 klass_7_1 = new Fragment_Klass_7_1();
    Fragment_Klass_7_2 klass_7_2 = new Fragment_Klass_7_2();
    Fragment_Klass_7_3 klass_7_3 = new Fragment_Klass_7_3();
    Fragment_Klass_7_4 klass_7_4 = new Fragment_Klass_7_4();
    Fragment_Klass_7_5 klass_7_5 = new Fragment_Klass_7_5();
    Fragment_Klass_7_6 klass_7_6 = new Fragment_Klass_7_6();
    Fragment_Klass_7_7 klass_7_7 = new Fragment_Klass_7_7();
    Fragment_Klass_7_8 klass_7_8 = new Fragment_Klass_7_8();
    Fragment_Klass_7_9 klass_7_9 = new Fragment_Klass_7_9();
    Fragment_Klass_7_10 klass_7_10 = new Fragment_Klass_7_10();
    Fragment_Klass_7_11 klass_7_11 = new Fragment_Klass_7_11();
    Fragment_Klass_7_12 klass_7_12 = new Fragment_Klass_7_12();
    Fragment_Klass_7_13 klass_7_13 = new Fragment_Klass_7_13();
    Fragment_Klass_7_14 klass_7_14 = new Fragment_Klass_7_14();
    Fragment_Klass_7_15 klass_7_15 = new Fragment_Klass_7_15();
    Fragment_Klass_7_16 klass_7_16 = new Fragment_Klass_7_16();
    Fragment_Klass_7_17 klass_7_17 = new Fragment_Klass_7_17();
    Fragment_Klass_7_18 klass_7_18 = new Fragment_Klass_7_18();
    Fragment_Klass_7_19 klass_7_19 = new Fragment_Klass_7_19();
    Fragment_Klass_7_20 klass_7_20 = new Fragment_Klass_7_20();
    Fragment_Klass_7_21 klass_7_21 = new Fragment_Klass_7_21();
    Fragment_Klass_7_22 klass_7_22 = new Fragment_Klass_7_22();
    Fragment_Klass_7_23 klass_7_23 = new Fragment_Klass_7_23();
    Fragment_Klass_8_1 klass_8_1 = new Fragment_Klass_8_1();
    Fragment_Klass_8_2 klass_8_2 = new Fragment_Klass_8_2();
    Fragment_Klass_8_3 klass_8_3 = new Fragment_Klass_8_3();
    Fragment_Klass_8_4 klass_8_4 = new Fragment_Klass_8_4();
    Fragment_Klass_8_5 klass_8_5 = new Fragment_Klass_8_5();
    Fragment_Klass_8_6 klass_8_6 = new Fragment_Klass_8_6();
    Fragment_Klass_8_7 klass_8_7 = new Fragment_Klass_8_7();
    Fragment_Klass_8_8 klass_8_8 = new Fragment_Klass_8_8();
    Fragment_Klass_8_9 klass_8_9 = new Fragment_Klass_8_9();
    Fragment_Klass_8_10 klass_8_10 = new Fragment_Klass_8_10();
    Fragment_Klass_8_11 klass_8_11 = new Fragment_Klass_8_11();
    Fragment_Klass_8_12 klass_8_12 = new Fragment_Klass_8_12();
    Fragment_Klass_8_13 klass_8_13 = new Fragment_Klass_8_13();
    Fragment_Klass_8_14 klass_8_14 = new Fragment_Klass_8_14();
    Fragment_Klass_8_15 klass_8_15 = new Fragment_Klass_8_15();
    Fragment_Klass_8_16 klass_8_16 = new Fragment_Klass_8_16();
    Fragment_Klass_8_17 klass_8_17 = new Fragment_Klass_8_17();
    Fragment_Klass_8_18 klass_8_18 = new Fragment_Klass_8_18();
    Fragment_Klass_8_19 klass_8_19 = new Fragment_Klass_8_19();
    Fragment_Klass_8_20 klass_8_20 = new Fragment_Klass_8_20();
    Fragment_Klass_8_21 klass_8_21 = new Fragment_Klass_8_21();
    Fragment_Klass_8_22 klass_8_22 = new Fragment_Klass_8_22();
    Fragment_Klass_8_23 klass_8_23 = new Fragment_Klass_8_23();
    Fragment_Klass_8_24 klass_8_24 = new Fragment_Klass_8_24();
    Fragment_Klass_8_25 klass_8_25 = new Fragment_Klass_8_25();
    Fragment_Klass_8_26 klass_8_26 = new Fragment_Klass_8_26();
    Fragment_Klass_9_1 klass_9_1 = new Fragment_Klass_9_1();
    Fragment_Klass_9_2 klass_9_2 = new Fragment_Klass_9_2();
    Fragment_Klass_9_3 klass_9_3 = new Fragment_Klass_9_3();
    Fragment_Klass_9_4 klass_9_4 = new Fragment_Klass_9_4();
    Fragment_Klass_9_5 klass_9_5 = new Fragment_Klass_9_5();
    Fragment_Klass_9_6 klass_9_6 = new Fragment_Klass_9_6();
    Fragment_Klass_9_7 klass_9_7 = new Fragment_Klass_9_7();
    Fragment_Klass_9_8 klass_9_8 = new Fragment_Klass_9_8();
    Fragment_Klass_9_9 klass_9_9 = new Fragment_Klass_9_9();
    Fragment_Klass_9_10 klass_9_10 = new Fragment_Klass_9_10();
    Fragment_Klass_9_11 klass_9_11 = new Fragment_Klass_9_11();
    Fragment_Klass_9_12 klass_9_12 = new Fragment_Klass_9_12();
    Fragment_Klass_9_13 klass_9_13 = new Fragment_Klass_9_13();
    Fragment_Klass_9_14 klass_9_14 = new Fragment_Klass_9_14();
    Fragment_Klass_9_15 klass_9_15 = new Fragment_Klass_9_15();
    Fragment_Klass_9_16 klass_9_16 = new Fragment_Klass_9_16();
    Fragment_Klass_9_17 klass_9_17 = new Fragment_Klass_9_17();
    Fragment_Klass_9_18 klass_9_18 = new Fragment_Klass_9_18();
    Fragment_Gymnaasium_1 gymnaasium_1 = new Fragment_Gymnaasium_1();
    Fragment_Gymnaasium_2 gymnaasium_2 = new Fragment_Gymnaasium_2();
    Fragment_Gymnaasium_3 gymnaasium_3 = new Fragment_Gymnaasium_3();
    Fragment_Gymnaasium_4 gymnaasium_4 = new Fragment_Gymnaasium_4();
    Fragment_Gymnaasium_5 gymnaasium_5 = new Fragment_Gymnaasium_5();
    Fragment_Gymnaasium_6 gymnaasium_6 = new Fragment_Gymnaasium_6();
    Fragment_Gymnaasium_7 gymnaasium_7 = new Fragment_Gymnaasium_7();
    Fragment_Gymnaasium_8 gymnaasium_8 = new Fragment_Gymnaasium_8();
    Fragment_Gymnaasium_9 gymnaasium_9 = new Fragment_Gymnaasium_9();
    Fragment_Gymnaasium_10 gymnaasium_10 = new Fragment_Gymnaasium_10();
    Fragment_Gymnaasium_11 gymnaasium_11 = new Fragment_Gymnaasium_11();

    Fragment frag = null;

    View v;

    String[] headers ={"Arvude võrdlemine->klass_1_1", "Paaris- ja paaritud arvud->klass_1_2", "Üleminekuga liitmine, lahutamine->klass_1_3", "Tabel: arvude liitmine->klass_1_4", "Tabel: arvude lahutamine->klass_1_5", "Tabel: täiskümnete liitmine->klass_1_6", "Tabel: täiskümnete lahutamine->klass_1_7", "Mõõtühikud->klass_1_8", "Geomeetrilised kujundid->klass_1_9", "Võrdus ja võrratus->klass_2_1", "Arvud 1 - 100->klass_2_2", "Ühelised, kümnelised->klass_2_3", "Suurendamine ja vähendamine->klass_2_4", "Arvud 1 - 1000->klass_2_5", "Arvutamine 20 piires->klass_2_6", "Arvutamine arvudega 0 - 100->klass_2_7", "Korrutamine, seos liitmisega->klass_2_8", "Korda suurem, korda vähem->klass_2_9", "Jagamine, seos korrutamisega->klass_2_10", "Pikkusühikud->klass_2_11", "Mahuühikud->klass_2_12", "Ajaühikud->klass_2_13", "Täht arvu tähisena->klass_2_14", "Sirge ja sirglõik->klass_2_15", "Nurk->klass_2_16", "Nelinurgad->klass_2_17", "Kolmnurk->klass_2_18", "Ring ja ringjoon->klass_2_19", "Ruumilised kujundid->klass_2_20", "Arvud 1 - 10000->klass_3_1", "Arvude ehitus->klass_3_2", "Tehete järjekord->klass_3_3", "Korrutustabel->klass_3_4", "Korrutamine ja jagamine->klass_3_5", "Arvude osadeks jagamine->klass_3_6", "Ajaühikud->klass_3_7", "Raskusühikud->klass_3_8", "Pikkusühikud->klass_3_9", "Mahuühikud->klass_3_10", "Täht arvu tähisena->klass_3_11", "Sirge, sirglõik ja murdjoon->klass_3_12", "Nelinurgad->klass_3_13", "Kolmnurk->klass_3_14", "Nurk->klass_3_15", "Ring ja ringjoon->klass_3_16", "Ruumilised kujundid->klass_3_17", "Naturaalarvud->klass_4_1", "Arvud vs numbrid->klass_4_2", "Järkarvud->klass_4_3", "Tehted arvudega->klass_4_4", "Arvude omadused->klass_4_5", "Arvude jaguvus->klass_4_6", "Null->klass_4_7", "Naturaalarvu ruut->klass_4_8", "Liitmistehe->klass_4_9", "Lahutamistehe->klass_4_10", "Korrutamistehe->klass_4_11", "Jagamistehe->klass_4_12", "Tasandilised kujundid->klass_4_13", "Ruumilised kujundid->klass_4_14", "Ümbermõõt ja pindala->klass_4_15", "Naturaalarvud->klass_5_1", "Arvu klassid->klass_5_2", "Ümardamine->klass_5_3", "Jaguvuse tunnused->klass_5_4", "Algarvud->klass_5_5", "Vähim ühiskordne->klass_5_6", "Suurim ühistegur->klass_5_7", "Rooma numbrid->klass_5_8", "Murdarv->klass_5_9", "Arvu ruut ja kuup->klass_5_10", "Murdude liitmine, lahutamine->klass_5_11", "Murdude korrutamine->klass_5_12", "Murdude jagamine->klass_5_13", "Tehete järjekord->klass_5_14", "Pindalaühikud->klass_5_15", "Ruumalaühikud->klass_5_16", "Plaanimõõt->klass_5_17", "Sagedus, sagedustabel->klass_5_18", "Mood->klass_5_19", "Skaala->klass_5_20", "Aritmeetiline keskmine->klass_5_21", "Diagrammid->klass_5_22", "Arvavaldis, tähtavaldis->klass_5_23", "Valem->klass_5_24", "Võrrand->klass_5_25", "Arvkiir->klass_5_26", "Punkt, tasand->klass_5_27", "Jooned->klass_5_28", "Nurk->klass_5_29", "Sirgete omadused->klass_5_30", "Risttahukas->klass_5_31", "Kuup->klass_5_32", "Täisarvud, negatiivsed arvud->klass_6_1", "Vastandarv->klass_6_2", "Arvu absoluutväärtus->klass_6_3", "Pöördarv->klass_6_4", "Harilik murd->klass_6_5", "Hariliku murru taandamine->klass_6_6", "Kümnendmurd->klass_6_7", "Protsent->klass_6_8", "Tehted negatiivsete arvudega->klass_6_9", "Sektor->klass_6_10", "Sektordiagramm->klass_6_11", "Võrrandi lihtsustamine->klass_6_12", "Lineaarvõrrand->klass_6_13", "Arvkiir->klass_6_14", "Koordinaatteljestik->klass_6_15", "Koordinaadid->klass_6_16", "Sümmeetria->klass_6_17", "Lõik->klass_6_18", "Nurk->klass_6_19", "Kolmnurga elemendid->klass_6_20", "Kolmnurkade liigitamine->klass_6_21", "Kolmnurkade omadused->klass_6_22", "Ringjoone omadused->klass_6_23", "Kolmnurkne püstprisma->klass_6_24", "Arvuhulgad->klass_7_1", "Arvu absoluutväärtus->klass_7_2", "Protsendi leidmine->klass_7_3", "Terviku leidmine->klass_7_4", "Suhe, võrdeline seos->klass_7_5", "Pöördvõrdeline seos->klass_7_6", "Kasvamine, kahanemine->klass_7_7", "Astendamine->klass_7_8", "Astmed->klass_7_9", "Tehete järjekord->klass_7_10", "Sagedus, sagedustabel->klass_7_11", "Mood->klass_7_12", "Aritmeetiline keskmine->klass_7_13", "Võrdkujuline võrrand, võrre->klass_7_14", "Murdarvuline lineaarvõrrand->klass_7_15", "Funktsioon->klass_7_16", "Võrdeline seos->klass_7_17", "Lineaarne seos->klass_7_18", "Hulknurk->klass_7_19", "Rööpkülik->klass_7_20", "Romb->klass_7_21", "Trapets->klass_7_22", "Nelinurksed püstprismad->klass_7_23", "Astendamise reeglid->klass_8_1", "Kümne astmed->klass_8_2", "Standardkuju->klass_8_3", "Ruutjuur->klass_8_4", "Arvude ruudud, juured->klass_8_5", "Üksliige, hulkliige->klass_8_6", "Ruutude vahe valem->klass_8_7", "Kaksliikme ruut->klass_8_8", "Lihtsustamine->klass_8_9", "Ruutvõrrand->klass_8_10", "Ruutvõrrandi lihtsustamine->klass_8_11", "Liitmisvõte->klass_8_12", "Asendusvõte->klass_8_13", "Lahendi kontroll->klass_8_14", "Keskmine hälve->klass_8_15", "Katse, sündmus->klass_8_16", "Tõenäosus->klass_8_17", "Mõisted->klass_8_18", "Paralleelsed sirged->klass_8_19", "Kolmnurk->klass_8_20", "Rööpkülik->klass_8_21", "Romb->klass_8_22", "Trapets->klass_8_23", "Ringjoon->klass_8_24", "Püstprisma->klass_8_25", "Püramiid->klass_8_26", "Kuupjuur, neljas juur->klass_9_1", "Ruutkolmliige->klass_9_2", "Avaldised->klass_9_3", "Algebraline murd->klass_9_4", "Ruutfunktsioon->klass_9_5", "Tõenäosusteooria->klass_9_6", "Statistiline rida->klass_9_7", "Kaalutud keskmine->klass_9_8", "Üldkogum, valim->klass_9_9", "Võrdelised lõigud->klass_9_10", "Kolmnurk->klass_9_11", "Pythagorase teoreem->klass_9_12", "Hulknurgad->klass_9_13", "Siinus, koosinus, tangens->klass_9_14", "Mõõtkava->klass_9_15", "Silinder->klass_9_16", "Koonus->klass_9_17", "Kera->klass_9_18", "Avaldised ja arvhulgad->klass_gymnasium_1", "Võrrandid ja võrrandisüsteemid->klass_gymnasium_2", "Trigonomeetria I ja võrratused->klass_gymnasium_3", "Trigonomeetria II->klass_gymnasium_4", "Vektor tasandil->klass_gymnasium_5", "Tõenäosus ja statistika->klass_gymnasium_6", "Funktsioonid I ja jadad->klass_gymnasium_7", "Funktsioonid II->klass_gymnasium_8", "Funktsiooni piirväärtus ja tuletis->klass_gymnasium_9", "Integraal->klass_gymnasium_10", "Geomeetria->klass_gymnasium_11"};

    Fragment[] frags = {klass_1_1, klass_1_2, klass_1_3, klass_1_4, klass_1_5, klass_1_6, klass_1_7, klass_1_8, klass_1_9, klass_2_1, klass_2_2, klass_2_3, klass_2_4, klass_2_5, klass_2_6, klass_2_7, klass_2_8, klass_2_9, klass_2_10, klass_2_11, klass_2_12, klass_2_13, klass_2_14, klass_2_15, klass_2_16, klass_2_17, klass_2_18, klass_2_19, klass_2_20, klass_3_1, klass_3_2, klass_3_3, klass_3_4, klass_3_5, klass_3_6, klass_3_7, klass_3_8, klass_3_9, klass_3_10, klass_3_11, klass_3_12, klass_3_13, klass_3_14, klass_3_15, klass_3_16, klass_3_17, klass_4_1, klass_4_2, klass_4_3, klass_4_4, klass_4_5, klass_4_6, klass_4_7, klass_4_8, klass_4_9, klass_4_10, klass_4_11, klass_4_12, klass_4_13, klass_4_14, klass_4_15, klass_5_1, klass_5_2, klass_5_3, klass_5_4, klass_5_5, klass_5_6, klass_5_7, klass_5_8, klass_5_9, klass_5_10, klass_5_11, klass_5_12, klass_5_13, klass_5_14, klass_5_15, klass_5_16, klass_5_17, klass_5_18, klass_5_19, klass_5_20, klass_5_21, klass_5_22, klass_5_23, klass_5_24, klass_5_25, klass_5_26, klass_5_27, klass_5_28, klass_5_29, klass_5_30, klass_5_31, klass_5_32, klass_6_1, klass_6_2, klass_6_3, klass_6_4, klass_6_5, klass_6_6, klass_6_7, klass_6_8, klass_6_9, klass_6_10, klass_6_11, klass_6_12, klass_6_13, klass_6_14, klass_6_15, klass_6_16, klass_6_17, klass_6_18, klass_6_19, klass_6_20, klass_6_21, klass_6_22, klass_6_23, klass_6_24, klass_7_1, klass_7_2, klass_7_3, klass_7_4, klass_7_5, klass_7_6, klass_7_7, klass_7_8, klass_7_9, klass_7_10, klass_7_11, klass_7_12, klass_7_13, klass_7_14, klass_7_15, klass_7_16, klass_7_17, klass_7_18, klass_7_19, klass_7_20, klass_7_21, klass_7_22, klass_7_23, klass_8_1, klass_8_2, klass_8_3, klass_8_4, klass_8_5, klass_8_6, klass_8_7, klass_8_8, klass_8_9, klass_8_10, klass_8_11, klass_8_12, klass_8_13, klass_8_14, klass_8_15, klass_8_16, klass_8_17, klass_8_18, klass_8_19, klass_8_20, klass_8_21, klass_8_22, klass_8_23, klass_8_24, klass_8_25, klass_8_26, klass_9_1, klass_9_2, klass_9_3, klass_9_4, klass_9_5, klass_9_6, klass_9_7, klass_9_8, klass_9_9, klass_9_10, klass_9_11, klass_9_12, klass_9_13, klass_9_14, klass_9_15, klass_9_16, klass_9_17, klass_9_18, gymnaasium_1, gymnaasium_2, gymnaasium_3, gymnaasium_4, gymnaasium_5, gymnaasium_6, gymnaasium_7, gymnaasium_8, gymnaasium_9, gymnaasium_10, gymnaasium_11};



    public Fragment_BugReport() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_BugReport.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_BugReport newInstance(String param1, String param2) {
        Fragment_BugReport fragment = new Fragment_BugReport();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        definitsioon = getArguments().getString("definitsioon");
        //fragmentStringName = getArguments().getString("fragmentstringname");
        Log.i("*****", definitsioon);

        counter = 0;
        for(String el:headers) {
            String[] parts = el.split("->");
            String klassListist = parts[0];
            if(klassListist.equals(definitsioon)){
                fragmentStringName = el;
                break;
            }
            counter += 1;
        }

        int fragmentCounter = 0;
        for(Fragment el:frags) {
            if(fragmentCounter==counter){
                frag = el;
                break;
            }
            fragmentCounter += 1;
        }
        if(definitsioon.equals("Ruutvõrrandi kalkulaator")){
            frag = quad_calc;
        }
        if(definitsioon.equals("Intressi kalkulaator")){
            frag = interest_calculator;
        }

        v =  inflater.inflate(R.layout.activity_bug_report, container, false);
        setHasOptionsMenu(true);
        return v;
    }

    /*@Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if (state)
        {
            menu.getItem(0).setVisible(false);
        }
        super.onCreateOptionsMenu(menu,inflater);
    }*/

    @Override
    public void onViewCreated(final View view, final Bundle savedInstanceState){
        defText = getView().findViewById(R.id.definitsioon);
        defText.setText(definitsioon);

        selgitus = getView().findViewById(R.id.selgitus);
        selgitus.setText("");

        button = getView().findViewById(R.id.sendbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String body = selgitus.getText().toString();
                sendPost(definitsioon, body.trim());
                //Toast.makeText(getActivity(),"Viga Saadetud",Toast.LENGTH_SHORT).show();
                selgitus.setText("");
            }
        });
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener( new View.OnKeyListener()
        {
            @Override
            public boolean onKey( View v, int keyCode, KeyEvent event )
            {
                if( keyCode == KeyEvent.KEYCODE_BACK )
                {
                    Toast.makeText(getActivity(),"back pressed",Toast.LENGTH_SHORT).show();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.container, frag);
                    transaction.commit();
                    return true;
                }
                return false;
            }
        } );
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

 /*   @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }



   public void sendPost(final String title, final String body) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://api.github.com/repos/Teemant/minilex/issues");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                    conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    conn.setRequestProperty("Accept","application/vnd.github.symmetra-preview+json");
                    conn.setRequestProperty ("Authorization", "Basic "+ "bWlubGVrc2lrb246bWluaWxla3MxMjM=");

                    conn.setRequestMethod("POST");

                    conn.setDoOutput(true);
                    conn.setDoInput(true);

                    DataOutputStream os = new DataOutputStream(conn.getOutputStream());

                    String json = "{\"title\":" + "\"" + title + "\",\"body\":\"" + body + "\"}";
                    os.write(json.getBytes("UTF-8"));

                    os.flush();
                    os.close();

                    status = String.valueOf(conn.getResponseCode());
                    Log.i("****STATUS", status);
                    Log.i("****MSG" , conn.getResponseMessage());

                    conn.disconnect();
                    if(status.equals("201")){
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getActivity(),"Viga Saadetud",Toast.LENGTH_SHORT).show();
                            }
                        });
                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.container, frag);
                        transaction.commit();
                    }
                } catch (Exception e) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getActivity(),"Kontrollige, kas internetiühendus on olemas",Toast.LENGTH_SHORT).show();
                        }
                    });
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
