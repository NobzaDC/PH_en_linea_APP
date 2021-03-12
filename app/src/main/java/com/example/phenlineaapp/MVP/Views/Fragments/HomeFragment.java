package com.example.phenlineaapp.MVP.Views.Fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.Adapters.ViewPagerAdapter;
import com.example.phenlineaapp.MVP.Interfaces.Methods.MethodCall;
import com.example.phenlineaapp.Methods.Calls;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.databinding.FragmentHomeBinding;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private Dialog dialog;
    private MethodCall methodCall;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        methodCall = new Calls(getContext(), getActivity());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.viewPager.setSaveEnabled(false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.detail_cooproperty_dialog);
        dialog.getWindow().setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.background_detail_cooproperty));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
        Button btnCallAdmin = dialog.findViewById(R.id.btnCallAdmin);
        btnCallAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodCall.call("3006922336");
                dialog.dismiss();
            }
        });

        binding.btnSeeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }

    private void callAdmin(String tel) {

    }
}