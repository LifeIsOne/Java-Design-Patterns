package sample;

public class MockMeter implements Meter{
    @Override
    public int getStep() {
        return 5;
    }
}