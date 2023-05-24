package invertirdigitos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


// Valor maximo int en Java:  2147483647
// Valor minimo int en Java: -2147483648
// rango positivos: 0 1 2      1073741822 1073741823 1073741825        2147483646 2147483647 -2147483648
// rango negativos: 2147483647 -2147483648 -2147483647       -1073741825 -1073741824 -1073741823        -2 -1 0
// primos positivos: 2 23 61 109 151 167
// primos pero con signo negativo: -2 -23 -61 -109 -151 -167
// numeros con ceros: 0, 10, 200, 3000, 40000, 50000, 600000, 7000000, 8000000, 90000000, 1000000000
// numeros con ceros negativos: -0, -10, -200, -3000, -40000, -50000, -600000, -7000000, -80000000, -90000000, -1000000000

public class NumbersTest {
    private Numbers numbers;

    @BeforeEach
    public void setup() {
        numbers = new Numbers();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 2",
            "1073741822, 2281473701",
            "1073741823, 3281473701",
            "1073741825, 5281473701",
            "2147483646, 6463847412",
            "2147483647, 7463847412",
            "-2147483648, -8463847412",
            "2147483647, 7463847412",
            "-2147483648, -8463847412",
            "-2147483647, -7463847412",
            "-1073741825, -5281473701",
            "-1073741824, -4281473701",
            "-1073741823, -3281473701",
            "-2, -2",
            "-1, -1",
            "0, 0",
            "2, 2",
            "23, 32",
            "61, 16",
            "109, 901",
            "151, 151",
            "167, 761",
            "-2, -2",
            "-23, -32",
            "-61, -16",
            "-109, -901",
            "-151, -151",
            "-167, -761",
            "0, 0",
            "10, 01",
            "200, 002",
            "3000, 0003",
            "40000, 00004",
            "50000, 00005",
            "600000, 000006",
            "7000000, 0000007",
            "8000000, 0000008",
            "90000000, 00000009",
            "1000000000, 0000000001",
            "0, 0",
            "-10, -01",
            "-200, -002",
            "-3000, -0003",
            "-40000, -00004",
            "-50000, -00005",
            "-600000, -000006",
            "-7000000, -0000007",
            "-80000000, -00000008",
            "-90000000, -00000009",
            "-1000000000, -0000000001"
    })
    public void verifyInvertirPositiveTest(int numberTest, String expectedResult) {
        String actualResult = numbers.invertir(numberTest);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR: el numero invertido obtenido no corresponde con el numero ingresado");
    }

}
