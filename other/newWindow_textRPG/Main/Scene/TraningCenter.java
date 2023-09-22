package Main.Scene;

import Main.Manager.*;

public class TraningCenter extends Scene {
    // 현재 클래스의 유저는 ObjectManager의 User값과 같다
    public TraningCenter(){this.user = ObjectManager.getInstance().getUser();}


    @Override
    public void initialize() {
        this.name = "스파르타 아현 훈련소";
    } // 여기 이름

    @Override
    public void update() {
        try{
            if(user.getTime() > 21){ // 만약 현재시간이 21보다 크면
                Thread.sleep(1000); // // 1000 millis 동안 구동을 강제정지후 재생
                System.out.println("잠잘 시간 입니다.");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(1); // Scene을 1 으로 설정 = Home 클래스 호출
            } else if(user.getTime() == 21){ // 혹은 현재 시간이 21과 같다면 이라면
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                System.out.println("입장이 불가합니다. 마을로 돌아갑니다.");
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village 클래스 호출
            }else{ // 아니면
                if(user.getMoney() >= 4000){ // 만약 현재Money가 4000보다 작거나 같으면
                    Thread.sleep(2000); // 2000 millis 동안 구동을 강제정지후 재생
                    System.out.println("=======================================================");
                    System.out.println(" 훈련장 메뉴: 1. 정권 찌르기 2. 웨이트 운동 3. 스파링 4. 나가기");
                    System.out.println("=======================================================");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생

                    int choice = ScanManager.Scan(); // int choice는 스캔입력값과 같다
                    switch (choice) { // 매개변수 choice
                        case 1:
                            System.out.println("1. 정권 찌르기");
                            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                            System.out.println("얍얍얍 정권 찌르기 1000번을 실시 합니다.");
                            try {
                                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                                System.out.println("                          ");
                                System.out.println("       ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    ");
                                System.out.println("      ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ");
                                System.out.println("    ▒▒▒▒▒▒|▒▒▒▒|▒▒▒▒|▒▒▒  ");
                                System.out.println("   ▒▒|▒▒▒▒|▒▒▒▒|▒▒▒▒|▒▒▒  ");
                                System.out.println("  ▒▒▒|▒▒▒▒|▒▒▒▒|▒▒▒▒|▒▒▒  ");
                                System.out.println("  ▒▒▒|▒▒▒▒|▒▒▒▒|▒▒▒▒|▒▒   ");
                                System.out.println("   ▒▒▒▒▒▒                 ");
                                System.out.println("                          ");
                            } catch (InterruptedException e) {} // 인터럽트 처리문
                            break;
                        case 2:
                            System.out.println("2. 웨이트 운동 ");
                            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                            System.out.println("으라차차 바위로 웨이트 운동을 실시 합니다. ");
                            try {
                                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                                System.out.println("          ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println(" ▒▒       ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println("    ▒▒    ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println("       ▒▒ ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println(" ▒▒       ");
                                System.out.println(" ▒▒▒▒▒▒▒▒ ");
                                System.out.println("          ");
                            } catch (InterruptedException e) {} // 인터럽트 처리문
                            break;
                        case 3:
                            System.out.println("3. 스파링");
                            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                            System.out.println("가짜 Mob과 스파링을 실시합니다. 얻어 맞는 중입니다.");
                            try {
                                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                                System.out.println("               ");
                                System.out.println("  ▒▒▒▒▒▒  ▒▒   ");
                                System.out.println(" ▒▒    ▒▒ ▒▒   ");
                                System.out.println(" ▒▒    ▒▒ ▒▒▒▒ ");
                                System.out.println(" ▒▒    ▒▒ ▒▒   ");
                                System.out.println("  ▒▒▒▒▒▒  ▒▒   ");
                                System.out.println("   ▒▒▒▒▒▒▒▒▒   ");
                                System.out.println("          ▒▒   ");
                                System.out.println("          ▒▒   ");
                                System.out.println("               ");
                            } catch (InterruptedException e) {} // 인터럽트 처리문
                            break;
                        case 4:
                            System.out.println("4. 나가기");
                            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                        default: // case 1 ~ 4번이 아닐경우
                            break;
                    }
                    // 만약 현재Money가 4000보다 작거나 같으면

                    user.setMoney(Money - 4000); // Money값을 ( 현재 Money - 4,000 ) 으로 변경
                    user.setTime(time + 2); // Time값을 ( 현재 Time + 2 ) 으로 변경
                    user.setATK(ATK + 40); // ATK값을 ( 현재 ATK + 40 ) 으로 변경

                    Thread.sleep(2000); // 2000 millis 동안 구동을 강제정지후 재생
                    System.out.println("산송장이 되긴 싫습니다. 훈련장을 나갑니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("훈련 소요시간: 2시간" + "\n훈련 입장 비용: 4000원");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("공격력이 40만큼 상승 합니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("훈련 완료. 마을로 돌아갑니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = Village 클래스 호출

                }else if (user.getMoney() < 4000){ // 혹은 현재 돈이 4,000 보다 작으면
                    user.setTime(time + 4); // Time값을 ( 현재 time + 4 ) 으로 변경
                    user.setMoney(Money - 4000); // Money값을 ( 현재 Money - 4000 ) 으로 변경
                    user.setATK(ATK + 40); // ATK값을 ( 현재 ATK + 40 ) 으로 변경

                    Thread.sleep(2000); // 2000 millis 동안 구동을 강제정지후 재생
                    System.out.println("!");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("소지금이 모자랍니다. \n패널티 발생: 메뉴를 고를 수 없습니다. \n훈련에 4시간이 소모 됩니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("훈련 소요시간: 4시간" + "\n훈련 입장 비용: 4000원");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("공격력이 40만큼 상승 합니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    System.out.println("훈련 완료. 마을로 돌아갑니다.");
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                    SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = Village 클래스 호출
                }
            }
         // 인터럽트 처리문 -> 발생근원지를 찾아서 단계별로 에러를 출력
        }catch(Exception e) {throw new RuntimeException(e);}
    }
    @Override
    public void render() {
        // (스파르타 아현 훈련소 (윗줄 initialize 참고)) 에 입성 하셨습니다.
        System.out.println(this.name + "에 입성 하셨습니다.");
    }
}