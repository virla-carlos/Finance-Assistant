import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Transaction firstTransaction = new Transaction(
                "Pix",
                new BigDecimal("280.99"),
                LocalDate.of(2026, 11, 16),
                TransactionType.INCOME
        );

        Transaction secondTransaction = new Transaction(
                "Supermercado",
                new BigDecimal("150.58"),
                LocalDate.of(2026,11,5),
                TransactionType.EXPENSE
        );

        Transaction threeTransaction = new Transaction(
                "Steam",
                new BigDecimal("100.00"),
                LocalDate.of(2026, 11, 17),
                TransactionType.EXPENSE
        );

        TransactionManager teste = new TransactionManager();
        teste.insertObjectInList(firstTransaction);
        teste.insertObjectInList(secondTransaction);
        teste.insertObjectInList(threeTransaction);

        teste.verifyList();
        teste.viewTransaction(firstTransaction);

    }
}