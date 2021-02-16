package com.example.phenlineaapp.Views.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phenlineaapp.Adapters.ViewPagerAdapter;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(new InicioFragment(), "Inicio");
        viewPagerAdapter.addFragment(new EventFragment(), "Eventos");
        binding.viewPager.setAdapter(viewPagerAdapter);
        return binding.getRoot();
    }
}