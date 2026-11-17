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

        ArrayList<Transaction> objectCollection = new ArrayList<>();
        objectCollection.add(firstTransaction);
        objectCollection.add(secondTransaction);
        objectCollection.add(threeTransaction);

        for (int i = 0; i < objectCollection.size(); i++){
            System.out.printf("""
                    \nDescrição de movimentação: %s
                    Valor de movimentação: %s
                    Data de movimentação: %s
                    Tipo de movimentação; %s \n
                    """,
                    objectCollection.get(i).getDescription(),
                    objectCollection.get(i).getAmount(),
                    objectCollection.get(i).getDate(),
                    objectCollection.get(i).getType()
            );
        }

        System.out.printf("Número de movimentações armazenadas sistema: %s\n", objectCollection.size());
    }
}