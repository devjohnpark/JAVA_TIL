package objectoriented.polymorphism.interfaces.auth;

// 구글 권한에 대한 기능을 수행하는 클래스
public class GoogleAuth extends Auth {
    private int googleID;

    @Override
    public void checkAuth() {
        // 구글 계정 권한 조회 로직
        System.out.println("Check auth with googleID: " + googleID);
    }
}