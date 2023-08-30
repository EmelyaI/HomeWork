package Task8_2;

public class Circle implements Figure {
    private float s;
    private float p;
    public float FindSquareAndPer(float a, float b, float c) {
        float s = (float) (3.14 * Math.pow(a, 2));
        float p = (float) (2 * a * 3.14);
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