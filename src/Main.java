public class Main {
    public static void main(String[] args) {
        Employee employees [] = new Employee[10];
        // Данные о сотрудниках
        employees[0] = new Employee( "Иванов", "Иван", "Иванович", (byte) 2, 70_000);
        employees[1] = new Employee("Макаров", "Владимир", "Георгиевич", (byte) 2, 100_000);
        employees[2] = new Employee("Исаев", "Матвей", "Максимович", (byte) 3, 130_000);
        employees[3] = new Employee("Лаптев", "Даниил", "Павлович", (byte) 4, 90_000);
        employees[4] = new Employee("Казакова", "Евгения", "Тимуровна", (byte) 5, 70_000);
        employees[5] = new Employee("Лапшина", "Юлия", "Антоновна", (byte) 4, 70_000);
        employees[6] = new Employee("Казаков", "Виталий", "Игоревич", (byte) 3, 95_000);
        employees[7] = new Employee("Лазарева", "Дарья", "Николаевна", (byte) 1, 130_000);
        employees[8] = new Employee("Максимов", "Александр", "Артурович", (byte) 3, 90_000);
        employees[9] = new Employee("Зотова", "Екатерина", "Валентиновна", (byte) 4, 120_000);

        // Получение списка сотрудников со всеми данными
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ");
        for (int i = 0; i < employees.length; i++) {
            //Employee.id++;
            System.out.println(employees[i]);;
        }
        System.out.println();
        // Сумма затрат на зарплаты в месяц
        double salaryMonthsSum = 0;
        for (int i = 0; i < employees.length; i++) {
            salaryMonthsSum = salaryMonthsSum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");
        System.out.println();
        // Сотрудник с минимальной зарплатой
        double minSalary = employees[0].getSalary();
        String minSalaryEmployee;
        //String minSalaryEmployeeDouble;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        //Второй цикл для поиска всех сотрудников с минимальной зарплатой
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employees[i].toString());
            }
        }
        System.out.println();
        // Сотрудник с максимальной зарплатой
        double maxSalary = employees[0].getSalary();
        String maxSalaryEmployee;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        // Второй цикл для поиска всех сотрудников с максимальной зарплатой
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employees[i].toString());
            }
        }
        System.out.println();
        // Среднее значение зарплат
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum / (employees.length - 1) + " рублей.");
        System.out.println();
        // Ф.И.О. всех сотрудников
        System.out.println("Ф.И.О. всех сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println((employees[i].getLastName().toString() + " " + employees[i].getFirstName().toString() + " " + employees[i].getMiddleName().toString()));
        }
    }
}