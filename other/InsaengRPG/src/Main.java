import Scene.Ending;
import MainUpdate.MainUpdate;
import Manager.*;
import Scene.Scene;

public class Main {
    public static void main(String[] args) {

        MainUpdate main = new MainUpdate();
        main.initialize();

        while(SceneManager.getInstance().getTurn() > 0)
        {
            int mainTurn = SceneManager.getInstance().getTurn();
            mainTurn = --mainTurn;
            SceneManager.getInstance().setTurn(mainTurn);
            main.render();
            main.update();
        }

        Scene e  = new Ending();
        e.render();

    }
}
