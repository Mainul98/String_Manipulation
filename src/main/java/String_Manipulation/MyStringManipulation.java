package String_Manipulation;

public class MyStringManipulation {
    public static void main(String[] args) {
        String str = "I Live in Dhaka city";
        //String city = "Dhaka";
       // String city2 = "Dhaka";
       // char [] a = str.toCharArray();
      //  for (int i =0;i< a.length;i++){
      //      System.out.println(a[i]);
     //   }
       // System.out.println(a.length);
      //  System.out.println(str.length());
      // String c = String.valueOf(str.charAt(0));
       // System.out.println(c);
       // System.out.println(str.indexOf('I'));
        //System.out.println(str.contains(city));
        //System.out.println(city.equals(city2));
        //System.out.println(str.replace("Dhaka","Barishal"));

        //String [] words=str.split(" ");
       // for (int i=0;i< words.length;i++){
        //    System.out.println(words[i]);
       // }
       // System.out.println(words.length);
        String city=str.substring(str.indexOf("Dh"),str.indexOf("ci"));
        System.out.println(city);
        String str2 = "dhaka";
        String s1 = String.valueOf(str2.charAt(0)).toUpperCase();
        System.out.println(s1);
        String s2 = str2.substring(1);
        System.out.println(s2);
        System.out.println(s1+s2);
        String city2 =" Barishal ";
        System.out.println(city2.trim());
        String amount = "100.50";
        String [] amt = amount.split("\\.");
        String t = amt[0];
        int t1=Integer.parseInt(t);
        String p = amt[1];
        int p2=Integer.parseInt(p);
        System.out.println(t1*2);
        System.out.println(p2*2);

        String path="D:\\Java\\Practice1\\Hello_Wortd.java";
        String project_name[]=path.split("\\\\");
        System.out.println(project_name[3]);

        String path1="D:/Java/Practice1/Hello_Wortd.java";
        String project_name1[]=path.split("/");
        System.out.println(project_name[3]);




    }
}
