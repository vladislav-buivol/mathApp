package com.example.math_app;
//https://stackoverflow.com/questions/49990933/configuration-on-demand-is-not-supported-by-the-current-version-of-the-android-g
//https://github.com/PrivacyApps/html-textview
//https://github.com/mirrajabi/search-dialog

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
//import android.widget.SearchView;

import android.widget.Toast;

import com.example.math_app.fragments.Fragment_BugReport;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
//need  implementation 'com.github.mirrajabi:search-dialog:1.2.3'
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.BaseSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.SearchResultListener;
import ir.mirrajabi.searchdialog.core.Searchable;
*/

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

    Fragment_BugReport bugReport = new Fragment_BugReport();
    int group;
    int child;
    String saveName;

    String[] headers = {"Arvude võrdlemine ->klass_1_1", "Paaris- ja paaritud arvud->klass_1_2", "Üleminekuga liitmine ja lahutamine->klass_1_3", "Tabel: arvude liitmine kahekümne piires->klass_1_4", "Tabel: arvude lahutamine kahekümne piires->klass_1_5", "Tabel: täiskümnete liitmine saja piires->klass_1_6", "Tabel: täiskümnete lahutamine saja piires->klass_1_7", "Mõõtühikud->klass_1_8", "Geomeetrilised kujundid->klass_1_9", "Võrdus ja võrratus->klass_2_1", "Numbrid->klass_2_2", "Ühelised, kümnelised->klass_2_3", "Suurendamine ja vähendamine->klass_2_4", "Arvud 1 - 1000 ->klass_2_5", "Arvutamine 20 piires->klass_2_6", "Arvutamine arvudega 0 – 100->klass_2_7", "Korrutamine, selle seos liitmisega->klass_2_8", "Korda suurem, korda vähem->klass_2_9", "Jagamine, selle seos korrutamisega ->klass_2_10", "Pikkusühikud->klass_2_11", "Mahuühikud->klass_2_12", "Ajaühikud->klass_2_13", "Täht arvu tähisena ->klass_2_14", "Sirge ja sirglõik->klass_2_15", "Nurk->klass_2_16", "Nelinurgad->klass_2_17", "Kolmnurk->klass_2_18", "Ring ja ringjoon->klass_2_19", "Ruumilised kujundid->klass_2_20", "Arvud 1 - 10000->klass_3_1", "Arvude ehitus ->klass_3_2", "Tehete järjekord->klass_3_3", "Korrutustabel->klass_3_4", "Korrutamine ja jagamine->klass_3_5", "Arvust osa ja osa järgi arvu leidmine ->klass_3_6", "Ajaühikud->klass_3_7", "Raskusühikud->klass_3_8", "Pikkusühikud->klass_3_9", "Mahuühikud->klass_3_10", "Täht arvu tähisena ->klass_3_11", "Sirge, sirglõik, murdjoon->klass_3_12", "Nelinurgad->klass_3_13", "Kolmnurk->klass_3_14", "Nurk->klass_3_15", "Ring ja ringjoon->klass_3_16", "Ruumilised kujundid->klass_3_17", "Naturaalarvud->klass_4_1", "Arvud vs numbrid->klass_4_2", "Järkarvud->klass_4_3", "Liitmine, lahutamine, korrutamine, jagamine->klass_4_4", "Arvude omadused->klass_4_5", "Arvude jaguvus->klass_4_6", "Null->klass_4_7", "Arvude 0 - 10 ruudud:->klass_4_8", "Liitmistehe->klass_4_9", "Lahutamistehe->klass_4_10", "Korrutamistehe->klass_4_11", "Jagamistehe->klass_4_12", "Tasandilised kujundid->klass_4_13", "Ruumilised kujundid->klass_4_14", "Ümbermõõt ja pindala->klass_4_15", "Naturaalarvud->klass_5_1", "Arvu klassid->klass_5_2", "Ümardamine->klass_5_3", "Jaguvuse tunnused->klass_5_4", "Algarvud->klass_5_5", "Vähim ühiskordne->klass_5_6", "Suurim ühistegur->klass_5_7", "Rooma numbrid->klass_5_8", "Murdarv->klass_5_9", "Arvu ruut ja kuup->klass_5_10", "Tehete järjekord->klass_5_11", "Pindalaühikud->klass_5_12", "Ruumalaühikud->klass_5_13", "Plaanimõõt->klass_5_14", "Sagedus, sagedustabel->klass_5_15", "Mood->klass_5_16", "Skaala->klass_5_17", "Aritmeetiline keskmine->klass_5_18", "Diagrammid->klass_5_19", "Arvavaldis, tähtavaldis->klass_5_20", "Valem->klass_5_21", "Võrrand->klass_5_22", "Arvkiir->klass_5_23", "Punkt, tasand->klass_5_24", "Jooned->klass_5_25", "Nurk->klass_5_26", "Sirgete omadused->klass_5_27", "Risttahukas->klass_5_28", "Kuup->klass_5_29", "Täisarvud, negatiivsed arvud->klass_6_1", "Vastandarv->klass_6_2", "Arvu absoluutväärtus->klass_6_3", "Pöördarv->klass_6_4", "Harilik murd->klass_6_5", "Sektor->klass_6_6", "Sektordiagramm->klass_6_7", "Võrrandi lihtsustamine->klass_6_8", "Lineaarvõrrand->klass_6_9", "Arvkiir->klass_6_10", "Koordinaatteljestik->klass_6_11", "Koordinaadid->klass_6_12", "Sümmeetria->klass_6_13", "Lõik->klass_6_14", "Nurk->klass_6_15", "Kolmnurga elemendid->klass_6_16", "Kolmnurkade liigitamine->klass_6_17", "Kolmnurkade omadused->klass_6_18", "Ringjoone omadused->klass_6_19", "Kolmnurkne püstprisma->klass_6_20", "Arvuhulgad->klass_7_1", "Arvu absoluutväärtus->klass_7_2", "Protsendi leidmine->klass_7_3", "Terviku leidmine->klass_7_4", "Suhe, võrdeline seos->klass_7_5", "Pöördvõrdeline seos->klass_7_6", "Kasvamine, kahanemine->klass_7_7", "Astendamine->klass_7_8", "Astmed->klass_7_9", "Tehete järjekord->klass_7_10", "Sagedus, sagedustabel->klass_7_11", "Mood->klass_7_12", "Aritmeetiline keskmine->klass_7_13", "Võrdekujuline võrrand, võrre->klass_7_14", "Murdarvuline lineaarvõrrand->klass_7_15", "Funktsioon->klass_7_16", "Võrdeline seos->klass_7_17", "Lineaarne seos->klass_7_18", "Hulknurk->klass_7_19", "Rööpkülik->klass_7_20", "Romb->klass_7_21", "Trapets->klass_7_22", "Nelinurksed püstprismad->klass_7_23", "Astendamise reeglid->klass_8_1", "Kümne astmed->klass_8_2", "Standardkuju->klass_8_3", "Ruutjuur->klass_8_4", "Arvude ruudud, juured->klass_8_5", "Üksliige, hulkliige->klass_8_6", "Ruutude vahe valem->klass_8_7", "Kaksliikme ruut->klass_8_8", "Lihtsustamine->klass_8_9", "Ruutvõrrand->klass_8_10", "Ruutvõrrandi lahendamine->klass_8_11", "Liitmisvõte->klass_8_12", "Asendusvõte->klass_8_13", "Lahendi kontroll->klass_8_14", "Keskmine hälve->klass_8_15", "Katse, sündmus->klass_8_16", "Tõenäosus->klass_8_17", "Mõisted->klass_8_18", "Paralleelsed sirged->klass_8_19", "Kolmnurk->klass_8_20", "Rööpkülik->klass_8_21", "Romb->klass_8_22", "Trapets->klass_8_23", "Ringjoon->klass_8_24", "Püstprisma->klass_8_25", "Püramiid->klass_8_26", "Kuupjuur, neljas juur->klass_9_1", "Ruutkolmliige->klass_9_2", "Avaldised->klass_9_3", "Algebraline murd->klass_9_4", "Ruutfunktsioon->klass_9_5", "Tõenäosusteooria->klass_9_6", "Statistiline rida->klass_9_7", "Kaalutud keskmine->klass_9_8", "Üldkogum, valim->klass_9_9", "Võrdelised lõigud->klass_9_10", "Kolmnurk->klass_9_11", "Pythagorase teoreem->klass_9_12", "Hulknurgad->klass_9_13", "Siinus, koosinus, tangens->klass_9_14", "Mõõtkava->klass_9_15", "Silinder->klass_9_16", "Koonus->klass_9_17", "Kera->klass_9_18", "Avaldised ja arvhulgad->klass_gymnaasium_1", "Võrrandid ja võrrandisüsteemid->klass_gymnaasium_2", "Trigonomeetria I ja võrratused->klass_gymnaasium_3", "Trigonomeetria II->klass_gymnaasium_4", "Vektor tasandil->klass_gymnaasium_5", "Tõenäosus ja statistika->klass_gymnaasium_6", "Funktsioonid I ja jadad->klass_gymnaasium_7", "Funktsioonid II->klass_gymnaasium_8", "Funktsiooni piirväärtus ja tuletis->klass_gymnaasium_9", "Integraal->klass_gymnaasium_10", "Geomeetria->klass_gymnaasium_11"};
    Fragment[] frags = {klass_1_1, klass_1_2, klass_1_3, klass_1_4, klass_1_5, klass_1_6, klass_1_7, klass_1_8, klass_1_9, klass_2_1, klass_2_2, klass_2_3, klass_2_4, klass_2_5, klass_2_6, klass_2_7, klass_2_8, klass_2_9, klass_2_10, klass_2_11, klass_2_12, klass_2_13, klass_2_14, klass_2_15, klass_2_16, klass_2_17, klass_2_18, klass_2_19, klass_2_20, klass_3_1, klass_3_2, klass_3_3, klass_3_4, klass_3_5, klass_3_6, klass_3_7, klass_3_8, klass_3_9, klass_3_10, klass_3_11, klass_3_12, klass_3_13, klass_3_14, klass_3_15, klass_3_16, klass_3_17, klass_4_1, klass_4_2, klass_4_3, klass_4_4, klass_4_5, klass_4_6, klass_4_7, klass_4_8, klass_4_9, klass_4_10, klass_4_11, klass_4_12, klass_4_13, klass_4_14, klass_4_15, klass_5_1, klass_5_2, klass_5_3, klass_5_4, klass_5_5, klass_5_6, klass_5_7, klass_5_8, klass_5_9, klass_5_10, klass_5_11, klass_5_12, klass_5_13, klass_5_14, klass_5_15, klass_5_16, klass_5_17, klass_5_18, klass_5_19, klass_5_20, klass_5_21, klass_5_22, klass_5_23, klass_5_24, klass_5_25, klass_5_26, klass_5_27, klass_5_28, klass_5_29, klass_5_30, klass_5_31, klass_5_32, klass_6_1, klass_6_2, klass_6_3, klass_6_4, klass_6_5, klass_6_6, klass_6_7, klass_6_8, klass_6_9, klass_6_10, klass_6_11, klass_6_12, klass_6_13, klass_6_14, klass_6_15, klass_6_16, klass_6_17, klass_6_18, klass_6_19, klass_6_20, klass_6_21, klass_6_22, klass_6_23, klass_6_24, klass_7_1, klass_7_2, klass_7_3, klass_7_4, klass_7_5, klass_7_6, klass_7_7, klass_7_8, klass_7_9, klass_7_10, klass_7_11, klass_7_12, klass_7_13, klass_7_14, klass_7_15, klass_7_16, klass_7_17, klass_7_18, klass_7_19, klass_7_20, klass_7_21, klass_7_22, klass_7_23, klass_8_1, klass_8_2, klass_8_3, klass_8_4, klass_8_5, klass_8_6, klass_8_7, klass_8_8, klass_8_9, klass_8_10, klass_8_11, klass_8_12, klass_8_13, klass_8_14, klass_8_15, klass_8_16, klass_8_17, klass_8_18, klass_8_19, klass_8_20, klass_8_21, klass_8_22, klass_8_23, klass_8_24, klass_8_25, klass_8_26, klass_9_1, klass_9_2, klass_9_3, klass_9_4, klass_9_5, klass_9_6, klass_9_7, klass_9_8, klass_9_9, klass_9_10, klass_9_11, klass_9_12, klass_9_13, klass_9_14, klass_9_15, klass_9_16, klass_9_17, klass_9_18, gymnaasium_1, gymnaasium_2, gymnaasium_3, gymnaasium_4, gymnaasium_5, gymnaasium_6, gymnaasium_7, gymnaasium_8, gymnaasium_9, gymnaasium_10, gymnaasium_11};
    HashMap<String,Fragment> fragmnetMap = createFragmenMap();
    HashMap<String,Fragment> headersFragmnetMap = createMap();
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

                if(groupPosition < GYMNAASIUM) {
                    String klass = "klass_" + groupPosition + "_" + String.valueOf(childPosition + 1);
                    ftrans.replace(R.id.container, fragmnetMap.get(klass));
                    ftrans.commit();
                }
                else if(groupPosition == GYMNAASIUM){
                    //gymnaasium_1
                    String klass = "gymnaasium_" + String.valueOf(childPosition + 1);
                    ftrans.replace(R.id.container, fragmnetMap.get(klass));
                    ftrans.commit();
                }

                // Kalkulaatorid
                // Ruutvõrrandi kalkulaator
                else if(groupPosition==KALKULAATORID && childPosition==SUB_KALKULAATORID_RUUT_LAH){
                    ftrans.replace(R.id.container,quad_calc);
                    ftrans.commit();
                }
                // Intresside kalkulaator
                else if(groupPosition==KALKULAATORID && childPosition==SUB_KALKULAATORID_INTRESSI_LAH){
                    ftrans.replace(R.id.container,interest_calculator);
                    ftrans.commit();
                }

                //For bugereport
                group = groupPosition;
                child = childPosition;
                saveName = listDataChild.get(listDataHeader.get(group)).get(child);

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
        klass_8.add("Arvude ruudud, juured");
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

         /*
https://www.dev2qa.com/android-actionbar-searchview-autocomplete-example/
        */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        getMenuInflater().inflate(R.menu.bug_report, menu);
        getMenuInflater().inflate(R.menu.material_search_menu, menu);


        // Inflate the search menu action bar.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.material_search_menu, menu);

        // Get the search menu.
        MenuItem searchMenu = menu.findItem(R.id.app_bar_menu_search);

        // Get SearchView object.
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchMenu);

        // Get SearchView autocomplete object.
        final SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete)searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchAutoComplete.setBackgroundColor(Color.BLUE);
        searchAutoComplete.setTextColor(Color.GREEN);
        searchAutoComplete.setDropDownBackgroundResource(android.R.color.holo_blue_light);

        // Create a new ArrayAdapter and add data to search auto complete object.
        String dataArr[] = {"Apple" , "Amazon" , "Amd", "Microsoft", "Microwave", "MicroNews", "Intel", "Intelligence"};
        ArrayAdapter<String> newsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dataArr);
        searchAutoComplete.setAdapter(newsAdapter);

        // Listen to search view item on click event.
        searchAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long id) {
                String queryString=(String)adapterView.getItemAtPosition(itemIndex);
                searchAutoComplete.setText("" + queryString);
                Toast.makeText(MainActivity.this, "you clicked " + queryString, Toast.LENGTH_LONG).show();
            }
        });

        // Below event is triggered when submit search query.
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setMessage("Search keyword is " + query);
                alertDialog.show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.app_bar_menu_search) {
            /*
            new SimpleSearchDialogCompat(MainActivity.this, "Otsi...", "Sisestage märksõna",
                    null, initData(), new SearchResultListener<Searchable>() {
                @Override
                public void onSelected(BaseSearchDialogCompat baseSearchDialogCompat, Searchable searchable, int i) {
                    Toast.makeText(MainActivity.this,""+searchable.getTitle(),Toast.LENGTH_SHORT).show();
                    baseSearchDialogCompat.dismiss();

                    //System.out.println("LOOOOOOOOOOOOOOOOG " + searchable.getTitle());
                    setFragment(searchable.getTitle());
                }
            }).show();
            return true;
        */} if(id == R.id.action_favorite){
            FragmentTransaction ftrans = getSupportFragmentManager().beginTransaction();
            ftrans.replace(R.id.container,bugReport);
            //ftrans.addToBackStack("teretere");

            if(saveName==null){
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("definitsioon", saveName);
                bugReport.setArguments(bundle);
                ftrans.commit();
            }

        }

        return super.onOptionsItemSelected(item);
    }

    private void setFragment(String title) {
        FragmentTransaction ftrans = getSupportFragmentManager().beginTransaction();
        ftrans.replace(R.id.container, headersFragmnetMap.get(title));
        System.out.println("LOOOOOOOOOOOG" + " " +headersFragmnetMap.get(title) +" " + title);
        ftrans.commit();

    }

    /*
    //need  implementation 'com.github.mirrajabi:search-dialog:1.2.3'

    private ArrayList<SearchMode> initData() {
        ArrayList<String> tmp = new ArrayList<>();
        for(String el:headers){
            if(!tmp.contains(el.split("->")[0].trim())) tmp.add(el.split("->")[0].trim());
        }
        Collections.sort(tmp);
        ArrayList<SearchMode> items = new ArrayList<>();
        for(String string : tmp){
            if(string.length() >0) items.add(new SearchMode(string.trim()));
        }

        return items;
    }
    */


    private HashMap<String,Fragment> createFragmenMap(){
        HashMap<String, Fragment> map = new HashMap<>();
        String k = "";
        for(Fragment f:frags){
            k = String.valueOf(f).toLowerCase().replace("{","-").replace("fragment_","").split("-")[0];
            map.put(k,f);
        }
        return map;
    }

    private HashMap<String,Fragment> createMap() {
        String key = "";
        Fragment value;
        HashMap<String, Fragment> map = new HashMap<>();

        for(String h: headers){
            key = h.split("->")[0];
            value = fragmnetMap.get(h.split("->")[1]);
            map.put(key,value);
        }
        //System.out.println(map);

        //for (String string : headers) {
        //}
        return map;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
