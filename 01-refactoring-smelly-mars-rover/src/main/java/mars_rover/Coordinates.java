package mars_rover;

public class Coordinates {
  private int x;
  private int y;

  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Coordinates that = (Coordinates) o;

    if (x != that.x) {
      return false;
    }
    return y == that.y;
  }

  @Override
  public int hashCode() {
    int result = x;
    result = 31 * result + y;
    return result;
  }

  @Override
  public String toString() {
    return "Coordinates{" +
      "x=" + x +
      ", y=" + y +
      '}';
  }

  Coordinates moveAlongYAxis(int displacement) {
    return new Coordinates(getX(), getY() + displacement);
  }

  Coordinates moveAlongXAxis(int displacement) {
    return new Coordinates(getX() - displacement, getY());
  }
}
