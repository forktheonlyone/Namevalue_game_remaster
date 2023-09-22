package Scene;

import Manager.*;
import java.util.Scanner;

public class ParttimeJob extends Scene {
    private String farm = "농장";
    private String silverTown = "양로원";
    private String background = "뒷골목";
    private String mainMenu = "메인";

    private int input() {
        int num = 0; // 초기화
        menuTxt(); // 알바장소 선택지 메뉴

        try {
            System.out.print("                                            알바 종류 입력 : ");
            num = scanner.nextInt(); // num값 정수형 입력 받음
        } catch (Exception e) { // 예외 처리
            System.out.println("                                      에러");
        }
        return num; // num값 반환
    }

    public void menuTxt() {
        System.out.println("                                   ༻✦༺ 　༻알바 장소를 선택해 주세요༺　༻✦༺");
        // 보유골드: ( Wealth값 )
        System.out.println("                                     ༻✦༺ 　༺༻ 보유 골드: " + user.getWealth() + "༺༻ 　༻✦༺");
        System.out.println("                                              1. " + farm);
        System.out.println("                                              2. " + silverTown);
        System.out.println("                                              3. " + background);
        System.out.println("                                              4. " + mainMenu);
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }

    public void renderTxt(){
        // 만약 sceneName값과 mainMenu값과 같지 않다면
        if(sceneName != mainMenu) {
            try {
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                        " + sceneName + " 을(를) 선택하셨습니다.");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                System.out.print("                                        돈 +" + sceneWealth + " 스트레스 +" + scenePTSD);
            } catch (InterruptedException e) {
                e.printStackTrace();  // 발생근원지를 찾아서 단계별로 에러를 출력
            }
        }else{ // 아니면
            try {
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                        " + sceneName + " 을(를) 선택하셨습니다.");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            } catch (InterruptedException e) {
                e.printStackTrace(); // 발생근원지를 찾아서 단계별로 에러를 출력
            }

        }

        // 만약 sceneName값과 silverTown값이 같다면
        if(sceneName ==  silverTown){
            System.out.println(" 도덕성 +"+sceneMorality);
        // 혹은 sceneName값과 background값이 같다면
        }else if(sceneName ==  background){
            System.out.println(" 도덕성 -"+sceneMorality);
        // 혹은 sceneName이 farm값과 같다면
        }else if(sceneName == farm) {
            System.out.print("\n");
        }else{} // 아니면
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }


    @Override
    public void initialize() {
        this.user = GameManager.getInstance().getUser(); // 이 클래스의 유저는 GameManager의 User와 같음
        scanner = new Scanner(System.in); // 스캐너 객체 생성
    }

    @Override
    public int update() {
        int i = input();

        while(true) { // true라면 반복
            if(0 < i && i < 5) { // 만약 0이 i보다 작으며 i가 5보다 작다면
                break; // 탈출
            } else { // 아니면
                System.out.println("                                         잘 못 입력하셨습니다");
                i = input();
            }
        }

        switch (i) { // 매개변수 i를 입력받은 switch문
            case 1: // 1번

                sceneName =  farm; // sceneName값에 farm값 할당
                sceneWealth = 10; // sceneWealth값에 10 할당
                scenePTSD = 7; // scenePTSD값에 7 할당
                break;

            case 2: // 2번
                sceneName =  silverTown; // sceneName값에 silverTown값 할당
                sceneWealth = 3; // sceneWealth값에 3 할당
                scenePTSD = 3; // scenePTSD값에 3 할당
                sceneMorality = 5; // sceneMorality값에 5 할당
                // Morality의 값을 ( 현재 Morality값 + sceneMorality값 )로 설정
                user.setMorality(user.getMorality() + sceneMorality);
                break; // 탈출

            case 3: // 3번
                sceneName =  background; // sceneName에 background값 할당
                sceneWealth = 30; // sceneWealth값에 30 할당
                scenePTSD = 5; // scenePTSD값에 5 할당
                sceneMorality = 10; // sceneMorality값에 10 할당
                // Morality의 값을 ( 현재 Morality값 - sceneMorality값 )로 설정
                user.setMorality(user.getMorality() - sceneMorality);
                break; // 탈출

            case 4: // 4번
                sceneName = mainMenu; // sceneName에 mainMenu값 할당
                GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                break; // 탈출

        }

        // Wealth의 값을 ( 현재 Wealth값 + sceneWealth값 )로 설정
        user.setWealth(user.getWealth() + sceneWealth);
        // PTSD의 값을 ( 현재 PTSD값 + scenePTSD값 )로 설정
        user.setPTSD(user.getPTSD() + scenePTSD);
        renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
        // SceneManager의 Scene을 ( GameManager의 menu )로 설정
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender(); // 현재 몇턴 남았는지 안내 출력문
        return 0;
    }

    @Override
    public void render() {}
}