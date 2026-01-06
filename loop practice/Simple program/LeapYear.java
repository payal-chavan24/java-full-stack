//write a program to accept a year check it is a leap year or not
public class LeapYear {
	public static void main(String[] args) {
		int year = 2024;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("it is leap year");
		} else {
			System.out.println("it is not leap year");
		}

	}

}
