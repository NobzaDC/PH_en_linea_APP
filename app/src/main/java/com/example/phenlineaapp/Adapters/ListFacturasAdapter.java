package com.example.phenlineaapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phenlineaapp.Models.FacturasModel;
import com.example.phenlineaapp.R;

import java.util.List;

public class ListFacturasAdapter extends RecyclerView.Adapter<ListFacturasAdapter.ViewHolderFacturas> implements View.OnClickListener {

    private final List<FacturasModel> mList;
    private View.OnClickListener listener;

    public ListFacturasAdapter(List<FacturasModel> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public ListFacturasAdapter.ViewHolderFacturas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_periodos_facturas, null, false);
        view.setOnClickListener(this);
        return new ViewHolderFacturas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFacturasAdapter.ViewHolderFacturas holder, int position) {
        holder.tvAño.setText(mList.get(position).getAnio());
        holder.tvMes.setText(mList.get(position).getMes());
        holder.tvPeriodo.setText(mList.get(position).getPeriodo());
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public void onClick(View view) {
        if ((listener != null)) {
            listener.onClick(view);
        }
    }

    public class ViewHolderFacturas extends RecyclerView.ViewHolder {

        TextView tvAño, tvMes, tvPeriodo;

        public ViewHolderFacturas(@NonNull View itemView) {
            super(itemView);
            tvAño = itemView.findViewById(R.id.tv_facturas_año);
            tvMes = itemView.findViewById(R.id.tv_facturas_mes);
            tvPeriodo = itemView.findViewById(R.id.tv_facturas_periodo);
        }
    }
}
