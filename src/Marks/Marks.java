package Marks;

public class Marks {
 int marks= 76;
 String subject="Java";
	public static void main(String[] args) {
		Marks m=new Marks();
		System.out.println("Subject:" +m.subject);
		System.out.println("Marks obtain:" +m.marks);

m.subject= "C++";    //Object m modifies both the value
m.marks= 83;


System.out.println("Subject :"  +m.subject);
System.out.println("Marks obtain:" +m.marks);
		
	}

}
