package session4;

public class Employee {
	String empName;// ClassLevel variable accessed by this keyword
	String empLocation;// ClassLevel variable accessed by this keyword
	int age;
//Default Constructor

	Employee() {

	}

//Parametrized Constructor -- 1 Parameter
	Employee(String empName)// Method's Local variable
	{
		this.empName = empName;// this is a object variable that refers to the current object.
	}

//Parametrized Constructor-- 2 Parameters
	Employee(String empName, String empLocation)// Method's Local variables
	{
		this.empName = empName;// this is a object variable that refers to the current object.
		this.empLocation = empLocation; // this is a object variable that refers to the current object.
	}

	Employee(String empName, String empLocation, int age)// Method's Local variables
	{
		this.empName = empName;// this is a object variable that refers to the current object.
		this.empLocation = empLocation; // this is a object variable that refers to the current object.
		this.age = age;
	}

	public static void main(String[] args) {
//Create 3 objects to represent 3 employees
		Employee akshay = new Employee();// No data set in defalut constructor
		Employee aniket = new Employee("Aniket"); // Name is set in 1 parameter constructor
		Employee vijay = new Employee("Vijay", "Solapur"); // Name & Location are set in 2 Parameters constructor
		Employee amol = new Employee("amol", "mumbai", 25);
//Display 3 employees data set using constructors
		System.out.println("Akshay's Name is " + akshay.age);
		System.out.println("Aniket's Name is " + aniket.empName);
		System.out.println("Vijay's Name is " + vijay.empName);
		System.out.println("Vijay's Location is " + vijay.empLocation);
		System.out.println("amol's Name is " + amol.empName);
		System.out.println("amol's Location is " + amol.empLocation);
		System.out.println("amol's age is " + amol.age);

	}
}
