public class Cleaner implements Observer{

    private String name;

    private int salary = 5000;

    public Cleaner(String name) {
        this.name = name;
    }


    @Override
    public void receiveOffer(Vacancy vacancy, String companyName) {
        switch (vacancy.getVacancyType()) {
            case Cleaner:
                if (this.salary <= vacancy.getSalary()) {
                    System.out.printf("Уборщица %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                    this.salary = vacancy.getSalary();
                } else {
                    System.out.printf("Уборщица %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                }
                break;
                default:
                    System.out.printf("Уборщица %s: Эта вакансия %s мне не подходит. (компания: %s; заработная плата: %d)\n",
                            name,vacancy.getVacancyType(), companyName,salary);
                    break;
        }
    }



}
