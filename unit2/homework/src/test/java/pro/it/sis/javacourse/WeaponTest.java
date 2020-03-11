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
        System.out.println("Удар по "+ eafritfrit.getName()+" "+ Klinokplameni.getName() + " Физический урон-"+eafritfrit.getPhysicalDamage() + " " +"Огненый урон-"+ eafritfrit.getFireDamage() +" "+
                "Ледяной урон-" + eafritfrit.getIceDamage());

        Klinoklda.hit(eafritfrit);
        System.out.println("Удар по " + eafritfrit.getName()+ " "+ Klinoklda.getName()  + " Физический урон-"+eafritfrit.getPhysicalDamage() + " " +"Огненый урон-"+eafritfrit.getFireDamage()+" "+
                "Ледяной урон-" + eafritfrit.getIceDamage());

        Klinokplameni.hit(iceVelikan);
        System.out.println("Удар по "+ iceVelikan.getName()+" " + Klinokplameni.getName() + " Физический урон-"+iceVelikan.getPhysicalDamage() + " " +"Огненый урон-"+iceVelikan.getFireDamage()+" "+
                "Ледяной урон-" + iceVelikan.getIceDamage());

        Klinoklda.hit(iceVelikan);
        System.out.println("Удар по " + iceVelikan.getName()+ " " + Klinoklda.getName() + " Физический урон-"+iceVelikan.getPhysicalDamage() + " " +"Огненый урон-"+iceVelikan.getFireDamage()+" "+
                "Ледяной урон-" + iceVelikan.getIceDamage());

    }
}


