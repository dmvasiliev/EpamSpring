package evBorisov.epamSpring.mydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Dmitry on 04.08.2016.
 */
@Service
public class ServiceImpl implements DbService {
    @Autowired
    @Oracle
    private Dao dao;

    @PostConstruct
    public void doWork() {
        System.out.println("I'm service, i use: ");
        dao.crud();
    }
}
