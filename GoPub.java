// 작성자 : 송한올
// 2023.09.15
// indev 1.0.9

public class GoPub extends Scene{

    private static GoPub instance = null;
    public static GoPub getInstance() {
        if (instance == null) {
            instance = new GoPub();
        }
        return instance;
    }

    @Override
    public void Menu() {
        System.out.print("\n");
        System.out.println("1. 음식 주문하기 ( 음식을 이용해 체력을 회복하세요. )");
        System.out.println("2. 방을 빌려 침대에서 잠에 들기 ( -15 Gold )");
        System.out.println("3. 마을로 돌아가기");
        System.out.print("\n");
    }

    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan())
        {
            case 1 :
                Restaurant restaurant = new Restaurant();
                restaurant.InRestaurant();
                return Choose();

            case 2 :
                Bill("낡은 침대이지만 포근함 만큼은 집을 생각나게 한다.", 15, 30, "체력을 모두 회복했다!");
                return Choose();

            case 3 :
                System.out.println("마을로 돌아간다.");
                return Govillage.getInstance().FirstChoose();

            default:
                System.out.println("잘못 입력하였습니다.");
                return Choose();
        }
    }

    @Override
    public Scene FirstChoose() {
        System.out.print("\n");
        System.out.println("맥주잔이 부딪히는 소리, 바드의 악기 연주 소리가 들린다.");
        return Choose();
    }
    public void Bill(String info,int pay, int heal, String healInfo)
    {
        if (Player.getPlayer().getGold() >= pay)
        {
            System.out.println(info);
            System.out.print("\n");
            Player.getPlayer().setGold(Player.getPlayer().getGold() - pay);
            Player.getPlayer().hpRecovery(heal);
            System.out.println(healInfo);
        }
        else
        {
            System.out.print("\n");
            System.out.println("===============");
            System.out.println("골드가 부족합니다.");
            System.out.println("===============");
        }
    }
}

