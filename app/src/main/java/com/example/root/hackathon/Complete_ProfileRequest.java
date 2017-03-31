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
    private static final String complete = "http://smartewaste-com.stackstaging.com/Foobar404Gov/api/completeprofile.php";
    private Map<String, String> params;

    public Complete_ProfileRequest(int user_id ,String address, String pincode,String bankname,String accountholder, String accountno,String ifsc,  Response.Listener<String> listener) {
        super(Method.POST,complete , listener, null);
        params = new HashMap<>();
        params.put("user_id", user_id+"");
        params.put("address", address);
        params.put("pincode", pincode);
        params.put("bankname", bankname);
        params.put("accontholder", accountholder);
        params.put("accountno", accountno);
        params.put("ifsc", ifsc);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}