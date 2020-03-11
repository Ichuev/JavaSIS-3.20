package pro.it.sis.javacourse;

public class Target {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;
    protected String name;

    public Target(String name) {
        this.name = name;
    }

    public void setPhysicalDamage(int PhysicalDamage) {
        physicalDamage = PhysicalDamage;
    }

    public void setFireDamage(int FireDamage) {
        fireDamage = FireDamage ;
    }

    public void setIceDamage(int IceDamage) {
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

    public String getName() {
        return name;
    }

}