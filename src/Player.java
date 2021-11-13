public class Player extends SuperPlayerPc implements MyInterface{
    String name = null;

    Player(){
    }


    @Override
    public int CompareTo(Player player, Computer computer) {
        int myResult;
        if (player.toString().equals("rock") && (computer.toString().equals("paper"))) {
            myResult = -1;
        } else if (player.toString().equals("rock") && (computer.toString().equals("scissor"))) {
            myResult = 1;
        } else if (player.toString().equals("rock") && (computer.toString().equals("rock"))) {
            myResult = 0;
        } else if (player.toString().equals("paper") && (computer.toString().equals("rock"))){
            myResult = 1;
        }else if (player.toString().equals("paper") && (computer.toString().equals("scissor"))) {
            myResult = -1;

        }else if (player.toString().equals("paper") && (computer.toString().equals("paper"))) {
            myResult = 0;

        }else if (player.toString().equals("scissor") && (computer.toString().equals("paper"))){
            myResult = 1;
        }else if (player.toString().equals("scissor") && (computer.toString().equals("rock"))) {
            myResult = -1;
        }else if (player.toString().equals("scissor") && (computer.toString().equals("scissor"))) {
            myResult = 0;
        }
        else{
            System.out.println("Error in CompareTo. Result set to 0.");
            myResult = 0;
        }
        return myResult;
    }

    public void takeTurn(int myInt) {
        this.name = super.TakeTurn(myInt);
    }


    @Override
    public String toString() {
        return this.name;
    }
}


