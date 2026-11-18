import java.util.ArrayList;

public class TransactionManager {

    private ArrayList<Transaction> collectionManager;

    public TransactionManager(){
        ArrayList<Transaction> collectionManager = new ArrayList<>();
        this.collectionManager = collectionManager;
    }

    public void insertObjectInList(Transaction object){
        collectionManager.add(object);
    }

    public void verifyList(){
        collectionManager.size();
    }

    public void viewTransactions() {

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
}
