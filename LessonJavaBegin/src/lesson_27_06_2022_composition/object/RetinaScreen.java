package lesson_27_06_2022_composition.object;

public class RetinaScreen extends ElectronicDevice{
    private int resolutionX;
    private int resolutionY;

    public void showData(){
        print("drawing data on screen");
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public void on() {
        print("Retina init..");
    }

    @Override
    public void off() {
        print("Retina off..");
    }
}
