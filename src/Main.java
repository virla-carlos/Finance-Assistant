import java.math.BigDecimal;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args){

        Transaction transaction = new Transaction(
                "Aluguel",
                new BigDecimal("280.99"),
                LocalDate.of(2026,11,16),
                TransactionType.EXPENSE
        );

        System.out.printf("\nDescrição da movimentação: %s\n", transaction.getDescription());
        System.out.printf("Valor da movimentação: %.2f\n", transaction.getAmount());
        System.out.printf("Data de movimentação: %s\n", transaction.getDate());
        System.out.printf("Tipo de movimentação: %s\n", transaction.getType());

    }
}