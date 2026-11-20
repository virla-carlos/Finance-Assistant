import java.math.BigDecimal;
import java.util.ArrayList;

public class TransactionManager {

    private ArrayList<Transaction> collectionManager;

    public TransactionManager(){
        ArrayList<Transaction> collectionManager = new ArrayList<>();
        this.collectionManager = collectionManager;
    }

    public void addTransaction(Transaction object){
        collectionManager.add(object);
    }

    public void getTransactionCount(){
        collectionManager.size();
    }

    public void displayTransaction() {

        if (collectionManager.isEmpty()) {
            System.out.print("Nenhuma movimentação registrada");
        }else{
            for (int i = 0; i < collectionManager.size(); i++) {
                System.out.printf("\nDescrição de movimentação: %s", collectionManager.get(i).getDescription());
                System.out.printf("\nValor de movimentação: %s", collectionManager.get(i).getAmount());
                System.out.printf("\nData de movimentação: %s", collectionManager.get(i).getDate());
                System.out.printf("\nTipo de movimentação: %s \n", collectionManager.get(i).getType());
            }
        }
    }

    public void sumIncome(){
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (int i = 0; i < collectionManager.size(); i++){
            if (collectionManager.get(i).getType().equals(TransactionType.INCOME)){
                totalIncome = totalIncome.add(collectionManager.get(i).getAmount());
            }
        }
        System.out.printf("\nTeste de calculo do total de receitas: \n%s",totalIncome);
    }
}
