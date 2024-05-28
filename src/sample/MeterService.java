package sample;

public class MeterService {
    private Meter meter;

    public MeterService(Meter meter) {
        this.meter = meter;
    }

    public void render(){
        int step = meter.getStep();
    }
}
