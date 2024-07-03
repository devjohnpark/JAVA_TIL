package exceptionhandle.customexception.banksystem;

public class TransactionStateManager {
    private boolean transactionInProgress;

    public TransactionStateManager() {
        this.transactionInProgress = false;
    }

    public void startTransaction() throws InvalidTransactionStateException {
        if (transactionInProgress) {
            throw new InvalidTransactionStateException(BankSystemErrorCode.TRANSACTION_ALREADY_IN_PROGRESS);
        }
        transactionInProgress = true;
        System.out.println("Transaction started.");
    }

    public void endTransaction() throws InvalidTransactionStateException {
        if (!transactionInProgress) {
            throw new InvalidTransactionStateException(BankSystemErrorCode.NO_TRANSACTION_IN_PROGRESS);
        }
        transactionInProgress = false;
        System.out.println("Transaction ended.");
    }

    public boolean isTransactionInProgress() {
        return transactionInProgress;
    }
}