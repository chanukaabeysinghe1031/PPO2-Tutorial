public class CashRegisterTester {
        public static void main(String []args){
            Integer[] purchases={12,33,44};
            CashRegister register=new CashRegister();
            register.recordPurchase(29.50);
            register.recordPurchase(9.25);
            register.receivePayement(50);
            double change=register.giveChange();
            System.out.println(change);
            System.out.println("Expected :11.25");
            register.printReceipt(29.50);
            register.printReceipt(9.50);
            System.out.println("The price list is " +register.prices);
            System.out.println("The number of the total purchases is ");
        }
}
