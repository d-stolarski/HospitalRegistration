import java.util.Scanner;

public class Hospital {
	Scanner scan = new Scanner(System.in);
	public static final int MAX_PATIENTS_NUMBER = 2;
	Patient[] patients;
	int patientsQueue;
	
	
	public Hospital(){
		patients = new Patient[MAX_PATIENTS_NUMBER];
		patientsQueue = 0;
	}
	
	public void addPatient(){
		Patient patient = new Patient();
		if(patientsQueue < MAX_PATIENTS_NUMBER){
			System.out.println("Podaj imiê pacjenta:");
			patient.setFirstName(scan.nextLine());
			System.out.println("Podaj nazwisko pacjenta:");
			patient.setLastName(scan.nextLine());
			System.out.println("Podaj PESEL pacjenta:");
			patient.setPesel(scan.nextLine());
			patients[patientsQueue] = patient;
			patientsQueue++;
		} else {
			System.out.println("Osi¹gniêto limit pacjentów na dziœ, proszê spróbowaæ jutro.");
		}
	}
	
	public void showInfo(){
		if(patientsQueue == 0){
			System.out.println("Brak informacji do wyœwietlenia! Dodaj napierw dane pacjentów.");
		} else 
		for(int i = 0; i < patientsQueue; i++){
			System.out.println("Zarejestrowani pacjenci: " + patients[i].getFirstName() +" "+ patients[i].getLastName() +" "+ patients[i].getPesel());
		}
	}
}
