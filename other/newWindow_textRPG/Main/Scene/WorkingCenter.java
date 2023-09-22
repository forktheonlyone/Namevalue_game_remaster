package Main.Scene;
import Main.Object.Object;
import Main.Manager.ObjectManager;
import Main.Manager.ScanManager;
import Main.Manager.SceneManager;

public class WorkingCenter extends Scene{
    Object user = ObjectManager.getInstance().getUser(); // user는 ObjectManager에 객체생성된 User
    @Override
    public void initialize() {
        System.out.println("=====================");
        System.out.println("멋지구광유식당에 도착했다");
        System.out.println("=====================");
    }
    @Override
    public void update() {
        try {
            int num = ScanManager.Scan(); // num은 스캐너 입력받은 값
            switch (num) { // num 매개변수 받음
                case 1:
                    System.out.println("그릇을 열심히 닦았다");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    // 유저의 MaxHp값을 ( 현재 MaxHp + 3 )로 설정
                    ObjectManager.getInstance().getUser().setMaxHp(MaxHp + 3);
                    // 유저의 Time값을 ( 현재 Time + 1 )로 설정
                    ObjectManager.getInstance().getUser().setTime(time + 1);
                    // 유저의 Money값을 ( 현재 Money + 3 )로 설정
                    ObjectManager.getInstance().getUser().setMoney(Money + 10000);
                    // 유저의 EXP값을 ( 현재 EXP + 30 )로 설정
                    ObjectManager.getInstance().getUser().setEXP(EXP + 30);

                    System.out.println("돈을 획득했다 + " + 10000);
                    System.out.println("일을 했더니 체력이 좋아진 것 같다 +" + 3);
                    System.out.println("경험치가 올랐다 + " + 30);
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    break;
                case 2:
                    System.out.println("바닥을 열심히 닦았다");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    // 유저의 MaxHp값을 ( 현재 MaxHp + 3 )로 설정
                    ObjectManager.getInstance().getUser().setMaxHp(MaxHp + 3);
                    // 유저의 Time값을 ( 현재 Time + 1 )로 설정
                    ObjectManager.getInstance().getUser().setTime(time + 1);
                    // 유저의 Money값을 ( 현재 Money + 3 )로 설정
                    ObjectManager.getInstance().getUser().setMoney(Money + 10000);
                    // 유저의 EXP값을 ( 현재 EXP + 30 )로 설정
                    ObjectManager.getInstance().getUser().setEXP(EXP + 30);

                    System.out.println("돈을 획득했다 + " + 10000);
                    System.out.println("일을 했더니 체력이 좋아진 것 같다 +" + 3);
                    System.out.println("경험치가 올랐다 + " + 30);
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    break;
                default: // switch의 case 1 ~ 2 입력값이 아닐경우
                    System.out.println("넌 일할 자격이 없다");
                    System.out.println("쫓겨났다");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            }
            SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
            ObjectManager.getInstance().setUser(user); // ObjectManager에 객체생성된 User 호출
        }
        catch (InterruptedException e) {e.printStackTrace();} // 에러 발생근원지를 찾아서 단계별로 에러를 출력
    }
    @Override
    public void render() {
        try {
            // 만약 Time값이 22보다 클 경우
            if (ObjectManager.getInstance().getUser().getTime() > 22) {
                System.out.println("넌 잠을 좀 자야될 거 같아");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(1); // Scene을 1 으로 설정 = Home
                // 혹은 Time값이 22와 같을경우
            } else if (ObjectManager.getInstance().getUser().getTime() == 22) {
                System.out.println("장사가 끝나서 일을 하지 못하겠군. 마을로 돌아가자");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = Village
            } else { // 둘다 아니면
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                System.out.println("1. 설거지를 한다");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                System.out.println("2. 청소를 한다");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            }
        }
        catch (InterruptedException e) {e.printStackTrace();} // 인터럽트 처리문 -> 에러 발생근원지를 찾아서 단계별로 에러를 출력
    }
}
