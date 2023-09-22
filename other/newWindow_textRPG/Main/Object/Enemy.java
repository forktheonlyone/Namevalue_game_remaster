package Main.Object;

import Main.Object.*;
import Main.Object.Object;
import Main.Manager.*;
import java.util.Random;
import java.util.Scanner;

public class Enemy extends Object { // Object 클래스 상속
        Object user = ObjectManager.getInstance().getUser(); // Object 타입의 user에 ObjectManager.getInstance().getUser() 대입
        int HP_u = user.getHP(); // HP_u에 user.getHP() 값 대입
        int ATK_u = user.getATK(); // ATK_u에 user.getATK() 값 대입

        public Enemy(){} // 기본 생성자

        public void initialize() { // 상속 받아서 추상메서드 재정의
            this.name = getName();
            this.HP=user.Level*200; // Enemy 객체의 HP는 유저 레벨의 곱하기 200
            this.ATK= user.Level*5; // Enmey 객체의 ATK는 유저 레벨의 곱하기 5
            this.EXP= (int) (Math.random() * 30 + 10); // Enemy 객체의 EXP는 10~39의 랜덤값
            this.Money = (int) (Math.random() * 4000 + 10000); // Enemy 객체의 Money는 10000~13999의 랜덤값
        }
        @Override
        public void update() { // 상속 받아서 추상메서드 재정의
            System.out.println("이름 :"+this.name);
            System.out.println("체력 :"+this.HP);
            System.out.println("공격력 :"+this.ATK);
            System.out.println("주는 경험치 :"+this.EXP);
            System.out.println("주는 돈 :"+this.Money);

        }
        public void render(){} // 상속 받아서 추상메서드 재정의
}