package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }


    //다른곳에서 생성 제한
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글통 객체 로직 호출");
    }

    public static void main(String[] args) {

    }
}
