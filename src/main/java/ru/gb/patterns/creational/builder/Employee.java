package ru.gb.patterns.creational.builder;

public class Employee {
    private long id;
    private String name;
    private double salary;
    private boolean active;
    private String qualification;

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.salary = builder.salary;
        this.active = builder.active;
        this.qualification = builder.qualification;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    static class EmployeeBuilder {
        private long id;
        private String name;
        private double salary;
        private boolean active;
        private String qualification;

        public EmployeeBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder withActive(boolean active) {
            this.active = active;
            return this;
        }

        public EmployeeBuilder withQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
