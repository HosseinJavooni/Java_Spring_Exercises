package Optional;

import java.util.Date;

public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    NationalCode nationalCode;

    public Person(String firstName, String lastName, int age, String email, NationalCode nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.nationalCode = nationalCode;
    }

    public NationalCode getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(NationalCode nationalCode) {
        this.nationalCode = nationalCode;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static class NationalCode{
        String nationalId;
        Long birthDate;

        public NationalCode(String nationalId, Long birthDate){
            this.nationalId = nationalId;
            this.birthDate = birthDate;
        }

        public String getNationalId() {
            return nationalId;
        }

        public void setNationalId(String nationalId) {
            this.nationalId = nationalId;
        }

        public Long getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Long birthDate) {
            this.birthDate = birthDate;
        }
    }
}
