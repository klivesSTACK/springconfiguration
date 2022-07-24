package spring.configuration.profiles.services;

public interface GreetingRepository {

    String getPrimaryGreeting();
    String getJapaneseGreeting();
    String getChineseGreeting();
}
