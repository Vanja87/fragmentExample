package mmstudio.com.fragmentsexample;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import mmstudio.com.fragmentsexample.login.LoginFragment;
import mmstudio.com.fragmentsexample.register.MyViewPagerAdapter;
import mmstudio.com.fragmentsexample.register.RegisterFragment;

import static android.R.attr.fragment;

public class Login extends AppCompatActivity {

    ViewPager mViewPager;
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(LoginFragment.newInstance());
        fragmentList.add(RegisterFragment.newInstance());

        List<String> names = new ArrayList<>();
        names.add("Login");
        names.add("Register");


        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);

        viewPagerAdapter.addItems(fragmentList, names);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            public void onPageSelected(int position) {
                if (position == 0) {
                    mViewPager.setBackgroundColor(Color.RED);
                } else {
                    mViewPager.setBackgroundColor(Color.BLUE);
                }

            }

            public void replaceFragment(Fragment fragment) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();

                ft.replace(R.id.fragment_container, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }

            public void goToRegistration() {
                mViewPager.setCurrentItem(1);
            }
        }



