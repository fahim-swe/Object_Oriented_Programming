package Inheritance.multilevel;

public class area extends advanced{


    public float rectangle(float l, float b)
    {
        return super.mul(l,b);
    }

    public float circle(float r)
    {
        return (float) (3.1416 * super.sqr(r));
    }
}

