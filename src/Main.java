//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            int a = 300;
            System.out.println("Значение c переменной a с типом int равно" + a);
            byte b = 8;
            System.out.println("Значение c переменной b с типом byte равно" + b);
            short c = 127;
            System.out.println("Значение c переменной c с типом short равно" + c);
            long d = 400;
            System.out.println("Значение c переменной d с типом long равно" + d);
            float f = 1.25F;
            System.out.println("Значение c переменной f с типом float равно" + f);
            double g = 1.256;
            System.out.println("Значение c переменной g с типом double равно" + g);

            float e = 27.12F;
            long h = 987678965549L;
            double j = 2.786;
            short k = 569;
            short l = -159;
            short z = 27897;
            byte x = 67;

            byte teacherLp = 23;
            byte teacherAs = 27;
            byte teacherLpEa = 30;
            int totalStudents = teacherLp + teacherAs + teacherLpEa;
            System.out.println ("Всего учеников" + totalStudents);
            int paper = 480;
            int oneStudentsPaper = paper / totalStudents;
            System.out.println("На каждого ученика рассчитано" + oneStudentsPaper);

            byte bottlesInTwoMinutes = 16;
            int oneMinute = bottlesInTwoMinutes / 2;
            System.out.println ("За одну минуту  машина произвела " + oneMinute +  " бутылок");
            int twentyMinutes = bottlesInTwoMinutes / 2 * 20;
            System.out.println("За двадцать минут машина произвела " + twentyMinutes + " бутылок");
            int minutesPerDay = 24 * 60;
            minutesPerDay = minutesPerDay * oneMinute;
            System.out.println("В сутки машина произвела " + minutesPerDay +  " бутылок");
            minutesPerDay = minutesPerDay * 3;
            System.out.println("За строе суток машина произвела " + minutesPerDay +  " бутылок");
            minutesPerDay = minutesPerDay * 30;
            System.out.println("За месяц машина произвела " + minutesPerDay +  " бутылок");

            byte TotalForThePaintSchool = 120;
            byte ForOneCclassOfCansOfWhitePaint = 2;
            byte ForOneCclassOfCansOfBrownPaint = 4;
            int TotalOneClass = ForOneCclassOfCansOfWhitePaint + ForOneCclassOfCansOfBrownPaint;
            System.out.println ("На один класс уходит " + TotalOneClass + " банок краски");
            int ForHowManyClasses = TotalForThePaintSchool / TotalOneClass;
            System.out.println (TotalForThePaintSchool + " банок краски уходит на " +  ForHowManyClasses + " классов " );
            byte WhitePaint = (byte) (ForOneCclassOfCansOfWhitePaint * ForHowManyClasses);
            byte BrownPaint = (byte) (ForOneCclassOfCansOfBrownPaint * ForHowManyClasses);
            System.out.println ("В школе, где " + ForHowManyClasses + " классов, нужно " + WhitePaint + " банок белой краски и " + BrownPaint + " банок коричневой краски");


            byte Bananas  = 5;
            byte BananasOneGramm = 80;
            int Milk = 200;
            int Milk100MlInGramm = 105;
            int TotalMilkGramm = (Milk100MlInGramm * 2);
            byte IceCream = 2;
            byte IceCreamOne = 100;
            byte Eggs = 4;
            byte EggsOne = 70;
            int TotalGr = (Bananas *BananasOneGramm) + TotalMilkGramm + (IceCreamOne * IceCream) + (EggsOne *Eggs);
            System.out.println  (TotalGr + "  граммов спортзавтрака ");
            Float BreakfastInKg  = 1000F;
            Float TotalKg = TotalGr / BreakfastInKg;
            System.out.println (TotalKg + " Кг спортзавтрака");

            byte MinusKg = 7;
            int MinusGr = MinusKg * 1000;
            System.out.println (MinusGr + " граммов нужно скорректировать вес в меньшую сторону");
            int Day250G = MinusGr / 250;
            System.out.println (Day250G + " дней уйдет на похудение при потере 250 граммов в день" );
            int Day500G = MinusGr/500;
            System.out.println (Day500G + " дней уйдет на похудение при потере 500 граммов в день" );
            int AverageOfDays = (Day250G + Day500G) / 2;
            System.out.println (AverageOfDays + " день может потребоваться в среднем, чтобы добиться результата похудения.");

            //Задача 8//
            int Masha = 67760;
            int Denis = 83690;
            int Kristina = 76230;
            int Percent = 10;
            int MashaPercent = (Masha / 100) * Percent;
            int TotalMasha = Masha + MashaPercent;
            Masha  = ((Masha + MashaPercent)*12) - (Masha * 12);
            System.out.println ( "на " + MashaPercent + " руб. увеличена ЗП для Маши в месяц");
            System.out.println ("Маша теперь получает " + TotalMasha +  " рублей. Годовой доход вырос на " + Masha + " рублей");



            int DenisPercent = (Denis / 100) * Percent;
            int TotalDenis = Denis + DenisPercent;
            Denis  = ((Denis + DenisPercent)*12) - (Denis* 12);
            System.out.println ( "на " + DenisPercent + " руб. увеличена ЗП для Дениса в месяц");
            System.out.println ("Денис теперь получает " + TotalDenis +  " рублей. Годовой доход вырос на " + Denis  + " рублей");


            int KristinaPercent = (Kristina / 100) * Percent;
            int KristinaTotal = Kristina + KristinaPercent;
            Kristina  = ((Kristina + KristinaPercent)*12) - (Kristina* 12);
            System.out.println ( "на " + KristinaPercent + " рублей увеличена ЗП для Крестины в месяц");
            System.out.println ("Крестина теперь получает " + KristinaTotal +  " рублей. Годовой доход вырос на " + Kristina + " рублей");

















        }
    }
}