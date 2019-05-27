package model.element.motionless;

public class MotionlessFactory {
    private static Exit exit = new Exit();
    private static Border border = new Border();
    private static BreakableWall breakableWall = new BreakableWall();
    private static Dirt dirt = new Dirt();
    private static Tunnel tunnel = new Tunnel();
    private static Motionless[] motionlessElements = { exit, border, breakableWall, dirt, tunnel, };

    public static Motionless getFromFileSymbol() {
        return null;
    }

    public Motionless createBorder() {
        return border;
    }

    public Motionless createBreakableWall() {
        return breakableWall;
    }

    public Motionless createDirt() {
        return dirt;
    }

    public Motionless createExit() {
        return exit;
    }

    public Motionless createTunnel() {
        return tunnel;
    }

}
