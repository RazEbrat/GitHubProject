package gitHubPractice;

public class Practice1 {

	public static void main(String[] args) {

		String result = toUpper("raz");
		System.out.println(result);

		String result2 = toUpper("fahim");
		System.out.println(result2);
		
		String result3 = toLower("Adil");
		System.out.println(result3);

	}

	public static String toUpper(String name) {
		String result = name.toUpperCase();
		return result;
	}
	
	public static String toLower(String name) {
		String result = name.toLowerCase();
		return result;
	}

}
