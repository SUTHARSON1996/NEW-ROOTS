package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 26/11/16.
 */

public class BasicProfileInfo extends Fragment {

    View view;
    EditText name;
    EditText status;
    ImageView imageView;
    Button changDetails;
    Button changeImage;
    String accName;
    String accStatus;
    FragmentChanger fragmentChanger;

    public static BasicProfileInfo newInstance(){

        return new BasicProfileInfo();
    }

    public BasicProfileInfo(){


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentChanger){
            fragmentChanger = (FragmentChanger)context;
        }
        else{
            throw new ClassCastException(context.toString()+" must implement listener");

        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.basic_profile_info,container,false);
        name=(EditText)view.findViewById(R.id.basic_acount_name);
        status=(EditText)view.findViewById(R.id.basic_acount_status);
        changDetails=(Button)view.findViewById(R.id.basic_account_details_post_button);
        imageView = (ImageView)view.findViewById(R.id.basic_account_detail_image);
        changeImage = (Button)view.findViewById(R.id.basic_acc_change_image);

        changDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accName = name.getText().toString();
                accStatus = status.getText().toString();
                Toast.makeText(getActivity(),accName+" "+accStatus,Toast.LENGTH_LONG).show();

            }
        });

        changeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked button",Toast.LENGTH_LONG).show();
                fragmentChanger.changeBasicProfilePic();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked image",Toast.LENGTH_LONG).show();
                fragmentChanger.changeBasicProfilePic();
            }
        });


        return view;

    }
}
