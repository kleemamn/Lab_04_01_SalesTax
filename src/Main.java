public class Main {
    public static void main(String[] args) {
        double purchasePrice = 25 ;
        double taxAmount ;
        final double salesTax = 0.05 ;

        taxAmount = purchasePrice * salesTax ;

        System.out.println("If the purchase price is " + purchasePrice + " the sales tax will be " + taxAmount );
    }
}