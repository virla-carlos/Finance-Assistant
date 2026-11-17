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

        // Date rule validation
        if (date == null){
            throw new IllegalArgumentException("A data inserida não pode ser nula");
        }else if (date.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("A data inserida não pode ser posterior ao dia de hoje");
        }else{
            this.date = date;
        }

        // Type rule validation
        if (type == null){
            throw new IllegalArgumentException("O tipo de movimentação não pode ser nulo");
        }else{
            this.type = type;
        }
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
