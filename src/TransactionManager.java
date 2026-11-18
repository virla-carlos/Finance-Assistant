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
        System.out.println(collectionManager.size());
    }

    public void viewTransaction(Transaction object){
        System.out.printf("\nDescrição de movimentação: %s\n",object.getDescription());
        System.out.printf("Valor de movimentação: %s\n", object.getAmount());
        System.out.printf("Data de movimentação: %s\n", object.getDate());
        System.out.printf("Tipo de movimentação: %s\n", object.getType());
    }
}
