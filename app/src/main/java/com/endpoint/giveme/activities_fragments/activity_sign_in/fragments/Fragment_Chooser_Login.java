package com.endpoint.giveme.activities_fragments.activity_sign_in.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.endpoint.giveme.R;
import com.endpoint.giveme.activities_fragments.activity_sign_in.activity.SignInActivity;

public class Fragment_Chooser_Login extends Fragment {

    private LinearLayout ll_phone_sign_up;
    private Button btn_skip;
    private SignInActivity activity;
private TextView tv_terms;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chooser_login,container,false);
        initView(view);
        return view;
    }

    public static Fragment_Chooser_Login newInstance()
    {
        return new Fragment_Chooser_Login();
    }

    private void initView(View view) {
        activity = (SignInActivity) getActivity();
        ll_phone_sign_up = view.findViewById(R.id.ll_phone_sign_up);
        btn_skip = view.findViewById(R.id.btn_skip);
        tv_terms = view.findViewById(R.id.tv_terms);

        ll_phone_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.DisplayFragmentPhone();
            }
        });

       tv_terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.NavigateToTermsActivity();
            }
        });
        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.NavigateToClientHomeActivity();
            }
        });
    }
}
