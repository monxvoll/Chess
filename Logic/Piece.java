package Logic;

public abstract class Piece {
    //Cuando la ficha es blanca la variable es true
    protected boolean color = true;
    //EL nombre es el mismo tipo de ficha
    protected String name = "";
    //Ubicacion en la matriz, eje x
    protected int ubicationX = 0;
    //Ubicacion en la matriz, eje x
    protected int ubicationY = 0;

    //Getters
    public boolean getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public int getUbicationX(){
        return ubicationX;
    }
    public int getUbicationY(){
        return ubicationY;
    }


    //Setters
    public void setColor(boolean color){
        this. color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUbicationX(int ubicationX){
        this.ubicationX = ubicationX;
    }
    public void setUbicationY(int ubicationY){
        this.ubicationY = ubicationY;
    }

    //Metodo
    public abstract int movePiece();

    //Constructor
    public Piece(boolean color, String name, int ubicationX, int ubicationY) {
        this.color = color;
        this.name = name;
        this.ubicationX = ubicationX;
        this.ubicationY = ubicationY;

    }
    public Piece() {
    }
}
