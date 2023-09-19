//작성자 : 송한올
//작성일 : 23.09.19
//최종 : 23.09.19

public class GameStory extends Scene{
    @Override
    public void Menu() {
        DialogManager.getInstance().GameStoryMenu();
    }

    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan())
        {
            case 1 :
                return SceneManager.getInstance().getVillage().FirstChoose();
            case 2 :
                break;
        }
        return null;
    }

    @Override
    public Scene FirstChoose() {
        DialogManager.getInstance().GameStoryDialog();
        return Choose();
    }
}
