package pl.stormit;


import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class GreeterFacade {

    @Inject
    private TimeService timeService;

    public String time(){
        return timeService.time();
    }

    @PostConstruct
    public void init(){
        System.out.println("Hello from PostConstruct :-)");
    }

}
