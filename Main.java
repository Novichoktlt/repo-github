package lesson4.online;

public class Main {



    public static void main(String[] args) {

//        Employees employees1 = new Employees("Ефремова Наталья Александровна", "директор", "364587", 200000,  40);
//            System.out.println("ФИО: " + employees1.getFullName() + ",     должность: " + employees1.getPosition());




        Employees employees[] = new Employees[5];
        employees[0] = new Employees("Ефремова Наталья Александровна", "директор", "364587", 200000,  40);
        employees[1] = new Employees("Храмцов Георгий Иванович", "водитель", "635481", 40000, 25);
        employees[2] = new Employees("Пеплов Максим Викторович", "водитель", "654287", 40000, 42);
        employees[3] = new Employees("Иванов Вячеслав Игоревич", "сторож", "681581", 40000, 60);
        employees[4] = new Employees("Коннов Геннадий Вячиславович", "водитель", "534225", 40000, 23);


        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getList());
            }

        increaseSalary(employees, 35, 10000);


        System.out.println();





    }
    private static void increaseSalary(Employees[] employees, int age, int increase)
    {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].setSalary(increase);
                System.out.println(employees[i].getList());
            }
        }
    }




}
