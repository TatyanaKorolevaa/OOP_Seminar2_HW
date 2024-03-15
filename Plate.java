
public class Plate {

    private int food;

    public Plate(int food) {

        if (food < 0) {
            this.food = 15;
        }
        else {
        this.food = food;
        }

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addPlate(int food){
        if (food > 0) this.food += food;
        
    }

    public void info() {
        System.out.println("Еды в тарелке осталось - " + food);
    }

}
