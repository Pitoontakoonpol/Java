import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Triangle
{
    private int i, j, k;
    
    public int size = 0;

    public Character c;

    // public void displayTriangle()
    // {
    // 	Scanner ct = new Scanner(System.in);
    // 	System.out.println("Enter height of the Triangle: ");
    // 	size = ct.nextInt();

    // 	System.out.println("Which the Character you want to use: ");
    // 	c = ct.next().charAt(0);
    // }

    public void setTriangle()
    {
       	Scanner ct = new Scanner(System.in);
    	System.out.println("Triangle; Enter height of the Triangle: ");
    	size = ct.nextInt();

    	System.out.println("Which the Character you want to use: ");
    	c = ct.next().charAt(0);
    	System.out.println("-------------------------------------");
    
    	for (i = 1; i <= size; i++)
		{
			for (j = size; j >= i; j--)
			{
				System.out.print(" ");
			}
				for (k = 1; k <= (2 * i - 1); k++) 
				{
					System.out.print(c);
				}
			System.out.println();
		}
    }

    public void reversrTriangle()
    {
    	Scanner ct = new Scanner(System.in);
    	System.out.println("Reverse Triangle; Enter height of the Triangle: ");
    	size = ct.nextInt();

    	System.out.println("Which the Character you want to use: ");
    	c = ct.next().charAt(0);
    	System.out.println("-------------------------------------");

        for (i = size; i >= 0; i--)
        {
            for (j = size; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print(c);
            }

         	System.out.println();
        }
    }

     public void multiTriangle()
    {
    	Scanner ct = new Scanner(System.in);
    	System.out.println("Multi Triangle; Enter height of the Triangle: ");
    	size = ct.nextInt();

    	System.out.println("Which the Character you want to use: ");
    	c = ct.next().charAt(0);
    	System.out.println("-------------------------------------");

    	for (i = 0; i <= size; i++)
		{
			for (j = size; j >= i; j--)
			{
				System.out.print(" ");
			}
				for (k = 1; k <= (2 * i - 1); k++) 
				{
					System.out.print(c);
				}
			System.out.println();
		}

        for (i = size; i >= 0; i--)
        {
            for (j = size; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print(c);
            }

         	System.out.println();
        }
    }
}

class Rectangle
{
    private int i;
    private int j;
    private int k;

    public int width = 0, height = 0;

    public Character c;

    public void setRectangle()
    {
    	Scanner ct = new Scanner(System.in);
    	System.out.println("Rectangle; Enter height of the Rectriangle: ");
    	height = ct.nextInt();

    	System.out.println("Rectangle; Enter width of the Rectriangle: ");
    	width = ct.nextInt();

    	System.out.println("Which the Character you want to use: ");
    	c = ct.next().charAt(0);
    	System.out.println("-------------------------------------");

        for (i = 1; i <= width; i++)
        {
            for (j = 1; j <= height; j++)
            {
        		System.out.print(c);
            }
            System.out.println("");
        }
    }
}

class Choice
{
	public int n, h;

	public void choiceProgram()
	{
		Scanner a = new Scanner(System.in);
    	System.out.println("Choose the program you want to play: ");
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("Your answaer is: " + n);
		System.out.println("-------------------------------------");
    	n = a.nextInt();

    	if (n == 1) 
		{
			System.out.println("-------------------------------------");
			Triangle t1 = new Triangle();
			t1.setTriangle();
			System.out.println("-------------------------------------");

			System.out.println("-------------------------------------");
			Triangle t2 = new Triangle();
			t2.reversrTriangle();
			System.out.println("-------------------------------------");

			System.out.println("-------------------------------------");
			Triangle t3 = new Triangle();
			t3.multiTriangle();
			System.out.println("-------------------------------------");
			System.out.println("Thank you; God bless!!!");
        	System.out.println("-------------------------------------");
		}
		else if (n == 2) 
		{
			System.out.println("-------------------------------------");
			Rectangle r1 = new Rectangle();
			r1.setRectangle();
			System.out.println("-------------------------------------");
			System.out.println("Thank you; God bless!!!");
        	System.out.println("-------------------------------------");
		}
		else 
		{
			System.out.println("-------------------------------------");
			System.out.println("Error Your program, Thank you");
			Choice ch = new Choice();
    		ch.choiceProgram();
			System.out.println("-------------------------------------");
			System.out.println("Thank you; God bless!!!");
        	System.out.println("-------------------------------------");
        }

        System.out.println("Do you want to do other transactions?");
        System.out.println("1. Yes, I want");
        System.out.println("2. No, I wan't");
        System.out.println("Your answaer is: " + h);
        h = a.nextInt();
        System.out.println("-------------------------------------");

        if (h == 1) 
        {
        	Choice ch = new Choice();
        	ch.choiceProgram();
        }
        else
        {
        	System.out.println("-------------------------------------");
			System.out.println("Thank you; God bless!!!");
        	System.out.println("-------------------------------------");
        }
	}
}

class DrawTest
{
    public static void main(String[] args)
    {
    	Choice ch = new Choice();
    	ch.choiceProgram();

    	ch = null;
    }
}



