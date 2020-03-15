package pro.it.sis.javacourse;

import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class WeaponTest {

    public static void main(String[] args) {
        Weapon Klinokplameni = new Weapon("Пылающий асфальт", 50, 50, 0);
        Weapon Klinoklda = new Weapon("Меч ночи в якутске", 50, 0, 50);
        Eafrit eafritfrit = new Eafrit();
        IceVelikan iceVelikan = new IceVelikan();

        Klinokplameni.hit(eafritfrit);
        System.out.printf("Удар по %s %s Физический урон-%d Огненый урон-%d Ледяной урон-%d Полный урон %d%n", eafritfrit.getName(), Klinokplameni.getName(), eafritfrit.getPhysicalDamage(), eafritfrit.getFireDamage(), eafritfrit.getIceDamage(), eafritfrit.getAllDamage());

        Klinoklda.hit(eafritfrit);
        System.out.printf("Удар по %s %s Физический урон-%d Огненый урон-%d Ледяной урон-%d Полный урон %d%n", eafritfrit.getName(), Klinoklda.getName(), eafritfrit.getPhysicalDamage(), eafritfrit.getFireDamage(), eafritfrit.getIceDamage(), eafritfrit.getAllDamage());

        Klinokplameni.hit(iceVelikan);
        System.out.printf("Удар по %s %s Физический урон-%d Огненый урон-%d Ледяной урон-%d Полный урон %d%n", iceVelikan.getName(), Klinokplameni.getName(), iceVelikan.getPhysicalDamage(), iceVelikan.getFireDamage(), iceVelikan.getIceDamage(), iceVelikan.getAllDamage());

        Klinoklda.hit(iceVelikan);
        System.out.printf("Удар по %s %s Физический урон-%d Огненый урон-%d Ледяной урон-%d Полный урон %d%n", iceVelikan.getName(), Klinoklda.getName(), iceVelikan.getPhysicalDamage(), iceVelikan.getFireDamage(), iceVelikan.getIceDamage(), iceVelikan.getAllDamage());

    }
}


