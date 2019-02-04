package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
    
    private Outfit theOutfit;
    
    @Autowired
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
