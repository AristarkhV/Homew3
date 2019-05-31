package App;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = {0, 2, 2, 8},
                secondArray = {1, 3};
        MargeArrays bufferArray = new MargeArrays();
        int[] resultArray = bufferArray.mergeArrays(firstArray, secondArray);
        for (int i = 0; i < 6; i++) System.out.print(resultArray[i] + " ");
        System.out.println("\n\n");
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringRole text = new StringRole();
        String[] buffer = text.printTextPerRole(textLines, roles);
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }

        ComplexNumber firstNumber = new ComplexNumber(2.25, 2.255);
        ComplexNumber secondNumber = new ComplexNumber(2.25, 2.25);
        System.out.println(firstNumber.equals(secondNumber));
        System.out.println(firstNumber.hashCode());
        System.out.println(secondNumber.hashCode());

        int toX = 3, toY = 0;
        Robot andrey = new Robot();
        andrey.moveRobot(andrey, toX, toY);
    }
}
