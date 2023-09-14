public class SceneManager {
    private static SceneManager instance = null;

    public static synchronized SceneManager getInstance(){
        if(instance == null)
            instance = new SceneManager();
        return instance;
    }

    private Scene sceneState;
    private boolean check = false;

    public boolean isCheck() {return check;}
    public void setCheck(boolean check) {this.check = check;}

    /*
    public void goPub() {
        GoPub gopub = GoPub.getInstance();
        gopub.PubMenu();
    }

    public void goSmith() {
        GoPub gosmith = GoPub.getInstance();
        gosmith.PubMenu();
    }

    public void goDungeon() {
        GoPub godungeon = GoPub.getInstance();
        godungeon.PubMenu();
    }
*/


    public void setScen(int id){

        switch (id) {
            case 1 -> sceneState = new GoPub();
            case 2 -> sceneState = new GoSmith();
            case 3 -> sceneState = new GoDungeon();
            default -> System.out.println("다시 입력해주세요");
        }
    }



    public void update(){
        boolean result = sceneState.Live;
        if(result)
            SceneManager.getInstance().setCheck(false);
    }


}
