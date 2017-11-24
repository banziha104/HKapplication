package com.veryworks.iyeongjun.hkapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.Button;

import com.veryworks.iyeongjun.hkapp.domain.DataReceiver;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTouch;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    boolean drawerToggle = false;

    @BindView(R.id.btnMenu) Button btnMenu;
    @BindView(R.id.tabLayout) TabLayout tab;
    @BindView(R.id.viewpager) ViewPager pager;
    String a;
    /**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setView();
        DataReceiver dataReceiver = new DataReceiver(this);
        dataReceiver.getData();
    }

    private void setView() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, //상태바 제거
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setPager();
    }


    /**
     * 메뉴버튼 터치리스너
     *
     * @param event
     * @return
     */

    @OnTouch(R.id.btnMenu)
    public boolean onMenuButtonTouch(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (drawerToggle == false) {
                drawer.openDrawer(Gravity.RIGHT);
            } else {
                drawer.closeDrawer(Gravity.RIGHT);
            }
        }
        return false;
    }

    /*뷰페이저와 프래그먼트 세팅*/
    public void setPager() {

//        Log.d("ARPOINT", currentUserLocation.getLatitude() + "/" + currentUserLocation.getLongitude());
//
//        tab.addTab(tab.newTab().setIcon(tabIcons[0]));
//        tab.addTab(tab.newTab().setIcon(tabIcons[1]));
//        tab.addTab(tab.newTab().setIcon(tabIcons[2]));
//        tab.addTab(tab.newTab().setIcon(tabIcons[3]));
        tab.addTab(tab.newTab().setText("a"));
        tab.addTab(tab.newTab().setText("b"));
        tab.addTab(tab.newTab().setText("c"));
        tab.addTab(tab.newTab().setText("d"));
        List<Fragment> datas = new ArrayList<>();

        ListFragment listFragment = new ListFragment();
        SectionTypeFragment sectionFragment = new SectionTypeFragment();
        TournamentFragment tagFragment = new TournamentFragment();
        MapFragment mapFragment = new MapFragment();

        datas.add(listFragment);
        datas.add(sectionFragment);
        datas.add(tagFragment);
        datas.add(mapFragment);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), datas);
        // 아답터를 페이저 위젯에 연결
        pager.setAdapter(adapter);
        // 페이저가 변경되었을 때 탭을 변경해주는 리스너
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        // 탭이 변경되었때 페이저를 변경해주는 리스너
        tab.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tabs) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tabs) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tabs) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
}
