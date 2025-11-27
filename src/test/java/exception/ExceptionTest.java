package exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class ExceptionTest {

    String text = null;
    boolean assertion = false;

    @Test
    void exceptionTest() {
        try {
            System.out.println(text.length());
        } catch (NullPointerException npe) {
            System.out.println("Исключение: У строки null нет длины");
        } finally {
            System.out.println("Finally:  А вот System.out.println(null) не вызовет исключения:");
            System.out.println(text + "\n");
            
            try {
                Assertions.assertTrue(assertion);
            } catch (AssertionFailedError a) {
                System.out.println("Исключение: Логическая ошибка. Boolean assertion = false");
            } finally {
                System.out.println("Finally: Заметаем следы");
            }
        }
    }

}


