package com.example.to_do_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.to_do_list.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    public void goTD(View v) { //why doesn't this line work when it does inside of the other methods'
        startActivity(new Intent(getActivity(), TodoMain.class));
    }
    public void goClass(View v) { //why doesn't this line work when it does inside of the other methods'
        startActivity(new Intent(getActivity(), CourseMain.class));
    }
    public void goExam(View v) { //why doesn't this line work when it does inside of the other methods'
        startActivity(new Intent(getActivity(), ExamMain.class));
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}