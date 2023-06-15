public class JavaVersion {
public static void main(String[] args) {
        String version = System.getProperty("java.version");
        if (version != null) {
	System.out.println("Java is installed. Version: " + version);
        } else {
        System.out.println("Java is not installed.");
        }
}
}