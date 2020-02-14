
public class JavaApiPractice
	{

		public static void main(String[] args)
			{
				String word = ("Mullen High School"); 
				System.out.println(word.substring(0, 3));
				System.out.println(word.substring(7,11));
				System.out.println(word.substring(7,11).length());
				System.out.println(word.substring(2).indexOf("l"));
				System.out.println(word.substring(17).indexOf("l"));
				System.out.println(word.substring(0,6).concat(word.substring(7,11)));
				System.out.println(word.replaceAll("[e]", "x"));
				System.out.println(word.substring(0,7).toUpperCase());
				System.out.println(word.replaceAll(" ", ""));
				System.out.println(word.substring(0,7).compareTo(word.substring(7,11))); 

			}

	}
