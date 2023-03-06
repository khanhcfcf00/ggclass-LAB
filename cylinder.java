public class cylinder {
Package BT_LAB;

public class Cylinder extends circle{
    public double height;

    public double getHeight(){
        return this.height;
    }

    public double setHeight(double height){
        return this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }
}
}

