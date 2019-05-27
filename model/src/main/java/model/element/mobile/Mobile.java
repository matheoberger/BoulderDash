package model.element.mobile;

import model.Model;

public abstract class Mobile {
    private int x;
    private int y;
    private StrategyMove strategyMove;
    private Model map;

    public Mobile() {

    }

    public void disappear() {

    }

    public Model getMap() {
        return this.map;
    }

    public StrategyMove getStrategyMove() {
        return this.strategyMove;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Boolean isLocationUsed(final int x, final int y) {
        return false;
    }

    public void move() {
        this.strategyMove.move();
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

}
