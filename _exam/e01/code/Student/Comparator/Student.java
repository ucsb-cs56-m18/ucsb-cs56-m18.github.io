public class Student implements Comparable<Student> {

    private String name;
    private int perm;
    private String major;

    public Student (String name, int perm, String major) {
	this.name = name;
	this.perm = perm;
	this.major = major;
    }

    public String getName() { return name; }
    public int getPerm() { return perm; }
    public String getMajor() { return major; }

    @Override
    public String toString() {
	return "[" + name + "," + perm + "]"; // _____
    }
    
    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	Student s = (Student) o;
	return this.perm == s.perm;  // _____
    }

    @Override // ________
    public int hashCode() { return perm; } // _______
    
    /**
       Natural order is lexicographic order by name.  Break ties by by
       perm; e.g. if two students are named Chris Lee, put them in
       order by their perm.
     */

    @Override
    public int compareTo(Student s) {
	if (name.equals(s.name)) { // _______ (whole method)
	    return this.perm - s.perm; 
	}
	else { 
	    return name.compareTo(s.name); 
	}
    }

}
