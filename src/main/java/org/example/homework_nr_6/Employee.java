package org.example.homework_nr_6;

public class Employee {

    public static void main(String[] args){
        Employee employee = new Employee("Serghei", 26, "Java");
        System.out.println(employee);
    }

        private String name;
        private Integer age;
        private String department;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }


    }

