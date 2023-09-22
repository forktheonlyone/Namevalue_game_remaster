package Main.Object;
import Main.Manager.*;
import java.util.Random;

public class User extends Object{
    // 주인공의 기본 스텟 설정
    public void initialize(){
        HP = 100;
        Money = 15000;
        MaxHp = 120;
        ATK = 120;
        time = 8;
        Day = 10; // ??? 시작하자마자 마왕 만남
        Level = 10;
        EXP = 0;
        name ="광!유!";
    }
    // 보스와의 전투로 가기
    public void update(){boss_day();}
    // 상태창 출력
    public void render(){
        System.out.println("용사 :"+name);
        System.out.println("생존일: "+Day);
        System.out.println("현재 시각: "+time);
        System.out.println("레벨: "+Level);
        System.out.println("경험치: "+EXP);
        System.out.println("최대체력: "+MaxHp);
        System.out.println("체력: "+HP);
        System.out.println("공격력: "+ATK);
        System.out.println("소지금: "+Money);
        tired();        // <상태이상 : 피곤함> 확인
        Low_Health();   // 체력이 낮은지 확인
        Level_Up();     // 경험치량을 보고 자동 레벨업
        MaxHealth();    // 체력이 꽉 차있는지 확인
        Creditor();     // 빚이 많은지 확인
    }

    // 체력 상태를 말해주거나 죽을 경우 부활 혹은 게임오버 시킴
    public void Low_Health(){
        // 체력이 50 ~ 25%인 경우
        if(this.HP < 50 && this.HP >= 25){
            System.out.println("와 좀 아픈데..?");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 0.5초 지연
            System.out.println("체력이 절반 이하입니다.");
            System.out.println(" ");
        }// 체력이 25 ~ 5%인 경우
        else if(this.HP < 25 && this.HP >= 5){
            System.out.println("아ㅏㅇ아아 잠시만");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 0.5초 지연
            System.out.println("체력이 25%미만입니다. 위험합니다.");
            System.out.println(" ");
        }// 죽은 경우
        else if(HP <= 0 ){
            System.out.println(" ");
            System.out.println("껰");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 2초 지연
            System.out.println("죽었습니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 0.5초 지연

            // 죽을 때마다 레벨, 경험치를 잃고 체력이 1이 됨
            System.out.println("죽음으로인해 레벨과 경험치가 소실됩니다.");
            Level -= 1;
            EXP = 0;
            HP = 1;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 0.5초 지연
            // 레벨이 0인 경우(부활이 불가능해 진 경우) 게임오버
            if(Level == 0){
                System.out.println("영원한 죽음을 맞이했습니다.");
                SceneManager.getInstance().setScene(7);
            }
        }
    }
    // 24시 이후로도 계속 깨어 있을 경우 자동 취침(디버프 추가)
    // 25 이상의 시간이 나오지 않도록 하는 멤버 메소드
    public void tired(){
        // 시간이 24시 이상(?)일 경우(24시에서 0시로 바뀌는 걸 해결)
        if (time >= 24){
            System.out.println("수면 부족으로 기절하였습니다. ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
            // 시간을 15시로, 현재 체력 -50%, 하루 지남
            time = 15;
            HP >>= 2;
            Day ++;
            System.out.println("------------------------");
            System.out.println("피곤에 쩔어 늦게 일어났습니다.");
            System.out.println("15시 기상 + 체력 - 50%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
            // 상태창 출력
            System.out.println("생존일: "+Day);
            System.out.println("현재 시각: "+time);
            System.out.println("레벨: "+Level);
            System.out.println("경험치: "+EXP);
            System.out.println("최대체력: "+MaxHp);
            System.out.println("체력: "+HP);
            System.out.println("공격력: "+ATK);
            System.out.println("소지금: "+Money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
        }
    }
    // 회복한 체력이 최대 체력보다 클 경우 조정
    // 최대 체력일 경우 출력
    public void MaxHealth(){
        if (HP > MaxHp) {
            System.out.println("최대 체력에 도달했습니다. 당신의 최대 체력: "+ getMaxHp());
            HP = MaxHp;
        }
    }
    // 레벨 업할 경험치가 있다면 경험치를 소모하여 최대 체력이나 공격력을 상승
    public  void Level_Up(){
        // (레벨 * 50) 이상의 경험치를 지닌 경우
        if(EXP > 50 * Level || EXP == 50 * Level){
            Level += 1;             // 레벨 증가
            EXP -= 50 * (Level-1);  // 경험치 소모
            System.out.println("레벨이 올랐습니다");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
            System.out.println("얻고싶은 보상을 선택하세요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
            System.out.println("1. 최대체력 +");
            System.out.println("2. 공격력 +");
            // 레벨 업 보상을 선택
            int input = ScanManager.Scan();
            switch (input) {
                case 1 : { // 최대 체력 상승 +(레벨*10)
                    System.out.println("최대 체력 이 (" + Level * 10 + ") 만큼 증가 하였습니다.");
                    MaxHp += (Level * 10);
                    break;
                }
                case 2 : { // 공격력 상승 +(레벨*10)
                    System.out.println("공격력이 (" + Level * 10 + ") 만큼 증가 하였습니다.");
                    ATK += (Level * 10);
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
        }
    }
    // 보스와 싸우는 날이 되는 경우 전투 돌입 혹은 도망(패널티?, 날짜 초기화, 마을 복귀)
    public void boss_day() {
        // 10 ~ 15일인 경우
        if (Day >= 10 && Day <= 15) {
            Random random = new Random();
            int Boss_day = random.nextInt(100); // 0 ~ 99의 난수
            try {Thread.sleep(2000);
                // 2초 지연
                // ??? 항상 True임 -> 난수 생성 왜?
                if (Boss_day < 100) {
                    System.out.println("\n앗 보스를 만나따" + "\n최종 보스 이승석[마 왕]이 등장 했습니다.\n");
                    Thread.sleep(2000); // 2초 지연
                    // 보스 상태창 출력
                    ObjectManager.getInstance().getBoss().render();
                    System.out.println("1. 난 물러서지 않지. 싸우자!! "+ "2. 비겁하게.. 도망치기..");
                    // 전투 선택지
                    int choice = ScanManager.Scan();
                    switch (choice) {
                        case 1: // 보스 공격하기를 선택
                            System.out.println("보스와 싸우기를 선택 하셨습니다.");
                            Thread.sleep(2000); // 2초 지연
                            // 보스와의 전투에 돌입(while 문)
                            ObjectManager.getInstance().getBoss().update();
                            break;
                        case 2: // 도망치기를 선택
                            System.out.println("'RUN'을 선택 하셨습니다.");
                            Thread.sleep(1000);
                            System.out.println("미친듯이 도망칩니다. \n패널티가 부여 됩니다.");
                            Thread.sleep(2000);
                            // 말로만 레벨이 감소하고 실제로 감소 안함
                            System.out.println("패널티: 레벨이 1만큼 하락 합니다." + "\n현재 레벨: " + (Level - 1));
                            Thread.sleep(1000);
                            // 날짜가 1일로 돌아감
                            System.out.println("앗 첫날로 돌아가버려따");
                            Day = 1;
                            // 마을로 돌아감
                            SceneManager.getInstance().setScene(0);
                            break;
                        default:
                            // 입력 오류 시 출력
                            System.out.println("잘못 입력 하셨습니다?");
                    }
                }
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
    // 빚이 있는 경우 시간이 낭비 되고 체력이 까이기도 함
    public void Creditor() {
        // 빚이 1~10000원 인 경우
        if (Money <= -1 && Money >= -10000) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 0.5초 지연
            System.out.println("채무 불이행으로 돈쟁이들이 찾아와서 협박당했습니다.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 2초 지연
            // ??? 낭비되기 전 시간이 출력됨
            System.out.println("시간이 1시간 낭비당했습니다. 현재시간: " + time);
            time++; // 1시간 낭비
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
        }
        else if (Money < -10000 ){ // 빚이 10000원보다 큰 경우
            System.out.println("채무불이행으로 돈쟁이들이 찾아와서 구타당했습니다.");
            try {Thread.sleep(2000);}
            catch (InterruptedException e)
            {throw new RuntimeException(e);}
            // 2초 지연
            System.out.println("채부 불이행으로 돈쟁이들에게 1시간동안 구타당했습니다.");
            // ??? 낭비되기 전 시간과 줄어들기 전의 체력이 출력
            System.out.println("현재시간" + time + "현재 체력" + HP);
            time++;     // 1시간 낭비
            HP -= 20;   // 체력 20 감소
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // 1초 지연
        }
    }
}