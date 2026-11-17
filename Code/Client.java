public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple du cours : Abstract Factory (Exemple 2) ===");

        // Famille Essence
        System.out.println("\n--- Famille Essence ---");
        AbstractFactory fabriqueEssence = new FactoryEssence();
        Scooter scooterEssence = fabriqueEssence.ConstruireScooter();
        Automobile autoEssence = fabriqueEssence.ConstruireAutomobile();
        scooterEssence.methodeScooter();
        autoEssence.methodeAutomobile();

        // Famille Electrique
        System.out.println("\n--- Famille Electrique ---");
        AbstractFactory fabriqueElectrique = new FactoryElectrique();
        Scooter scooterElectrique = fabriqueElectrique.ConstruireScooter();
        Automobile autoElectrique = fabriqueElectrique.ConstruireAutomobile();
        scooterElectrique.methodeScooter();
        autoElectrique.methodeAutomobile();
    }
}
