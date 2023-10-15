package Task8_2;

public class Triangle implements Figure {
    private float s;
    private float p;

    @Override
    public float FindSquareAndPer(float a, float b, float c) {
        p = a + b + c;
        s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
