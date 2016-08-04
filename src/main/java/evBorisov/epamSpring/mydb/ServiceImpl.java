package evBorisov.epamSpring.mydb;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Dmitry on 04.08.2016.
 */
@Service
public class ServiceImpl implements DbService {

    @DB(DBType.DERBY)
    private Dao dao;

    @PostConstruct
    public void doWork() {
        System.out.println("I'm service, i use: ");
        dao.crud();
    }
}
