//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задача 1
         byte age =18;
        if ( age >=18) {
            System.out.println("Если возраст человека равен " + age +" он совершеннолетний" );

        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
            // задача 2
             byte temperature = 23;
             if(temperature<=5) {
                System.out.println("На улице холодно, нужно надеть шапку");

             }
             else
             {
                 System.out.println("Сегодня тепло, можно идти без шапки");
             }
             // задача 3
         int speed = 62;
             if (speed>60)
             {
                 System.out.println("Если скорость " + speed + " придется заплатить штраф");
             }
             else {
                 System.out.println("Если скорость " + speed + " можно ездить спокойно");
             }
             //задача 4

             if(age>=2 && age<=6)
             {
                 System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в сад.");
             }
             else if(age>=7 && age<=17)
             {
                 System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу.");
             }
              else if(age>=18 && age<=24)
             {
                 System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет.");
             }
             else {
                 System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу.");
             }
             //задача 5
            if(age<=5)
            {
                System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе.");
            }
            else if(age>5 && age<=14)
            {
                System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого.");
            }
            else
            {
               System.out.println("Если возраст ребенок равен " + age + " , то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
            //Задача 6
        int total_capacity = 102;
        int seating_capacity = 60;
        int standing_capacity = total_capacity - seating_capacity;
        int occupied_seats = 56;

            if(occupied_seats<=seating_capacity)
            {
                System.out.println("В вагоне осталось "+ (seating_capacity-occupied_seats) + " сидячих мест(a) и " + standing_capacity +" стоячих мест(a).");
            }
            else if(occupied_seats>seating_capacity && occupied_seats<=total_capacity)
            {
                System.out.println("В вагоне не осталось сидячих мест, но осталось " + (total_capacity-occupied_seats) + " стоячих мест.");
            }
            else
            {
                System.out.println("В вагоне не осталось свободных мест.");
            }
            //задача 7
        int one = 48;
        int two = 42;
        int three = 15;
        if(one>two && one>three)
        {
            System.out.println("Число " +one + " большее из трех");
        }
         else if(two>one && two>three)
        {
            System.out.println("Число " + two + " большее из трех");
        }
        else
        {
            System.out.println("Число " + three + " большее из трех");
        }

        }


    }
