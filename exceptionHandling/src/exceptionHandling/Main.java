package exceptionHandling;

public class Main {

	public static void main(String[] args) {

		try {
			int[] sayilar = new int[] { 1, 2, 3 };
			System.out.println(sayilar[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("loglandı");
		} finally {
			System.out.println("hep");

		}
	}

}
