package ext;

import computer.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("cv")
public class DaoImplCapteur implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version capteur");
        double data=77;
        return data;

    }
}
