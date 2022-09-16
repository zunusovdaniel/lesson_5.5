public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(645);
        boss.setProtection("Маг");
        System.out.println(boss.getDamage() + " " + boss.getHealth() + " " + boss.getProtection());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage() + " " + createHeroes()[i].getHealth() +
                    " " + createHeroes()[i].getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero Carl = new Hero(100, 50);
        Hero Moana = new Hero(100, 80);
        Hero Mark = new Hero(120, 40, "Маг");
        Hero[] hero = {Carl, Moana, Mark};
        return hero;

    }
}