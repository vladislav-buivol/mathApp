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
 * {@link Fragment_quad_calc.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_quad_calc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_quad_calc extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    double a;
    double b;
    double c;

    TextView x1;
    TextView x2;

    TextView info;

    EditText inputA;
    EditText inputB;
    EditText inputC;


    public Fragment_quad_calc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_quad_calc.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_quad_calc newInstance(String param1, String param2) {
        Fragment_quad_calc fragment = new Fragment_quad_calc();
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
        TextView mTextView;

        TextView   one = (TextView) getActivity().findViewById(R.id.anwserX);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_quad_calc, container, false);
        return inflater.inflate(R.layout.activity_quadratic_calculator_, container, false);
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


    private class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (inputA.getText().toString().trim().equals("") ||
                    inputB.getText().toString().trim().equals("") ||
                    inputC.getText().toString().trim().equals("")) {
                String text = "Lahendid puuduvad";
                info.setText(text);
                zeroFields();
            } else if (inputA.getText().toString().trim().equals("-") ||
                    inputB.getText().toString().trim().equals("-") ||
                    inputC.getText().toString().trim().equals("-")){
                String text = "Lahendid puuduvad";
                info.setText(text);
            } else if (ifXNull()){
                String text = "Nulliga ei saa jagada";
                info.setText(text);
                setImaginary();
            } else if(ifSquareRootNeg()){
                String text = "Ruutjuure all negatiivne arv";
                info.setText(text);
                setImaginary();
            } else {
                calculate();
                String text = "";
                info.setText(text);
            }
        }
        @Override
        public void afterTextChanged(Editable s) { }
    }
    public void zeroFields(){
        String setx1 = "X1 = ";
        String setx2 = "X2 = ";

        x1.setText(setx1);
        x2.setText(setx2);
    }
    public void setImaginary(){
        String setx1 = "X1 = imaginaararv";
        String setx2 = "X2 = imaginaararv";

        x1.setText(setx1);
        x2.setText(setx2);
    }

    public boolean ifXNull(){
        a = Double.parseDouble(inputA.getText().toString());
        return a == 0;
    }
    public boolean ifSquareRootNeg(){
        a = Double.parseDouble(inputA.getText().toString());
        b = Double.parseDouble(inputB.getText().toString());
        c = Double.parseDouble(inputC.getText().toString());
        double underSquareRoot = Math.pow(b,2)-(4*a*c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(underSquareRoot);
        return underSquareRoot < 0;
    }
    public void calculate(){
        a = Double.parseDouble(inputA.getText().toString());
        b = Double.parseDouble(inputB.getText().toString());
        c = Double.parseDouble(inputC.getText().toString());

        double underSquareRoot = Math.pow(b,2)-(4*a*c);
        double anwserX1 = (((-1)*b)+Math.sqrt(underSquareRoot))/(2*a);
        double anwserX2 = (((-1)*b)-Math.sqrt(underSquareRoot))/(2*a);

        double roundedX1 = (double)Math.round(anwserX1 * 10000d) / 10000d;
        double roundedX2 = (double)Math.round(anwserX2 * 10000d) / 10000d;

        String stringx1 = "X1 = " + Double.toString(roundedX1);
        String stringx2 = "X2 = " + Double.toString(roundedX2);

        x1.setText(stringx1);
        x2.setText(stringx2);
    }

    //https://stackoverflow.com/questions/33469159/android-fragment-and-null-object-reference
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        x1 = (TextView) getView().findViewById(R.id.anwserX);
        x2 = getView().findViewById(R.id.anwserX2);

        inputA = getView().findViewById(R.id.InputA);
        inputB = getView().findViewById(R.id.InputB);
        inputC = getView().findViewById(R.id.InputC);

        info = getView().findViewById(R.id.info);

        inputA.addTextChangedListener(new GenericTextWatcher(inputA));
        inputB.addTextChangedListener(new GenericTextWatcher(inputB));
        inputC.addTextChangedListener(new GenericTextWatcher(inputC));
    }
}

