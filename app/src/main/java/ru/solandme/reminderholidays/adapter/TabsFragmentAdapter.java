package ru.solandme.reminderholidays.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ru.solandme.reminderholidays.fragment.AbstractTabFragment;
import ru.solandme.reminderholidays.fragment.BirthdaysFragment;
import ru.solandme.reminderholidays.fragment.HolidaysFragment;
import ru.solandme.reminderholidays.fragment.NotificationsFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;
    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);

        this.context = context;
        initTabsMap(context);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HolidaysFragment.getInstance(context));
        tabs.put(1, NotificationsFragment.getInstance(context));
        tabs.put(2, BirthdaysFragment.getInstance(context));
    }
}
