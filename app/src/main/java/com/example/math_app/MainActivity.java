package com.example.math_app;
//https://stackoverflow.com/questions/49990933/configuration-on-demand-is-not-supported-by-the-current-version-of-the-android-g
//https://github.com/PrivacyApps/html-textview


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;

import android.widget.Toast;

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
import com.example.math_app.fragments.calculators.Fragment_Interest_Calculator;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_1;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_4;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_6;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_9;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_8;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_2;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_5;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_7;
import com.example.math_app.fragments.klass_1.Fragment_Klass_1_3;
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
import com.example.math_app.fragments.calculators.Fragment_quad_calc;
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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    View view_Group;
    private int LEMMIKUD = 0;
    private int KLASS_1 = 1;
    private int KLASS_2 = 2;
    private int KLASS_3 = 3;
    private int KLASS_4 = 4;
    private int KLASS_5 = 5;
    private int KLASS_6 = 6;
    private int KLASS_7 = 7;
    private int KLASS_8 = 8;
    private int KLASS_9 = 9;
    private int GYMNAASIUM = 10;
    private int KALKULAATORID = 11;
    private int SUB_KALKULAATORID_RUUT_LAH = 0;
    private int SUB_KALKULAATORID_INTRESSI_LAH = 1;
    private DrawerLayout mDrawerLayout;

    ExpandableListAdapter mMenuAdapter;
    ExpandableListView expandableList;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
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
    //Icons, use as you want
    /*static int[] icon = { R.drawable.ico1, R.drawable.ico1,
            R.drawable.ico1, R.drawable.ico1,
            R.drawable.ico1, R.drawable.ico1, R.drawable.ico1};
            */
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
            expandableList.setIndicatorBounds(expandableList.getRight()- 80, expandableList.getWidth());
        } else {
            expandableList.setIndicatorBoundsRelative(expandableList.getRight()- 80, expandableList.getWidth());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        expandableList = (ExpandableListView) findViewById(R.id.navigationmenu);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        prepareListData();
        mMenuAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expandableList.setAdapter(mMenuAdapter);


                expandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView,
                                        View view,
                                        int groupPosition,
                                        int childPosition, long id) {
                //Log.d("DEBUG", "submenu item clicked");
                Toast.makeText(MainActivity.this,
                        "Header: "+String.valueOf(groupPosition) +
                                "\nItem: "+ String.valueOf(childPosition), Toast.LENGTH_SHORT)
                        .show();
                view.setSelected(true);
                FragmentTransaction ftrans = getSupportFragmentManager().beginTransaction();
                // 1. klass
                // Arvud
                if(groupPosition == KLASS_1 && childPosition == 0 ){
                    ftrans.replace(R.id.container, klass_1_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_1 && childPosition == 1 ){
                    ftrans.replace(R.id.container, klass_1_2);
                    ftrans.commit();
                }
                // Arvutamine
                if(groupPosition == KLASS_1 && childPosition == 2 ){
                    ftrans.replace(R.id.container, klass_1_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_1 && childPosition == 3 ){
                    ftrans.replace(R.id.container, klass_1_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_1 && childPosition == 4 ){
                    ftrans.replace(R.id.container, klass_1_5);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_1 && childPosition == 5 ){
                    ftrans.replace(R.id.container, klass_1_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_1 && childPosition == 6 ){
                    ftrans.replace(R.id.container, klass_1_7);
                    ftrans.commit();
                }
                // Mõõtühikud
                if(groupPosition == KLASS_1 && childPosition == 7 ){
                    ftrans.replace(R.id.container, klass_1_8);
                    ftrans.commit();
                }
                // Geomeetrilised kujundid
                if(groupPosition == KLASS_1 && childPosition == 8 ){
                    ftrans.replace(R.id.container, klass_1_9);
                    ftrans.commit();
                }
                // 2. klass
                //Arvud
                if(groupPosition == KLASS_2 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_2_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_2_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_2_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_2_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_2_5);
                    ftrans.commit();
                }
                // Arvutamine
                if(groupPosition == KLASS_2 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_2_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_2_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_2_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_2_9);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_2_10);
                    ftrans.commit();
                }
                // Mõõtühikud
                if(groupPosition == KLASS_2 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_2_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_2_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_2_13);
                    ftrans.commit();
                }
                //  Algebra ja funktsioonid
                if(groupPosition == KLASS_2 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_2_14);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_2 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_2_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_2_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_2_17);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_2_18);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 18 ){
                    ftrans.replace(R.id.container,klass_2_19);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_2 && childPosition == 19 ){
                    ftrans.replace(R.id.container,klass_2_20);
                    ftrans.commit();
                }
                // 3. klass
                // Arvud
                if(groupPosition == KLASS_3 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_3_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_3_2);
                    ftrans.commit();
                }
                // Arvutamine
                if(groupPosition == KLASS_3 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_3_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_3_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_3_5);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_3_6);
                    ftrans.commit();
                }
                // Mõõtühikud
                if(groupPosition == KLASS_3 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_3_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_3_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_3_9);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_3_10);
                    ftrans.commit();
                }
                // Algebra ja funktsioonid
                if(groupPosition == KLASS_3 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_3_11);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_3 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_3_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_3_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_3_14);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_3_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_3_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_3 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_3_17);
                    ftrans.commit();
                }
                // 4. klass
                // Arvutamine
                if(groupPosition == KLASS_4 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_4_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_4_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_4_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_4_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_4_5);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_4_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_4_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_4_8);
                    ftrans.commit();
                }
                // Ühe tehtega võrrandid
                if(groupPosition == KLASS_4 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_4_9);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_4_10);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_4_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_4_12);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_4 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_4_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_4_14);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_4 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_4_15);
                    ftrans.commit();
                }
                // 5. klass
                // Arvud
                if(groupPosition == KLASS_5 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_5_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_5_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_5_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_5_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_5_5);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_5_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_5_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_5_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_5_9);
                    ftrans.commit();
                }
                // Arvutamine
                if(groupPosition == KLASS_5 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_5_10);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_5_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_5_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_5_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_5_14);
                    ftrans.commit();
                }
                // Mõõtühikud
                if(groupPosition == KLASS_5 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_5_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_5_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_5_17);
                    ftrans.commit();
                }
                // Andmed ja diagrammid
                if(groupPosition == KLASS_5 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_5_18);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 18 ){
                    ftrans.replace(R.id.container,klass_5_19);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 19 ){
                    ftrans.replace(R.id.container,klass_5_20);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 20 ){
                    ftrans.replace(R.id.container,klass_5_21);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 21 ){
                    ftrans.replace(R.id.container,klass_5_22);
                    ftrans.commit();
                }
                // Algebra ja funktsioonid
                if(groupPosition == KLASS_5 && childPosition == 22 ){
                    ftrans.replace(R.id.container,klass_5_23);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 23 ){
                    ftrans.replace(R.id.container,klass_5_24);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 24 ){
                    ftrans.replace(R.id.container,klass_5_25);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 25 ){
                    ftrans.replace(R.id.container,klass_5_26);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_5 && childPosition == 26 ){
                    ftrans.replace(R.id.container,klass_5_27);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 27 ){
                    ftrans.replace(R.id.container,klass_5_28);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 28 ){
                    ftrans.replace(R.id.container,klass_5_29);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 29 ){
                    ftrans.replace(R.id.container,klass_5_30);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 30 ){
                    ftrans.replace(R.id.container,klass_5_31);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_5 && childPosition == 31 ){
                    ftrans.replace(R.id.container,klass_5_32);
                    ftrans.commit();
                }
                // 6. klass
                // Arvud
                if(groupPosition == KLASS_6 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_6_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_6_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_6_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_6_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_6_5);
                    ftrans.commit();
                }
                // Arvutamine
                if(groupPosition == KLASS_6 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_6_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_6_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_6_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_6_9);
                    ftrans.commit();
                }
                // Joonestamine
                if(groupPosition == KLASS_6 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_6_10);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_6_11);
                    ftrans.commit();
                }
                // Algebra ja funktsioonid
                if(groupPosition == KLASS_6 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_6_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_6_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_6_14);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_6_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_6_16);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_6 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_6_17);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_6_18);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 18 ){
                    ftrans.replace(R.id.container,klass_6_19);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 19 ){
                    ftrans.replace(R.id.container,klass_6_20);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 20 ){
                    ftrans.replace(R.id.container,klass_6_21);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 21 ){
                    ftrans.replace(R.id.container,klass_6_22);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 22 ){
                    ftrans.replace(R.id.container,klass_6_23);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_6 && childPosition == 23 ){
                    ftrans.replace(R.id.container,klass_6_24);
                    ftrans.commit();
                }
                // 7. klass
                // Arvud
                if(groupPosition == KLASS_7 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_7_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_7_2);
                    ftrans.commit();
                }
                // Protsentarvutus
                if(groupPosition == KLASS_7 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_7_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_7_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_7_5);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_7_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_7_7);
                    ftrans.commit();
                }
                // Astendamine
                if(groupPosition == KLASS_7 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_7_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_7_9);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_7_10);
                    ftrans.commit();
                }
                // Statistika, andmed
                if(groupPosition == KLASS_7 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_7_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_7_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_7_13);
                    ftrans.commit();
                }
                // Võrrandid
                if(groupPosition == KLASS_7 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_7_14);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_7_15);
                    ftrans.commit();
                }
                // Funktsioonid
                if(groupPosition == KLASS_7 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_7_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_7_17);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_7_18);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_7 && childPosition == 18 ){
                    ftrans.replace(R.id.container,klass_7_19);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 19 ){
                    ftrans.replace(R.id.container,klass_7_20);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 20 ){
                    ftrans.replace(R.id.container,klass_7_21);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 21 ){
                    ftrans.replace(R.id.container,klass_7_22);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_7 && childPosition == 22 ){
                    ftrans.replace(R.id.container,klass_7_23);
                    ftrans.commit();
                }
                // 8. klass
                // Arvud, arvutamine
                if(groupPosition == KLASS_8 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_8_1);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_8_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_8_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_8_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_8_5);
                    ftrans.commit();
                }
                // Algebra ja funktsioonid
                if(groupPosition == KLASS_8 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_8_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_8_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_8_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_8_9);
                    ftrans.commit();
                }
                // Võrrandid
                if(groupPosition == KLASS_8 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_8_10);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_8_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_8_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_8_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_8_14);
                    ftrans.commit();
                }
                // Statistika, tõenäosus
                if(groupPosition == KLASS_8 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_8_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_8_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_8_17);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_8 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_8_18);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 18 ){
                    ftrans.replace(R.id.container,klass_8_19);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 19 ){
                    ftrans.replace(R.id.container,klass_8_20);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 20 ){
                    ftrans.replace(R.id.container,klass_8_21);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 21 ){
                    ftrans.replace(R.id.container,klass_8_22);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 22 ){
                    ftrans.replace(R.id.container,klass_8_23);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 23 ){
                    ftrans.replace(R.id.container,klass_8_24);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 24 ){
                    ftrans.replace(R.id.container,klass_8_25);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_8 && childPosition == 25 ){
                    ftrans.replace(R.id.container,klass_8_26);
                    ftrans.commit();
                }
                // 9. klass
                // Arvud, arvutamine
                if(groupPosition == KLASS_9 && childPosition == 0 ){
                    ftrans.replace(R.id.container,klass_9_1);
                    ftrans.commit();
                }
                // Algebra ja funktsioonid
                if(groupPosition == KLASS_9 && childPosition == 1 ){
                    ftrans.replace(R.id.container,klass_9_2);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 2 ){
                    ftrans.replace(R.id.container,klass_9_3);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 3 ){
                    ftrans.replace(R.id.container,klass_9_4);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 4 ){
                    ftrans.replace(R.id.container,klass_9_5);
                    ftrans.commit();
                }
                // Tõenäosus, statistika
                if(groupPosition == KLASS_9 && childPosition == 5 ){
                    ftrans.replace(R.id.container,klass_9_6);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 6 ){
                    ftrans.replace(R.id.container,klass_9_7);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 7 ){
                    ftrans.replace(R.id.container,klass_9_8);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 8 ){
                    ftrans.replace(R.id.container,klass_9_9);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == KLASS_9 && childPosition == 9 ){
                    ftrans.replace(R.id.container,klass_9_10);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 10 ){
                    ftrans.replace(R.id.container,klass_9_11);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 11 ){
                    ftrans.replace(R.id.container,klass_9_12);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 12 ){
                    ftrans.replace(R.id.container,klass_9_13);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 13 ){
                    ftrans.replace(R.id.container,klass_9_14);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 14 ){
                    ftrans.replace(R.id.container,klass_9_15);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 15 ){
                    ftrans.replace(R.id.container,klass_9_16);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 16 ){
                    ftrans.replace(R.id.container,klass_9_17);
                    ftrans.commit();
                }
                if(groupPosition == KLASS_9 && childPosition == 17 ){
                    ftrans.replace(R.id.container,klass_9_18);
                    ftrans.commit();
                }
                // Gümnaasium
                // Avaldised ja arvhulgad
                if(groupPosition == GYMNAASIUM && childPosition == 0 ){
                    ftrans.replace(R.id.container,gymnaasium_1);
                    ftrans.commit();
                }
                // Võrrandid ja võrrandisüsteemid
                if(groupPosition == GYMNAASIUM && childPosition == 1 ){
                    ftrans.replace(R.id.container,gymnaasium_2);
                    ftrans.commit();
                }
                // Trigonomeetria I ja võrratused
                if(groupPosition == GYMNAASIUM && childPosition == 2 ){
                    ftrans.replace(R.id.container,gymnaasium_3);
                    ftrans.commit();
                }
                // Trigonomeetria II
                if(groupPosition == GYMNAASIUM && childPosition == 3 ){
                    ftrans.replace(R.id.container,gymnaasium_4);
                    ftrans.commit();
                }
                // Vektor tasandil
                if(groupPosition == GYMNAASIUM && childPosition == 4 ){
                    ftrans.replace(R.id.container,gymnaasium_5);
                    ftrans.commit();
                }
                // Tõenäosus ja statistika
                if(groupPosition == GYMNAASIUM && childPosition == 5 ){
                    ftrans.replace(R.id.container,gymnaasium_6);
                    ftrans.commit();
                }
                // Funktsioonid I ja jadad
                if(groupPosition == GYMNAASIUM && childPosition == 6 ){
                    ftrans.replace(R.id.container,gymnaasium_7);
                    ftrans.commit();
                }
                // Funktsioonid II
                if(groupPosition == GYMNAASIUM && childPosition == 7 ){
                    ftrans.replace(R.id.container,gymnaasium_8);
                    ftrans.commit();
                }
                // Funktsiooni piirväärtus ja tuletis
                if(groupPosition == GYMNAASIUM && childPosition == 8 ){
                    ftrans.replace(R.id.container,gymnaasium_9);
                    ftrans.commit();
                }
                // Integraal
                if(groupPosition == GYMNAASIUM && childPosition == 9 ){
                    ftrans.replace(R.id.container,gymnaasium_10);
                    ftrans.commit();
                }
                // Geomeetria
                if(groupPosition == GYMNAASIUM && childPosition == 10 ){
                    ftrans.replace(R.id.container,gymnaasium_11);
                    ftrans.commit();
                }
                // Kalkulaatorid
                // Ruutvõrrandi kalkulaator
                if(groupPosition==KALKULAATORID && childPosition==SUB_KALKULAATORID_RUUT_LAH){
                    ftrans.replace(R.id.container,quad_calc);
                    ftrans.commit();
                }
                // Intresside kalkulaator
                if(groupPosition==KALKULAATORID && childPosition==SUB_KALKULAATORID_INTRESSI_LAH){
                    ftrans.replace(R.id.container,interest_calculator);
                    ftrans.commit();
                }
                if (view_Group != null) {
                    view_Group.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                view_Group = view;
                view_Group.setBackgroundColor(Color.parseColor("#DDDDDD"));
                mDrawerLayout.closeDrawers();
                return false;
            }
        });
        expandableList.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                //Log.d("DEBUG", "heading clicked");
                return false;
            }
        });

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding data header
        listDataHeader.add("Lemmikud");
        listDataHeader.add("1. klass");
        listDataHeader.add("2. klass");
        listDataHeader.add("3. klass");
        listDataHeader.add("4. klass");
        listDataHeader.add("5. klass");
        listDataHeader.add("6. klass");
        listDataHeader.add("7. klass");
        listDataHeader.add("8. klass");
        listDataHeader.add("9. klass");
        listDataHeader.add("Gümnaasium");
        listDataHeader.add("Kalkulaatorid");
        //listDataHeader.add("Ruutvõrrandi lahendaja");


        // Adding child data
        List<String> klass_1 = new ArrayList<String>();
        klass_1.add("Arvude võrdlemine");
        klass_1.add("Paaris- ja paaritud arvud");
        klass_1.add("Üleminekuga liitmine, lahutamine");
        klass_1.add("Tabel: arvude liitmine");
        klass_1.add("Tabel: arvude lahutamine");
        klass_1.add("Tabel: täiskümnete liitmine");
        klass_1.add("Tabel: täiskümnete lahutamine");
        klass_1.add("Mõõtühikud");
        klass_1.add("Geomeetrilised kujundid");

        List<String> klass_2 = new ArrayList<String>();
        klass_2.add("Võrdus ja võrratus");
        klass_2.add("Arvud 1 - 100");
        klass_2.add("Ühelised, kümnelised");
        klass_2.add("Suurendamine ja vähendamine");
        klass_2.add("Arvud 1 - 1000");
        klass_2.add("Arvutamine 20 piires");
        klass_2.add("Arvutamine arvudega 0 - 100");
        klass_2.add("Korrutamine, seos liitmisega");
        klass_2.add("Korda suurem, korda vähem");
        klass_2.add("Jagamine, seos korrutamisega");
        klass_2.add("Pikkusühikud");
        klass_2.add("Mahuühikud");
        klass_2.add("Ajaühikud");
        klass_2.add("Täht arvu tähisena");
        klass_2.add("Sirge ja sirglõik");
        klass_2.add("Nurk");
        klass_2.add("Nelinurgad");
        klass_2.add("Kolmnurk");
        klass_2.add("Ring ja ringjoon");
        klass_2.add("Ruumilised kujundid");

        List<String> klass_3 = new ArrayList<String>();
        klass_3.add("Arvud 1 - 10000");
        klass_3.add("Arvude ehitus");
        klass_3.add("Tehete järjekord");
        klass_3.add("Korrutustabel");
        klass_3.add("Korrutamine ja jagamine");
        klass_3.add("Arvude osadeks jagamine");
        klass_3.add("Ajaühikud");
        klass_3.add("Raskusühikud");
        klass_3.add("Pikkusühikud");
        klass_3.add("Mahuühikud");
        klass_3.add("Täht arvu tähisena");
        klass_3.add("Sirge, sirglõik ja murdjoon");
        klass_3.add("Nelinurgad");
        klass_3.add("Kolmnurk");
        klass_3.add("Nurk");
        klass_3.add("Ring ja ringjoon");
        klass_3.add("Ruumilised kujundid");

        List<String> klass_4 = new ArrayList<String>();
        klass_4.add("Naturaalarvud");
        klass_4.add("Arvud vs numbrid");
        klass_4.add("Järkarvud");
        klass_4.add("Tehted arvudega");
        klass_4.add("Arvude omadused");
        klass_4.add("Arvude jaguvus");
        klass_4.add("Null");
        klass_4.add("Naturaalarvu ruut");
        klass_4.add("Liitmistehe");
        klass_4.add("Lahutamistehe");
        klass_4.add("Korrutamistehe");
        klass_4.add("Jagamistehe");
        klass_4.add("Tasandilised kujundid");
        klass_4.add("Ruumilised kujundid");
        klass_4.add("Ümbermõõt ja pindala");

        List<String> klass_5 = new ArrayList<String>();
        klass_5.add("Naturaalarvud");
        klass_5.add("Arvu klassid");
        klass_5.add("Ümardamine");
        klass_5.add("Jaguvuse tunnused");
        klass_5.add("Algarvud");
        klass_5.add("Vähim ühiskordne");
        klass_5.add("Suurim ühistegur");
        klass_5.add("Rooma numbrid");
        klass_5.add("Murdarv");
        klass_5.add("Arvu ruut ja kuup");
        klass_5.add("Murdude liitmine, lahutamine");
        klass_5.add("Murdude korrutamine");
        klass_5.add("Murdude jagamine");
        klass_5.add("Tehete järjekord");
        klass_5.add("Pindalaühikud");
        klass_5.add("Ruumalaühikud");
        klass_5.add("Plaanimõõt");
        klass_5.add("Sagedus, sagedustabel");
        klass_5.add("Mood");
        klass_5.add("Skaala");
        klass_5.add("Aritmeetiline keskmine");
        klass_5.add("Diagrammid");
        klass_5.add("Arvavaldis, tähtavaldis");
        klass_5.add("Valem");
        klass_5.add("Võrrand");
        klass_5.add("Arvkiir");
        klass_5.add("Punkt, tasand");
        klass_5.add("Jooned");
        klass_5.add("Nurk");
        klass_5.add("Sirgete omadused");
        klass_5.add("Risttahukas");
        klass_5.add("Kuup");

        List<String> klass_6 = new ArrayList<String>();
        klass_6.add("Täisarvud, negatiivsed arvud");
        klass_6.add("Vastandarv");
        klass_6.add("Arvu absoluutväärtus");
        klass_6.add("Pöördarv");
        klass_6.add("Harilik murd");
        klass_6.add("Hariliku murru taandamine");
        klass_6.add("Kümnendmurd");
        klass_6.add("Protsent");
        klass_6.add("Tehted negatiivsete arvudega");
        klass_6.add("Sektor");
        klass_6.add("Sektordiagramm");
        klass_6.add("Võrrandi lihtsustamine");
        klass_6.add("Lineaarvõrrand");
        klass_6.add("Arvkiir");
        klass_6.add("Koordinaatteljestik");
        klass_6.add("Koordinaadid");
        klass_6.add("Sümmeetria");
        klass_6.add("Lõik");
        klass_6.add("Nurk");
        klass_6.add("Kolmnurga elemendid");
        klass_6.add("Kolmnurkade liigitamine");
        klass_6.add("Kolmnurkade omadused");
        klass_6.add("Ringjoone omadused");
        klass_6.add("Kolmnurkne püstprisma");

        List<String> klass_7 = new ArrayList<String>();
        klass_7.add("Arvuhulgad");
        klass_7.add("Arvu absoluutväärtus");
        klass_7.add("Protsendi leidmine");
        klass_7.add("Terviku leidmine");
        klass_7.add("Suhe, võrdeline seos");
        klass_7.add("Pöördvõrdeline seos");
        klass_7.add("Kasvamine, kahanemine");
        klass_7.add("Astendamine");
        klass_7.add("Astmed");
        klass_7.add("Tehete järjekord");
        klass_7.add("Sagedus, sagedustabel");
        klass_7.add("Mood");
        klass_7.add("Aritmeetiline keskmine");
        klass_7.add("Võrdkujuline võrrand, võrre");
        klass_7.add("Murdarvuline lineaarvõrrand");
        klass_7.add("Funktsioon");
        klass_7.add("Võrdeline seos");
        klass_7.add("Lineaarne seos");
        klass_7.add("Hulknurk");
        klass_7.add("Rööpkülik");
        klass_7.add("Romb");
        klass_7.add("Trapets");
        klass_7.add("Nelinurksed püstprismad");

        List<String> klass_8 = new ArrayList<String>();
        klass_8.add("Astendamise reeglid");
        klass_8.add("Kümne astmed");
        klass_8.add("Standardkuju");
        klass_8.add("Ruutjuur");
        klass_8.add("Arvu ruudud, juured");
        klass_8.add("Üksliige, hulkliige");
        klass_8.add("Ruutude vahe valem");
        klass_8.add("Kaksliikme ruut");
        klass_8.add("Lihtsustamine");
        klass_8.add("Ruutvõrrand");
        klass_8.add("Ruutvõrrandi lihtsustamine");
        klass_8.add("Liitmisvõte");
        klass_8.add("Asendusvõte");
        klass_8.add("Lahendi kontroll");
        klass_8.add("Keskmine hälve");
        klass_8.add("Katse, sündmus");
        klass_8.add("Tõenäosus");
        klass_8.add("Mõisted");
        klass_8.add("Paralleelsed sirged");
        klass_8.add("Kolmnurk");
        klass_8.add("Rööpkülik");
        klass_8.add("Romb");
        klass_8.add("Trapets");
        klass_8.add("Ringjoon");
        klass_8.add("Püstprisma");
        klass_8.add("Püramiid");

        List<String> klass_9 = new ArrayList<String>();
        klass_9.add("Kuupjuur, neljas juur");
        klass_9.add("Ruutkolmliige");
        klass_9.add("Avaldised");
        klass_9.add("Algebraline murd");
        klass_9.add("Ruutfunktsioon");
        klass_9.add("Tõenäosusteooria");
        klass_9.add("Statistiline rida");
        klass_9.add("Kaalutud keskmine");
        klass_9.add("Üldkogum, valim");
        klass_9.add("Võrdelised lõigud");
        klass_9.add("Kolmnurk");
        klass_9.add("Pythagorase teoreem");
        klass_9.add("Hulknurgad");
        klass_9.add("Siinus, koosinus, tangens");
        klass_9.add("Mõõtkava");
        klass_9.add("Silinder");
        klass_9.add("Koonus");
        klass_9.add("Kera");

        List<String> gymnasium = new ArrayList<String>();
        gymnasium.add("Avaldised ja arvhulgad");
        gymnasium.add("Võrrandid ja võrrandisüsteemid");
        gymnasium.add("Trigonomeetria I ja võrratused");
        gymnasium.add("Trigonomeetria II");
        gymnasium.add("Vektor tasandil");
        gymnasium.add("Tõenäosus ja statistika");
        gymnasium.add("Funktsioonid I ja jadad");
        gymnasium.add("Funktsioonid II");
        gymnasium.add("Funktsiooni piirväärtus ja tuletis");
        gymnasium.add("Integraal");
        gymnasium.add("Geomeetria");

        List<String> lemmikud = new ArrayList<String>();
        lemmikud.add("Minu lemmikud");

        List<String> kalkulaatorid = new ArrayList<String>();
        kalkulaatorid.add("Ruutvõrrandi kalkulaator"); //SUB_KALKULAATORID_RUUT_LAH = 0;
        kalkulaatorid.add("Intressi kalkulaator"); //SUB_KALKULAATORID_INTRESSI_LAH = 1;

        Log.i("TAAG",listDataChild.toString());
        Log.i("TAAG",listDataHeader.toString());

        listDataChild.put(listDataHeader.get(LEMMIKUD), lemmikud);
        listDataChild.put(listDataHeader.get(KLASS_1), klass_1);// Header, Child data
        listDataChild.put(listDataHeader.get(KLASS_2), klass_2);
        listDataChild.put(listDataHeader.get(KLASS_3), klass_3);
        listDataChild.put(listDataHeader.get(KLASS_4), klass_4);
        listDataChild.put(listDataHeader.get(KLASS_5), klass_5);
        listDataChild.put(listDataHeader.get(KLASS_6), klass_6);
        listDataChild.put(listDataHeader.get(KLASS_7), klass_7);
        listDataChild.put(listDataHeader.get(KLASS_8), klass_8);
        listDataChild.put(listDataHeader.get(KLASS_9), klass_9);
        listDataChild.put(listDataHeader.get(GYMNAASIUM), gymnasium);
        listDataChild.put(listDataHeader.get(KALKULAATORID), kalkulaatorid);
        //listDataChild.put(listDataHeader.get(11),new ArrayList<String>());

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_ruutLahendaja){
            /*Intent i = new Intent(this,Quadratic_calculator_Activity.class);
            this.startActivity(i);*/
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        /*if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

/*
    public String readHTML(String fileName) throws IOException {
        InputStream is =getAssets().open(fileName);
        int size = is.available();

        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();

        String str = new String(buffer);
        str = str.replace("old string", "new string");
        return str;
    }
*/
}