public class SuperPlayerPc {

    public String TakeTurn(int choice) {
        String myResult = null;
        if (choice == 1){
        myResult = "rock";
        }else if (choice == 2){
        myResult = "paper";
        }else if (choice == 3){
        myResult = "scissor";
        }
        return myResult;
    }
}
