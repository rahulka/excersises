package exercise3;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class StudentFilteringTest {

	@Test
	public void testStudentFilteringWithInput1() {
		Set<Student> students = new TreeSet<Student>();
		
		Student zhingSun = new Student ("Zhing", "Sun");
		Student johnLincoln = new Student ("John", "Lincoln");
		Student johnDoe = new Student ("John", "Doe");
		Student fooBar = new Student ("Foo", "Bar");
		Student sunLincoln = new Student ("Sun", "Lincoln");
		Student amyDoe = new Student ("Amy", "Doe");
		
		students.add(johnDoe);
		students.add(johnLincoln);
		students.add(amyDoe);
		students.add(fooBar);
		students.add(zhingSun);
		students.add(sunLincoln);
			
		Set<Student> actualStudents = new HashSet<Student>();
		actualStudents.addAll(students);
		
		Set<Student> expectedStudents = new HashSet<Student>();
		expectedStudents.add(zhingSun);
		expectedStudents.add(johnLincoln);
		expectedStudents.add(johnDoe);
		expectedStudents.add(fooBar);
		
		assertEquals(actualStudents, expectedStudents);
	}
	
	
	@Test
	public void testStudentFilteringWithInput2() {
		Set<Student> students = new TreeSet<Student>();
		
		Student himeshPatel = new Student ("Himesh", "Patel");
		Student dhirajShah = new Student ("Dhiraj", "Shah");
		Student rohitPatil = new Student ("Rohit", "Patil");
		Student rohitSharma = new Student ("Rohit", "Sharma");
		Student subhashPatel = new Student ("Subhash", "Patel");
		Student tanyaShah = new Student ("Tanya", "Shah");
		
		students.add(rohitPatil);
		students.add(dhirajShah);
		students.add(tanyaShah);
		students.add(rohitSharma);
		students.add(himeshPatel);
		students.add(subhashPatel);
			
		Set<Student> actualStudents = new HashSet<Student>();
		actualStudents.addAll(students);
		
		Set<Student> expectedStudents = new HashSet<Student>();
		expectedStudents.add(himeshPatel);
		expectedStudents.add(dhirajShah);
		expectedStudents.add(rohitPatil);
		expectedStudents.add(rohitSharma);
		
		assertEquals(actualStudents, expectedStudents);
	}
	

}
