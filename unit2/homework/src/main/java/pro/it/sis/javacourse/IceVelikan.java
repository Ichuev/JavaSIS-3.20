package pro.it.sis.javacourse;

public class IceVelikan extends Target {

    public IceVelikan() {
        super("Ледяной Великан");
    }

    @Override
    public void setIceDamage(int IceDamage) {
        if (IceDamage > 0){

            System.out.println("Урон ледяным мечом не наносит по мне урон");
        } else{

            System.out.println("Будет больно если меня ударят огнем");
        }

    }
}
