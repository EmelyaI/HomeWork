package Task8_2;

public class Rectangle implements Figure {
    private float s;
    private float p;
    @Override
    public float FindSquareAndPer(float a, float b, float c) {
        s = a * b;
        p = (a + b) * 2;
        setP(p);
        System.out.println("Area - " + s);
        return p;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }
}
