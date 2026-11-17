import java.math.BigDecimal;
import java.time.LocalDate;

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

        System.out.printf("\nDescrição da movimentação: %s\n", firstTransaction.getDescription());
        System.out.printf("Valor da movimentação: %.2f\n", firstTransaction.getAmount());
        System.out.printf("Data de movimentação: %s\n", firstTransaction.getDate());
        System.out.printf("Tipo de movimentação: %s\n", firstTransaction.getType());

        System.out.printf("\nDescrição da movimentação: %s\n", secondTransaction.getDescription());
        System.out.printf("Valor da movimentação: %.2f\n", secondTransaction.getAmount());
        System.out.printf("Data de movimentação: %s\n", secondTransaction.getDate());
        System.out.printf("Tipo de movimentação: %s\n", secondTransaction.getType());
    }
}