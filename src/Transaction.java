import java.math.BigDecimal;
import  java.time.LocalDate;

public class Transaction {
    private String description;
    private BigDecimal amount;
    private LocalDate date;
    private TransactionType type;

    public Transaction(String description, BigDecimal amount, LocalDate date, TransactionType type){

        // Description rule validation
        if (description.isBlank()) {
            throw new IllegalArgumentException("Valor de movimentação inválido");
        }else{
            this.description = description;
        }

        // Amount rule validation
        if (amount == null){
            throw new IllegalArgumentException("O valor de movimentação não pode ser nulo");
        }else if ((amount.compareTo(BigDecimal.ZERO) <= 0)){
            throw new IllegalArgumentException("O valor de movimentação não pode ser menor ou igual a zero");
        }else{
            this.amount = amount;
        }

        this.date = date;
        this.type = type;
    }

    public String getDescription(){
        return description;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public TransactionType getType(){
        return type;
    }

}
