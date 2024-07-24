public class Aeroplane extends Vehicle implements Flyable, Drivable {
    int speed;
    Position position;
    Direction direction;

    public Aeroplane() {
        this.speed = 900;
        this.position = new Position(0,0);
        this.direction = Direction.SOUTH;
    }
    @Override
    public void move() {
//        fly();
        System.out.println("Aeroplane is flying at " + speed + "mph.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

