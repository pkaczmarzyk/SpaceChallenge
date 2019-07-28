public class Rocket implements SpaceShip {

    private int cost ;
    private int weight ;
    private int maxCargo;
    private int cargo;

    private double chanceLaunched;
    private double chanceLanded;

    public Rocket (){
        cargo = 0;
        chanceLaunched = 0.00;
        chanceLanded = 0.00;
    }

    public int getCost () {
        return cost;
    }

    public int getWeight () {
        return weight;
    }

    public int getMaxCargo () {
        return maxCargo;
    }

    public int getCargo () {
        return cargo;
    }

    public double getChanceLaunched () {
        return chanceLaunched;
    }

    public double getChanceLanded () {
        return chanceLanded;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public void setMaxCargo (int maxCargo) {
        this.maxCargo = maxCargo;
    }

    public void setCargo (int cargo) {
        this.cargo = cargo;
    }

    public void setChanceLaunched (double chanceLaunched) {
        this.chanceLaunched = chanceLaunched;
    }

    public void setChanceLanded (double chanceLanded) {
        this.chanceLanded = chanceLanded;
    }

    public boolean launch () {
        return true;
    }

    public boolean land () {
        return true;
    }

    public boolean canCarry (Item item) {
        if (getCargo () + item.getWeight() <= maxCargo) {
            return true;
        } else {
            return false;
        }
    }

    public void carry (Item item) {
        setCargo (getCargo() + item.getWeight());
    }

    // waga całej rakiety z ładunkiem
    public int getTotalWeight () {
        return getWeight() + getCargo();
    }

}
