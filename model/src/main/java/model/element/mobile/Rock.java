package model.element.mobile;

public class Rock extends FallingMobile {

    public Rock() {
        this.setStrategyMove(new MoveGravity());
    }

}
