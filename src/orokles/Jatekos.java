package orokles;

public class Jatekos {
    protected Asztal asztal;

    public void  lep(){
        System.out.println("Kor: " + asztal.getKor() + ", Tet: " + asztal.getTet());
    }

    public void setAsztal(Asztal a){
        asztal = a;
    }
}
