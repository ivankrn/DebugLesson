package ru.urfu;

/**
 * Создание и инициализация двумерного массива. Считает сумму его элементов.
 *
 * @author vpyzhyanov
 * @since 22.05.2023
 */
public class MatrixInitializer {
    private static final int SIZE = 100;
    private long sum = 0;

    /**
     * TODO выполнить задание:
     * <ol>
     *     <li>Найти значение sum, при котором происходит исключение
     *         (поставить breakpoint на возникающее исключение)</li>
     *     <li>Исправить ошибку</li>
     *     <li>Найти значение sum перед добавлением значения элемента массива с индексами [84][14]</li>
     *     <li>Вычислить значение выражения (up - left + 1) * j / 4 для i = 57, j = 28 </li>
     *     <li>Добавить breakpoint в метод {@link #getValue(long[][], int, int)},
     *         нужно остановиться только когда значение sum станет больше 2300
     *         (нужно в методе test добавить breakpoint (на нём останавливаться не нужно),
     *         после которого должен сработать ранее созданный breakpoint).
     *         Найдите значение выражения up + left</li>
     *     <li>Вывести в лог значение sum, когда i == j
     *         (<b>Код изменять нельзя! И на точке не останавливаемся!</b>)
     *         Найти сколько раз встречается значение по модулю меньше 10 000</li>
     * </ol>
     */
    public void test() {
        sum = 0;
        long[][] matrix = new long[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                long value = getValue(matrix, i, j);
                matrix[i][j] = value;
                sum += value;
            }
        }

        System.out.println("sum = " + sum);
    }

    private static long getValue(long[][] matrix, int i, int j) {
        long up = i > 0
                ? matrix[i - 1][j]
                : 0L;
        long left = j > 0
                ? matrix[i + 1][j - 1]
                : 1L;
        return ((left - up + i) * (j / 10 + 1)) / 8;
    }
}
