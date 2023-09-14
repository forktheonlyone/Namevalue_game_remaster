public abstract class Scene {


    protected boolean Live ;

    public abstract void Menu();

    public abstract void initialize();
    public abstract boolean update();

    public abstract Scene Choose();

    public abstract Scene FirstChoose();
}
