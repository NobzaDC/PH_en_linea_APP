package com.example.phenlineaapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.R;

import java.util.List;

public class ButtonsUserControlAdapter extends RecyclerView.Adapter<ButtonsUserControlAdapter.ViewHolderButtons> implements View.OnClickListener {

    private final List<ButtonsUserControlModel> mList;
    private final View.OnClickListener mListener;

    public ButtonsUserControlAdapter(List<ButtonsUserControlModel> mList, View.OnClickListener mListener) {
        this.mList = mList;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ButtonsUserControlAdapter.ViewHolderButtons onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_control_buttons, null, false);
        view.setOnClickListener(this);
        return new ViewHolderButtons(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonsUserControlAdapter.ViewHolderButtons holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View view) {
        if (mListener != null) {
            mListener.onClick(view);
        }
    }

    public class ViewHolderButtons extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, description;

        public ViewHolderButtons(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img_control_buttons);
            title = itemView.findViewById(R.id.txt_title_control_buttons);
            description = itemView.findViewById(R.id.txt_description_control_buttons);
        }
    }
}
