package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    @DisplayName("Проверка положительного результата")
    void triangleSqServiceCorrectTest() {
        Triangle triangle = new Triangle();
        double result = triangle.calculateArea(3, 4, 5);
        Assertions.assertEquals(6.0d, result);
    }

    @Test
    @DisplayName("Проверка положительного результата")
    void triangleSqServiceInCorrectTest() {
        Triangle triangle = new Triangle();
        //double result = triangle.calculateArea(-3, -4, -5);
        Assertions.assertThrows(
                Exception.class,
                () -> triangle.calculateArea(-3, -4, -5)
        );
    }
}
