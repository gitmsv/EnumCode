package ua.jvdevpro.smlnk;

/**Все перечисления являются наследниками (неявными) класса Enum. Однако
 перечисления описываются с помощью ключевого слова enum. Перечисление
 является списком открытых статических конечных свойств (констант).*/

public enum Colors {
    BLUE("#0000FF"), GREEN("#008000"), INDIGO("#4B0082"), ORANGE("#FFA500"),
    RED("#FF0000"), VIOLET("#EE82EE"), YELLOW("#FFFF00");

    private String colorCode;


    /**Так как перечисления унаследованы от класса, то в нем можно объявлять конструкторы (только с модификатором private),
     * собственные методы и свойства.*/

    /**Так как перечисления унаследованы от класса, то в нем можно объявлять конструкторы (только с модификатором private),
     * собственные методы и свойства.*/

    Colors(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
