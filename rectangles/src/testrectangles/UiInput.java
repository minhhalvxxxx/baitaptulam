
import java.util.Scanner;

public class UiInput {
Scanner scanner = new Scanner(System.in);
    RectangleControl rectangleControl = new RectangleControl();

    public void input() {
        RequestData requestData = new RequestData();
        System.out.print("Input length: ");
        requestData.setSetLength(scanner.nextLine());
        System.out.print("Input width: ");
        requestData.setSetWidth(scanner.nextLine());
        rectangleControl.execute(requestData);
    }
}
