package lesson_27_06_2022_composition.object;

public abstract class Planshet extends Computer{
    private RetinaScreen screen;
    private Camera camera;

    public Planshet(String name) {
        super(name);
    }

    public Planshet(double weight, String name) {
        super(weight, name);
    }

    public abstract void navigateByScreen();

    // реализация для всех планшентов
    @Override
    public void on() {
        print("Planshet on");
    }

    @Override
    public void off() {
        print("Planshet off");
    }

    @Override
    public void load() {
        print("Planshet load");
    }

    public void takePhoto(){
        getCamera().takeFoto();
    }

    public Camera getCamera() {
        if (camera==null) camera = new Camera();
        return camera;
    }

    public RetinaScreen getScreen() {
        if (screen==null) screen = new RetinaScreen();
        return screen;
    }
}
