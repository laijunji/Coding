package Concurrency;

public class SynBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        SynBank synBank = new SynBank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 1; i < NACCOUNTS; i++){
            int fromAccount = i;
            Runnable r = () -> {
                try{
                    while (true){
                        int toAccount = (int)(synBank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        synBank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int)(DELAY * Math.random()));
                    }
                }catch (InterruptedException e){

                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
