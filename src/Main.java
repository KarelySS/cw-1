public class Main {
    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Степанова Алиса Михайловна", 1, 74900);
        employee[1] = new Employee("Андреев Павел Степанович", 2, 82400);
        employee[2] = new Employee("Волков Александр Михайлович", 3, 65300);
        employee[3] = new Employee("Никонов Андрей Александрович", 4, 37000);
        employee[4] = new Employee("Жданов Роман Кириллович", 5, 76800);
        employee[5] = new Employee("Мельников Андрей Александрович", 1, 81300);
        employee[6] = new Employee("Егорова Вера Ильинична", 2, 37100);
        employee[7] = new Employee("Трофимова Анастасия Кирилловна", 3, 77200);
        employee[8] = new Employee("Афанасьев Олег Михайлович", 4, 59700);
        employee[9] = new Employee("Михайлов Николай Евгеньевич", 5, 63400);
        getList();
        calculateSum();
        findMinSalary();
        findMaxSalary();
        calculateAverageValue();
        fio();
    }
//Задача №а
    public static void getList() {
        for (Employee worker : employee) {
            System.out.println(worker);
        }
    }
    //Задача №b
    public static int calculateSum() {
        int sum = 0;
        for (Employee worker : employee) {
            sum += worker.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum);
        return sum;
    }
    //Задача №c
    public static void findMinSalary() {
        Employee min = employee[0];
        if (employee[0] != null) {
            int minSalary = employee[0].getSalary();
            for (Employee worker : employee) {
                if (worker.getSalary() < minSalary) {
                    minSalary = worker.getSalary();
                    min = worker;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+min);
    }
    //Задача №d
    public static void findMaxSalary() {
        Employee max=employee[0];
        int maxSalary=employee[0].getSalary();
        for (Employee worker :employee) {
            if (worker.getSalary()>maxSalary) {
                maxSalary= worker.getSalary();
                max=worker;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: "+max);
    }
    //Задача №e
    public static void calculateAverageValue(){
        int sum = 0;
        for (Employee worker : employee) {
            sum += worker.getSalary();
        }
        int averageValue=sum/10;
        System.out.println("Среднее значение: "+averageValue);
    }
    //Задача №f
    public static void fio(){
        for (Employee worker: employee){
            System.out.println(worker.getFio());
        }
    }
}




