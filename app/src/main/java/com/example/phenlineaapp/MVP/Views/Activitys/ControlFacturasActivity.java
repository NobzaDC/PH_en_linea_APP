package com.example.phenlineaapp.MVP.Views.Activitys;


import android.os.Bundle;

import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.databinding.ActivityControlFacturasBinding;

public class ControlFacturasActivity extends BaseActivity {

    private ActivityControlFacturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityControlFacturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}