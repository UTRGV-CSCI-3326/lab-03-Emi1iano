public class BankAccount {
    public static void main(String[] args) {
        double cash = 2175.37;
        cash += -302.50;
        cash += 50.03;
        cash /= 2;
        cash += 20.00;
        cash += -1;
        cash *= 2;
        cash += 1;
        System.out.printf("Bobs amount in bank is: $" + "%.2f",cash);
        System.out.println("");
    }
}
