//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
        int a=1;
        byte b=2;
        short c=3;
        long d=4L;
        float e=1.1000000001f;
        double f= 1.000000002;
        System.out.println("Задача 1:\nЗначение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной e с типом float равно "+e);
        System.out.println("Значение переменной f с типом double равно "+f);
//Задача 2
        float z=27.12f;
        long x= 987678965549L;
        float v=2.786f;
        short n= 569;
        short m= -159;
        short h= 27897;
        byte j = 67;
//Задача 3
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int hz =480/(LP+AS+EA);
        System.out.println("Задача 3:\nНа каждого ученика рассчитано "+hz+" листов бумаги");
//Задача 4
        byte power2 = 16;
        int power1 = power2/2;
        int twenty = power1*20;
        int day = power1*60*24;
        int threeDay= power1*60*24*3;
        int mounth = power1*60*24*30;
        System.out.println("Задача 4:\nЗа 20 минут машина произвела "+twenty+" штук бутылок");
        System.out.println("За сутки машина произвела "+day+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+threeDay+" штук бутылок");
        System.out.println("За месяц машина произвела "+mounth+" штук бутылок");
//Задача 5
        byte ollColor= 120;
        int classRoom = ollColor/(2+4);
        int white = classRoom*2;
        int brown = classRoom*4;
        System.out.println("Задача 5:\nВ школе, где "+classRoom+" классов, нужно "+white+" банок белой краски и "+brown+ " банок коричневой краски.");
//Задача 6
        byte banana= 80;
        byte milk = 105;
        byte ice = 100;
        byte egg = 70;
        int coktailG = banana*5+milk*2+ice*2+egg*4;
        float coktailKg=coktailG/1000f;
        System.out.println("Задача 6:\nЗавтрак весит "+coktailG+" грамм, или "+coktailKg+" килограмм");;
//Задача 7
        float min = 250/1000f;
        float max = 500/1000f;
        double dayMin = 7/min;
        double dayMax = 7/max;
        double low = (dayMin+dayMax)/2;
        System.out.println("Задача 7:\nЕсли будет терять по 250 грамм в день, то похудеет за "+dayMin+" дней");
        System.out.println("Если будет терять по 500 грамм в день, то похудеет за "+dayMax+" дней");
        System.out.println("Процесс похудения в среднем займёт "+ low+" дней");
//Задача 8
        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        float mashaNew =masha*1.1f;
        float denNew = den*1.1f;
        float krisNew = kris*1.1f;
        double mashaRaz =masha* 0.1*12;
        double denRaz = den*0.1*12;
        double krisRaz = kris*0.1*12;
        System.out.println("Задача 8:\nМаша теперь получает "+mashaNew+" рублей. Годовой доход вырос на "+mashaRaz+" рублей.");
        System.out.println("Денис теперь получает "+denNew+" рублей. Годовой доход вырос на "+denRaz+" рублей.");
        System.out.println("Кристина теперь получает "+krisNew+" рублей. Годовой доход вырос на "+krisRaz+" рублей.");
    }

}