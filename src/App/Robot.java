package App;

public class Robot {

    private int currentX = 0;
    private int currentY = 0;
    public Direction currentDirection;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Robot() {

        currentDirection = Direction.UP;
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        System.out.println("Rotate 90 degrees counterclockwise.");
        switch (getDirection()) {
            case UP:
                currentDirection = currentDirection.LEFT;
                break;
            case DOWN:
                currentDirection = currentDirection.RIGHT;
                break;
            case LEFT:
                currentDirection = currentDirection.UP;
                break;
            case RIGHT:
                currentDirection = currentDirection.DOWN;
                break;
        }
    }

    public void turnRight() {
        System.out.println("Rotate 90 degrees clockwise.");
        switch (getDirection()) {
            default:
            case DOWN:
                currentDirection = Direction.LEFT;
                break;
            case UP:
                currentDirection = Direction.RIGHT;
                break;
            case RIGHT:
                currentDirection = Direction.DOWN;
                break;
            case LEFT:
                currentDirection = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case UP:
                currentY++;
                System.out.println("Step forward.");
                break;
            case DOWN:
                currentY--;
                System.out.println("Step forward.");
                break;
            case RIGHT:
                currentX++;
                System.out.println("Step forward.");
                break;
            case LEFT:
                currentX--;
                System.out.println("Step forward.");
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getCurrentY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getCurrentY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getCurrentY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getCurrentY() > toY) {
                robot.stepForward();
            }
        }
        if (robot.getCurrentX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getCurrentX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getCurrentX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getCurrentX() > toX) {
                robot.stepForward();
            }
        }
    }

    public int getCurrentX() {

        return currentX;
    }

    public int getCurrentY() {

        return currentY;
    }
}
