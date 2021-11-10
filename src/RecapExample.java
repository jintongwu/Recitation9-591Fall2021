import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RecapExample {
	/*
	 * Counter class use a HashMap to counter the number of time a name has appeared
	 */
	class Counter {

		// TODO: declare a private HashMap to store the fare

		public Counter() {
			// TODO: implement this constructor
		}

		/**
		 * count the input name once
		 * 
		 * @param name
		 */
		public void count(String name) {
			// TODO: implement this method

		}

		/**
		 * Get the current appearance of the input name
		 * 
		 * @param name
		 * @return the count of appearance of the input name
		 */
		public int getCount(String name) {
			// TODO: implement this method
			return 0;
		}

	}

	/*
	 * SubwayFare class use a HashMap to store the fare for subways routes
	 */
	class SubwayFare {

		// TODO: declare a private HashMap to store the fare

		public SubwayFare() {
			// TODO: implement this constructor
			
		}

		/**
		 * Record a fare for a route
		 * 
		 * @param startStation
		 * @param endStation
		 * @param price
		 */
		public void addFare(String startStation, String endStation, double price) {
			// TODO: implement this method
			
		}

		/**
		 * Get the fare price for a route
		 * 
		 * @param startStation
		 * @param endStation
		 * @return
		 */
		public double getFare(String startStation, String endStation) {
			// TODO: implement this method
			return 0.0;
		}
	}

	/*
	 * Grades class use a HashMap to store all the hw grades for a set of students
	 */
	class Grades {

		// TODO: declare a private HashMap to store the fare

		public Grades() {
			// TODO: implement this constructor
		}

		/**
		 * Parse the input file and record the student's hw grades
		 * 
		 * @param filename
		 */
		public void addGradeFromFile(String filename) {
			// TODO: implement this method
			FileInputStream in;
			try {
				in = new FileInputStream(new File(filename));
				Scanner scnr = new Scanner(in);

				while (scnr.hasNextLine()) {

				}

				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}

		/**
		 * Get the grade of studentName for the hwName
		 * 
		 * @param studentName
		 * @param hwName
		 * @return
		 */
		public double getGrade(String studentName, String hwName) {
			// TODO: implement this method
			return 0.0;
		}

		/**
		 * Print all grades of hwName to the console, in "studentName : hwName-grade"
		 * format
		 * 
		 * @param hwName
		 */
		public void printAllGradeForHW(String hwName) {
			// TODO: implement this method
		}

	}
}
