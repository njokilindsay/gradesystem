/**
 * 
 */
package gradesystem;

import java.util.Scanner;

public class GradeUsingArrays {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int rollno[] = {101,102,103,104};
		int numstud = rollno.length;
		System.out.println("Enter the no. of subjects:");
		int numsub = reader.nextInt();
		
		String names[] =new String[numstud];
		int marks[][] = new int[numstud][numsub];
		int total[] = new int[numstud];
		float average[] = new float[numstud];
		char result[]= new char[numstud];
		char grade[]= new char[numstud];
		
		for (int i=0;i<numstud;i++) {
			reader.nextLine();
			System.out.print("Enter the Student Name :");
			names[i] = reader.next();
			
				System.out.print("Enter the Three Marks : ");
				for (int j=0;j<numsub;j++) {
				marks[i][j] = reader.nextInt();
				if (marks[i][j]>50) 
					result[i] ='P';
				else result [i]='F';
				
				total[i] +=marks[i][j];
		
				}
			
				average[i] = total[i]/numsub;
				
				if (average[i]>=70&&average[i]<=100)
					grade[i] = 'A';
				else if (average[i]>=50)
					grade[i] = 'B';
				else grade[i] = 'C';
		}
		
		System.out.println("*******************************************************");
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println("*******************************************************");
		System.out.println("ROLL    NAME   MARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		for (int k=0;k<numstud;k++) {
		System.out.print(+rollno[k]+"\t"+names[k]);
		for (int t=0;t<numsub;t++) {
			System.out.print("\t"+marks[k][t]);
		}
		System.out.print("\t"+total[k]+"\t"+result[k]+"\t"+average[k]+"\t"+grade[k]);
		
            System.out.println();
	}
	}
}
