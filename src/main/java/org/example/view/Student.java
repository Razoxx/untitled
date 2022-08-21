package org.example.view;

public class Student {
    int numberStudentTicket;
    String name;
    String surname;
    int yearStudy;
    int gradeMath;
    int gradeEconomy;
    int gradeLanguage;
    float averageRating;


}

class StudentTest{
    public static void main(String[] args) {

        Student Student1 = new Student();

        Student1.numberStudentTicket = 10;
        Student1.name = "Vasiliy ";
        Student1.surname = "Popov";
        Student1.yearStudy = 2010;
        Student1.gradeMath = 5;
        Student1.gradeEconomy = 2;
        Student1.gradeLanguage = 3;
        Student1.averageRating = Student1.gradeEconomy + Student1.gradeLanguage + Student1.gradeMath ;
        Student1.averageRating  = Student1.averageRating / 3;


        System.out.println( "Номер студенческого: " + Student1.numberStudentTicket);
        System.out.println("ФИО студента: " + Student1.name + Student1.surname );
        System.out.println("Год обучения: " + Student1.yearStudy);
        System.out.println("Средняя оценка по предметам " + Student1.averageRating);

        System.out.println("");

        Student Student2 = new Student();

        Student2.numberStudentTicket = 11;
        Student2.name = "Vitaliy ";
        Student2.surname = "Pupkin";
        Student2.yearStudy = 2013;
        Student2.gradeMath = 2;
        Student2.gradeEconomy = 4;
        Student2.gradeLanguage = 5;
        Student2.averageRating = Student2.gradeEconomy + Student2.gradeLanguage + Student2.gradeMath;
        Student2.averageRating  = Student2.averageRating / 3;


        System.out.println( "Номер студенческого: " + Student2.numberStudentTicket);
        System.out.println("ФИО студента: " + Student2.name + Student2.surname );
        System.out.println("Год обучения: " + Student2.yearStudy);
        System.out.println("Средняя оценка по предметам " + Student2.averageRating);

        System.out.println("");

        Student Student3 = new Student();

        Student3.numberStudentTicket = 12;
        Student3.name = "Oleg ";
        Student3.surname = "Potapov";
        Student3.yearStudy = 2015;
        Student3.gradeMath = 4;
        Student3.gradeEconomy = 4;
        Student3.gradeLanguage = 5;
        Student3.averageRating = Student3.gradeEconomy + Student3.gradeLanguage + Student3.gradeMath;
        Student3.averageRating  = Student3.averageRating / 3;

        System.out.println("Номер студенческого: " + Student3.numberStudentTicket);
        System.out.println("ФИО студента: " + Student3.name + Student3.surname );
        System.out.println("Год обучения: " + Student3.yearStudy);
        System.out.println("Средняя оценка по предметам " + Student3.averageRating);
    }
}