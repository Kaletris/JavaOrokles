package orokles;

import java.util.Random;

public class Asztal {
    private final Jatekos[] jatekosok = new Jatekos[10];
    private int jatekosSzam = 0;
    private double tet;
    private int kor = 0;
    private final Random random = new Random();
    private double goal = random.nextDouble() * 100;

    public void ujJatek(){
        kor = 0;
        goal = random.nextDouble() * 100;
    }

    public void addJatekos(Jatekos j){
        j.setAsztal(this);
        jatekosok[jatekosSzam] = j;
        jatekosSzam++;
    }

    public int getKor(){
        return kor;
    }

    public void emel(double d){
        tet += d;
    }

    public void kor(){
        if(tet > goal){
            System.out.println("Vege a jateknak");
            return;
        }

        for (int i = 0; i < jatekosSzam; i++){
            jatekosok[i].lep();
            if(tet > goal * 1.1){
                System.out.println("" + (i + 1) + ". jatekos nyert");
                break;
            }
            else if(tet > goal){
                System.out.println("Mindenki veszített");
                break;
            }
        }
        System.out.println("Tet: " + tet);
    }

    public double getTet(){
        return tet;
    }
}
