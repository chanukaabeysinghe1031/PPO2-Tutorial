public class CashRegister {
        private double payement;
        private double purchase;
        private static int salesCounter;
        private static double salesTotal;
        public  String prices="";
        public CashRegister(){
        }
        public void recordPurchase(double amount){
            purchase=purchase+amount;
            getSalesTotal(amount);
            getSalesCounter();
        }
        public void receivePayement(double amount){
            payement=payement+amount;
        }
        public double giveChange(){
            double change =payement-purchase;
            return change;
        }
        public void printReceipt(double price){
            prices= prices.concat(String.valueOf(price));
        }
        public void getSalesTotal(double amount){
            salesTotal=salesTotal+amount;
        }
        public void getSalesCounter() {
            salesCounter++;
        }
        public double getTotalPurchases(){
            return salesTotal;
        }
        public int getTotalCounterofPurchases(){
            return salesCounter;
        }

}
