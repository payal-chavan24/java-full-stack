// find total,average print percantage
public class Subject {

	public static void main(String[] args) {
		int english = 87, physic = 78, bio = 76, maths = 67, chemistry = 98;
		double total = english + physic + bio + maths + chemistry;
		double average = total / 5;
		double percantage = total / 500 * 100;
		System.out.println(total);
		System.out.println(average);
		System.out.println("percantage of the srudent=" + percantage + "%");
	}

}
