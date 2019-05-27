package model.element.mobile;

public abstract class AliveMobile implements iLife {
    private Boolean alive;

    public Boolean getAlive() {
        return this.alive;
    }

    public void setAlive(final Boolean alive) {
        this.alive = alive;
    }
}
