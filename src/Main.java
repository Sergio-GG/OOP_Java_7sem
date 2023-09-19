public class Main {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();

        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        // На примере вакансии для охранника

        Vacancy vac1 = new Vacancy(VacancyType.Security, 20000);
        //Vacancy vac2 = new Vacancy(VacancyType.Master, 55000);
        //Vacancy vac3 = new Vacancy(VacancyType.Cleaner, 5000);
        Vacancy vac4 = new Vacancy(VacancyType.Security, 11000);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Security sec1 = new Security("Stepanich");
        Security sec2 = new Security("Kuzmich");
        Cleaner cleaner1 = new Cleaner("Klava Ignatievna");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(sec1);
        jobAgency.registerObserver(sec2);
        jobAgency.registerObserver(cleaner1);

        for (int i = 0; i < 3; i++){
            google.needEmployee(vac1);
            System.out.println("----------------------------------------------------------------------------");
            //yandex.needEmployee(vac2);
            //geekBrains.needEmployee(vac3);
            geekBrains.needEmployee(vac4);
            System.out.println("############################################################################");
        }

    }

}
