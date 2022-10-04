package com.infinite.code;

public class OverloadingExample {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
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
    public double distance(OverloadingExample point2){
        double d1=Math.pow((this.getX()- point2.getX()),2)+Math.pow((this.getY()- point2.getY()),2);
        double ans=Math.sqrt(d1);
        return ans;
    }

    public static void main(String[] args) {
        OverloadingExample point=new OverloadingExample();
        OverloadingExample point1=new OverloadingExample();
        OverloadingExample point2=new OverloadingExample();

        point.setX(3);
        point.setY(4);
        point1.setX(3);
        point1.setY(4);
        point2.setX(5);
        point2.setY(6);

        double result1= point.distance();
        double result=point1.distance(point2);
        System.out.println(result1);
        System.out.println(result);

    }
}
