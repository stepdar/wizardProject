package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {
    
    private Outfit theOutfit;
    
    @Autowired
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
