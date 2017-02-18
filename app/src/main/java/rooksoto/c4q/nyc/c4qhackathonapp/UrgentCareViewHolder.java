package rooksoto.c4q.nyc.c4qhackathonapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rooksoto.c4q.nyc.c4qhackathonapp.model.UrgentCareLocation;

/**
 * Created by akashaarcher on 2/18/17.
 */

public class UrgentCareViewHolder extends RecyclerView.ViewHolder {

    private View view;
    private TextView tvFacilityName;
    private TextView tvBorough;
    private TextView tvAddress;
    private TextView tvPhone;



    public UrgentCareViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        tvFacilityName = (TextView) view.findViewById(R.id.urg_facility_name);
        tvBorough = (TextView) view.findViewById(R.id.urg_borough);
        tvAddress = (TextView) view.findViewById(R.id.urg_address);
        tvPhone = (TextView) view.findViewById(R.id.urg_phone);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.urgent_care_item, parent, false);
    }


    public void bind(UrgentCareLocation location) {
        tvFacilityName.setText(location.getName());
        tvBorough.setText(location.getBorough());
        tvAddress.setText(location.getAddress());
        tvPhone.setText(location.getPhone());
    }
}
