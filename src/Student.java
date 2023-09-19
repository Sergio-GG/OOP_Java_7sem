public class Student implements Observer{

    private String name;
    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy, String companyName) {
        switch (vacancy.getVacancyType()) {
            case Student:
                if (this.salary <= vacancy.getSalary()) {
                    System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                    this.salary = vacancy.getSalary();
                } else {
                    System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                            name, companyName, salary);
                }
                break;
            default:
                System.out.printf("Студент %s: Эта вакансия %s мне не подходит. (компания: %s; заработная плата: %d)\n",
                        name,vacancy.getVacancyType(), companyName,salary);
                break;
        }
    }
}
