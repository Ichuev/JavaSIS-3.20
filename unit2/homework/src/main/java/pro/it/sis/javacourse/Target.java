package pro.it.sis.javacourse;

public class Target {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;
    private int allDamage;
    protected String name;

    public Target(String name) {
        this.name = name;
    }

    public void setAllDamage (int allDamage){
        this.allDamage = allDamage;
    }

    public int getAllDamage() {
        allDamage = physicalDamage + fireDamage + iceDamage;
        return allDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage += physicalDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage += fireDamage ;
    }

    public void setIceDamage(int iceDamage) {
        this.iceDamage += iceDamage;
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