package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;
	private final static String MASTER = "MASTER";

	@Requires({"isMaster(course)"})
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}

	private boolean isMaster(CourseData course){
		return MASTER.equals(course.getLevel());
	}
}
