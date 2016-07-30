
public class DaysInMonth {

	public static void main(String[] args) {
		int i;
		for (i=1; i<=12; i++)
			switch(i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 12:
				System.out.println("There are 31 days in the "+i+" month ");
				break;
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("There are 30 days in the "+i+" month");
				break;
			
			}

	}

}
