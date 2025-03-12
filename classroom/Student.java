package classroom;

public class Student {
	
	int id;
	String name;
	String course;
	String clg_name;
	
	// operation
	void setData(int i, String n, String c, String cl) {
		id = i;
		name = n;
		course = c;
		clg_name = cl;
		
	}
	
	void getData() {
		System.out.println(id + " " +name+" "+course+" "+clg_name);
	}

	public static void main(String[] args) {
		
		Student sd = new Student();
		sd.setData(7, "Param", "AI/ML", "MIET");
		sd.getData();
		
	}
}
