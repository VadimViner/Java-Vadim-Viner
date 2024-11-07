public class Person {
    String name;
    String position;
    String email;
    String phone;
    long salary;
    int age;

    public Person(String empName, String empPosition, String empMail, String empPhone, long empSalary, int empAge) {
        this.name = empName;
        this.position = empPosition;
        this.email = empMail;
        this.phone = empPhone;
        this.salary = empSalary;
        this.age = empAge;
    }

    public void getPerson() {
        System.out.println("Сотрудник: " + name + ", должность: " + position + ", эл.адрес: " + email + ", телефон: " + phone + ", оклад: " + salary + ", возраст " + age);
    }

    public static void main(String[] arg) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@gmail.com", "89877656543", 30000, 30);
        persArray[1] = new Person("Petrov Pyotr", "Driver", "pepyotr@gmail.com", "89877656545", 30000, 31);
        persArray[2] = new Person("Sidorov Viktor", "Writer", "siviktor@gmail.com", "89877656546", 31000, 32);
        persArray[3] = new Person("Ivanova Nina", "Engineer", "ivnina@gmail.com", "89877656547", 32000, 33);
        persArray[4] = new Person("Dow Jones", "Cook", "drdow@gmail.com", "89877656540", 34000, 35);

        for (Person perArr : persArray) {
            perArr.getPerson();
        }
    }
}
