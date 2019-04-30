package za.ac.cput.Police;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Police.DataAnalyst;
import za.ac.cput.Factory.Police.DataAnalystFactory;

/**
 * Unit test for simple App.
 */
public class DataAnalystFactoryTest
{
    @Test

    public void getDataAnalyst(){

        String daID = "07079";
        String daName = "John";
        String daSurname = "Handcock";
        DataAnalyst dataAnalyst = DataAnalystFactory.getDataAnalyst(daID,daName,daSurname);
        System.out.println(dataAnalyst);
        Assert.assertNotNull(dataAnalyst.getDaID());
        Assert.assertNotNull(dataAnalyst.getDaName());
        Assert.assertNotNull(dataAnalyst.getDaSurname());
    }
}
