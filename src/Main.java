public class Main {
    public static void main(String[] args) {
        courseWork();
    }
    private static void allEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    private static void salaryMonthsSum(Employee[] array) {
        double salaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            salaryMonthsSum = salaryMonthsSum + array[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");
    }
    private static void minSalaryEmployee(Employee[] array) {
        double minSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minSalary == array[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой: " + array[i].toString());
            }
        }
    }
    private static void maxSalaryEmployee(Employee[] array) {
        double maxSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxSalary == array[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой: " + array[i].toString());
            }
        }
    }
    private static void averageMonthsSalary(Employee[] array) {
        double salaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            salaryMonthsSum = salaryMonthsSum + array[i].getSalary();
        }
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum / (array.length - 1) + " рублей.");
    }
    private static void allNames(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i].getLastName().toString() + " " + array[i].getFirstName().toString() + " " + array[i].getMiddleName().toString()));
        }
    }
    private static void salaryIndex20(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].setSalary(array[i].getSalary() * 1.2);
        }
    }
    public static void courseWork() {
        Employee employees[] = new Employee[10];
        // Данные о сотрудниках
        employees[0] = new Employee("Иванов", "Иван", "Иванович", (byte) 2, 70_000);
        employees[1] = new Employee("Макаров", "Владимир", "Георгиевич", (byte) 2, 100_000);
        employees[2] = new Employee("Исаев", "Матвей", "Максимович", (byte) 3, 100_000);
        employees[3] = new Employee("Лаптев", "Даниил", "Павлович", (byte) 4, 130_000);
        employees[4] = new Employee("Казакова", "Евгения", "Тимуровна", (byte) 5, 70_000);
        employees[5] = new Employee("Лапшина", "Юлия", "Антоновна", (byte) 1, 70_000);
        employees[6] = new Employee("Казаков", "Виталий", "Игоревич", (byte) 3, 95_000);
        employees[7] = new Employee("Лазарева", "Дарья", "Николаевна", (byte) 1, 130_000);
        employees[8] = new Employee("Максимов", "Александр", "Артурович", (byte) 5, 90_000);
        employees[9] = new Employee("Зотова", "Екатерина", "Валентиновна", (byte) 4, 120_000);

        // Получение списка сотрудников со всеми данными
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ");
        allEmployees(employees);
        System.out.println();
        // Сумма затрат на зарплаты в месяц
        salaryMonthsSum(employees);
        System.out.println();
        // Сотрудник с минимальной зарплатой
        minSalaryEmployee(employees);
        System.out.println();
        // Сотрудник с максимальной зарплатой
        maxSalaryEmployee(employees);
        System.out.println();
        // Среднее значение зарплат
        averageMonthsSalary(employees);
        System.out.println();
        // Ф.И.О. всех сотрудников
        System.out.println("Ф.И.О. всех сотрудников:");
        allNames(employees);
        System.out.println();
        // Задания повышенной сложности
        // Увеличение зарплат на 20 %
        salaryIndex20(employees);
        System.out.println();
    }
}