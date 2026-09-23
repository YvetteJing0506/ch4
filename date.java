public class date {

	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year);
		
	}


	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
	public static void main (String[] args) {
	printAmerican("Tuesday", "September", 22, 2026);
	printEuropean("Tuesday", 22, "September", 2026);
	}
	
}

//System.out.print("European format: " + day + " " + date + " " + month + " " + year);
