// 작성자 : 송한올
// 2023.09.18
// indev v1.0.11

public class GoPub extends Scene{

    @Override
    public void Menu() {
        DialogManager.getInstance().PubMenuDialog();
    }

    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan())
        {
            case 1 :
                SceneManager.getInstance().getRestaurant().FirstChoose();
                return Choose();

            case 2 :
                Player.getPlayer().GoldCost(15);
                Bill("낡은 침대이지만 포근함 만큼은 집을 생각나게 한다.", 30, "체력을 모두 회복했다!");
                return Choose();

            case 3 :
                DialogManager.getInstance().GoBackTownDialog();
                return SceneManager.getInstance().getVillage().FirstChoose();

            default:
                DialogManager.getInstance().WrongDialog();
                return Choose();
        }
    }

    @Override
    public Scene FirstChoose() {
        DialogManager.getInstance().PubBackGround();
        return Choose();
    }
    public void Bill(String info, int heal, String healInfo)
    {
        System.out.println(info);
        System.out.print("\n");
        Player.getPlayer().hpRecovery(heal);
        System.out.println(healInfo);
    }

}

