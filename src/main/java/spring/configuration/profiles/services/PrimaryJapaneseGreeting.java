package spring.configuration.profiles.services;

public class PrimaryJapaneseGreeting implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryJapaneseGreeting(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getJapaneseGreeting();
    }
}
