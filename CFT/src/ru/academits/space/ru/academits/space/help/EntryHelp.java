package ru.academits.space.ru.academits.space.help;

/**
 * Created by Александр on 24.02.2017.
 */
public class EntryHelp {
    public static void help() {

        System.out.println("Введите последовательно, через один пробел параметры: ");
        System.out.println("Есть два типа файлов: для строк и для чисел - intов ");
        System.out.println("Файл из которого считать, с указанием пути: ");
        System.out.println("Пример: inputCFTInt.txt ");
        System.out.println("Введите название файла которого нужно записать, с указанием пути где лежит:");
        System.out.println("Пример: outputCFT.txt");
        System.out.println("Введите тип строк или чисел для обработки: -i - для чисел, -s -для строк.");
        System.out.println("Введите тип какое действи совершить: -а - для сортировки по возрастанию," +
                " -d -для сортировки по убыванию.");
        System.out.println("Пример: inputCFTInt.txt outputCFT.txt -i -d.");
        System.out.println("Удачи)))");
    }
}
