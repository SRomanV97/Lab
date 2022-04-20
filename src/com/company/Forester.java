package com.company;

/* Написать программу "Дровосек лесник и лес". В программе должно присутствовать 4 класса: Лес, Человек, Лесник и Дровочек.
Все экземпляры перечисленных классов должны уметь выводить информацию о себе (имя, количество деревьев, сила, усталость и тп).
Лесник должнен уметь рубить деревья в указанном лесу. Каждый раз, когда дровосек рубит или лесник сажает деревья, они устают
(уменьшается велечина усталости). Лесник и дровосекне могут работать, когда устали или каждый 7 деньпо счету.
Усталость сбрасывается каждые 24 часа (Становится опять максимальной).
 */

public class Forester extends Human{



    Forester(String Name, int Power, String Type){
        super(Name, Power, Type);
    }

    public void PlantForest(int NullOfWood, int power, int numWood){
        while (this.power > 0){

            numGuess++;

            if (numGuess %7 == 0){      // условие отдыха каждый 7 день
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("Сегодня выходной");
                System.out.println("-------------------------------------------------------------------------------");
                continue;
            }

            NullOfWood = NullOfWood + this.power;
            fatigue += 20;


            if (NullOfWood >= numWood){             //условие востановления леса, изначально заданному количеству деревьев
                NullOfWood = numWood;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После высадки леса, появилось " + NullOfWood + " деревьев");
                System.out.println("Лес востановлен");
                System.out.println("Вам потребовалось " + numGuess + " дней");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            }

            if (this.power < fatigue){              //условие чтобы силы не уходили в минус
                this.power = 0;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После высадки леса, появилось " + NullOfWood + " деревьев");
                System.out.println("Оставшиеся силы равны " + this.power);
                System.out.println("Усталость равна " + fatigue);
                System.out.println("-------------------------------------------------------------------------------");
            }else{
                this.power = this.power - fatigue;
                System.out.println("Пошел " + numGuess + " день");
                System.out.println("После высадки леса, появилось " + NullOfWood + " деревьев");
                System.out.println("Оставшиеся силы равны " + this.power);
                System.out.println("Усталость равна " + fatigue);
                System.out.println("-------------------------------------------------------------------------------");
            }

            if (this.power < 1 || fatigue > 99){        // условие для востановления сил
                System.out.println("Время востановить силы");
                numGuess ++;
                System.out.println("Сегодня " + numGuess + " день. Идет востановление сил");
                this.power = power;
                fatigue = 0;
                System.out.println("Силы востановились " + this.power);
                System.out.println("Усталость прошла, пора за работу, усталость равна " + fatigue);
                System.out.println("-------------------------------------------------------------------------------");
            }



        }
    }

}
