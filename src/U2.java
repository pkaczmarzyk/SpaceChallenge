import java.util.Random;

public class U2 extends Rocket {


    public U2 () {
        setCost(120000000);
        setWeight (18000);
        setMaxCargo (11000);
    }


    @Override
    public boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        setChanceLaunched (0.04 * getTotalWeight() / getMaxCargo());
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
        setChanceLanded (0.08 * getTotalWeight() / getMaxCargo());
        if (getChanceLanded () >= rand) {
            return false;
        } else {
            return true;
        }
    }


}
