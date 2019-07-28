import java.util.Random;

public class U1  extends Rocket {

    public U1 () {
        setCost(100000000);
        setWeight (10000);
        setMaxCargo (8000);
    }

    @Override
    public boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        setChanceLaunched (0.05 * getTotalWeight() / getMaxCargo());
        if (getChanceLaunched() >= rand) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        setChanceLanded (0.01 * getTotalWeight() / getMaxCargo());
        if (getChanceLanded () >= rand) {
            return false;
        } else {
            return true;
        }
    }

}
