package exceptionhandle.customexception.banksystem;

public class BankSystemTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        TransactionService transactionService = new TransactionService(bankAccount);
        TransactionStateManager transactionStateManagerManager = new TransactionStateManager();
        BankSystemController bankSystemController = new BankSystemController(transactionService,transactionStateManagerManager);

//        bankSystemController.handleWithdraw(-20);
//        bankSystemController.handleDeposit(-50);
//        bankSystemController.handleWithdraw(200);

        transactionStateManagerManager.startTransaction();
        transactionStateManagerManager.startTransaction();
//        try {
//            // 유효하지 않은 입금 테스트 (체크 예외)
//
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // 유효하지 않은 출금 테스트 (체크 예외)
//            account.withdraw(-20);
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // 잔액 부족 출금 테스트 (체크 예외)
//            account.withdraw(200);
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // 거래 상태 테스트 (런타임 예외)
//            account.startTransaction();
//            account.startTransaction(); // 두 번째 시작 시도는 예외를 던집니다.
//        } catch (InvalidTransactionStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // 거래 상태 종료 테스트 (런타임 예외)
//            account.endTransaction();
//            account.endTransaction(); // 두 번째 종료 시도는 예외를 던집니다.
//        } catch (InvalidTransactionStateException e) {
//            e.printStackTrace();
//        }
    }
}