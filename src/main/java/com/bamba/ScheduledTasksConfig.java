package com.bamba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduledTasksConfig {

    @Autowired
    private final RemoteAPIService remoteApiService;

    @Autowired
    private final PersonService personService;

    public ScheduledTasksConfig(RemoteAPIService remoteApiService, PersonService personService) {
        this.remoteApiService = remoteApiService;
        this.personService = personService;
    }

    @Scheduled(cron = "0 9 12 * * 3") // Planifie la tâche pour s'exécuter tous les mardis à 20h28
    private void yourTaskMethod() {
//        this.remoteApiService.callRemoteAPI();
        Person person = new Person();
        person.setFirstName("Bamba");
        person.setLastName("Diagne");
        this.personService.savePerson(person);
       System.out.println("Test jobb....");
    }
}
