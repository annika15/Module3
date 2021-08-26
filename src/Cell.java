public class Cell {
    public int strength;
    public int x;
    public int y;
    public int id;

    public Cell(int strength, int x, int y, int id){
        if (strength > 0){
            this.strength = strength;
        } else{
            this.strength = 0;
        }
        if (x >= 0){
            this.x = x;
        } else{
            this.x = 0;
        }
        if (y >= 0){
            this.y = y;
        } else{
            this.y = 0;
        }
        if (id >= 0){
            this.id = id;
        } else{
            this.id = 0;
        }
    }

    public Cell(){
        this.strength = 0;
        this.x = 0;
        this.y = 0;
        this.id = 0;
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){
    }
}
