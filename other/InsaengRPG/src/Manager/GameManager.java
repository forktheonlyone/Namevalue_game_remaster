package Manager;

import Object.User;

public class GameManager { // 싱글톤 생성
    private static GameManager instance = null;

    public static GameManager getInstance()
    {
        if(instance == null)
            instance = new GameManager();

        return instance;
    }

    User user = null; // user는 null 값
    public final int menu = 0; // 상수 menu에 0 대입
    public final int intro = 6; // 상수 intro에 6 대입

    public void initialize(){
        this.user = new User(); // User객체 생성 후 대입
    }

    public User getUser() { return user;}  // getter와 setter 사용
    public void setUser(User user) { this.user = user;}

}