package com.putri.mynotesapp.ui.home;

/*
 * NIM : 10120040
 *Nama : Putri Silva Amrillah
 *Kelas : IF1
 *Email : putri.10120040@mahasiswa.unikom.ac.id
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.putri.mynotesapp.R;

public class FragmentHome extends Fragment{

    Button logout;
    GoogleSignInClient gClient;
    GoogleSignInOptions gOptions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
