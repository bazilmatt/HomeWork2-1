/**
 *
@version 0.0.1
@author Vasiliy Matveev */
public class HomeWork2_1 {

    public static void main(String[] args) {
        Object b = null;
        try {
            System.out.println("Hello world" + b.toString());
        } catch (NullPointerException e){
            System.out.println("в переменной b значение null - вызван обработчик исключения");
        } finally {
            System.out.println("а также отработал блок finally"); //можно убрать, здесь незачем
        }

    }
}
