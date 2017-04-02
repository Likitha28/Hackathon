package com.example.root.hackathon;

/**
 * Created by Manish on 02-Apr-17.
 */


import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class RequestFetch extends StringRequest {

    private String TAG = RequestFetch.class.getSimpleName();
    private static final String ORDER_REQUEST_URL = "http://smartewaste-com.stackstaging.com/Foobar404Gov/api/send-product-type.php";
    private Map<String, String> params;

    public RequestFetch(String collectorID, Response.Listener<String> listener) {
        super(Method.POST, ORDER_REQUEST_URL, listener, null);
        Log.e(TAG, collectorID);
        params = new HashMap<>();

    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }

}

