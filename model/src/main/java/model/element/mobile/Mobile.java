package model.element.mobile;

import model.PlayableMap;
import model.element.Element;

public abstract class Mobile extends Element {
    private int x;
    private int y;
    private StrategyMove strategyMove = null;
    private final PlayableMap map;

    public Mobile() {
        this.map = new PlayableMap();
    }

    public PlayableMap getMap() {
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
        return true;
    }

    public void move() {
        this.strategyMove.move();
    }

    public void setStrategyMove(final StrategyMove strategyMove) {
        this.strategyMove = strategyMove;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

}
