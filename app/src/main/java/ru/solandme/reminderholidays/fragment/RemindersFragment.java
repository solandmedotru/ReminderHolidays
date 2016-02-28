package ru.solandme.reminderholidays.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.solandme.reminderholidays.R;
import ru.solandme.reminderholidays.adapter.RemindListAdapter;
import ru.solandme.reminderholidays.dto.RemindDTO;

public class RemindersFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_reminders;

    public static RemindersFragment getInstance(Context context) {
        Bundle args = new Bundle();
        RemindersFragment fragment = new RemindersFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_reminders));

        return fragment;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.reminderRV);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createTestListData()));


        return view;
    }

    private List<RemindDTO> createTestListData() {

        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));

        return data;

    }
}
