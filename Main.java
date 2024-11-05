//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;

class Helloworld {
    public static void main(String[] args) {
        User youngUser = new User();
        youngUser.name = "Aditya S";
        youngUser.birthDay = LocalDate.parse("2004-10-21");
        System.out.printf("%s was born back in %s and he is now %d years old. ", youngUser.name,
                youngUser.birthDay.toString(), youngUser.age());

        User olderUser= new User();

        olderUser.name="Aditya Singh senior";
        olderUser.birthDay=LocalDate.parse("1975-02-19");

        System.out.printf("%s was born back in %s and he is now %d years old.",olderUser.name,olderUser.birthDay.toString(),olderUser.age());
    }

    }

