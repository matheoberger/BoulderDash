package model.element.mobile;

public abstract class AliveMobile extends Mobile implements iLife {
    protected Boolean alive;

    public Boolean getAlive() {
        return this.alive;
    }

    @Override
    public abstract void setAlive(final Boolean alive);
}
