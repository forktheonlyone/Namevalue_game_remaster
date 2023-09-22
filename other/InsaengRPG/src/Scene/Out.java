package Scene;

import Manager.*;
import java.util.Scanner;

public class Out extends Scene {
//--------------- 장소를 선택할 경우 바뀌는 각 scene의 이름 ---------------
    private String bookStore = "서점";
    private String goldBar = "금거래소";
    private String artMuseum = "미술관";
    private String generalStore = "잡화점";
    private String mainMenu = "메인";

//------------------- 각 장소의 각 행동의 스탯 변화량 -------------------
    // 서점 방문 시 각 행동의 스텟 변화량
    private int goomonBook = 3;
    private int ssenBook = 5;
    private int majorBook = 7;
    // 금거래소 방문 시 각 행동의 스텟 변화량
    private int silver = 3;
    private int gold = 5;
    private int diamond = 7;
    // 미술관 방문 시 각 행동의 스텟 변화량
    private int artMuseum_1 = 3;
    private int artMuseum_2 = 5;
    private int artMuseum_3 = 7;
    // 잡화점 방문 시 각 행동의 스텟 변화량
    private int eclipse = -3;
    private int puremilkyMacaroon = -5;
    private int makGookSu = -7;
//---------------------------------------------------------
    // 행동할 때 스트레스 감소량
    private int erasePTSD = -1;
    // 행동할 때 골드 감소량
    private int eraseWealth = -5;

    // randItem(id)의 결과로 어떤 행동을 할지 골라지는 곳
    int[][] intArray =new int[][]
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
                    {1,2,3},
            };

    // 갈 장소를 알려주는 메뉴 출력 + 현재 보유 골드와 지불량
    public void menuTxt(){
        System.out.println("                                   ༻✦༺ 　༺༻매장을 선택해 주세요༺༻　༻✦༺");
        System.out.println("                              ༻✦༺　༺༻ 보유 골드: " + user.getWealth() + " 필요 골드: " + eraseWealth + " ༺༻　༻✦༺");
        System.out.println("                                              1. "+bookStore);
        System.out.println("                                              2. "+goldBar);
        System.out.println("                                              3. "+artMuseum);
        System.out.println("                                              4. "+generalStore);
        System.out.println("                                              5. "+mainMenu);
        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
    }

    // 메뉴 출력(menuTxt())과 숫자 입력받기
    private int input(){
        int num = 0;
        menuTxt();  // 메뉴 출력

        try {
            System.out.print("                                          외출 장소 입력 : ");
            // 숫자 입력받기
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("                                              에러");
        }
        return num;
    }

    // 어떤 행동을 할지 랜덤하게 골라주는 멤버 메소드
    public int randItem(int id) {
        double dl = Math.random();
        int ra = (int)(dl * 3);
        return intArray[id - 1][ra];
    }

    // ??? user 가져오기, scanner 초기화
    @Override
    public void initialize() {
        this.user = GameManager.getInstance().getUser();
        scanner = new Scanner(System.in);
    }

    // 장소(scene) 정하고 랜덤한 행동하기(스텟 변경) (왜 int인지는 모르겠음)
    @Override
    public int update() {
        // 어떤 장소로 갈지 숫자로 정하기
        int i = input();

        // 입력한 숫자가 1 ~ 5가 아닐 경우 다시 입력받기
        while(true) {
            // 입력한 숫자가 1 ~ 5일 경우 while문 탈출
            if(0 < i && i < 6)
                break;
            else {
                System.out.println("                                         잘 못 입력하셨습니다");
                i = input();
            }
        }

        // 골드가 충분히 있는(5원 이상) 경우
        if(user.getWealth() > 4 ) {
            switch (i) {
                case 1:
                    // 장소(scene) 이름을 서점으로 변경
                    sceneName = bookStore;
                    // 선택한 장소 출력 및 1초 시간 지연
                    try {
                        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                        System.out.println("                                          "+sceneName+" 을(를) 선택하셨습니다.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    // 서점에서의 행동이 3가지 중 하나로 랜덤하게 골라짐
                    switch (randItem(i)) {
                        case 1: // 구몬책 구매
                            // user의 스텟(지성, 스트레스, 돈) 바꾸기
                            getGoomonBook();
                            // 바뀐 수치 출력
                            System.out.println("                                        서점에서 구몬책을 구매하셨습니다.");
                            System.out.println("                                           지성 +" + goomonBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 2: // 쎈수학 구매
                            // user의 스텟(지성, 스트레스, 돈) 바꾸기
                            getSsenBook();
                            // 바뀐 수치 출력
                            System.out.println("                                        서점에서 쎈수학을 구매하셨습니다.");
                            System.out.println("                                           지성 +" + ssenBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 3: // 전공 서적 구매
                            // user의 스텟(지성, 스트레스, 돈) 바꾸기
                            getMajorBook();
                            // 바뀐 수치 출력
                            System.out.println("                                        서점에서 전공 서적을 구매하셨습니다.");
                            System.out.println("                                           지성 +" + majorBook + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                    }
                    break;

                case 2:
                    // 장소(scene) 이름을 금거래소로 변경
                    sceneName = goldBar;
                    // 선택한 장소 출력 및 1초 시간 지연
                    try {
                        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                        System.out.println("                                          "+sceneName+" 을(를) 선택하셨습니다.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    // 금거래소에서의 행동이 3가지 중 하나로 랜덤하게 골라짐
                    switch (randItem(i)) {
                        case 1: // 은 구매
                            // user의 스텟(사교성, 스트레스, 돈) 바꾸기
                            getSilver();
                            // 바뀐 수치 출력
                            System.out.println("                                        금거래소에서 은을 구매하셨습니다.");
                            System.out.println("                                          사교성 +" + silver + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 2: // 금 구매
                            // user의 스텟(사교성, 스트레스, 돈) 바꾸기
                            getGold();
                            // 바뀐 수치 출력
                            System.out.println("                                        금거래소에서 금을 구매하셨습니다.");
                            System.out.println("                                          사교성 +" + gold + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 3: // 다이아몬드 구매
                            // user의 스텟(사교성, 스트레스, 돈) 바꾸기
                            getDiamond();
                            // 바뀐 수치 출력
                            System.out.println("                                     금거래소에서 다이아몬드를 구매하셨습니다.");
                            System.out.println("                                         사교성 +" + diamond + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                    }
                    break;

                case 3:
                    // 장소(scene) 이름을 미술관으로 변경
                    sceneName = artMuseum;
                    // 선택한 장소 출력 및 1초 시간 지연
                    try {
                        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                        System.out.println("                                          "+sceneName+" 을(를) 선택하셨습니다.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    // 미술관에서의 행동이 3가지 중 하나로 랜덤하게 골라짐
                    switch (randItem(i)) {
                        case 1: // 미술관 주위 구경
                            // user의 스텟(예술성, 스트레스, 돈) 바꾸기
                            getArtMuseum_1();
                            // 바뀐 수치 출력
                            System.out.println("                                           미술관 주위를 구경합니다.");
                            System.out.println("                                         예술성 +" + artMuseum_1 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 2: // 미술관 내부 구경
                            // user의 스텟(예술성, 스트레스, 돈) 바꾸기
                            getArtMuseum_2();
                            // 바뀐 수치 출력
                            System.out.println("                                             미술관 내부를 구경합니다.");
                            System.out.println("                                          예술성 +" + artMuseum_2 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 3: // 미술품 관람
                            // user의 스텟(예술성, 스트레스, 돈) 바꾸기
                            getArtMuseum_3();
                            // 바뀐 수치 출력
                            System.out.println("                                              미술품을 관람합니다.");
                            System.out.println("                                           예술성 +" + artMuseum_3 + " 스트레스 " + erasePTSD + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                    }
                    break;

                case 4:
                    // 장소(scene) 이름을 잡화점으로 변경
                    sceneName = generalStore;
                    // 선택한 장소 출력 및 1초 시간 지연
                    try {
                        System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                        System.out.println("                                          "+sceneName+" 을(를) 선택하셨습니다.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    // 잡화점에서의 행동이 3가지 중 하나로 랜덤하게 골라짐
                    switch (randItem(i)) {
                        case 1: // 이클립스 구매
                            // user의 스텟(스트레스, 돈) 바꾸기
                            getEclipse();
                            // 바뀐 수치 출력
                            System.out.println("                                      잡화점에서 이클립스를 구매하셨습니다.");
                            System.out.println("                                           스트레스 " + (eclipse+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 2: // 순수우유마카롱 구매
                            // user의 스텟(스트레스, 돈) 바꾸기
                            getPureMilkyMacaroon();
                            // 바뀐 수치 출력
                            System.out.println("                                    잡화점에서 순수우유마카롱을 구매하셨습니다.");
                            System.out.println("                                           스트레스 " + (puremilkyMacaroon+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                        case 3: // 막국수 구매
                            // user의 스텟(스트레스, 돈) 바꾸기
                            getMakGookSu();
                            // 바뀐 수치 출력
                            System.out.println("                                        잡화점에서 막국수를 구매하셨습니다.");
                            System.out.println("                                           스트레스 " + (makGookSu+erasePTSD) + " 돈 " + eraseWealth);
                            System.out.println("                                ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                            break;
                    }
                    break;

                case 5:
                    // 장소(scene) 이름을 메인으로 변경
                    sceneName = mainMenu;
                    // 선택한 장소 출력
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                    System.out.println("                                         "+sceneName + "를 선택하셨습니다.");
                    System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
                    // 행동을 하지 않고 다시 메인으로 돌아가므로 턴을 소모한 게 아님
                    // 소모한 턴 다시 회복
                    GameManager.getInstance().getUser().turnUp();
                    break;
            }

        } else { // 돈이 부족한(5원 미만) 경우
            System.out.println("                                                            소지 골드가 부족합니다.");
            // 행동을 하지 않고 다시 메인으로 돌아가므로 턴을 소모한 게 아님
            // 소모한 턴 다시 회복
            GameManager.getInstance().getUser().turnUp();
        }
        // 현재 장소(scene)을 Menu로 변경
        SceneManager.getInstance().setScene(GameManager.getInstance().menu);
        // user의 남은 턴 출력
        GameManager.getInstance().getUser().turnRender();
        return 0;
    }

    @Override
    public void render() {}

    // user의 스트레스를 erasePTSD만큼 감소
    private void erasePTSD() {
        user.setPTSD(user.getPTSD() + erasePTSD);
    }

    // user가 eraseWealth만큼 골드를 지불하도록하는 멤버 메소드
    private void eraseWealth() {
        // user의 골드가 5원 이상인 경우 eraseWealth만큼 감소
        if(user.getWealth()-5>-1){
            user.setWealth(user.getWealth() + eraseWealth);
        } else { // user의 골드가 5원 미만인 경우 출력
            System.out.println("                                                            소지 골드가 부족합니다.");
        }
    }

    // user의 지성이 goomonBook만큼 증가, 스트레스 감소, 골드 지불
    public void getGoomonBook() {
        user.setIntel(user.getIntel() + goomonBook);
        erasePTSD();
        eraseWealth();
    }

    // user의 지성이 ssenBook만큼 증가, 스트레스 감소, 골드 지불
    public void getSsenBook() {
        user.setIntel(user.getIntel() + ssenBook);
        erasePTSD();
        eraseWealth();
    }

    // user의 지성이 majorBook만큼 증가, 스트레스 감소, 골드 지불
    public void getMajorBook() {
        user.setIntel(user.getIntel() + majorBook);
        erasePTSD();
        eraseWealth();
    }

    // user의 사교성이 silver만큼 증가, 스트레스 감소, 골드 지불
    public void getSilver() {
        user.setSociability(user.getSociability() + silver);
        erasePTSD();
        eraseWealth();
    }

    // user의 사교성이 gold만큼 증가, 스트레스 감소, 골드 지불
    public void getGold() {
        user.setSociability(user.getSociability() + gold);
        erasePTSD();
        eraseWealth();
    }

    // user의 사교성이 diamond만큼 증가, 스트레스 감소, 골드 지불
    public void getDiamond() {
        user.setSociability(user.getSociability() + diamond);
        erasePTSD();
        eraseWealth();
    }

    // user의 예술성이 artMuseum_1만큼 증가, 스트레스 감소, 골드 지불
    public void getArtMuseum_1() {
        user.setArtistry(user.getArtistry() + artMuseum_1);
        erasePTSD();
        eraseWealth();
    }

    // user의 예술성이 artMuseum_2만큼 증가, 스트레스 감소, 골드 지불
    public void getArtMuseum_2() {
        user.setArtistry(user.getArtistry() + artMuseum_2);
        erasePTSD();
        eraseWealth();
    }

    // user의 예술성이 artMuseum_3만큼 증가, 스트레스 감소, 골드 지불
    public void getArtMuseum_3() {
        user.setArtistry(user.getArtistry() + artMuseum_3);
        erasePTSD();
        eraseWealth();
    }

    // user의 스트레스가 eclipse만큼 더 감소, 스트레스 감소, 골드 지불
    public void getEclipse() {
        user.setPTSD(user.getPTSD() - eclipse);
        erasePTSD();
        eraseWealth();
    }

    // user의 스트레스가 puremilkyMacaroon만큼 더 감소, 스트레스 감소, 골드 지불
    public void getPureMilkyMacaroon() {
        user.setPTSD(user.getPTSD() - puremilkyMacaroon);
        erasePTSD();
        eraseWealth();
    }

    // user의 스트레스가 makGookSu만큼 더 감소, 스트레스 감소, 골드 지불
    public void getMakGookSu() {
        user.setPTSD(user.getPTSD() - makGookSu);
        erasePTSD();
        eraseWealth();
    }
}