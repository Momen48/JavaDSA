import java.util.*;
public class Interface {
    public static void main(String args[]){
        
        Queen q = new Queen();
        q.moves();

        king k = new king();
        k.moves();
    }
}

interface ChessGame{
    void moves();
}

class Queen implements ChessGame{
    public void moves (){
        System.out.println("queen moves all way, any step");
    }
}

class king implements ChessGame{
    public void moves (){
        System.out.println("king moves all way, 1 step");
    }
}

class rook implements ChessGame{
    public void moves (){
        System.out.println("up, down, left, right ny step");
    }
}