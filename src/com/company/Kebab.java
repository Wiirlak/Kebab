package com.company;

public class Kebab {
    private boolean salade;
    private boolean tomate;
    private boolean oignon;
    private boolean viande;
    private boolean galette;

    public Kebab() {
        defaultKebab();
    }

    public boolean isVegetarian(){
        return !viande;
    }

    public void defaultKebab(){
        salade = true;
        tomate = true;
        oignon = true;
        viande = true;
        galette = false;
    }

    public boolean asSalade() {
        return salade;
    }

    public void setSalade(boolean salade) {
        this.salade = salade;
    }

    public boolean asTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean asOignon() {
        return oignon;
    }

    public void setOignon(boolean oignon) {
        this.oignon = oignon;
    }

    public boolean asViande() {
        return viande;
    }

    public void setViande(boolean viande) {
        this.viande = viande;
    }

    public boolean isGalette() {
        return galette;
    }

    public void setGalette(boolean galette) {
        this.galette = galette;
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "salade=" + salade +
                ", tomate=" + tomate +
                ", oignon=" + oignon +
                ", viande=" + viande +
                ", galette=" + galette +
                '}';
    }
}
