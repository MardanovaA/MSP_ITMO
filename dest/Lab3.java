import java.util.Scanner;
public class Lab3 {
	
    public static void main(String[] args) {
		while (true){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the x coordinate");
			double x = in.nextDouble();
			System.out.println("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0443 y");
			double y = in.nextDouble();
			System.out.println("Enter the radius");
			double r = in.nextDouble();

			Point point = new Point(x, y, r);
			//Area area = point.getArea();

			if (point.isInArea()) {
				System.out.println("The point is included in the specified area");
			}
			else{System.out.println("The point is not included in the specified area");
			}
		}
    }
}
