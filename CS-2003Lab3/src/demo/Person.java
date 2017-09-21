package demo;

public class Person {
	static int current_year = 2017;
	private String name;
	private int birthhdate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthhdate = bdate;
	}

	/**
	 * resets birthday of person to the year entered
	 * @param year
	 */
	public void reset_birthday(int year){
		birthhdate = year;
	}
	/**
	 * prints out whether person is considered a senior citizen
	 */
	private void senior_citizen() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	/**
	 * prints out the information of person
	 */
	private void print_info() {
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthhdate);
		age = current_year - birthhdate;
		System.out.printf("I am %d years old ",age);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.print_info();
		John.senior_citizen();
		
	}




}