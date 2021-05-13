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
//    Notatki:
//    Jestem użytkownikiem, ktory zasadniczo nie ma dostepu do klasy Wallet, dostep do tej klasy ma natomiast kasjer,
//    obaj mamy jednak dostep do klasy CashSlot. Chcąc wybrac pieniadze z klasy wallet, musze zwrocic sie do kasjera,
//    ktory sprawdzi stan konta. Kasjer jest dla klienta pośrednikiem do portfela,
//    CashSlot posrednikiem pomiedzy klientem a kasjerem. Dlatego tez pole message musi znajdowac sie w klasie Cashier,
//    a w tym polu musi sie znalezc informacja od klasy Wallet, ze w portfelu nie ma wystarczajacych srodkow.
//    Kasjer zleca wyplate pieniedzy, jesli w portfelu wallet.getBalance() >= amount, to wallet.debit(amount),
//    a nastepnie cashSlot.dispense(amount), jesli nie, to w polu this.message = "I don't have enough money in my wallet".
//    Tę informację otrzymuję od kasjera i dlatego w tej klasie znajduje sie pole message.
//    Tak naprawde w klasie testowej nie powinno utworzonego obiektu klasy Wallet, poniewaz jako uzytkownik nie powinienem
//    miec bezposredniego dostepu do portfela, a moj dostep do portfela powinien zawsze nastepowac poprzez kasjera,
//    ktory wplaca i wyplaca mi pieniadze (jednak poprzez CashSlot) oraz podaje mi informacje o stanie konta (bezposrednio).
//
}