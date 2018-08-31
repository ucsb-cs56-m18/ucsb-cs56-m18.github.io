import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student("Chris Lee",1234567,"CMPSC"));
	al.add(new Student("Chris Lee",7654321,"CMPEN"));
	al.add(new Student("Taylor Wu",2468013,"MATH"));
	al.add(new Student("Jim Cortez",2468013,"CMPSC"));
	al.add(new Student("Fred Smith",2468013,"CMPEN"));
	// etc.

	// sort by perm
	
	al.sort( (s1,s2) -> s1.getPerm() - s2.getPerm() );
	System.out.println(al);
    }
}
