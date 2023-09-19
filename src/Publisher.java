
public interface Publisher {

    void sendVacancy(Vacancy vacancy, String companyName);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
