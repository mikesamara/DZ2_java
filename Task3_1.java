import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.io.IOException;
import javax.xml.XMLConstants;

public class Task3_1 {

 
public static void main(String[] args) throws IOException 
{
    Logger logger = Logger.getLogger(Task3_1.class.getName());
    FileHandler fh = new FileHandler("logTask3_1.xml");
    logger.addHandler(fh);
    XMLFormatter xml = new XMLFormatter();
    fh.setFormatter(xml);
    logger.info("res");
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int numb_a = sc.nextInt();
    System.out.println("Введите операцию + - / *: ");
    char operation;
    operation = sc.next().charAt(0);
    System.out.print("Введите второе число: ");
    int numb_b = sc.nextInt();
    int res;
    switch (operation) {
        case '+':
            res = numb_a + numb_b;
            System.out.printf("Результат: %d",res);
            break;
        case '-':
            res = numb_a - numb_b;
            System.out.printf("Результат: %d",res);
            break;
        case '/':
            res = numb_a / numb_b;
            System.out.printf("Результат: %d",res);
            break;
        case '*':
            res = numb_a * numb_b;
            System.out.printf("Результат: %d",res);
            break;

        }
        sc.close();
   }
}
