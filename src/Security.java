public class Security implements Observer{

    private String name;

    private int salary = 10000;

    public Security(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy, String companyName) {
        switch (vacancy.getVacancyType()) {
            case Security:
                if (this.salary < vacancy.getSalary()) {
                    System.out.printf("Охранник %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                    this.salary = vacancy.getSalary();
                } else {
                    System.out.printf("Охранник %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                }
                break;
            default:
                System.out.printf("Охранник %s: Эта вакансия %s мне не подходит. (компания: %s; заработная плата: %d)\n",
                        name,vacancy.getVacancyType(), companyName,salary);
                break;
        }
    }
}
