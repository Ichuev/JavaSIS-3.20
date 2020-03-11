package pro.it.sis.javacourse;

public class Eafrit extends Target {

    public Eafrit() {
        super("Ефрит");
    }

    @Override
    public void setFireDamage(int FireDamage) {
        if (FireDamage > 0){

            System.out.println("Урон урон огнем мне непочем");
        } else{

            System.out.println("Будет больно если меня ударят льдом");
        }

    }
}
