package Main.Object;

import Main.Object.*;
import Main.Scene.*;
import Main.Manager.*;

import java.util.Random;

public class Boss extends Object { // 오브젝트 클래스 상속
    Object user = ObjectManager.getInstance().getUser(); // 객체 생성하고 user에 대입

    public Boss() {} // 기본 생성자

    public void initialize() { // 상속 받아서 추상메서드 재정의
        this.name = "마 왕";   // 인스턴스의 name,HP,ATK에 각각 마왕,300,50 대입
        this.HP = 300;
        this.ATK = 50;
    }

    public void update() { // 상속 받아서 추상메서드 재정의
        System.out.println(user.name + ": 전투 태세 돌입" + "\n [마 왕]과 전투를 시작 합니다.");
        try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
            while (true) { // 조건이 참인 동안 반복
                if (user.getHP() > 0 && HP > 0) { // 유저의 HP와 몬스터 HP가 0보다 높으면
                    HP = HP - user.getATK();      // 몬스터 HP는 HP에서 유저의 공격력 만큼 뺀값이다
                    user.setHP(user.getHP() - ATK);  // 유저의 HP는 현재 HP에서 몬스터의 공격력 만큼 뺀값

                    Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                    System.out.println("\n전투 진행중...");
                    Thread.sleep(1000);
                    System.out.println("*** " + user.name + " " + "(이)가 공격 합니다.");
                    Thread.sleep(1000);
                    System.out.println("[마 왕]이" + " " + user.name + " " + "의 공격을 받았습니다.");
                    Thread.sleep(1000);
                    System.out.println(name + "의 남은 체력: " + HP);
                    Thread.sleep(1000);
                    if(HP<=0) {                                    // 몬스터 HP가 0 이하면
                        System.out.println("[마 왕]: 난 죽어따!");  // << 출력문 호출
                    }
                    else { // 몬스터 HP가 0보다 높다면
                        System.out.println("[마 왕]: 공격은 다 한건가? 가소롭군.");
                        System.out.println("\n전투 진행중...");
                        Thread.sleep(1000);
                        System.out.println("[마 왕]의 공격으로 인해 체력이 50 하락 합니다.");
                        Thread.sleep(1000);
                        System.out.println(user.name + ": ..윽! 몸에 상처가...");
                        Thread.sleep(1000);
                        System.out.println(user.name + "의 남은 체력: " + user.HP);
                    }
                } else if ((user.getHP() <= 0) && HP > 0) { // 유저의 HP는 0 이하고 몬스터 HP는 0보다 높으면
                    System.out.println(user.name + " " + "당신은 사망 하였습니다."+"\n게임이 종료 됩니다.");
                    Thread.sleep(1000);
                    System.exit(0); // 게임은 종료
                    break;
                } else if (HP <= 0) { // 몬스터 HP가 0 이하면
                    System.out.println("!");
                    Thread.sleep(1000);
                    System.out.println("[마 왕]: .. 강한 상대군, 인정 하지." + user.name + " " + "너의 승리다.");
                    Thread.sleep(1000);
                    System.out.println("★☆★☆★ 유후~ 축하드립니다. [마 왕]을 처치 하였습니다. ★☆★☆★");
                    Thread.sleep(1000);
                    System.out.println();
                    Thread.sleep(1000);
                    System.out.println();
                    Thread.sleep(1000);
                    System.out.println("     ▒▒▒▒▒▒▒         ▒▒▒▒       ▒▒▒▒      ▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒     ▒▒▒▒▒▒▒▒    ▒▒            ▒▒▒▒▒▒▒▒▒▒       ▒▒▒▒       ▒▒▒▒▒▒▒▒▒▒      ▒▒▒▒ ");
                    System.out.println("   ▒▒       ▒▒      ▒▒  ▒▒      ▒▒ ▒▒    ▒▒ ▒▒    ▒▒            ▒▒           ▒▒            ▒▒              ▒▒  ▒▒      ▒▒        ▒▒    ▒▒▒▒ ");
                    System.out.println("   ▒▒       ▒▒     ▒▒    ▒▒     ▒▒  ▒▒  ▒▒  ▒▒    ▒▒            ▒▒           ▒▒            ▒▒             ▒▒    ▒▒     ▒▒        ▒▒    ▒▒▒▒ ");
                    System.out.println("   ▒▒       ▒▒    ▒▒      ▒▒    ▒▒   ▒▒▒▒   ▒▒    ▒▒            ▒▒           ▒▒            ▒▒            ▒▒      ▒▒    ▒▒        ▒▒    ▒▒▒▒ ");
                    System.out.println("   ▒▒             ▒▒▒▒▒▒▒▒▒▒    ▒▒    ▒▒    ▒▒    ▒▒▒▒▒▒▒▒▒▒    ▒▒           ▒▒            ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒      ▒▒▒▒ ");
                    System.out.println("   ▒▒     ▒▒▒▒    ▒▒      ▒▒    ▒▒    ▒▒    ▒▒    ▒▒            ▒▒           ▒▒            ▒▒            ▒▒      ▒▒    ▒▒        ▒▒    ▒▒▒▒ ");
                    System.out.println("   ▒▒       ▒▒    ▒▒      ▒▒    ▒▒          ▒▒    ▒▒            ▒▒           ▒▒            ▒▒            ▒▒      ▒▒    ▒▒        ▒▒         ");
                    System.out.println("   ▒▒       ▒▒    ▒▒      ▒▒    ▒▒          ▒▒    ▒▒            ▒▒           ▒▒            ▒▒            ▒▒      ▒▒    ▒▒        ▒▒    ▒▒▒▒ ");
                    System.out.println("     ▒▒▒▒▒▒▒      ▒▒      ▒▒    ▒▒          ▒▒    ▒▒▒▒▒▒▒▒▒▒     ▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒    ▒▒      ▒▒    ▒▒        ▒▒    ▒▒▒▒ ");
                    System.exit(0); // 게임 종료
                    break;
                }
            }
        } catch(Exception e) {throw new RuntimeException(e);} //  RuntimeException을 강제로 발생시킨다.
    }

    public void render () { // 상속 받아서 추상메서드 재정의
        System.out.println("--------------! 경고 !---------------");
        System.out.println("====================================");
        System.out.println(" 레  벨: " + "측정 불가");
        System.out.println(" 이  름: " + name);
        System.out.println(" 체  력: " + HP);
        System.out.println(" 공격력: " + ATK);
        System.out.println("====================================");
    }
}