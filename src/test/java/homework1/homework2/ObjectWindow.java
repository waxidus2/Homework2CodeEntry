package homework1.homework2;

import homework1.Window;
import org.junit.jupiter.api.Test;

public class ObjectWindow {
    @Test
    public void workingWithWindow() {
      Window firstWindow = new Window();

      firstWindow.setTotalPrice(215);
      firstWindow.setHeight(131.5);
      firstWindow.setWidth(114.5);

      System.out.println("My window is white color");
        System.out.println("I have beautiful view from the window");
        System.out.println(firstWindow.getTotalPrice());
    }
}
