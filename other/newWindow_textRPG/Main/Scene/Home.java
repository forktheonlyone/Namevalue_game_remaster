package Main.Scene;
import Main.Manager.*;
public class Home extends Scene {
    @Override
    public void initialize(){
        System.out.println("------------------");
        System.out.println("숙소에 도착 하였습니다.");
        System.out.println("------------------");
        if(user.getMoney() >= 15000){ // 만약 플레이어가 소지중인 돈이 15,000이 같거나 크면
            // Time값을 ( 현재 Time + 1 )로 설정
            user.setTime(user.getTime() + 1);
            // Money값을 ( 현재 Money - 15000 )로 설정
            user.setMoney(user.getMoney() - 15000);
            try {
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
            } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
            }
            System.out.println(" ");
            System.out.println("숙박료를 결제하였습니다.");
            System.out.println("-15000 gold");
            try {
                Thread.sleep(500); // 500 millis 동안 구동을 일시정지후 재생
            } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
            }
        }

        else if(user.getMoney() < 15000){ // 혹은 플레이어가 소지중인 돈이 15,000 보다 작을경우
            System.out.println(" ");
            System.out.println("돈이 없어요");
            System.out.println(" ");
            try {
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
            } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
            }
            System.out.println("시간만 날렸군.");
            try {
                Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
            } catch (InterruptedException e) {// 예외 처리, 오류 e를 잡아
                throw new RuntimeException(e);// 예외를 RuntimeException에 떠넘기기
            }
            // Time값을 ( 현재 Time + 1 )로 설정
            user.setTime(user.getTime() + 1);
            SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village
        }
    }
    @Override
    public void update(){
        int Home_do = ScanManager.Scan(); // int Home_do = 스캔매니저 입력받은값
        switch(Home_do){
            case 1: // 1 입력 받을시
                // 만약 Time값이 24보다 같거나 작으면 &(그리고)& Time값이 19보다 같거나 크면
                if (user.getTime() <= 24 && user.getTime() >= 19) {
                    System.out.println("잠을 잡니다.");
                    System.out.println(" ");
                    System.out.println("커어어어어어어어어");

                    // for ( i 는 0이고 i가 8보다 작을때까지 반복하며 i는 1씩 증감
                    for (int i = 0; i < 8; i++) {
                        System.out.println("어");
                        try {
                            Thread.sleep(200); // 200 millis 동안 구동을 강제정지후 재생
                        } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                            throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                        }
                    }
                    System.out.println("쿨쿨쿨");
                    // Time값을 (8)로 설정
                    user.setTime(8);
                    // HP값을 ( 현재 HP + 5 )로 설정
                    user.setHP(user.getHP() + 5);
                    // Day값을 ( 현재 Day + 1 )로 설정
                    user.setDay(user.getDay() + 1);

                    try {
                        Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                        throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                    }
                    System.out.println(" ");
                    System.out.println("잘 자고 다음날 일어났습니다. 현재시간 8시");
                    System.out.println(" ");
                    System.out.println("피로가 회복되고 상처가 아물었습니다");
                    System.out.println("------------------------------");
                    System.out.println("체력 + 5 ");
                    System.out.println("------------");
                    try {
                        Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                        throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                    }
                    break;}

                else if(time < 19){ // 혹은 시간이 19보다 작을때
                    System.out.println("아직 잘시간이 아닙니다.");
                    try {
                        Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                    } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                        throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                    }
                    break;}

            case 2: // 2 입력 받을시
                System.out.println("샤워를 시작합니다.");
                System.out.println(" ");
                try {
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                    throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                }
                System.out.println("쏴아아아ㅏㅇ아아아아아아아");
                System.out.println("ㅡㅡㅡㅡㅁㅡㅡㅡ");
                System.out.println("ㅣㅣㅣㅣㅣㅣㅣㅣㅣ");
                // i는 0이고 i는 9가 될때까지 반복하며 i는 1씩 증감된다.
                for(int i = 0 ; i < 10; i++){
                    System.out.println("/////////////");
                    try {
                        Thread.sleep(200); // 200 millis 동안 구동을 강제정지후 재생
                    } catch (InterruptedException e) {// 예외 처리, 오류 e를 잡아
                        throw new RuntimeException(e);// 예외를 RuntimeException에 떠넘기기
                    }
                }

                try {
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                    throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                }
                System.out.println("샤워가 끝났습니다.");
                System.out.println("----------------");
                user.setTime(user.getTime() + 1); // 시간을 ( 현재시간 + 1 ) 로 설정
                user.setHP(user.getHP() + 5); // 플레이어의 체력을 ( 현재체력 + 5 ) 로 설정
                System.out.println("몸이 개운해 졌습니다. 체력 +5 , 1시간이 소요되었습니다");
                try {
                    Thread.sleep(500); // 500 millis 동안 구동을 강제정지후 재생
                } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
                    throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
                }
                user.render(); // render() 호출
                break; // switch 탈출

            case 3: // 3 입력 받을시
                SceneManager.getInstance().setScene(0); // Scene을 0 으로 설정 = village 클래스 호출
                System.out.println("나갈래");
                break;} // switch 탈출
    }
    @Override
    public void render(){
        try {
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
        } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
            throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
        }
        System.out.println("------------");
        System.out.println("현재상태");
        System.out.println("공격력: " + user.getATK()); // 현재 플레이어의 ATK 값
        System.out.println("돈 : " + user.getMoney()); // 현재 플레이어의 Money 값
        System.out.println("체력 : " + user.getHP()); // 현재 플레이어의 HP 값
        System.out.println("최대체력 : " + user.getMaxHp()); // 현재 플레이어의 최대체력 값
        System.out.println("시간 : " + user.getTime()); // 현재 플레이어의 시간 값
        System.out.println("생존일 수 : " + user.getDay()); // 현재 플레이어의 날짜 값
        System.out.println("현재 EXP : " + user.getEXP()); // 현재 플레이어의 경험치 값
        System.out.println("현재 레벨 : " + user.getLevel()); // 현재 플레이어의 레벨 값
        try {
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
        } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
            throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
        }
        // Home 클래스의 메뉴안내 출력문
        System.out.println(" ");
        System.out.println("뭘할까요?");
        System.out.println("------------------");
        System.out.println("1. 자기");
        System.out.println("2. 사워하기(1시간)");
        System.out.println("3. 나가기");
        try {
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
        } catch (InterruptedException e) { // 예외 처리, 오류 e를 잡아
            throw new RuntimeException(e); // 예외를 RuntimeException에 떠넘기기
        }
    }
}