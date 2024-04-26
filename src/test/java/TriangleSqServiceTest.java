import org.example.TriangleSqService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleSqServiceTest {
    @Test
    @DisplayName("Проверка положительного результата")
    void triangleSqServiceCorrectTest() {
        TriangleSqService triangleSqService = new TriangleSqService();
        double result = triangleSqService.triangleSqService(3,4,5);
        Assertions.assertEquals(6,result);
    }

    @Test
    @DisplayName("Проверка отрицательного результата")
    void triangleSqServiceUnCorrectTest() {
        TriangleSqService triangleSqService = new TriangleSqService();
        double result = triangleSqService.triangleSqService(3,4,5);
        Assertions.assertNotEquals(5,result);
    }
}
