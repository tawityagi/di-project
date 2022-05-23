package tyagi.tawi.diproject.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tyagi.tawi.diproject.services.PetService;

@Controller
public class PetController {

    private final PetService petService;

    PetController(PetService petService){
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}