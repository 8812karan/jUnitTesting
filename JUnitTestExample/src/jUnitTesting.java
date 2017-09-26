import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jUnitTesting {
		
	static void addNumbers(){
	
		int a,b,c;
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the two numbers to add:");
		try {
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("Result of two numbers is:");
			System.out.println(c);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		void addString(){
			
			
		}
	
public static void main(String[] args) {
	addNumbers();

}}
