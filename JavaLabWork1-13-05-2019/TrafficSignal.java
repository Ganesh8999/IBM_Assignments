import java.util.Scanner;

enum LightColor{
	RED, YELLOW, GREEN, NIL;
}

public class TrafficSignal	{

	public static void main(String... args)	{

		System.out.println("Enter color initial ");
		String color = new Scanner(System.in).nextLine();

		if(color.charAt(0) == 'g')	TrafficSignal.signal(LightColor.GREEN);
		else if(color.charAt(0) == 'r')	TrafficSignal.signal(LightColor.RED);
		else if(color.charAt(0) == 'y')	TrafficSignal.signal(LightColor.YELLOW);
		else TrafficSignal.signal(LightColor.NIL);
	}

	public static void signal(LightColor color)	{
		switch(color)	{
			case RED:
				System.out.println("Stop!");
				break;
			case YELLOW:
				System.out.println("Wait!");
				break;
			case GREEN:
				System.out.println("Go!");
				break;
			default:
				System.out.println("No Signal");
		}
	}
}