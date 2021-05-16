package wallet;

public class Cashier {
    private CashSlot cashSlot;
    private String message;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            this.message = "I don't have enough money in my wallet";
        }
    }

    public String getMessage() {
        return message;
    }
}