package gipsy.springframework.dependencyinjection.services;

public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
