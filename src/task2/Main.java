package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Student[] allStudents = {
                new Student("Atai","male", "Atai@gmail.com"),
                new Student("Gulbara","female", "Grlmf@gmail.com"),
                new Student("Dastan","male", "Dastan@gmail.com"),
                new Student("Kanykei","female", "Kan@gmail.com"),
                new Student("Bektur","male", "Bektur@gmail.com"),
                new Student("Alina","female", "Alina@gmail.com"),
                new Student("Kayrat","male", "KAI@gmail.com"),
                new Student("Uluk","male", "Ulukmanapo@gmail.com"),
                new Student("Akyl","male", "Akyl@gmail.com"),
                new Student("Aliman","female", "aliman@gmail.com"),
                new Student("Dima","male", "Dima@gmail.com"),
                new Student("Keremet","female", "Kira@gmail.com"),
                new Student("Baysalbek","male", "BAYsale@gmail.com"),
                new Student("Arina","female", "Arinaaaaa@gmail.com"),
                new Student("Khalem","male", "Khalem@gmail.com"),
                new Student("Usman","male", "Usman@gmail.com"),
                new Student("Dima","male", "Dima@gmail.com"),
                new Student("Keremet","female", "Kira@gmail.com"),
                new Student("Baysalbek","male", "BAYsale@gmail.com"),
                new Student("Alina","female", "Alina@gmail.com"),
                new Student("Kayrat","male", "KAI@gmail.com"),
                new Student("Uluk","male", "Ulukmanapo@gmail.com"),
        };

        Group[] groups = {
                new Group("Java-15",new Student[]{   new Student("Atai","male", "Atai@gmail.com"),
                        new Student("Gulbara","female", "Grlmf@gmail.com"),
                        new Student("Dastan","male", "Dastan@gmail.com"),
                        new Student("Kanykei","female", "Kan@gmail.com"),
                        new Student("Bektur","male", "Bektur@gmail.com"),
                        new Student("Alina","female", "Alina@gmail.com"),
                        new Student("Kayrat","male", "KAI@gmail.com"),
                        new Student("Uluk","male", "Ulukmanapo@gmail.com"),}),
                new Group("Java-12",new Student[]{ new Student("Akyl","male", "Akyl@gmail.com"),
                        new Student("Aliman","female", "aliman@gmail.com"),
                        new Student("Dima","male", "Dima@gmail.com"),
                        new Student("Keremet","female", "Kira@gmail.com"),
                        new Student("Baysalbek","male", "BAYsale@gmail.com"),
                        new Student("Arina","female", "Arinaaaaa@gmail.com"),
                        new Student("Khalem","male", "Khalem@gmail.com"),
                        new Student("Usman","male", "Usman@gmail.com"),})
        };
        Group[] groups1 = {new Group("SMM",new Student[]{ new Student("Dima","male", "Dima@gmail.com"),
                new Student("Karina","female", "Kira@gmail.com"),
                new Student("Bakyt","male", "bakyt@gmail.com"),
                new Student("Akylai","female", "Akyl@gmail.com"),
                new Student("Janar","male", "janar@gmail.com"),
                new Student("Ilim","male", "ILIM@gmail.com"), })};


       Mentor[] mentor ={
               new Mentor("Urmat","male", "Taichikov@gmail.com",groups),
               new Mentor("Aslan", "male", "Aslan@gmail.com",groups1)
       };

       Peaksoft peaksoft = new Peaksoft("Peaksoft", "Гражданская 119",mentor,allStudents);

        //баардык студенттер
        peaksoft.getAllStudents();
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");

        //метордун информациясы жана анын студенттери
        peaksoft.getMentorsInfo("Urmat");
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");

        //студентти аты менен информациясын табуу
        peaksoft.getStudentByName("alina");
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");

        //жалан кыздарды чыгарган метод
        peaksoft.onlyFemaleOrMale("female");
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");

        //менторду mail аркылуу табуу
        peaksoft.searchByMentorEmail("Aslan@gmail.com");
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");

        //сортировка
        peaksoft.sortByStudentName();
        System.out.println("}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{");


    }
}
