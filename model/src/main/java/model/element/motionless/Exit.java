package model.element.motionless;

public class Exit extends Motionless {
    private DoorState doorState;

    public DoorState getDoorState() {
        return this.doorState;
    }

    public void open() {

    }

    public void setDoorState(final DoorState doorState) {
        this.doorState = doorState;
    }
}
