package ArrayList4;

import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[]args) {
		
		ArrayList<String> courseList = new ArrayList<String>();
		ArrayList<String> dates = new ArrayList<String>();
		ArrayList<String> jobs = new ArrayList<String>();	
		
		courseList.add("Object-Oriented Programming in JAVA");
		courseList.add("Network Management");
		courseList.add("Data Science and Big Data");
		courseList.add("Statistics & Quantitative Methods"); 
		courseList.add("Advanced Database"); 
		courseList.add("Finance for Managers"); 
		courseList.add("Project Management"); 
		courseList.add("Cybersecurity"); 
		courseList.add("Data Mining and Data Visualization"); 
		System.out.println("What are your courses");
		System.out.println("My course List are" );
		for (String str : courseList)
            System.out.println(str);
		
		System.out.println("");
		System.out.println("******************************************************");
		System.out.println("");
		
		dates.add("2022-04-25");
		dates.add("2022-04-29");
		dates.add("2022-05-02");
		System.out.println("What are your significant dates");
		System.out.println("My dates are" );
		for (String str : dates)
            System.out.println(str);
		
		System.out.println("");
		System.out.println("******************************************************");
		System.out.println("");
		
		jobs.add("DevOps engineer");
		jobs.add("Quality assurance");
		jobs.add("JAva Full stacj=k developer");
		System.out.println("What are your dream jobs");
		System.out.println("My three dream jobs are" );
		for (String str : jobs)
            System.out.println(str);
		
	}
}
