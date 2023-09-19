public class Vacancy {

    private VacancyType vacancyType;

    private String vacName;
    private int salary;

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public int getSalary() {
        return salary;
    }

    public Vacancy(VacancyType vacancyType, int salary) {
        this.vacancyType = vacancyType;
        this.salary = salary;
    }
}
