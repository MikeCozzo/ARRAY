import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List; 

 
 

public class ARRAY1 { 

public static void main(String[] args) { 
double[] numbers = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146}; 

Scanner s = new Scanner(Arrays.toString(numbers));

while (s.hasNext()) {
    System.out.println(s.next());
}
 

Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
		System.out.print(sc.next());
}
} 
}
