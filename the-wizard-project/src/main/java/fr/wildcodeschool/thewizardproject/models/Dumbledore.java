package fr.wildcodeschool.thewizardproject.models;



public class Dumbledore implements WizardInterface {
    
    private Outfit theOutfit;
    
    public Dumbledore() {}
    public Dumbledore( Outfit aOutfit ) {
        super();
        this.theOutfit = aOutfit;
    }

    @Override
    public String giveAdvice() {
        return "No dress for you!";
    }

    @Override
    public String changeDress() {
       return this.theOutfit.typeDress();

    }

}
