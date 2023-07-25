import java.util.Scanner;
class Project{
	public static void main(String args[]){
		
		System.out.println("HELLO!! PLEASE INPUT YOUR MARKS  :)");
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nSTUDENT NAME :  ");
		String stu=input.nextLine();
		
		System.out.print("\nBUDDHISM   : ");
		int a=input.nextInt();
		
		System.out.print("SINHALA    : ");
		int b=input.nextInt();
		
		System.out.print("ENGLISH    : ");
		int c=input.nextInt();
		
		System.out.print("METHAMATICS: ");
		int d=input.nextInt();
		
		System.out.print("HISTORY    : ");
		int e=input.nextInt();
		
		System.out.print("SCIENCE    : ");
		int f=input.nextInt();
		
		System.out.print("PART 1     : ");
		int g=input.nextInt();
		
		System.out.print("PART 2     : ");
		int h=input.nextInt();
		
		System.out.print("PART 3     : ");
		int i=input.nextInt();
		
		int total=a+b+c+d+e+f+g+h+i;
		System.out.println("\nTOTAL MARKS: "+total);
		
		double avg=(total/9);
		System.out.println("\nAVERAGE    : "+avg);	
		
		System.out.print("\nBUDDHISM   :   ");
		System.out.println(a >= 75 ? "A" : a >= 65 ? "B" : a >= 55 ? "C" : "FAIL");
		
		System.out.print("SINHALA    :   ");
		System.out.println(b >= 75 ? "A" : b >= 65 ? "B" : b >= 55 ? "C" : "FAIL");
		
		System.out.print("ENGLISH    :   ");
		System.out.println(c >= 75 ? "A" : c >= 65 ? "B" : c >= 55 ? "C" : "FAIL");
		
		System.out.print("METHAMATICS:   ");
		System.out.println(d >= 75 ? "A" : d >= 65 ? "B" : d >= 55 ? "C" : "FAIL");
		
		System.out.print("HISTORY    :   ");
		System.out.println(e >= 75 ? "A" : e >= 65 ? "B" : e >= 55 ? "C" : "FAIL");
		
		System.out.print("SCIENCE    :   ");
		System.out.println(f >= 75 ? "A" : f >= 65 ? "B" : f >= 55 ? "C" : "FAIL");
		
		System.out.print("PART 1     :   ");
		System.out.println(g >= 75 ? "A" : g >= 65 ? "B" : g >= 55 ? "C" : "FAIL");
		
		System.out.print("PART 2     :   ");
		System.out.println(h >= 75 ? "A" : h >= 65 ? "B" : h >= 55 ? "C" : "FAIL");
		
		System.out.print("PART 3     :   ");
		System.out.println(i >= 75 ? "A" : i >= 65 ? "B" : i >= 55 ? "C" : "FAIL");
		
	}
}
