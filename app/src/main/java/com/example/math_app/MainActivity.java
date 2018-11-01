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

import com.example.math_app.fragments.Fragment_Interest_Calculator;
import com.example.math_app.fragments.Fragment_Klass_1_1;
import com.example.math_app.fragments.Fragment_Klass_1_4;
import com.example.math_app.fragments.Fragment_Klass_1_6;
import com.example.math_app.fragments.Fragment_Klass_1_9;
import com.example.math_app.fragments.Fragment_Klass_1_8;
import com.example.math_app.fragments.Fragment_Klass_1_2;
import com.example.math_app.fragments.Fragment_Klass_1_5;
import com.example.math_app.fragments.Fragment_Klass_1_7;
import com.example.math_app.fragments.Fragment_Klass_1_3;
import com.example.math_app.fragments.Fragment_Klass_2_1;
import com.example.math_app.fragments.Fragment_Klass_2_10;
import com.example.math_app.fragments.Fragment_Klass_2_11;
import com.example.math_app.fragments.Fragment_Klass_2_12;
import com.example.math_app.fragments.Fragment_Klass_2_13;
import com.example.math_app.fragments.Fragment_Klass_2_14;
import com.example.math_app.fragments.Fragment_Klass_2_15;
import com.example.math_app.fragments.Fragment_Klass_2_16;
import com.example.math_app.fragments.Fragment_Klass_2_17;
import com.example.math_app.fragments.Fragment_Klass_2_18;
import com.example.math_app.fragments.Fragment_Klass_2_19;
import com.example.math_app.fragments.Fragment_Klass_2_2;
import com.example.math_app.fragments.Fragment_Klass_2_20;
import com.example.math_app.fragments.Fragment_Klass_2_3;
import com.example.math_app.fragments.Fragment_Klass_2_4;
import com.example.math_app.fragments.Fragment_Klass_2_5;
import com.example.math_app.fragments.Fragment_Klass_2_6;
import com.example.math_app.fragments.Fragment_Klass_2_7;
import com.example.math_app.fragments.Fragment_Klass_2_8;
import com.example.math_app.fragments.Fragment_Klass_2_9;
import com.example.math_app.fragments.Fragment_Klass_3_1;
import com.example.math_app.fragments.Fragment_Klass_3_10;
import com.example.math_app.fragments.Fragment_Klass_3_11;
import com.example.math_app.fragments.Fragment_Klass_3_12;
import com.example.math_app.fragments.Fragment_Klass_3_13;
import com.example.math_app.fragments.Fragment_Klass_3_14;
import com.example.math_app.fragments.Fragment_Klass_3_15;
import com.example.math_app.fragments.Fragment_Klass_3_16;
import com.example.math_app.fragments.Fragment_Klass_3_17;
import com.example.math_app.fragments.Fragment_Klass_3_2;
import com.example.math_app.fragments.Fragment_Klass_3_3;
import com.example.math_app.fragments.Fragment_Klass_3_4;
import com.example.math_app.fragments.Fragment_Klass_3_5;
import com.example.math_app.fragments.Fragment_Klass_3_6;
import com.example.math_app.fragments.Fragment_Klass_3_7;
import com.example.math_app.fragments.Fragment_Klass_3_8;
import com.example.math_app.fragments.Fragment_Klass_3_9;
import com.example.math_app.fragments.Fragment_Klass_4_1;
import com.example.math_app.fragments.Fragment_Klass_4_10;
import com.example.math_app.fragments.Fragment_Klass_4_11;
import com.example.math_app.fragments.Fragment_Klass_4_12;
import com.example.math_app.fragments.Fragment_Klass_4_13;
import com.example.math_app.fragments.Fragment_Klass_4_14;
import com.example.math_app.fragments.Fragment_Klass_4_15;
import com.example.math_app.fragments.Fragment_Klass_4_2;
import com.example.math_app.fragments.Fragment_Klass_4_3;
import com.example.math_app.fragments.Fragment_Klass_4_4;
import com.example.math_app.fragments.Fragment_Klass_4_5;
import com.example.math_app.fragments.Fragment_Klass_4_6;
import com.example.math_app.fragments.Fragment_Klass_4_7;
import com.example.math_app.fragments.Fragment_Klass_4_8;
import com.example.math_app.fragments.Fragment_Klass_4_9;
import com.example.math_app.fragments.Fragment_quad_calc;


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
        klass_1.add("Üleminekuga liitmine ja lahutamine");
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
        klass_5.add("Submenu");
        klass_5.add("Submenu");
        klass_5.add("Submenu");

        List<String> klass_6 = new ArrayList<String>();
        klass_6.add("Submenu");
        klass_6.add("Submenu");

        List<String> klass_7 = new ArrayList<String>();
        klass_7.add("Submenu");
        klass_7.add("Submenu");

        List<String> klass_8 = new ArrayList<String>();
        klass_8.add("Submenu");
        klass_8.add("Submenu");

        List<String> klass_9 = new ArrayList<String>();
        klass_9.add("Submenu");
        klass_9.add("Submenu");

        List<String> gymnasium = new ArrayList<String>();
        gymnasium.add("Submenu");
        gymnasium.add("Submenu");

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