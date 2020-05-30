import java.util.*;

class Point2D
{
  private int x,y;

  Point2D(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }

  public String toString()
  {
    return ("Point2D [ X: " + x + ", Y: " + y + " ]");
  }
}

class Point2DComparator implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    Point2D fred1 = (Point2D)o1, fred2 = (Point2D)o2;
    if(fred1.getX() == fred2.getX())
    {
      return fred1.getY() - fred2.getY();
    }
    else
    {
      return fred1.getX() - fred2.getX();
    }
  }
  public boolean equals(Object obj)
  {
    return obj.equals (this);
  }
}

public class ComparatorTest
{
  public static void main(String[] args)
  {
    Point2D[] freds = new Point2D[]
    {
      new Point2D(3,7),
      new Point2D(4,2),
      new Point2D(12,2),
      new Point2D(3,3),
      new Point2D(4,4)
    };
    Arrays.sort(freds,new Point2DComparator());
    for(int i = 0; i < freds.length; i++)
    {
      System.out.println(freds[i]);
    }
  }
}