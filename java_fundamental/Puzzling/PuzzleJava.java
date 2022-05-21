import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    
    Random randMachine = new Random();
  

    public ArrayList<Integer> getTenRolls() {
    
        ArrayList<Integer> NewArray = new ArrayList<Integer>(); 

        for(int i = 0; i<10;i++ ){
            int randNum= randMachine.nextInt(21); 
            NewArray.add(randNum );

            // NewArray.add(randMachine.nextInt(21));
        }

        return NewArray;
        

    }

    public char getRandomLetter(){
        Random randMachine = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int index=randMachine.nextInt(26);
        return alphabet[index];

    }
    public String generatePassword(){
        String password="";
        for(int i=0 ; i< 8;i++){
            password+=getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwords= new ArrayList<String>();
        for(int i=0 ; i<length;i++){
            passwords.add(generatePassword());
        }
        return passwords;
    }


}
