public class Main {
    public static void main(String[] args) {
        courseWork();
    }
    private static void allEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    private static double salaryMonthsSum(Employee[] array) {
        double salaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            salaryMonthsSum = salaryMonthsSum + array[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryMonthsSum + " рублей.");
        return salaryMonthsSum;
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
        System.out.println("Среднее значение зарплат: " + salaryMonthsSum(array) / (array.length - 1) + " рублей.");
    }
    private static void allNames(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i].getLastName().toString() + " " + array[i].getFirstName().toString() + " " + array[i].getMiddleName().toString()));
        }
    }
    // Методы повышенной сложности
    private static void salaryIndex(Employee[] array, double index) {
        for (int i = 0; i < array.length; i++) {
            array[i].setSalary(array[i].getSalary() * index);
        }
    }
    private static void departmentEmployeesMinSalary(Employee[] array, byte departmentNumber) {
        double minSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < minSalary && array[i].getDepartment() == departmentNumber) {
                minSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
             if (minSalary == array[i].getSalary() && array[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с минимальной зарплатой: " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
             }
        }
    }
    private static void departmentEmployeesMaxSalary(Employee[] array, byte departmentNumber) {
        double maxSalary = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > maxSalary && array[i].getDepartment() == departmentNumber) {
                maxSalary = array[i].getSalary();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxSalary == array[i].getSalary() && array[i].getDepartment() == departmentNumber) {
                System.out.println("Сотрудник отдела №" + departmentNumber + " с максимальной зарплатой: " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
            }
        }
    }
    private static double departmentSalaryMonthsSum(Employee[] array, byte departmentNumber) {
        double departmentSalaryMonthsSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                departmentSalaryMonthsSum = departmentSalaryMonthsSum + array[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum + " рублей.");
        return departmentSalaryMonthsSum;
    }
    private static void departmentAverageMonthsSalary(Employee[] array, byte departmentNumber) {
        byte x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                x++;
            }
        }
        System.out.println("Среднее значение зарплат в отделе №" + departmentNumber + ": " + departmentSalaryMonthsSum(array, departmentNumber) / x + " рублей.");
    }
    private static void departmentEmployees(Employee[] array, byte departmentNumber) {
        String result = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                result = "EmployeeFound";
                System.out.println("Сотрудник отдела №" + departmentNumber + ": " + "id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " +
                        array[i].getMiddleName() + " Зарплата " + array[i].getSalary() + " рублей.");
            }
        }
        if (result == null) {
            System.out.println("Выбранного отдела не существует");
        }
    }
    private static void departmentSalaryIndex(Employee[] array, byte departmentNumber, double index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == departmentNumber) {
                array[i].setSalary(array[i].getSalary() * index);
            }
        }
    }
    private static void employeesSalaryLessThan(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < number) {
                System.out.println("id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " + array[i].getMiddleName() + " Зарплата: " + array[i].getSalary() + " рублей.");
            }
        }
    }
    private static void employeesSalaryMoreThan(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() >= number) {
                System.out.println("id:" + array[i].getId() + " " + array[i].getLastName() + " " + array[i].getFirstName() + " " + array[i].getMiddleName() + " Зарплата: " + array[i].getSalary() + " рублей.");
            }
        }
    }
    public static void courseWork() {
        Employee employees[] = new Employee[10];
        // Данные о сотрудниках
        employees[0] = new Employee("Иванов", "Иван", "Иванович", (byte) 5, 70_000);
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
        // Увеличение зарплат в index раз
        salaryIndex(employees, 1.2);
        System.out.println();
        // Сотрудники выбранного отдела с минимальной зарплатой
        departmentEmployeesMinSalary(employees, (byte) 5);
        System.out.println();
        // Сотрудники выбранного отдела с максимальной зарплатой
        departmentEmployeesMaxSalary(employees, (byte) 5);
        System.out.println();
        // Сумма затрат в месяц на зарплаты по отделу
        departmentSalaryMonthsSum(employees, (byte) 5);
        System.out.println();
        // Среднее значение зарплат в выбранном отделе
        departmentAverageMonthsSalary(employees, (byte) 5);
        System.out.println();
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
        departmentSalaryIndex(employees, (byte) 3, 1.3);
        System.out.println();
        // Список сотрудников выбранного отдела
        departmentEmployees(employees, (byte) 5);
        System.out.println();
        // Получение всех сотрудников с зарплатой меньше заданного числа
        System.out.println("Все сотрудники с зарплатой меньше заданного числа:");
        employeesSalaryLessThan(employees, 130_000);
        System.out.println();
        // Получение всех сотрудников с зарплатой больше или равной заданному числу
        System.out.println("Все сотрудники с зарплатой больше или равной заданному числу:");
        employeesSalaryMoreThan(employees, 130_000);
        System.out.println();
    }
}