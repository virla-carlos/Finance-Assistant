import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Transaction firstTransaction = new Transaction(
                "Aluguel",
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

        ArrayList<Transaction> objectCollection = new ArrayList<>();
        objectCollection.add(firstTransaction);
        objectCollection.add(secondTransaction);

        for (int i = 0; i < 2; i++){
            System.out.println(
                    "Descrição de movimentação: " + objectCollection.get(i).getDescription() + "\n" +
                    "Valor de movimentação: " + objectCollection.get(i).getAmount() + "\n" +
                    "Date de movimentação: " + objectCollection.get(i).getDate() + "\n" +
                    "Tipo de movimentação: " + objectCollection.get(i).getType() + "\n"
            );
        }

        System.out.println(objectCollection.size());
    }
}