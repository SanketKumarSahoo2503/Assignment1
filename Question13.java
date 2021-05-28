package Assignment1;

public class Question13 {

	public static void main(String[] args) {
		String ruler1 = "1";
		String ruler2 = " 2 ";
		System.out.println(ruler1);
		System.out.println(ruler1 + ruler2 + ruler1);
		ruler1 = ruler1 + ruler2 + ruler1;
		ruler2 = " 3 ";
		System.out.println(ruler1 + ruler2 + ruler1);
		ruler1 = ruler1 + ruler2 + ruler1;
		ruler2 = " 4 ";
		System.out.println(ruler1 + ruler2 + ruler1);
	}

}
