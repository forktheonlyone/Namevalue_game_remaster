// 작성자 : 송한올
// 2023.09.13
// indev 0.04

public class GoPub {

    public void PubMenu(Charactor chr)
    {
        System.out.println("맥주잔이 부딪히는 소리, 바드의 악기 연주 소리가 들린다.");
        boolean repeat = true;
        while (repeat)
        {
            System.out.println("1. 음식 주문하기 ( 음식을 이용해 체력을 회복하세요. )");
            System.out.println("2. 방을 빌려 침대에서 잠에 들기 ( -15 Gold )");
            System.out.println("3. 마을로 돌아가기");
            switch (ScannerManager.Scan())
            {
                case 1 :
                    System.out.println("1. 빵 ( -3 Gold ) / ( +5 HP )");
                    System.out.println("2. 스튜 ( -6 Gold ) / ( +10 HP )");
                    System.out.println("3. 칠면조 구이 ( -9 Gold ) / ( +15 HP )");
                    System.out.println("4. 취소");
                    foodMenu(chr);
                    break;
                case 2 :
                    System.out.println("낡은 침대이지만 포근함 만큼은 집을 생각나게 한다.");
                    Bill(chr, 15, 30, "체력을 모두 회복했다!");
                    break;
                case 3 :
                    System.out.println("마을로 돌아간다.");
                    repeat = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;

            }
        }
    }

    private void foodMenu(Charactor chr)
    {
        Player player = new Player(chr.getNickName());
        switch (ScannerManager.Scan())
        {
            case 1 :
                Bill(chr, 3, 5, "5 HP 회복 완료!");
                break;
            case 2 :
                Bill(chr, 6, 10, "10 HP 회복 완료!");
                break;
            case 3 :
                Bill(chr, 9, 15, "15 HP 회복 완료!");
                break;
            case 4 :
                break;

        }
    }
    private void Bill(Charactor chr, int pay, int heal, String healinfo)
    {
        if (((Player)chr).getGold() >= pay)
        {
            ((Player)chr).setGold(((Player)chr).getGold() - pay);
            ((Player)chr).hpRecovery(heal);
            System.out.println(healinfo);
            System.out.println("현재 체력 : " + ((Player)chr).getHp() + "HP");
        }
        else
        {
            System.out.println("골드가 부족합니다.");
        }
    }
}
