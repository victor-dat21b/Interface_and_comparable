public class Computer extends SuperPlayerPc implements MyInterface {
    String name;

    Computer(){
    }


    @Override
     public int CompareTo(Player player, Computer computer){
      return 0;
    }


    public String takeTurn(int myInt) {
        return super.TakeTurn(myInt);
    }


    @Override
    public String toString() {
        return this.name;
    }
}

