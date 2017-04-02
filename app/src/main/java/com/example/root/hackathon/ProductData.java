package com.example.root.hackathon;

/**
 * Created by Dev_N on 29-03-2017.
 */

public class ProductData {

    private String name;
    private String type;
    private String count;

    public ProductData( String type, String count) {
        this.name = name;
        this.type = type;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
