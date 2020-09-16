package ru.mirea.prak_3_2;

public class Loader {
    public static void main(String[] args) {
        Human II = new Human(185, 90, "Иван", "Иванов" );
        System.out.println(II.toString());
        Human.Hand rhand = II.new Hand(86.5, 5, 9.2 );
        Human.Hand lhand = II.new Hand(86.5, 4, 9.2);
        II.setWeight(89);
        System.out.println(II.toString());
        System.out.println("\n" + "Левая рука: " + lhand.toString());
        System.out.println("Правая рука: " + rhand.toString());
        Human.Head h = II.new Head("Чёрный", "Серый", "Круглая");
        h.setHairColor("Голубой");
        System.out.println("\n" + "Цвет волос:" + h.getHairColor() + "; Цвет глаз:" + h.getHairColor() + "; Форма головы:" + h.getShapeHead() + ".");
        Human.Leg rleg = II.new Leg(94, 42.5);
        Human.Leg lleg = II.new Leg(94, 42.5);
        System.out.println("\n" + "Левая нога: " + rleg.toString());
        System.out.println("Правая нога: " + lleg.toString());
    }
}
