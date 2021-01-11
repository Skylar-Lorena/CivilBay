package com.skylar.civilbay;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.DialogFragment;

public class LoginDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_login_dialog, container, false);
        getDialog().setTitle("Simple Dialog");
        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);


        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dismiss();
            }
        });
        RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup); //pull group
        int selectedId = surveyRadioGroup.getCheckedRadioButtonId(); //get selected ID
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId); //get r button val via ID


        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();
            }
        });
        return rootView;
    }
}

