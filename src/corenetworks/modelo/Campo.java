package corenetworks.modelo;

public class Campo {
    private int x;

    public int mostrar(){
        return  x;
    }

    public void increntar(){
        x++;
    }

    public Campo() {
    }

    public Campo(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
