package OOPS_Class_objects;

public class BoxConstructorOverloading {
    double  weidth, height, depth;

    BoxConstructorOverloading()//   1
    {
        weidth=height=depth=0;
    }

    BoxConstructorOverloading(double w,double h, double d )//  2
    {
        weidth=w;
        height=h;
        depth=d;
    }

    BoxConstructorOverloading(double leng)//  3
    {
        weidth=height=depth=leng;
    }
    double volume()
    {
        return (weidth*height*depth);
    }
}
