package Assignment3;

import java.util.Scanner;
public class election {
	static int a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b[] =  new int[5];
		while(true){
			System.out.println("Select your choice: \n1. Next vote \n2. Voting completed");
			a = sc.nextInt();
			if(a==1) {
				Scanner sy = new Scanner(System.in);
				System.out.println("\nPlease select whom do you want to vote: ");
				System.out.println(" 1.Narendra Modi\n 2.Mayawati\n 3.Rahul Gandhi\n 4.Kejriwal\n 5.Owaisi");
				int c = sy.nextInt();
				if(c==1) {
					b[0]++;
					System.out.println("You voted for Narendra Modi\n");
				}
				else if(c==2) {
					b[1]++;
					System.out.println("You voted for Mayawati\n");
				}
				else if(c==3) {
					b[2]++;
					System.out.println("You voted for Rahul Gandhi\n");
				}
				else if(c==4) {
					b[3]++;
					System.out.println("You voted for Kejriwal\n");
				}
				else if(c==5) {
					b[4]++;
					System.out.println("You voted for Owaisi\n");
				}	
			}
			else if(a==2) {
				break;
			}	
			else
				System.out.println("Invalid Choice. Please select a correct choice\n");
		}
	
		System.out.println("\n\t\t------TOTAL VOTES--------");
		System.out.println("\n1.Narendra Modi: "+b[0]+"\n2.Mayawati: "+b[1]+"\n3.Rahul Gandhi: "+b[2]+"\n4.Kejriwal: "+b[3]+"\n5.Owaisi:  "+b[4]+"\n");
		
		int max=b[0];
		for(int i=1;i<5;i++) {
			if(b[i]>max)
				max=b[i];
		}
		
		if(max==b[0]) {
			System.out.println("Narendra Modi won the election with total of "+b[0]+" votes");
		}
		else if(max==b[1]) {
			System.out.println("Mayawati won the election with total of "+b[1]+" votes");
		}
		else if(max==b[2]) {
			System.out.println("Rahul Gandhi won the election with total of "+b[2]+" votes");
		}
		else if(max==b[3]) {
			System.out.println("Kejriwal won the election with total of "+b[3]+" votes");
		}
		else if(max==b[4]) {
			System.out.println("Owaisi won the election with total of "+b[4]+" votes");
		}
		sc.close();
	}
}
