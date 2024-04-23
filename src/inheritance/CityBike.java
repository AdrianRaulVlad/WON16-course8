package inheritance;

public class CityBike extends Bike {
    private boolean lightState;

    public boolean isLightState() {
        return lightState;
    }

    public void setLightState(boolean lightState) {
        this.lightState = lightState;
    }
}
