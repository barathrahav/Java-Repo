import java.lang.String;

class StringTypes{

public static void main(String args[]){
	String value = "	Batch 15 is Toxic	";
	String val = "kgm@fs@batch15@thursday";

	//contains() check whether the given value is available in the given variable along with case sensitive
	System.out.println("value.contains(): "+value.contains("Toxic"));

	//concat() is used to add two different string and present it as single string
	System.out.println("value.concat(): "+value.concat(" By Birth"));

	//equals() check whether the variable and the given string is equal are not, it is case sensitive and space concerned
	System.out.println("value.equals(): "+value.equals("Batch 15 is Toxic"));

	//equalsIgnoreCase() ignore the case sensitive and check the value with the variable, also space concerned
	System.out.println("value.equalsIgnoreCase(): "+value.equalsIgnoreCase("BATCH 15 IS TOXIC"));
	
	//toUpperCase() changes all the alphabets to Capital letters
	System.out.println("value.toUpperCase(): "+value.toUpperCase());

	//toLowerCase() changes all the alphabets to Small letters
	System.out.println("value.toLowerCase(): "+value.toLowerCase());
	
	//length() return the length of the variable along with space
	System.out.println("length(): "+value.length());
	
	//charAt() returns the character that has been available in the mention index value
	System.out.println("charAt(): "+value.charAt(9));
	
	//compareTo() returns the lexicographic positive value if it contains any term that has been available in the variable
	System.out.println("compareTo(): "+value.compareTo(value.toUpperCase()));
	
	//compareToIgnoreCase() returns the lexicographic zero value if the variable are same
	System.out.println("compareToIgnoreCase(): "+value.compareToIgnoreCase(value.toUpperCase()));
	
	//compareTo() returns negative value if both the variable are different
	System.out.println("compareTo(): "+value.compareTo("hello"));
	
	//indexOf() retuns the index value of specified char
	System.out.println("indexOf(): "+value.indexOf('s'));

	//isEmpty() checks whether the given variable is empty or not
	System.out.println("isEmpty(): "+value.isEmpty());

	//replace() is use to replace the specified word with the specified value
	System.out.println("replace(): "+value.replace("Toxic","Vedappu"));

	//substring() is used to get the string that has been mentioned
	System.out.println("substring(): "+value.substring(3,11));

	//trim() is used to remove the spae from start and end
	System.out.println("trim(): "+value.trim());

	//lastIndexOf() returns the index of las occurence of the given char 
	System.out.println("lastIndexOf(): "+value.lastIndexOf('i'));

	//hashCode() retunr the key from the hash table which holds variables as values
	System.out.println("hashCode(): "+value.hashCode());

	//format() changes the given data in the specified format
	System.out.println("format(): "+String.format("%x",5));

	//join() is used to seta delimiter and join the parameterized values
	System.out.println("join(): "+String.join("-","Santhosh","pavithra","Chandru"));

	//replaceAll()
	System.out.println("replaceAll(): "+value.replaceAll("i","y"));

	//split()
	String[] arr1 = val.split("@",2);
	for(String a1:arr1){
	System.out.println("pattern1"+a1);
	}

}
}