package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;



    public Mountain(){
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }

    public Mountain(String n, String l, int h){
        name=n;
        location=l;
        height=h;
    }

    public String info(){
        String tmp=new String();
        tmp+=name+" is located in " +location+ " and reaches "+height+"m above sea level. ";
        return tmp;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
