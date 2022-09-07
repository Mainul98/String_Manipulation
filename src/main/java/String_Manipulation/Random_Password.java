package String_Manipulation;

import java.util.Random;

public class Random_Password {
    public static void main(String[] args) {
       // Random random = new Random();
        //System.out.println(random.nextDouble());
       // String password= generateRandomPassword(8);
      //  System.out.println(password);
        int min=100;
        int max=200;
        Double rand=Math.random();
        System.out.println(Math.round(rand*(max-min)+min));


    }
    public static String generateRandomPassword(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                +"jklmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

}
