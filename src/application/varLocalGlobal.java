package application;

public class varLocalGlobal {
    /*Essa é uma variável global, pois está fora da main, podendo ser utilizada em todo codigo.*/
    int itsGlobal;

    public static void main(String[] args) {
        /*Essa é uma variável local, pois esta dentro da main, podendo ser utilizada apenas dentro da main.*/
        int itsLocal = 2;

        System.out.println(itsLocal);
    }
}
