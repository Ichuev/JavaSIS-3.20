package pro.it.sis.javacourse;

public class Damage {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;
    Damage (int PhysicalDamage, int FireDamage, int IceDamage) {

        physicalDamage = PhysicalDamage;
        fireDamage = FireDamage;
        iceDamage = IceDamage;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }
}

