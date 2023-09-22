package Scene;

import Manager.*;
import java.util.Scanner;

public class EducationCenter extends Scene { // Scene 클래스를 상속받음
    private String mathSt = "수학수업";
    private String artSt = "미술수업";
    private String morSt = "도덕수업";
    private String mainMenu = "메인";

    private int needMoneyMathSt = -5; // MathSt에 필요한 돈
    private int needMoneyArtSt = -7; // ArtSt에 필요한 돈
    private int needMoneyMorSt = -3; // MorSt에 필요한 돈

    public void menuTxt(){
        System.out.println("                                 ༻✦༺ 　༺༻수업 종류를 선택해 주세요༺༻　༻✦༺");
        // Wealth값 출력
        System.out.println("                                    ༻✦༺ 　༺༻ 보유 골드: " + user.getWealth() + "༺༻　༻✦༺");
        // 수학수업에 필요한 골드 -5
        System.out.println("                                        1. " + mathSt + " (필요 골드: " + -needMoneyMathSt + ")");
        // 미술수업에 필요한 골드 -5
        System.out.println("                                        2. " + artSt + " (필요 골드: " + -needMoneyArtSt + ")");
        // 도덕수업에 필요한 골드 -5
        System.out.println("                                        3. " + morSt + " (필요 골드: " + -needMoneyMorSt + ")");
        // "메인" 출력
        System.out.println("                                        4. " + mainMenu);
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
    }

    private int input() {
        int num = 0;
        menuTxt(); // 해당 메서드 출력

        try {
            System.out.print("                                          수업 종류 입력 : ");
            num = scanner.nextInt(); // num값 정수형 입력 받음
        } catch (Exception e){ // 예외 처리
            System.out.println("                                              에러");
        }
        return num; // num 반환
    }

    public void renderTxt() {
        try {
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("                                        "+sceneName+" 을(를) 선택하셨습니다.");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.print("                                        돈 -"+sceneWealth + " 스트레스 +"+scenePTSD);

        } catch (InterruptedException e) {e.printStackTrace();} // 발생근원지를 찾아서 단계별로 에러를 출력


            // 만약 sceneName이 mathSt = "수학수업" 과 같다면
        if(sceneName ==  mathSt) {
            System.out.println(" 지성 +"+sceneIntel); // 지성 + sceneIntel값 출력
            // 혹은 sceneName이 artSt = "미술수업" 과 같다면
        }else if(sceneName ==  artSt) {
            System.out.println(" 예술성 +"+sceneArtistry); // 예술성 + sceneArtistry값 출력
            // 혹은 sceneName이 morSt = "도덕수업" 과 같다면
        }else if(sceneName ==  morSt) {
            System.out.println(" 도덕성 +"+sceneMorality); // 도덕성 + sceneMorality값 출력
            // 그것도 아니면
        } else {
            System.out.print("\n"); // 개행
        }
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }

    @Override
    public void initialize() {
        // 이 클래스의 user는 GameManager에서 객체생성된 User와 같다
        this.user = GameManager.getInstance().getUser();
        scanner = new Scanner(System.in); // System.in 값을 입력받음
    }

    @Override
    public int update() {
        // 정수형 i는 input과 같다
        int i = input();

        while(true) { // true 일 경우 반복
            if(0 < i && i < 5) // 만약 0이 i보다 작고 i가 5보다 작으면
                break; // 탈출
            else { // 아니면
                System.out.println("                                           잘 못 입력하셨습니다");
                i = input();
            }
        }

        switch (i) { // 매개변수 i를 입력받은 switch
            case 1: // 1번
                // 만약 ( 유저의 Wealth값 + needMoneyMathSt값 )이 -1 보다 크면
                if(user.getWealth() + needMoneyMathSt > -1) {
                    sceneName =  mathSt; // sceneName은 mathSt
                    sceneIntel = 5; // sceneIntel의 값 5
                    sceneWealth = 5; // sceneWealth의 값 5
                    scenePTSD = 5; // scenePTST의 값 5

                    // 유저의 Wealth값을 ( 현재 Wealth값 - sceneWealth )로 설정
                    user.setWealth(user.getWealth() - sceneWealth);
                    // 유저의 PTSD값을 ( 현재 PTSD값 - scenePTSD )로 설정
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    // 유저의 Intel값을 ( 현재 Intel값 - sceneIntel )로 설정
                    user.setIntel(user.getIntel() + sceneIntel);
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                } else { // 아니면
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                }
                break; // 탈출

            case 2: // 2번
                // 만약 ( 유저의 Wealth값 + needMoneyArtSt값 )이 -1보다 크면
                if(user.getWealth() + needMoneyArtSt > -1) {
                    sceneName =  artSt; // sceneName은 artSt
                    sceneArtistry = 3; // sceneArtistry의 값 3
                    sceneWealth = 7; // sceneWealth의 값 7
                    scenePTSD = 2; // scenePTSD의 값 2

                    // 유저의 Wealth값을 ( 현재 Wealth값 - sceneWealth )로 설정
                    user.setWealth(user.getWealth() - sceneWealth);
                    // 유저의 PTSD값을 ( 현재 PTSD값 - scenePTSD )로 설정
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    // 유저의 Artistry값을 ( 현재 Artistry값 - sceneArtistry )로 설정
                    user.setArtistry(user.getArtistry() + sceneArtistry);
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                } else {
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                }
                break; // 탈출

            case 3: // 3번
                // 만약 ( 유저의 Wealth값 + needMoneyArtSt값 )이 -1보다 크면
                if(user.getWealth() + needMoneyMorSt > -1) {
                    sceneName =  morSt; // sceneName은 morSt
                    sceneMorality = 3; // sceneMorality의 값 3
                    sceneWealth = 3; // sceneWealth의 값 3
                    scenePTSD = 3; // scenePTSD의 값 3

                    // 유저의 Wealth값을 ( 현재 Wealth값 - sceneWealth )로 설정
                    user.setWealth(user.getWealth() - sceneWealth);
                    // 유저의 PTSD값을 ( 현재 PTSD값 - scenePTSD )로 설정
                    user.setPTSD(user.getPTSD() + scenePTSD);
                    // 유저의  Morality을 ( 현재 Morality값 - sceneMOrality )로 설정
                    user.setMorality(user.getMorality() + sceneMorality);
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                } else { // 아니면
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한턴 증가
                }
                break; // 탈출

            case 4: // 4번
                sceneName = mainMenu; // sceneName은 mainMenu
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                         "+sceneName + "를 선택하셨습니다.");
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                GameManager.getInstance().getUser().turnUp(); // 한턴 증가
                break; // 탈출
        }
        // SceneManager의 Scene을 ( GameManager의 menu )로 설정
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender(); // 현재 몇턴 남았는지 안내 출력문
        return 0; // 0을 = menu 반환
    }

    @Override
    public void render() {} // Scene을 상속받은 메서드
}