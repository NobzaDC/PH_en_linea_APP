package com.example.phenlineaapp.Views.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.Adapters.ViewPagerAdapter;
import com.example.phenlineaapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ViewPagerAdapter viewPagerAdapter;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.viewPager.setSaveEnabled(false);
        return binding.getRoot();
    }
}