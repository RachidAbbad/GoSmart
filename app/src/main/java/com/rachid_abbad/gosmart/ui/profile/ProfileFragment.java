package com.rachid_abbad.gosmart.ui.profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rachid_abbad.gosmart.R;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel = new ProfileViewModel();
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        //ToDo Implements profile section here

        return root;
    }

}