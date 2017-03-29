package com.example.root.hackathon;

/**
 * Created by Manish on 28-Mar-17.
 */


import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://smartewaste-com.stackstaging.com/Foobar404Gov/api/register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String email, String mobile, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email",  email);
        params.put("mobile", mobile );
        params.put("password", password);
    }


    public Map<String, String> getParams() {
        return params;
    }
}