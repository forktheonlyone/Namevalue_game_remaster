package Main;
import Main.Manager.ObjectManager;
import Main.Object.User;
import Main.Object.Boss;
public class Main {
    public static void main(String[] args) {
        double delayTime = 3000; // double 타입의 참조변수 delayTime에 3000 대입
        long deltaTime = System.currentTimeMillis(); // long 타입의 참조변수 deltaTime에 System.currentTimeMillis() 대입

        MainUpdate main = new MainUpdate(); // MainUpdate 객체 생성
        main.intro(); // MainUpdate 클래스에 있는 intro 메서드 호출
        main.initialize(); // MainUpdate 클래스에 있는 initialize 메서드 호출
        while (true) { // 조건이 참이라면 반복
            if (deltaTime + delayTime < System.currentTimeMillis()) { // deltaTime과 delayTime 더한 값이 System.currentTimeMillis() 보자 작다면
                deltaTime = System.currentTimeMillis(); // deltaTime에 System.currentTimeMillis() 대입
                main.render(); // MainUpdate 클래스에 있는 render 메서드 호출
                main.update(); // MainUpdate 클래스에 있는 update 메서드 호출
                ObjectManager.getInstance().getUser().update(); // ObjectManager.getInstance().getUser()의 update() 메서드호출
            }
        }
    }
}