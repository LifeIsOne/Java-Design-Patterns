package sample;

public class RealMeter implements Meter{
    @Override
    public int getStep() {
        return 5;
    }
}