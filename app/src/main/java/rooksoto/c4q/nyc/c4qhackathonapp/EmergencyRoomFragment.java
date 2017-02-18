package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by akashaarcher on 2/18/17.
 */

public class EmergencyRoomFragment extends Fragment {

    private String title;
    private int page;
    private static final String INT_TAG = "zero";
    private static final String TITLE_TAG = "emergFrag";
    private RecyclerView recyclerView;


    public static Fragment newInstance(int page, String title) {
        EmergencyRoomFragment connectFrag = new EmergencyRoomFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        connectFrag.setArguments(bundleArgs);
        return connectFrag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(INT_TAG, 0);
        title = getArguments().getString(TITLE_TAG);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_emergency_room,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.emergency_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }


}
