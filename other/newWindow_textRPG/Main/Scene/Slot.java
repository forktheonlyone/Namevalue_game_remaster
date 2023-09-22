package Main.Scene;
import Main.Object.Object;
import Main.Manager.ObjectManager;
import Main.Manager.ScanManager;
import Main.Manager.SceneManager;

public class Slot extends Scene {

    Object user = ObjectManager.getInstance().getUser(); // user는 ObjectManager에 객체생성된 User

    public void initialize() {System.out.println("동카현지노에 도착하였습니다");}

    public void update() {
        try {
            // Str은 ScanManager의 ScanString과 같음
            String Str = ScanManager.ScanString("타이핑을 해주세요 : ");
            switch (Str) {
                case "블랙잭": // 블랙잭 타이핑시
                    System.out.println("1. 블랙잭");
                    // Money 1은 현재 Money * 최대값 2 ~ 최소값 -0.1 사이의 값
                    int Money1 = (int) (Math.random() * (Money * 2) + (Money * -0.1));
                    // Money값을 (Money1) 값으로 설정
                    user.setMoney(Money1);
                    System.out.println("보유금: " + user.getMoney()); // 보유금: 저장된 Money값
                    System.out.println("적당히하고 마을로 돌아가자");
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    break; // switch문 탈출
                case "홀덤": // 홀덤 타이핑시
                    System.out.println("2. 홀덤");
                    // Money 2은 현재 Money * 최대값 1.1 ~ 최소값 -0.1 사이의 값
                    int Money2 = (int) (Math.random() * (Money * 1.1) + (Money * 0.1));
                    // Money값을 (Money2) 값으로 설정
                    user.setMoney(Money2);
                    System.out.println("보유금: " + user.getMoney()); // 보유금: 저장된 Money값
                    System.out.println("적당히하고 마을로 돌아가자");
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    break; // switch문 탈출
                case "슬롯머신": // 슬롯머신 타이핑시
                    System.out.println("3. 슬롯머신");
                    // Money 3은 현재 Money * 최대값 1.1 ~ 최소값 -0.1 사이의 값
                    int Money3 = (int) (Math.random() * (Money * 1.1) + (Money * -0.1));
                    // Money값을 (Money3) 값으로 설정
                    user.setMoney(Money3);
                    System.out.println("보유금: " + user.getMoney()); // 보유금: 저장된 Money값
                    System.out.println("적당히하고 마을로 돌아가자");
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    break; // switch문 탈출
                case "포커":
                    System.out.println("4. 포커");
                    // Money 4은 현재 Money * 최대값 1.1 ~ 최소값 -0.1 사이의 값
                    int Money4 = (int) (Math.random() * (Money * 1.1) + (Money * 0.1));
                    // Money값을 (Money4) 값으로 설정
                    user.setMoney(Money4);
                    System.out.println("보유금: " + user.getMoney()); // 보유금: 저장된 Money값
                    System.out.println("적당히하고 마을로 돌아가자");
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    break; // switch문 탈출
                default:
                    System.out.println("실수했다, 돈을 아무데나 던져버렸다");
                    System.out.println("적당히하고 마을로 돌아가자");
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    break; // switch문 탈출
            }
        }
        // 예외 처리, 오류 e를 잡아
        // 예외 정보 출력
        catch (InterruptedException e) {e.printStackTrace();}
        SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
    }
    @Override
    public void render() {
        // 만약 Time값이 22보다 클 경우
        if (ObjectManager.getInstance().getUser().getTime() > 22) {
        System.out.println("넌 잠을 좀 자야될 거 같아");
        SceneManager.getInstance().setScene(1); // Scene을 1 로 설정 = Home
        }
        // 혹은 만약 Time값이 22와 같을 경우
        else if (ObjectManager.getInstance().getUser().getTime() == 22) {
            try {
                System.out.println("카지노가 문을 닫았군");
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
            }
            // 예외 처리, 오류 e를 잡아
            // 예외 정보 출력
            catch (InterruptedException e) {e.printStackTrace();}
        }
        // 혹은 만약 Money값이 10000 보다 작을경우
        else if (ObjectManager.getInstance().getUser().getMoney() < 10000) {
            try {
              System.out.println("돈도 없는게 꺼져");
              Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
               System.out.println("입구에서 쫓겨났다");
               Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
            }
            // 예외 처리, 오류 e를 잡아
            // 예외 정보 출력
            catch (InterruptedException e) {e.printStackTrace();}
        }
        else { // 위의 조건들이 다 false 라면
            try {
                System.out.println("드가자~");
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                System.out.println("입장료는 10000원입니다");
                user.setMoney(Money - 10000); // Money값을 ( 현재 Money - 10000) 으로 설정
                // Time값을 ( 현재 Time + 1 )로 설정
                ObjectManager.getInstance().getUser().setTime(time + 1);
                System.out.println("어떤 게임을 하시겠습니까?");
                System.out.println("1. 블랙잭 2. 홀덤 3. 슬롯머신 4. 포커");
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
            }
            // 예외 처리, 오류 e를 잡아
            // 예외 정보 출력
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}