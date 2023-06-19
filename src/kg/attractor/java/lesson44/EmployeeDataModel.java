package kg.attractor.java.lesson44;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataModel {
    private List<Employee> employees = new ArrayList<>();


    public EmployeeDataModel() {
        employees = readFile();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> readFile() {
        List<Employee> emplist = new ArrayList<>();
        try {
            Type listType = new TypeToken<ArrayList<Employee>>() {
            }.getType();
            Path path = Paths.get("employees.json");
            String json = Files.readString(path);
            emplist = new Gson().fromJson(json, listType);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return emplist;
    }

    public static class Employee {
        private String firstName;
        private String lastName;
        private String email;
        private String job;
        private String phone;
        private String image;
        private String currentBook;


        public Employee(String firstName, String lastName, String email, String job, String phone, String image, String currentBook) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.job = job;
            this.phone = phone;
            this.image = image;
            this.currentBook = currentBook;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCurrentBook() {
            return currentBook;
        }

        public void setCurrentBook(String currentBook) {
            this.currentBook = currentBook;
        }
    }
}
