package practice;

public class FirstProg {

	public static void main(String[] args) {
		
		String car="Ertiga";
		System.out.println(car);
		
		String cars[]= {"Sumo","Safari","Santro","Creata","Civic"};
		
		for(int i=0;i<=cars.length-1;i++) {
			if(cars[i].startsWith("S")) {
				System.out.println(cars[i]);
			}
		}
		

	}

}
