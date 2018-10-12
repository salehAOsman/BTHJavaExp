package exp797;
public class mainAcount {
	public static void main(String[] args) {

		Acount newAcount = new Acount(1122, 20000);

		System.out.println("\n\t" + newAcount);

		newAcount.withDraw(2500);

		System.out.println("\n\t" + newAcount);

		newAcount.deposit(3000);

		System.out.println("\n\t" + newAcount);
		System.out.println("Welcome");
	}
}
