public class Peg {

    private int location;
    private boolean isActive;

    public Peg (int location, boolean isActive) {
            this.location = location;
            this.isActive = isActive;
    }

     public boolean canMoveUp(int location){
        return true;
     }

    public boolean canMoveDown(int location){
        return true;
    }

    public boolean canMoveRight(int location){
        return true;
    }

    public boolean canMoveLeft(int location){
        return true;
    }
}
