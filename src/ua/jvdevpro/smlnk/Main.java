package ua.jvdevpro.smlnk;

/**
 * Объект перечисления не создается с помощью оператора new . Он создается
 * как переменная примитивного типа. Присвоить объекту можно только значение,
 * объявленное в перечислении. По сути это означает, что может существовать только
 * такое количество разных объектов перечисления, сколько их перечислено. Это дает
 * возможность сравнивать объекты перечислений, используя оператор ==
 */

public class Main<position> {

    public static void main(String[] args) {

        Colors colorOne;
        colorOne = Colors.RED;
        if (colorOne == Colors.RED) {
            System.out.println("Color = RED");
        }

        System.out.println(colorOne.getColorCode());
        colorOne.setColorCode("12345");
        System.out.println(colorOne.getColorCode());
    }

    }
