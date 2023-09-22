package Main;
import Main.Manager.ObjectManager;
import Main.Manager.ScanManager;
import Main.Manager.SceneManager;

import java.util.Scanner;
public class MainUpdate {
    public void intro(){
        try { // 시도
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ##   ##  #######  ##   ##       ##   ##   ####    ##   ##  #####     #####   ##   ##    ##   ");
            System.out.println(" ###  ##   ##   #  ##   ##       ##   ##    ##     ###  ##   ## ##   ##   ##  ##   ##   ####  ");
            System.out.println(" #### ##   ## #    ##   ##       ##   ##    ##     #### ##   ##  ##  ##   ##  ##   ##   ####  ");
            System.out.println(" ## ####   ####    ## # ##       ## # ##    ##     ## ####   ##  ##  ##   ##  ## # ##    ##   ");
            System.out.println(" ##  ###   ## #    #######       #######    ##     ##  ###   ##  ##  ##   ##  #######    ##   ");
            System.out.println(" ##   ##   ##   #  ### ###       ### ###    ##     ##   ##   ## ##   ##   ##  ### ###         ");
            System.out.println(" ##   ##  #######  ##   ##       ##   ##   ####    ##   ##  #####     #####   ##   ##    ##   ");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("\n뉴윈도우 마을에 어쩌구 저쩌구");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("마왕이 나타나 어쩌구 저쩌구");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("시간안에 마왕을 죽이지 않으면");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("세상이 어쩌구 저쩌구 어쩌구 저쩌구");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("용사가 등장했다!");

            Thread.sleep(2000); // 2000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ");
            System.out.println(" [게임 규칙]\n" +
                    "1. 플레이어는 AM 8:00 기상 합니다.\n" +
                    "2. 각 씬 마다 입장 제한 시간과 해야할 일이 존재합니다.\n" +
                    "- 숙소: 현재시간 <= 23 이용, 하루에 한번 무조건 1회 사용\n" +
                    "- 사냥터: 현재시간 <= 19 이용, 하루에 한번 무조건 2회 사용\n" +
                    "- 훈련장: 현재시간 <= 21 이용\n" +
                    "- 아르바이트: 현재시간 <= 22 이용\n" +
                    "3. 정해진 시간과 횟수 안에 반드시 해야할 일을 하지 않으면 불이익이 주어집니다.\n" +
                    "4. 생존일이 10~15일 사이 기간이라면, 플레이를 하는 도중 보스가 약 30%의 확률로 깜짝 등장합니다. \n" +
                    "5. 유저가 사망하거나 보스를 해치운다면 게임은 종료됩니다.\n");
            Thread.sleep(3000); // 3000 millis 동안 구동을 강제정지후 재생
        }
        // 예외 처리, 오류 e를 잡아
        // 예외 정보 출력
        catch (InterruptedException e) {e.printStackTrace();}
    }

    public void initialize() {
        ScanManager.Initialize(); // 스캔매니저 객체 생성
        System.out.println("게임을 시작하시겠습니까?");
        System.out.println("1.네 "+" 2.아니오");
        int num = ScanManager.Scan(); // num = 스캐너 입력 안내문 및 입력
        if (num == 1) // 입력받은 값이 1일경우
        {
            ObjectManager.getInstance().initialize(); // 플레이어 보스 잡몹 객체 생성
            SceneManager.getInstance().setScene(0); // Village 클래스 호출
        }
        else // 아닐경우
        {
            System.out.println("게임을 종료합니다.");
            System.exit(0); // 실행 종료
        }
    }

    public void update() {SceneManager.getInstance().update();}

    public void render() {SceneManager.getInstance().render();}
}
