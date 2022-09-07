package String_Manipulation;

public class RegexExample {
    public static void main(String[] args) {
        String str="The price of this shirt is 500 tk and VAT is 75 Tk";
        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" +", " ");
        System.out.println(str);
        String[] arr=(str.split(" "));
        double shirt_price=Double.parseDouble(arr[0]);
        double vat=Double.parseDouble(arr[1]);
        double total=shirt_price+vat;
        System.out.println("Total price "+total);

    }
}
