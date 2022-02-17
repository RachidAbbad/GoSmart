package com.rachid_abbad.gosmart.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.rachid_abbad.gosmart.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel = new NotificationsViewModel();
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        //ToDo Implements notification section here

        return root;
    }
}