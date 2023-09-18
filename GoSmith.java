// 작성자 : 송한올
// 23.09.18
// indev v1.0.10

public class GoSmith extends Scene {

    public int[][] gear = {{4,6,8}, {1,2,3}};
    public int[][] upgradeGold = {{50,100,150}, {30,60,90}};
    private int Lv[] = {0,0};

    @Override
    public void Menu() {
        DialogManager.getInstance().SmithUpgradeMenu();
        DialogManager.getInstance().GoBackTownDialog();
    }
    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan()) {
            case 1:
                Upgrade(0);
                return Choose();
            case 2:
                Upgrade(1);
                return Choose();
            case 3:
                return SceneManager.getInstance().getVillage().FirstChoose();
            default:
                DialogManager.getInstance().WrongDialog();
                return Choose();
        }
    }
    @Override
    public Scene FirstChoose() {
        DialogManager.getInstance().SmithBackGround();
        return Choose();
    }
    private void Upgrade(int i) {
        int lv = Lv[i];
        if (Lv[i] == 3)
        {
            DialogManager.getInstance().BSmithCannotDialog();
        }
        else if (Player.getPlayer().GoldCost(upgradeGold[i][lv])) {
            Player.getInstance().setAtk(gear[i][lv]);
            DialogManager.getInstance().SmithUpgradeDialog(i);
            Lv[i]++;
        }
    }
}




