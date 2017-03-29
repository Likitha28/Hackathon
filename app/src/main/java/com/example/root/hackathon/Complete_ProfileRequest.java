package com.example.root.hackathon;

/**
 * Created by Manish on 29-Mar-17.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Manish on 28-Mar-17.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
public class Complete_ProfileRequest extends StringRequest {
    private static final String complete = "http://smartewaste-com.stackstaging.com/Foobar404Gov/api/login.php";
    private Map<String, String> params;

    public Complete_ProfileRequest(String address, String pincode,String bankname,String accountholder, String accountno,String ifsc,  Response.Listener<String> listener) {
        super(Method.POST,complete , listener, null);
        params = new HashMap<>();
        params.put("email", address);
        params.put("email", pincode);
        params.put("email", bankname);
        params.put("password", accountholder);
        params.put("email", accountno);
        params.put("email", ifsc);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}