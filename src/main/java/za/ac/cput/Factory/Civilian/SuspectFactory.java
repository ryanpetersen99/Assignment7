package za.ac.cput.Factory.Civilian;

import za.ac.cput.Domain.Civilian.Suspect;

public class SuspectFactory {

    public static Suspect getSuspect(String suspectID,String suspectName,String suspectSurname,String suspectAccusation){
        return new Suspect.Builder().suspectID(suspectID).suspectName(suspectName).suspectSurname(suspectSurname).suspectAccusation(suspectAccusation).build();
    }
}
