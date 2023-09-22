package Main.Scene;
import Main.Manager.ObjectManager;
import Main.Manager.ScanManager;
import Main.Manager.SceneManager;
public class Village extends Scene { // Scene 클래스 상속
    public void initialize(){
        ObjectManager.getInstance().UserStatus(); // ObjectManager.getInstance()의 UserStatus() 메서드 호출
        mainMenu(); // mainMenu() 메서드 호출
        ObjectManager.getInstance().getUser().update(); // ObjectManager.getInstance().getUser()의 update() 메서드 호출
    }

    public void update(){
        try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
            int num = ScanManager.Scan(); // num에 ScanManager.Scan() 대입
            switch (num) { // num값 입력
                case 1:
                    System.out.println("쉬고 싶다");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(1); // 집으로 이동
                    break;
                case 2:
                    System.out.println("사냥을 하러가자");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    System.out.println("던전은 반드시 2번 가야한다");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(2); // 던전으로 이동
                    break;
                case 3:
                    System.out.println("물건을 좀 볼까");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(3); // 가게로 이동
                    break;
                case 4:
                    System.out.println("단련을 좀 해볼까");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(4); // 훈련장으로 이동
                    break;
                case 5:
                    System.out.println("돈을 좀 벌어볼까");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    System.out.println("가게는 22시까지 밖에 안하는군");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(5); // 알바 장소로 이동
                    break;
                case 6:
                    System.out.println("재미좀 볼까?");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    System.out.println("카지노는 22시까지 밖에 안하는군");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(6); // 카지노로 이동
                    break;
                case 7:
                    System.out.println("게임을 종료합니다");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    System.exit(7); // 시스템 종료
                    break;
                default:
                    System.out.println("다시 선택해주세요");
                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    SceneManager.getInstance().setScene(0); // 마을로 이동
                    break;
            }
        }
        catch (InterruptedException e) {e.printStackTrace();} // 에러의 발생근원지를 찾아서 단계별로 에러를 출력
    }
    public void render(){}

    private void mainMenu()
    {
        try{ // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
        System.out.println("마을에 도착하였습니다");
            Thread.sleep(1000);
        System.out.println("1. 숙소로 갑니다");
        System.out.println("2. 사냥터로 갑니다");
        System.out.println("3. 상점으로 갑니다");
        System.out.println("4. 훈련소로 갑니다");
        System.out.println("5. 아르바이트를 하러 갑니다");
        System.out.println("6. 카지노로 갑니다");
        System.out.println("7. 게임을 종료합니다");
            Thread.sleep(1000);
        System.out.println(" (1) "+" (2) "+ " (3) "+" (4) "+" (5) "+ " (6) "+" (7)");
        }
        catch (InterruptedException e) {e.printStackTrace();} // 에러의 발생근원지를 찾아서 단계별로 에러를 출력
    }
}
