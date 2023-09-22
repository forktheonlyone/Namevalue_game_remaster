package Scene;
import Manager.*;
import java.util.Scanner;

public class Party extends Scene {
    private String homeParty = "홈파티";
    private String villageParty = "마을잔치";
    private String kingdomParty = "왕궁파티";
    private String mainMenu = "메인";



    private int input(){
        int num = 0;
        menuTxt(); // 메뉴문 출력

        try {
            System.out.print("                                          파티 종류 입력 : ");
            num = scanner.nextInt(); // num값 정수형 입력 받음
        }catch (Exception e){ // 예외 처리
            System.out.println("                                              에러");
        }

        return num; // 0 반환
    }

    public void renderTxt() {

        try {
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("                                       "+sceneName+" 을(를) 선택하셨습니다.");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("                                       돈 -" + sceneWealth + " 사교성 +" + sceneSociability + " 스트레스 +" + scenePTSD);
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");

        } catch (InterruptedException e) {e.printStackTrace();} // 발생근원지를 찾아서 단계별로 에러를 출력

    }

    public void menuTxt(){
        System.out.println("                                   ༻✦༺ 　༻파티 종류를 선택해 주세요༺　༻✦༺");
        System.out.println("                                              1. "+homeParty);
        System.out.println("                                              2. "+villageParty);
        System.out.println("                                              3. "+kingdomParty);
        System.out.println("                                              4. "+mainMenu);
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
            // 만약 0이 i보다 작으며 i가 5보다 작을때
            if(0 < i && i < 5)
                break; // 탈출
            else { // 아니면
                System.out.println("                                         잘 못 입력하셨습니다");
                i = input();
            }
        }

        switch (i) { // 매개변수 i를 입력받은 switch문
            case 1: // 1번
                // 만약 (유저의 Wealth값 - 5)이 0보다 크다면
                if(user.getWealth()-5>0){
                    sceneName =  homeParty; // sceneName값에 homeParty값 할당
                    sceneWealth = 5; // sceneWealth값에 5 할당
                    sceneSociability = 3; // sceneSociability값에 3 할당
                    scenePTSD = 2; // scenePTSD값에 2 할당
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                }
                else{ // 아니면
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                }
                break; // 탈출

            case 2: // 2번
                if(user.getWealth()-10>0){ // 만약 ( 유저의 Wealth값 - 10 )이 0보다 크다면
                    sceneName =  villageParty; // sceneName값에 villageParty값 할당
                    sceneWealth = 10; // sceneWealth값에 10 할당
                    sceneSociability = 5; // sceneSociability값에 5 할당
                    scenePTSD = 2; // scenePTSD값에 2 할당
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                }
                else{ // 아니면
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한턴증가
                }
                break; // 탈출

            case 3: // 3번
                if(user.getWealth()-15>0){ // 만약 ( 유저의 Wealth값 - 15 )이 0보다 크다면
                    sceneName =  kingdomParty; // sceneName에 kingdomParty값 할당
                    sceneWealth = 15; // sceneWealth값에 10 할당
                    sceneSociability = 7; // sceneSociability값에 7 할당
                    scenePTSD = 2; // scenePTSD값에 2 할당
                    renderTxt(); // renterTxT 메서드 호출하여 현재 값과 정보 안내 출력
                }
                else{ // 아니면
                    System.out.println("                                          소지 골드가 부족합니다.");
                    GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                }
                break; // 탈출
            case 4: // 4번
                sceneName = mainMenu; // sceneName에 mainMenu값 할당
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                System.out.println("                                         "+sceneName + "를 선택하셨습니다.");
                System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                GameManager.getInstance().getUser().turnUp(); // 한 턴 증가
                break; // 탈출
        }
        // Wealth값을 ( 현재 Wealth값 - sceneWealth )로 수정
        user.setWealth(user.getWealth() - sceneWealth);
        // Sociability값을 ( 현재 Sociability값 + sceneSociability )로 수정
        user.setSociability(user.getSociability() + sceneSociability);
        // PTSD값을 ( 현재 PTSD값 + scenePTSD )로 수정
        user.setPTSD(user.getPTSD() + scenePTSD);
        // SceneManager의 Scene을 ( GameManager의 menu )로 설정
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        GameManager.getInstance().getUser().turnRender(); // 현재 몇턴 남았는지 안내 출력문

        return 0;
    }

    @Override
    public void render() {


    }
}