package com.infinite.code;

public class OverloadingExample {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    //Method to obtain distance of a point w.r.t origin
    public double distance(){
        double res=x*x+y*y;
        double ans=Math.sqrt(res);
        return ans;
    }

    public static void main(String[] args) {

    }
}
