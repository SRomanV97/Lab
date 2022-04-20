package com.company;

/* Написать программу "Дровосек лесник и лес". В программе должно присутствовать 4 класса: Лес, Человек, Лесник и Дровочек.
Все экземпляры перечисленных классов должны уметь выводить информацию о себе (имя, количество деревьев, сила, усталость и тп).
Лесник должнен уметь рубить деревья в указанном лесу. Каждый раз, когда дровосек рубит или лесник сажает деревья, они устают
(уменьшается велечина усталости). Лесник и дровосекне могут работать, когда устали или каждый 7 деньпо счету.
Усталость сбрасывается каждые 24 часа (Становится опять максимальной).
 */

public class Main {

    public static void main(String[] args) {

        Forest forest = new Forest("Хвойный", 100);
        forest.info();
        Woodcutter woodcutter = new Woodcutter("Майкл", 70, "Дровосек");
        woodcutter.info();
        //woodcutter.Woodcut(forest.numWood, woodcutter.power);
        Forester forester = new Forester("Не Майкл", 30, "Лесник");
        forester.info();
        //forester.PlantForest(forest.NullOfWood, forester.power, forest.numWood);
        forest.Game(woodcutter.name, forester.name, woodcutter.power, forester.power, forest.numWood);


    }
}
