//작성자 홍주형
//작성일자 2023.09.11
//최종수장 2023.09.12


public class GoVillage extends Scene {


    @Override
    public void Menu() {
        DialogManager.getInstance().VillageMenuDialog();
    }

    @Override
    public Scene Choose() {
        Menu();
        SceneManager.getInstance().VillageMoveSelect();

        return null;
    }

    @Override
    public Scene FirstChoose() {
        Player.getPlayer().Status();
        DialogManager.getInstance().VillageBackGround();
        return Choose();
    }
}