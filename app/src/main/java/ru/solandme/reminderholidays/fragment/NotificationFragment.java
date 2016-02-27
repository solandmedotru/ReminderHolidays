package ru.solandme.reminderholidays.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.solandme.reminderholidays.R;

public class NotificationFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_notification;
    private View view;

    public static NotificationFragment getInstance() {
        Bundle args = new Bundle();
        NotificationFragment notificationFragment = new NotificationFragment();
        notificationFragment.setArguments(args);
        return notificationFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);



        return view;
    }
}
