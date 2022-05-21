import java.util.ArrayList;
public class TestPuzzleJava {
    public static void main(String[] args) {

		PuzzleJava generator = new PuzzleJava();


		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

		System.out.println(generator.getRandomLetter());
		System.out.println(generator.generatePassword());


        ArrayList<String> passwords= new ArrayList<String>();
        passwords=generator.getNewPasswordSet(8);
        System.out.println(passwords);
}
}
