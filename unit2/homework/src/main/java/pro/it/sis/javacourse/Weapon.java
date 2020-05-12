package pro.it.sis.javacourse;

public class Weapon {

    private String name;
    private Damage dealtDamage;

    public Weapon(String name, Damage dealtDamage){
        this.name = name;
        this.dealtDamage = dealtDamage;
    }

    public Weapon(String name, int PhysicalDamage, int FireDamage, int IceDamage) {
        this.name = name;
        this.dealtDamage = new Damage(PhysicalDamage, FireDamage, IceDamage);
    }

    void hit(Target target) {
        target.setPhysicalDamage(this.dealtDamage.getPhysicalDamage());
        target.setFireDamage(this.dealtDamage.getFireDamage());
        target.setIceDamage(this.dealtDamage.getIceDamage());
    }
    public String getName() {
        return name;
    }
}