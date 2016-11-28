public class BankAccount implements Runnable{
    private int balance = 0;
    private int threadId = 0;


    public BankAccount(int id){
        this.threadId = id;

    }
    public void run(){
        System.out.println("run being called");
        for(int i = 0; i<1000; i++){

            deposit(1000);
            retrieve(450);
            getBalance();

        }

    }
    public static void main(String[] args){

        BankAccount bankBalance = new BankAccount(i); // there should be one Bank Account for all threads to use.
        for (int i = 0;i < 10 ;i++) {
            Thread t = new Thread(bankBalance);
            t.start();
        }


    }
    public synchronized int getBalance() {
        System.out.println("Balance is = " + balance + " Thread id = " + this.threadId);
        return balance;
    }
    public synchronized void deposit(int money) {
        balance = balance + money;
        System.out.println("Deposited money. New balance = " + balance + " Thread id = " + this.threadId);
    }
    public synchronized int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {

            result = balance;
        }
        balance = balance - result;
        System.out.println("Retreived money. New balance = " + balance + " Thread id = " + this.threadId);
        return result;
    }
}
