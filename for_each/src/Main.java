import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tablicaStringow = new ArrayList<String>();
        //  .add dodaje element do listy
        tablicaStringow.add("cat");
        tablicaStringow.add("dog");
        tablicaStringow.add("hamster");
// for each <- przechodzi po wszystkich elementach zbioru np. listy

        for (String stringu : tablicaStringow) {  // dla każdego stringu w tablicyStringow, zrób to poniżej

            System.out.println(stringu);  // cat, dog

        }


    }
}
