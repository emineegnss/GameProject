package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import MernisService.GGFKPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {

    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        GGFKPSPublicSoap soap = new GGFKPSPublicSoap();
        try {
            return soap.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getGamerName(),gamer.getGamerLastName(),gamer.getDateOfBirth().getYear());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }
}
