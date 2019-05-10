package pl.stormit;


import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class TimeService {

    public String time(){
        return Long.toString(System.currentTimeMillis());
    }



}
