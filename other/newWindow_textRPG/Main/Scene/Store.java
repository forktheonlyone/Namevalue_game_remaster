package Main.Scene;
import Main.Manager.*;
public class Store extends Scene {
    public void initialize() {

        // 만약 Time값이 21보다 작거나 같을경우
        if (user.getTime() <= 21){
            System.out.println("------------------");
            System.out.println("'뭘살가영마트'에 도착하였습니다.");
            System.out.println("------------------");

            try {
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                // 예외 처리, 오류 e를 잡아
                // 예외 정보 출력
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("------------------");
            System.out.println("사장 김가영: 어서오세요");
            // Time값을 ( 현재 Time + 1 )로 설정
            user.setTime(user.getTime() + 1);}

        // 혹은 만약 Time값이 21보다 클 경우
        else if (user.getTime() > 21){

            System.out.println(" ");
            System.out.println("사장 김가영 : 마감입니다.");

            try { // 시도
                // 1000 millis 동안 구동을 강제정지후 재생
                Thread.sleep(1000);
            // 예외 처리, 오류 e를 잡아
            // 예외 정보 출력
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("시간만 날렸군.");

            try { // 시도
                Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                // 예외 처리, 오류 e를 잡아
                // 예외 정보 출력
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Time값을 ( 현재 Time + 1 )로 설정
            user.setTime(user.getTime() + 1);
            // Scene을 0 으로 설정 = village
            SceneManager.getInstance().setScene(0);}}

    public void update() {

        System.out.println(" ");
        System.out.println("------------------");
        System.out.println("구매 품목을 선택하세요");
        System.out.println("1.물약 (6500 gold  체력 20+ )");
        System.out.println("2.캡사이신(6500 gold  공격력 20+)");
        System.out.println("3.프로틴(7000 gold   최대체력 20+)");
        System.out.println("4.침양환(8000 gold 최대체력 10+, 체력 20+)");
        System.out.println("5.레드불(10000 gold 시간초기화, 체력 20-)");
        System.out.println("6.상황표");
        System.out.println("7.나가기");
        // pick_item은 스캔받은 입력값과 같다
        int pick_item = ScanManager.Scan();

        switch(pick_item){ // 입력값
            case 1: // 입력값 1
                // 만약 Hp값이 MaxHp값보다 크거나 같은 경우
                if(user.getHP() >= user.getMaxHp()){
                    // Hp값을 ( MaxHp )값으로 변경
                    user.setHP(user.getMaxHp());
                    System.out.println("최대체력에 도달했습니다. 당신의 최대체력은 ("+ user.getMaxHp() + ") 입니다.");
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

                // 혹은 만약 Money값이 6500보다 크거나 같을 경우
                else if (user.getMoney() >= 6500) {
                    System.out.println("물약을 구매했습니다. -6500 gold");

                    System.out.println("----------------");
                    System.out.println("체력이 20 회복됩니다.");
                    // Money값을 ( 현재 Money - 6500 )로 변경
                    user.setMoney(user.getMoney() - 6500);
                    // Hp값을 ( 현재Hp + 20 )로 변경
                    user.setHP(user.getHP() + 20);
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    user.render(); // user 상태창 출력
                    try {
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                     // 예외 처리, 오류 e를 잡아
                     // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

                // 혹은 만약 Money값이 6500보다 작을경우
                else if (user.getMoney() < 6500) {
                    System.out.println("돈이 없어요");
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

            case 2: // 입력값 2
                // 만약 Money가 6500보다 크거나 같을경우
                if (user.getMoney() >= 6500) {
                    System.out.println("캡사이신을 구매했습니다. -6500gold");
                    System.out.println("----------------");
                    System.out.println("공격력이 20 증가합니다.");
                    // Money값을 ( 현재 Money값 - 6500 )로 설정
                    user.setMoney(user.getMoney() - 6500);
                    // ATK값을 ( 현재 ATK값 + 20 )로 설정
                    user.setATK(user.getATK() + 20);
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    user.render(); // user 상태창 출력
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }break;} // switch

                // 혹은 만약 Money값이 6500보다 작을경우
                else if (user.getMoney() < 6500) {
                    System.out.println("돈이 없어요");
                    try {
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                     // 예외 처리, 오류 e를 잡아
                     // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

            case 3 : // 입력값 3
                // 만약 Money가 7000보다 크거나 같을경우
                if (user.getMoney() >= 7000){
                    System.out.println("프로틴을 구매했습니다. -7000 gold");
                    System.out.println("----------------");
                    System.out.println("최대 체력이 20 증가합니다.");
                    // Money값을 ( 현재 Money값 - 7000 )로 설정
                    user.setMoney(user.getMoney()- 7000);
                    // MaxHp값을 ( 현재 MaxHp값 + 20 )로 설정
                    user.setMaxHp(user.getMaxHp() + 20);
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    user.render(); // user 상태창 출력
                    try {
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                     // 예외 처리, 오류 e를 잡아
                     // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }break;} // switch 탈출

                // 혹은 만약 Money가 7000보다 작을경우
                else if (user.getMoney() < 7000) {
                    System.out.println("돈이 없어요");
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

            case 4: // 입력값 4
                // 혹은 만약 Money가 8000보다 크거나 같을경우
                if(user.getMoney() >= 8000){
                    System.out.println("침향환을 구매했습니다. -8000gold ");
                    System.out.println("----------------");
                    System.out.println("최대체력이 10 높아지고 체력이 20 회복됩니다.");
                    // Money값을 ( 현재 Money값 - 8000 )로 설정
                    user.setMoney(user.getMoney() - 8000);
                    // HP값을 ( 현재 HP값 + 20 )로 설정
                    user.setHP(user.getHP() + 20);
                    // MaxHp값을 ( 현재 MaxHp값 + 10 )로 설정
                    user.setMaxHp(user.getMaxHp() + 10);
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                     // 예외 처리, 오류 e를 잡아
                     // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    user.render(); // user 상태창 출력
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }break;} // switch 탈출
                // 혹은 만약 Money가 8000보다 작을경우
                else if (user.getMoney() < 8000) {
                    System.out.println("돈이 없어요");
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;} // switch 탈출

            case 5: // 입력값 5
                // 만약 Money가 10000보다 크거나 같을경우
                if(user.getMoney() >= 10000){
                    System.out.println("레드불을 구매했습니다. -10000gold");
                    System.out.println("----------------");
                    System.out.println("가용시간을 초기화 합니다. 대신 체력 -20 감소합니다.");
                    // 당신의 체력: ( 현재HP ) 현재시간: ( 현재Time )
                    System.out.println("당신의 체력: "+ user.getHP()+"  현재시간: "+user.getTime());

                    // Money값을 ( 현재 Money값 - 1000 )로 설정
                    user.setMoney(user.getMoney() - 10000);
                    // Time값을 ( 8 )로 설정
                    user.setTime(8);
                    // HP값을 ( 현재 HP값 - 20 )로 설정
                    user.setHP(user.getHP() - 20);

                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    user.render(); // user 상태창 출력
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }break;} // switch 탈출

                // 혹은 만약 Money가 10000보다 작을경우
                else if (user.getMoney() < 10000){
                    System.out.println("돈이 없어요");
                    try { // 시도
                        Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                      // 예외 처리, 오류 e를 잡아
                      // 예외 정보 출력
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }break;} // switch 탈출

            case 6: // 입력값 6
                user.render(); // user 상태창 출력
                try { // 시도
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                  // 예외 처리, 오류 e를 잡아
                  // 예외 정보 출력
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }break; // switch 탈출

            case 7: // 입력값 7
                System.out.println("나갈래");
                try { // 시도
                    Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
                  // 예외 처리, 오류 e를 잡아
                  // 예외 정보 출력
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
                break;} // switch 탈출

    }public void render()  {}
}