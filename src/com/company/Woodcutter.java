package com.company;

/* Написать программу "Дровосек лесник и лес". В программе должно присутствовать 4 класса: Лес, Человек, Лесник и Дровочек.
Все экземпляры перечисленных классов должны уметь выводить информацию о себе (имя, количество деревьев, сила, усталость и тп).
Лесник должнен уметь рубить деревья в указанном лесу. Каждый раз, когда дровосек рубит или лесник сажает деревья, они устают
(уменьшается велечина усталости). Лесник и дровосекне могут работать, когда устали или каждый 7 деньпо счету.
Усталость сбрасывается каждые 24 часа (Становится опять максимальной).
 */

public class Woodcutter extends Human {


    Woodcutter(String Name, int Power, String Type) {
        super(Name, Power, Type);
    }

    void Woodcut(int numWood, int power) {
        while (this.power > 0 && numWood >= 1) {

            numGuess++;

            if (numGuess %7 == 0){
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("Сегодня выходной");
                System.out.println("-------------------------------------------------------------------------------");
                continue;
            }

            if (numWood <= this.power) {
                numWood = 0;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После вырубки леса, осталось " + numWood + " деревьев");
                System.out.println("Лес уничтожен");
                System.out.println("Вам потребовалось " + numGuess + " дней");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            }

            numWood = numWood - this.power;
            fatigue += 20;

            if (this.power < fatigue){
                this.power = 0;
                //numGuess++;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После вырубки леса, осталось " + numWood + " деревьев");
                System.out.println("Усталость равна " + fatigue);
                System.out.println("Оставшаяся сила равна " + this.power);
                System.out.println("-------------------------------------------------------------------------------");
            }else {
                this.power = this.power - fatigue;
                //numGuess++;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После вырубки леса, осталось " + numWood + " деревьев");
                System.out.println("Усталость равна " + fatigue);
                System.out.println("Оставшаяся сила равна " + this.power);
                System.out.println("-------------------------------------------------------------------------------");
            }

            if (fatigue > 99 || this.power < 1) {
                numGuess ++;
                System.out.println("Сегодня " + numGuess + " день. Идет востановление сил");
                this.power = power;
                fatigue = 0;
                System.out.println("Силы востановились " + this.power);
                System.out.println("Усталость прошла, пора за работу, усталость равна " + fatigue);
                System.out.println("-------------------------------------------------------------------------------");
            }

            if (numWood < 1) {
                System.out.println("Лес закончился");
                System.out.println("Вам потребовалось " + numGuess + " дней");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            }
        }
    }


}


