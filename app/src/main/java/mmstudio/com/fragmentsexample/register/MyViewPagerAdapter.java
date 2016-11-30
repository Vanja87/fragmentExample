package mmstudio.com.fragmentsexample.register;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

/**
 * Created by Vanja on 11/25/2016.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> itemList = new ArrayList<>();
    List<Fragment> names = new ArrayList<>();


    public  void addItems(List<Fragment> fragments, List<> titles) {
        itemList.addAll(fragments);
        names.addAll(titles);
        notifyDataSetChanged();

    }

    public  MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    public CharSequence getPageTitle(int position){
        return  names.get(position);
    }
}
