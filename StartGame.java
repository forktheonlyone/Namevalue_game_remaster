//작성자 홍주형
//작성일자 2023.09.12
//최종수정일자 2023.09.18

public class StartGame {
    public static void main(String[] args) {
        ScannerManager.Initialize();
        DialogManager.getInstance().TitleDialog();
        if (ScannerManager.Scan()==1) {
            SceneManager.getInstance().getStory().FirstChoose();
            }
        else {System.exit(0);}

    }
}
