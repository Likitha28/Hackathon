package com.example.root.hackathon;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.example.root.hackathon.ProductData;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddactivityRequest extends StringRequest {

    private static final String ORDER_REQUEST_URL = "http://smartewaste-com.stackstaging.com/Foobar404Gov/api/recieve-product-details.php";
    private Map<String, String> params;
    private String TAG = AddactivityRequest.class.getSimpleName();
    public AddactivityRequest(int user_id, ArrayList<ProductData> orderList, Response.Listener<String> listener) {
        super(Method.POST, ORDER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("user_id",user_id +"");
params.put("count", String.valueOf(orderList.size()));
        for (int i = 0; i < orderList.size(); i++) {
            params.put( Integer.toString(i),orderList.get(i).getType() + "," + orderList.get(i).getCount());
        }


        for (String key : params.keySet()) {
            Log.e(TAG, key + " " + params.get(key));
        }


    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }

}