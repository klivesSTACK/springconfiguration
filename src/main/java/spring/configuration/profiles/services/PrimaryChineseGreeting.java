package spring.configuration.profiles.services;

public class PrimaryChineseGreeting implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryChineseGreeting(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getChineseGreeting();
    }
}
