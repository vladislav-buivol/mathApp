package com.example.math_app;

import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.rule.ActivityTestRule;
import android.view.Gravity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.DrawerMatchers.isOpen;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

//https://stackoverflow.com/questions/27220612/accessing-children-in-custom-expandablelist-using-android-espresso
//href = https://developer.android.com/training/testing/espresso/basics
//href = https://medium.com/@alecholmes/arcane-android-espresso-with-a-navigation-drawer-a411ebc70f3c
//href = https://android.jlelse.eu/the-basics-of-android-espresso-testing-activities-fragments-7a8bfbc16dc5



public class Tests {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    @Before
    public void init(){
        activityActivityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction();
    }


    @Test
    public void navigationDrawerTest()  {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());
        onView(withId(R.id.drawer_layout)).check(matches(isOpen()));
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.close());
        onView(withId(R.id.drawer_layout))
                .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
                .perform(DrawerActions.open()); // Open Drawer
    }

    @Test
    public void fragmentTest() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_1));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_2));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_3));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_4));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_5));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_6));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_7));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_8));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.klass_9));
        onData(is(instanceOf(ExpandableListAdapter.class))).inAdapterView(withId(R.id.gymnasium));
    }

    @Test
    public void searchTest() {
        onView(withId(R.id.app_bar_menu_search)).perform(click());
    }

    //@Test
    //public void favoriteTest() {
      //  onView(withId(R.id.action_favorite)).perform(click());
    //}

}
