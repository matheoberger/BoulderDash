package model.element.mobile;

public abstract class FallingMobile extends Mobile {
    private Boolean falling;
    private Boolean visible;

    public FallingMobile() {

        // TODO Auto-generated constructor stub
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Boolean isFalling() {
        return this.falling;
    }

    public void kill(final iLife elementAlive) {
        elementAlive.setAlive(false);
    }

    public void setFalling(final Boolean falling) {
        this.falling = falling;
    }

    public void setVisible(final Boolean visible) {
        this.visible = visible;
    }
}
