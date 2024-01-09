public class interface1 {

    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();
        q.color();
        
    }

}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right diagonalin all direction ");
    }

    void color(){
        System.out.println("Black");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up down left right ");
    }

}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up down left right diagonal at one step ");
    }

}