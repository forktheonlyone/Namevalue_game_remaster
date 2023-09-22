package Main.Scene;
import Main.Manager.ObjectManager;
import Main.Manager.SceneManager;
import Main.Manager.ScanManager;

import Main.Object.Object;
import java.util.Scanner;
import Main.Manager.*;
import Main.Object.*;
public class Dungeon extends Scene { // Scene 클래스 상속
    private void attacked() {
        while (true) { // 조건이 참인 동안 반복
            System.out.printf("1.공격\t2.도망\n");
            int num = ScanManager.Scan(); // int타입의 변수 num에 ScanManager.Scan() 대입
            switch (num) { // num값 입력
                case 1: // 1번 입력시
                    System.out.println("======================================================");
                    System.out.println("공격!");
                    enemy.setHP(enemy.getHP() - user.getATK()); // 적의 HP는 적의 현재 HP에서 유저의 공격력을 뺀값
                    System.out.println(user.getName() + "가 데미지" + user.getATK() + "을 줬다");
                    System.out.println(enemy.getName() + "의 남은체력 : " + enemy.getHP());
                    System.out.println("아야");
                    user.setHP(user.getHP() - enemy.getATK()); // 유저 HP는 유저 현재 HP에서 적의 공격력을 뺀값
                    System.out.println(enemy.getName() + "(이)가 데미지" + enemy.getATK() + "을 줬다");
                    System.out.println(user.getName() + "의 남은체력:" + user.getHP());
                    System.out.println("======================================================");
                    break;
                case 2:
                    enemy.initialize(); // enemy.initialize 메서드 호출
                    SceneManager.getInstance().setScene(0); // 마을로 이동
                    return;
            }
            if (enemy.getHP() <= 0) { // 적의 HP가 0 이하라면
                System.out.println("몬스터가 죽었습니다.");
                ObjectManager.getInstance().getUser().setMoney(Money + Money_e); // 유저 돈 = 현재 돈 + 몬스터의 돈
                ObjectManager.getInstance().getUser().setEXP(EXP + EXP_e * Level); // 유저 경험치 = 현재 경험치 + 몬스터 경험치 x 몬스터 레벨
                System.out.println(Money_e + "만큼 돈을 얻었습니다.");
                System.out.println(EXP_e * Level + "만큼 경험치를 얻었습니다.");
                enemy.initialize(); // enemey.initialize() 메서드 호출
                try {Thread.sleep(1000);} // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                catch (InterruptedException e) {throw new RuntimeException(e);} // RuntimeException을 강제로 발생시킨다.
                SceneManager.getInstance().setScene(0); // 마을로 돌아간다
                break;
            }
            if (user.getHP() <= 0) { // 유저의 HP가 0 이하라면
                enemy.initialize(); // enemy.initialize() 메서드 호출
                user.setHP(0); // 유저의 HP는 0이 됨
                SceneManager.getInstance().setScene(0); // 마을로 돌아감
                break;
            }
        }
    }

    public void initialize() {
        System.out.println("사냥터는 4시간이 소모됩니다");
        System.out.println("=====================사냥터======================");
        System.out.printf("montser(Level1~5) 1\nmontser(Level6~10) 2\nmonster3(Level11~15 3\n나가기 4\n ");
        if (user.getTime() >= 19) { // 유저의 시간이 19 이상이라면
            System.out.println("==================================================");
            System.out.println("사냥터는 19시이전만");
            SceneManager.getInstance().setScene(0); // 마을로 돌아감
        }
    }

    public void update() {
        int num = ScanManager.Scan(); // int타입의 변수 num에 ScanManager.Scan() 대입
        switch (num) { // num값 입력
            case 1:
                if (Level <= 5) { // 레벨이 5 이하면
                    ObjectManager.getInstance().getEnemy().setName("불"); // 적의 이름은 불
                    System.out.println(
                            " ######    ####    #####    ######     ##       ##    \n" +
                            " ##         ##     ##  ##   ##         ##       ##    \n" +
                            " ##         ##     ##  ##   ##         ##       ##    \n" +
                            " ####       ##     #####    ####       ##       ##    \n" +
                            " ##         ##     ####     ##                        \n" +
                            " ##         ##     ## ##    ##                        \n" +
                            " ##        ####    ##  ##   ######     ##       ##    ");

                    System.out.println("================Enemy==================");
                    enemy.update(); // enemy.update 메서드 호출
                    enemy.initialize(); // enemy.initialize 메서드 호출
                    ObjectManager.getInstance().getUser().setTime(time + 4); // 유저의 시간이 +4
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                        System.out.println("===================User==================");
                        user.render(); // user.render 메서드 호출
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); //  RuntimeException을 강제로 발생시킨다.
                    }
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000);
                        attacked();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // RuntimeException을 강제로 발생시킨다.
                    }

                } else if (Level > 5) { // 레벨이 5보다 높으면
                    System.out.println("이던전은 5Level 이하만가능합니다");
                    SceneManager.getInstance().setScene(2); // 던전으로 감
                    break;
                }
                break;
            case 2:
                if (Level > 5) { // 레벨이 5보다 높으면
                    ObjectManager.getInstance().getEnemy().setName("물"); // 적의 이름은 물
                    System.out.println(
                            " ##   ##    ##     ######   ######   #####      ##       ##    \n" +
                            " ##   ##   ####      ##     ##       ##  ##     ##       ##    \n" +
                            " ##   ##  ##  ##     ##     ##       ##  ##     ##       ##    \n" +
                            " ## # ##  ######     ##     ####     #####      ##       ##    \n" +
                            " #######  ##  ##     ##     ##       ####                      \n" +
                            " ### ###  ##  ##     ##     ##       ## ##                     \n" +
                            " ##   ##  ##  ##     ##     ######   ##  ##     ##       ##    ");

                    System.out.println("================Enemy==================");
                    enemy.update(); // enemy.update 메서드 호출
                    enemy.initialize(); // enemy.initialize 메서드 호출
                    ObjectManager.getInstance().getUser().setTime(time + 4); // 유저의 시간이 4 늘어남
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                        System.out.println("===================User==================");
                        user.render(); // user.render 메서드 호출
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // RuntimeException을 강제로 발생시킨다.
                    }
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                        attacked(); //  attacked 메서드 호출
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // RuntimeException을 강제로 발생시킨다.
                    }
                } else if (Level <= 10) { // 레벨이 5보다 높고 10과 같거나 낮다면
                    System.out.println("이던전은 6Level~10Level 이하만가능합니다");
                    SceneManager.getInstance().setScene(2); // 던전으로 감
                    break;
                }
                break;
            case 3:
                if (Level > 10) { // 레벨이 10보다 높다면
                    ObjectManager.getInstance().getEnemy().setName("땅"); // 적의 이름은 땅
                    System.out.println(
                            " ##         ##     ##  ##   ####       ##       ##    \n" +
                            " ##        ####    ### ##   ## ##      ##       ##    \n" +
                            " ##       ##  ##   ######   ##  ##     ##       ##    \n" +
                            " ##       ######   ######   ##  ##     ##       ##    \n" +
                            " ##       ##  ##   ## ###   ##  ##                    \n" +
                            " ##       ##  ##   ##  ##   ## ##                     \n" +
                            " ######   ##  ##   ##  ##   ####       ##       ##    ");
                    System.out.println("================Enemy==================");
                    enemy.update(); // enemy.update 메서드 호출
                    enemy.initialize(); // enemy.initialize 메서드 호출
                    ObjectManager.getInstance().getUser().setTime(time + 4); // 유저의 시간은 +4 늘어남
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                        System.out.println("===================User==================");
                        user.render();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // RuntimeException을 강제로 발생시킨다.
                    }
                    try { // try 영역에서 발생한 예외 상황은 catch 영역에서 처리
                        Thread.sleep(1000); // 스레드가 1초동안 일시 정지
                        attacked();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // RuntimeException을 강제로 발생시킨다.
                    }
                } else if (Level <= 15) { // 레벨이 10보다 낮고 15 이하라면
                    System.out.println("이던전은 10Level~15Level 이하만가능합니다");
                    SceneManager.getInstance().setScene(2); // 던전으로 감
                    break;
                }
                break;
            case 4:
                System.out.println("나가기");
                SceneManager.getInstance().setScene(0); // 마을로감
                break;
            default:
                System.out.println("다시 선택해주세요");
                break;
        }
    }
    public void render() {}
}