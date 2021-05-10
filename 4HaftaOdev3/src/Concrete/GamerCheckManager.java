package Concrete;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;

import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        return true;
    }
}
