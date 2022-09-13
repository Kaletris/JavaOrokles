package orokles;

public class Main {
    public static void main(String[] args) {
        Asztal a = new Asztal();
        for (int i = 0; i < 3; i++){
            Jatekos j = new Jatekos();
            a.addJatekos(j);
        }
        for (int i = 0; i < 3; i++) {
            a.kor();
        }
    }
}
