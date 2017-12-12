import java.util.InputMismatchException;
import java.util.Scanner;

public class HospitalApp {
	public static final int ADD_PATIENT = 1;
	public static final int SHOW_INFO = 2;
	public static final int EXIT = 0;

	public static void main(String[] args) {
		int choice = 3;
		Scanner scan = new Scanner(System.in);
		Hospital hosp = new Hospital();
		
		do {
			System.out.println("PROGRAM SZPITAL");
			System.out.println("Wybierz opcjê:\n1 - Dodanie pacjenta do kolejki\n2 - Informacje o pacjentach");
			System.out.println("0 - Wyjœcie z programu");
			try{
				choice = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Nie wprowadzono cyfry!" + " " + e);
				break;
			}
			
			switch (choice) {
			case ADD_PATIENT:
				hosp.addPatient();
				break;
			case SHOW_INFO:
				hosp.showInfo();
				break;
			}
		} while (choice != EXIT);
		System.out.println("Do widzenia!");
		scan.close();
	}
}
