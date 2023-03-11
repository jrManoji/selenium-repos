

public class New {
public static void main(String[]args) {
	String value = "1 - 20 of 8413";
	String value2 = "8413";
	System.out.println(value);
	value.substring(10, 14);
	System.out.println(value.substring(10, 14));
	if(value.substring(10, 14).equals(value2)) {
		System.out.println("equals");
	}
	else {
		System.out.println("not equals");
	}
}
}
