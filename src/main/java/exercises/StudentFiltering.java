package exercises;

import java.util.Set;
import java.util.TreeSet;

import excercise3.Student;

public class StudentFiltering {

	public static void main(String[] args) {
		
		Set<Student> students = new TreeSet<Student>();
		Student student5 = new Student ("Zhing", "Sun");
		Student student2 = new Student ("John", "Lincoln");
		Student student1 = new Student ("John", "Doe");
		Student student4 = new Student ("Foo", "Bar");
		Student student6 = new Student ("Sun", "Lincoln");
		Student student3 = new Student ("Amy", "Doe");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		
		for (Student student : students) {
			System.out.println(student.getFullName());
		}
		
	}

}
