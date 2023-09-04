/**
 * 
 */
package sEdwardsGrades;

import java.util.Scanner;

/**
 * @author Shane Edwards
 *
 */
public class SEdwardsGrades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the student name: ");
		String studentName;
		int studentGrades[];
		studentGrades = new int [6];
		
		studentName = input.next();
		for(int i=0; i < studentGrades.length; i++)
		{
			System.out.print("Enter the next grade: ");
			studentGrades[i] = input.nextInt();
		}
		
		System.out.print(studentName + "'s Grades: ");
		for(int i=0; i< studentGrades.length; i++ )
		{
        System.out.print(" "+studentGrades[i]);
	}

}}
