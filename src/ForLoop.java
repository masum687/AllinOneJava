
public class ForLoop {

	public static void main(String[] args) {
//For Loop
//How to print 0 to 9
//Syntax: for(initialization; condition; update(increment/decrement){body}
for(int i=0; i<10; i++) {
	System.out.println(i);
}

//Search number from 0 to 100 where increment by 5
for(int j=0; j<101; j=j+5) {
	System.out.println(j);
}

//print even number from 0 to 50
for(int x=0; x<=50; x=x+2) {
	System.out.println(x);
}

//Use a for loop to print "I am a student of my School 5 times"
for(int y=0; y<5; y=y+1) {
	System.out.println("I am a student of my School");
}
//Length
String name = "Hossain";
for(int i=0; i<name.length();i++) {
	System.out.println(name.charAt(i));
}
//Reverse
String name1 = "  Hossain  ";
for(int i=name1.length()-1;i>=0;i--) {
	System.out.print(name1.charAt(i));
}

//Reverse using String buffer

String name2 = "Hossain";
StringBuffer output = new StringBuffer (name2);

output.reverse();
System.out.println(output);

//Upper Case Printing Method
name2.toUpperCase();
System.out.println(name2.toUpperCase());

//Lower Case

name2.toLowerCase();
System.out.println(name2.toLowerCase());

//Remove Space
name1.trim();
System.out.println(name1.trim());
}
	}


