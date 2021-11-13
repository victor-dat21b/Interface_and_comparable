public class GameController {
    private Player myPlayer;
    private Computer myComputer;


    public GameController(){
        this.myPlayer = new Player();
        this.myComputer = new Computer();
    }


    public void setPlayer(String sendText){
        this.myPlayer = new Player();
    }

    public void setComputer(String sendText){
        this.myComputer = new Computer();

    }

    public Player getPlayer(){
        return this.myPlayer;
    }

    public boolean checkPlayerTurn(){
        if (this.myPlayer.name == null){
            return true;
        } else{
            return false;
        }
    }




    }

