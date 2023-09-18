// 박세진 , 2023.09.11

public class GoDungeon extends Scene {

    public void Menu() {
        DialogManager.getInstance().DungeonMenuDialog();
    }

    public Scene Choose() {
        Menu();
        SceneManager.getInstance().DungeonSelect();
        return null;
    }

    public Scene FirstChoose() {
        return Choose();
    }

}
