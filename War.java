// 박세진 , 2023.09.11

public class War extends Scene {

    Fight F = new Fight();

    public Scene Choose() {
        DialogManager.getInstance().WarMenuDialog();
        switch (ScannerManager.Scan()) {
            case 1:
                F.AttackSquence(Player.getInstance(),Monster.getInstance());
                return Dead();
            case 2:
                F.Deffence(Player.getInstance(),Monster.getInstance());
                return Dead();
            case 3:
                Runaway();
            default:
                DialogManager.getInstance().WrongDialog();
                return Choose();
        }
    }

    public Scene Dead() {
        if (Player.getInstance().getHp() < 1) {
            System.out.println(Player.getInstance().getNickName() + "의 현재 HP : 0");
            DialogManager.getInstance().BadEnding();
            System.exit(0);
            return null;
        } else if (Monster.getInstance().getHp() < 1) {
            return null;
        } else {
            return Choose();
        }
    }

    public void Menu() {
        DialogManager.getInstance().WarMenuDialog();
    }
    public Scene FirstChoose() {
        DialogManager.getInstance().MobEntranceDialog();
        return Choose();
    }

    public Scene Runaway() {
        if (Monster.getInstance().getNickName().equals("리치왕 아서스 메놀드")) {
            System.out.println("도망칠 수 없음");
            return Choose();
        }
        else
            return SceneManager.getInstance().getVillage().FirstChoose();
    }
}














