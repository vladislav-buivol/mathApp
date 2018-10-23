package com.example.math_app;
//https://stackoverflow.com/questions/49990933/configuration-on-demand-is-not-supported-by-the-current-version-of-the-android-g
//https://github.com/PrivacyApps/html-textview


import android.content.Intent;
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
import android.webkit.WebView;
import android.widget.ExpandableListView;

import android.widget.Toast;

import com.example.math_app.fragments.Fragment_Interest_Calculator;
import com.example.math_app.fragments.Fragment_Klass_2;
import com.example.math_app.fragments.Fragment_quad_calc;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    View view_Group;
    private int KALKULAATORID = 11;
    private int SUB_KALKULAATORID_RUUT_LAH = 0;
    private int SUB_KALKULAATORID_INTRESSI_LAH = 1;
    private int KLASS_2 = 1;
    private int KLASS_2_ALL_MATERIALS = 0;
    private DrawerLayout mDrawerLayout;
    ExpandableListAdapter mMenuAdapter;
    ExpandableListView expandableList;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    Fragment_quad_calc quad_calc = new Fragment_quad_calc();
    Fragment_Interest_Calculator interest_calculator = new Fragment_Interest_Calculator();
    Fragment_Klass_2 klass_2_frag = new Fragment_Klass_2();
    String klass_2_all_materials = "";
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

                if(groupPosition == KLASS_2 && childPosition == KLASS_2_ALL_MATERIALS ){
                    ftrans.replace(R.id.container,klass_2_frag);
                    ftrans.commit();
                }
                if(groupPosition==KALKULAATORID && childPosition==SUB_KALKULAATORID_RUUT_LAH){
                    ftrans.replace(R.id.container,quad_calc);
                    ftrans.commit();
                }
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
        listDataHeader.add("Lemmikud");

        listDataHeader.add("Kalkulaatorid");
        //listDataHeader.add("Ruutvõrrandi lahendaja");


        // Adding child data
        List<String> klass_1 = new ArrayList<String>();

        klass_1.add("Submenu");
        klass_1.add("Submenu");
        klass_1.add("Submenu");


        List<String> klass_2 = new ArrayList<String>();
        klass_2.add("Klass 2 kõik materjalid");
        klass_2.add("Submenu");
        klass_2.add("Submenu");
        klass_2.add("Submenu");

        List<String> klass_3 = new ArrayList<String>();
        klass_3.add("Submenu");
        klass_3.add("Submenu");

        List<String> klass_4 = new ArrayList<String>();
        klass_4.add("Submenu");
        klass_4.add("Submenu");

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

        listDataChild.put(listDataHeader.get(0), klass_1);// Header, Child data
        listDataChild.put(listDataHeader.get(KLASS_2), klass_2);
        listDataChild.put(listDataHeader.get(2), klass_3);
        listDataChild.put(listDataHeader.get(3), klass_4);
        listDataChild.put(listDataHeader.get(4), klass_5);
        listDataChild.put(listDataHeader.get(5), klass_6);
        listDataChild.put(listDataHeader.get(6), klass_7);
        listDataChild.put(listDataHeader.get(7), klass_8);
        listDataChild.put(listDataHeader.get(8), klass_9);
        listDataChild.put(listDataHeader.get(9), gymnasium);
        listDataChild.put(listDataHeader.get(10), lemmikud);
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