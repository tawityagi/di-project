package tyagi.tawi.diproject.controllers;

import tyagi.tawi.diproject.services.PetService;

public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}