package com.example.math_app.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.math_app.R;

import org.json.JSONObject;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_BugReport.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_BugReport#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_BugReport extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    TextView defText;
    String definitsioon;
    EditText selgitus;
    Button button;
    String status;

    public Fragment_BugReport() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_BugReport.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_BugReport newInstance(String param1, String param2) {
        Fragment_BugReport fragment = new Fragment_BugReport();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        definitsioon = getArguments().getString("definitsioon");
        Log.i("*****", definitsioon);

        return inflater.inflate(R.layout.activity_bug_report, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        defText = getView().findViewById(R.id.definitsioon);
        defText.setText(definitsioon);

        selgitus = getView().findViewById(R.id.selgitus);
        selgitus.setText("");

        button = getView().findViewById(R.id.sendbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String body = selgitus.getText().toString();
                sendPost(definitsioon, body);
            }
        });
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

 /*   @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

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

   public void sendPost(final String title, final String body) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://api.github.com/repos/Teemant/minilex/issues");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                    conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    conn.setRequestProperty("Accept","application/vnd.github.symmetra-preview+json");
                    conn.setRequestProperty ("Authorization", "Basic "+ "bWlubGVrc2lrb246bWluaWxla3MxMjM=");

                    conn.setRequestMethod("POST");

                    conn.setDoOutput(true);
                    conn.setDoInput(true);
                    /*JSONObject jsonParam = new JSONObject();
                    jsonParam.put("title", title);
                    jsonParam.put("body", body);Log.i("****JSON", jsonParam.toString());*/

                    //os.writeBytes(jsonParam.toString());
                    //os.writeBytes(URLEncoder.encode(jsonParam.toString(), "UTF-8"));

                    DataOutputStream os = new DataOutputStream(conn.getOutputStream());

                    String json = "{\"title\":" + "\"" + title + "\",\"body\":\"" + body + "\"}";
                    os.write(json.getBytes("UTF-8"));

                    os.flush();
                    os.close();

                    status = String.valueOf(conn.getResponseCode());
                    Log.i("****STATUS", status);
                    Log.i("****MSG" , conn.getResponseMessage());


                    conn.disconnect();

                    if(status.equals("201")){
                        Log.i("****status" , "jõuab");
                        //getFragmentManager().popBackStackImmediate();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
