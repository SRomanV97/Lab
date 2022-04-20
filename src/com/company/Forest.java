package com.company;

/* Написать программу "Дровосек лесник и лес". В программе должно присутствовать 4 класса: Лес, Человек, Лесник и Дровочек.
Все экземпляры перечисленных классов должны уметь выводить информацию о себе (имя, количество деревьев, сила, усталость и тп).
Лесник должнен уметь рубить деревья в указанном лесу. Каждый раз, когда дровосек рубит или лесник сажает деревья, они устают
(уменьшается велечина усталости). Лесник и дровосекне могут работать, когда устали или каждый 7 деньпо счету.
Усталость сбрасывается каждые 24 часа (Становится опять максимальной).
 */

public class Forest {

    String name;
    int numWood;                    //количество деревьев
    int NullOfWood = 0;             // Лес без деревьев

    Forest(String Name, int NumWood) {
        name = Name;
        numWood = NumWood;
    }

    public void info() {
        System.out.println("Я " + name + " лес");
        System.out.println("Я состою из " + numWood + " деревьев");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void Game(String WName, String FName, int WPower, int FPower, int NumWood) {
        int FFatigue = 0;
        int WFatigue = 0;
        int numGuess = 0;
        int MaxWood = NumWood * 2;
        int startFPower = FPower;
        int startWPower = WPower;

        while (NumWood > 1 && NumWood < MaxWood) {

            numGuess++;

            NumWood = NumWood - WPower;
            WFatigue += 20;


            if (WPower > 0){
                WPower = WPower - WFatigue;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После вырубки леса, осталось " + NumWood + " деревьев");
                System.out.println("Усталость " + WName + "a" + " равна " + WFatigue);
                System.out.println("Оставшаяся сила " + WName + "a" + " равна " + WPower);
            }

            if (WFatigue > 99 || WPower < 1) {
                //numGuess++;
                System.out.println("Сегодня у " + WName + " выходной. Идет востановление сил");
                WPower = startWPower;
                WFatigue = 0;
                System.out.println("Силы востановились " + WPower);
                System.out.println("Усталость прошла, пора за работу, усталость " + WName + "a" + " равна " + WFatigue);
                System.out.println("-------------------------------------------------------------------------------");
            }

            NumWood = NumWood + FPower;
            FFatigue +=20;

            if (FPower > 0){
                FPower = FPower - FFatigue;
                //numGuess++;
                //System.out.println("Пошел " + numGuess + " день");
                System.out.println("После высадки леса, появилось " + NumWood + " деревьев");
                System.out.println("Усталость " + FName + "a" + " равна " + FFatigue);
                System.out.println("Оставшаяся сила " + FName + "a" + " равна " + FPower);
                System.out.println("-------------------------------------------------------------------------------");
            }

            if (FFatigue > 99 || FPower < 1) {
                //numGuess++;
                System.out.println("Сегодня у " + FName + " выходной. Идет востановление сил");
                FPower = startFPower;
                FFatigue = 0;
                System.out.println("Силы востановились " + FPower);
                System.out.println("Усталость прошла, пора за работу, усталость " + FName + "a" + " равна " + FFatigue);
                System.out.println("-------------------------------------------------------------------------------");
                continue;
            }

            if (NumWood < WPower){
                NumWood = 0;
                System.out.println("Лес успешно вырублен");
                System.out.println("Победил " + WName);
                System.out.println("Вам потребовалось " + numGuess + " дней");
                break;
            }

            if(NumWood > MaxWood){
                System.out.println("Лес увеличен в 2 раза");
                System.out.println("Победил " + FName);
                System.out.println("Вам потребовалось " + numGuess + " дней");
                break;
            }

        }
    }
}
