package File_Practical;

//operation class
class Box {
    double depth;
    double width;
    double height;

    Box(double d,double w,double h) {
        depth = d;
        width = w;
        height = h;
    }

    double method() {
        return depth * width * height;
    }

};



// main function class
public class BoxVolume {
    public static void main(String[] args) {
        Box obj1 = new Box(5,4,3);
        double vol = obj1.method();
        System.out.println("Volume of box = " + vol);
    }
}





