class Car
{
	public char gear;				// 0: neutral  1: drive  2: back
	private int direction;
	public int doors;				// 0: openned  1: closed
	public int seatbelt;			// 0: not fastened  1: fastened
	public int parkingBrake;		// 0: set  1: released
	private int speed;
	public int signal;				// 0: off  1: both  2: left  3: right
	private int status;				// 0: turned off  1: turned on
	public char[] compass = {'N', 'E', 'S', 'W'};	// North, East, South, West

	public void turnOn()
	{
		status = 1;
	}
	public void turnOff()
	{
		speed = 0;
		status = 0;
	}
	public void accel(int s)
	{
		speed += s;
	}
	public void brake(int s)
	{
		speed -= s;
		if (speed < 0)
		{
			speed = 0;
		}
	}
	public void turn(int d)
	{
		if (signal > 1) signal = 0;
		if (speed > 0)
		{
			switch (d)
			{
			case 1:		// right-turn
				direction++;
				break;
			case 2:		// left-turn
				direction--;
				break;
			default :
				break;
			}
			if (direction < 0) direction += 4;
			direction %= 4;
		}
	}
//	public void setEmergency();

	private String getSpeed()
	{
		return "[" + speed + " mph] ";
	}
	private String getDirection()
	{
		return "[" + compass[direction] + "] ";
	}
	private String getGear()
	{
		if (gear == 0)
			return "[N] ";
		else if (gear == 1)
			return "[D] ";
		else if (gear == 2)
			return "[R] ";
		else
			return "[N] ";
	}
	private String getDoor()
	{
		if (doors == 0)
			return "[#] ";
		else
			return "[ ] ";
	}
	private String getSeatbelt()
	{
		if (seatbelt == 0)
			return "[&] ";
		else
			return "[ ] ";
	}
	private String getParkingBrake()
	{
		if (parkingBrake == 0)
			return "[B] ";
		else
			return "[ ] ";
	}
	private String getSignal()
	{
		if (signal == 0)
			return "[ ] ";
		else if (signal == 1)
			return "[< >] ";
		else if (signal == 2)
			return "[>] ";
		else if (signal == 3)
			return "[<] ";
		else
			return "[ ] ";
	}
	public void showPanel()
	{
		String panel;
		if (status == 1)
			panel = getSignal() + getSpeed() + getGear() + getDoor() + getSeatbelt() + getParkingBrake() + getDirection();
		else
			panel = "[ ] [ ] [ ] [ ] [ ] [ ] [ ]";
		System.out.println(panel);
	}
}

class CarTest
{
	public static void main(String[] args)
	{
		Car myCar = new Car();

		myCar.showPanel();
		myCar.turnOn();
		System.out.println("Engine Started");
		myCar.showPanel();
		myCar.doors = 1;
		System.out.println("Door is closed");
		myCar.showPanel();
		myCar.seatbelt = 1;
		System.out.println("Fasten seatbelt");
		myCar.showPanel();
		myCar.parkingBrake = 1;
		System.out.println("Release parking brake");
		myCar.showPanel();

		myCar.gear = 1;
		System.out.println("Drive");
		myCar.showPanel();
		
		myCar.accel(30);
		System.out.println("Accelerate + 30");
		myCar.showPanel();
		myCar.signal = 2;
		System.out.println("Right-turn signal is on");
		myCar.showPanel();
		myCar.brake(10);
		System.out.println("Reduce - 10");
		myCar.showPanel();
		myCar.turn(1);
		System.out.println("Turn right");
		myCar.showPanel();

		
		myCar.signal = 2;
		System.out.println("Right-turn signal is on");
		myCar.showPanel();
		myCar.turn(1);
		System.out.println("Turn right");
		myCar.showPanel();
		myCar.signal = 2;
		System.out.println("Right-turn signal is on");
		myCar.showPanel();
		myCar.turn(1);
		System.out.println("Turn right");
		myCar.showPanel();
		myCar.signal = 2;
		System.out.println("Right-turn signal is on");
		myCar.showPanel();
		myCar.turn(1);
		System.out.println("Turn right");
		myCar.showPanel();
		myCar.signal = 2;
		System.out.println("Right-turn signal is on");
		myCar.showPanel();
		myCar.turn(1);
		System.out.println("Turn right");
		myCar.showPanel();
		myCar.signal = 3;
		System.out.println("Right-left signal is on");
		myCar.showPanel();
		myCar.turn(2);
		System.out.println("Turn left");
		myCar.showPanel();
		
		myCar.brake(20);
		System.out.println("Reduce - 20");
		myCar.showPanel();

		myCar.gear = 0;
		System.out.println("Neutral");
		myCar.showPanel();
		
		myCar.seatbelt = 0;
		System.out.println("Release seatbelt");
		myCar.showPanel();
		myCar.parkingBrake = 0;
		System.out.println("Set parking brake");
		myCar.showPanel();
		myCar.doors = 0;
		System.out.println("Door is opened");
		myCar.showPanel();

		myCar.turnOff();
		System.out.println("Engine Stopped");
		myCar.showPanel();
	}	
}