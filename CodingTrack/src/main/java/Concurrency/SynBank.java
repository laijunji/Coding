package Concurrency;

import java.util.Arrays;

public class SynBank {
    private final double[] accounts;

    public SynBank(int n,double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        if(accounts[from] > amount){
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f%n", this.getTotalBalance());
            System.out.println(Thread.currentThread());
        }else{
            wait();
        }
    }

    public synchronized double getTotalBalance(){
        double sum = 0;
        for (double a : accounts){
            sum += a;
        }
        return sum;
    }

    public int size(){
        return accounts.length;
    }

}

