package mmstudio.com.fragmentsexample.login;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mmstudio.com.fragmentsexample.Login;
import mmstudio.com.fragmentsexample.R;
import mmstudio.com.fragmentsexample.register.RegisterFragment;

/**
 * A simple {@link Fragment} subclass.
 */

public class LoginFragment extends Fragment {

    Button mRegister;
    Button mLogin;

    public static LoginFragment newInstance() {

        Bundle args = new Bundle();

        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRegister= (Button) view.findViewById(R.id.button3);
        mLogin = (Button) view.findViewById(R.id.button);

        final Login login = (Login) getActivity();

        mLogin.setOnClickListener(new View.OnClickListeners() {

        }

//        mRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                login.replaceFragment(RegisterFragment.newInstance());


        });
    }

