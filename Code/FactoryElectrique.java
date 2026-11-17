public class FactoryElectrique extends AbstractFactory {
    @Override
    public Scooter ConstruireScooter() {
        return new ScooterElectrique();
    }

    @Override
    public Automobile ConstruireAutomobile() {
        return new AutomobileElectrique();
    }
}
