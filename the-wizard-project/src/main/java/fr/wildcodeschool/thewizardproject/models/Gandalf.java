package fr.wildcodeschool.thewizardproject.models;



public class Gandalf implements WizardInterface {
    
    private Outfit theOutfit;
    
    
    public Gandalf() {
        super();
        
    }

    public Gandalf( Outfit theOutfit ) {
        super();
        this.theOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        
        return "wear your black dress! it is superb";
    }

    @Override
    public String changeDress() {
        return this.theOutfit.typeDress();

    }

}
