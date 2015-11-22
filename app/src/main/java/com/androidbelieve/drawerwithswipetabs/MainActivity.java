package com.androidbelieve.drawerwithswipetabs;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *Setup the DrawerLayout and NavigationView
         */

             mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);


        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */



        /**
         * Setup click events on the Navigation View Items.
         */

/*

             mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                 @Override
                 public boolean onNavigationItemSelected(MenuItem menuItem) {
                     mDrawerLayout.closeDrawers();


                     if (menuItem.getItemId() == R.id.nav_item_sent) {
                         FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                         fragmentTransaction.replace(R.id.containerView, new SentFragment()).commit();

                     }

                     if (menuItem.getItemId() == R.id.nav_item_inbox) {
                         FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                         xfragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
                     }

                     return false;
                 }

             });
*/
        /**
         * Setup Drawer Toggle of the Toolbar
         */
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();

                android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
                ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);
      ListView listView = (ListView)findViewById(R.id.left_drawer);
        listView.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, new Integer[]{1, 2, 3, 4}));


        mDrawerLayout.setDrawerListener(mDrawerToggle);

                mDrawerToggle.syncState();

    }
}