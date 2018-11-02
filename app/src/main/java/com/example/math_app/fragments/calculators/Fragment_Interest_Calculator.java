package com.example.math_app.fragments.calculators;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.math_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_Interest_Calculator.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_Interest_Calculator#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Interest_Calculator extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    EditText inputSumma;
    EditText inputPeriood;
    EditText inputIntress;

    double summa;
    double periood;
    double intress;

    TextView lihtIntress;
    TextView liitIntress;
    private OnFragmentInteractionListener mListener;

    public Fragment_Interest_Calculator() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Interest_Calculator.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Interest_Calculator newInstance(String param1, String param2) {
        Fragment_Interest_Calculator fragment = new Fragment_Interest_Calculator();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
       ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment__interest__calculator, container, false);
        return inflater.inflate(R.layout.activity_interest__calculator, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
/*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
*/
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        inputSumma = getView().findViewById(R.id.inputsumma);
        inputPeriood = getView().findViewById(R.id.inputperiood);
        inputIntress = getView().findViewById(R.id.inputintress);

        inputSumma.addTextChangedListener(new GenericTextWatcher(inputSumma));
        inputPeriood.addTextChangedListener(new GenericTextWatcher(inputPeriood));
        inputIntress.addTextChangedListener(new GenericTextWatcher(inputIntress));

        lihtIntress = getView().findViewById(R.id.lihtintress);
        liitIntress = getView().findViewById(R.id.liitintress);
    }

    private class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (inputSumma.getText().toString().trim().equals("") ||
                    inputPeriood.getText().toString().trim().equals("") ||
                    inputIntress.getText().toString().trim().equals("")) {
                emptyInputs();
            } else if (inputSumma.getText().toString().trim().equals("-") ||
                    inputPeriood.getText().toString().trim().equals("-") ||
                    inputIntress.getText().toString().trim().equals("-")){
                emptyInputs();
            } else {
                calculate();
            }
        }
        @Override
        public void afterTextChanged(Editable s) { }
    }
    public void emptyInputs(){
        String lihtText = "Lihtintress: ";
        String liitText = "Liitintress: ";
        lihtIntress.setText(lihtText);
        liitIntress.setText(liitText);
    }
    public void calculate(){
        summa = Double.parseDouble(inputSumma.getText().toString());
        periood = Double.parseDouble(inputPeriood.getText().toString());
        intress = Double.parseDouble(inputIntress.getText().toString());

        double lihtSum = summa* periood *(intress/100) + summa;
        double liitSum = summa * Math.pow((1+(intress/100)),periood);

        double roundedLihtSum = (double)Math.round(lihtSum * 10000d) / 10000d;
        double roundedLiitSum = (double)Math.round(liitSum * 10000d) / 10000d;

        String lihtText = "Lihtintress: " + Double.toString(roundedLihtSum);
        String liitText = "Liitintress: " + Double.toString(roundedLiitSum);
        lihtIntress.setText(lihtText);
        liitIntress.setText(liitText);
    }
}
