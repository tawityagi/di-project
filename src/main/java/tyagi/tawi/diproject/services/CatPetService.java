package tyagi.tawi.diproject.services;

import org.springframework.stereotype.Service;

@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
