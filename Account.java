public class Account {
    private String accountNumber;
    private String pin;
    private ATM atm;

    public Account(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.atm = new ATM(initialBalance);
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public ATM getATM() {
        return atm;
    }
}
