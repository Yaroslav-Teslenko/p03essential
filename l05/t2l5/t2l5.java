package l05.t2l5;

public class t2l5 {
    /*Створити клас Zoo. У класі створити список, який записати 8 тварин через метод add(index, element).
    Вивести список у консоль.*/

    /*Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин,
    дізнатися розмір списку і вивести в консоль.*/
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.zoo.add("tiger");
        zoo.zoo.add("camel");
        zoo.zoo.add("raccoon");
        zoo.zoo.add("horse");

        zoo.zoo.add("alligator");
        zoo.zoo.add("gippo");
        zoo.zoo.add("grief");
        zoo.zoo.add("monkey");

//        for(String s: zoo.zoo) System.out.println(s);
//        System.out.println("--");
//        zoo.zoo.forEach(System.out::println);
//        System.out.println("--");
        for (int i = 0; i < zoo.zoo.size(); i++) {
            System.out.println(i + " " + zoo.zoo.get(i));
        }
        int index;
        index = zoo.zoo.indexOf("horse");
        zoo.zoo.remove(index);
        index = zoo.zoo.indexOf("gippo");
        zoo.zoo.remove(index);
        index = zoo.zoo.indexOf("monkey");
        zoo.zoo.remove(index);
        System.out.println("--");
        System.out.println("new size ="+ zoo.zoo.size());
        for (int i = 0; i < zoo.zoo.size(); i++) {
            System.out.println(zoo.zoo.get(i));
        }
    }
}
