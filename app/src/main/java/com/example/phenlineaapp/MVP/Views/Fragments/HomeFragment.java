package com.example.phenlineaapp.MVP.Views.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.phenlineaapp.Adapters.ViewPagerAdapter;
import com.example.phenlineaapp.Base.Fragments.BaseFragment;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.databinding.FragmentHomeBinding;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends BaseFragment {

    private FragmentHomeBinding binding;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        init();
        return binding.getRoot();
    }

    private void init() {
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.viewPager.setSaveEnabled(false);
        binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_economy);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_social);
        binding.tabLayout.getTabAt(2).setIcon(R.drawable.ic_informes);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}