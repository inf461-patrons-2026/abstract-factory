public class FactoryEssence extends AbstractFactory {
    @Override
    public Scooter ConstruireScooter() {
        return new ScooterEssence();
    }

    @Override
    public Automobile ConstruireAutomobile() {
        return new AutomobileEssence();
    }
}
