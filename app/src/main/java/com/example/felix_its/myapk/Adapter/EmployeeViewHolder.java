package com.example.felix_its.myapk.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.felix_its.myapk.R;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    TextView txtname,txtaddress,txtnumber;
    Button imgdelete;
    public EmployeeViewHolder(View itemView) {
        super(itemView);
        txtname = itemView.findViewById(R.id.txtname);
        txtaddress = itemView.findViewById(R.id.txtaddress);
        txtnumber = itemView.findViewById(R.id.txtnumber);
        imgdelete = itemView.findViewById(R.id.imgdelete);
    }
}
