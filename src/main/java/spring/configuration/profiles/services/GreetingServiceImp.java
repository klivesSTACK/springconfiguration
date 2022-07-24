package spring.configuration.profiles.services;

public class GreetingServiceImp implements GreetingService {

    public static final String HELLO_WORLD = "Hello world! -Original";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
