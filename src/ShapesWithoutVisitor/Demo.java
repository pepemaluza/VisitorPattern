package ShapesWithoutVisitor;


public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle(5,4,2);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20);

        JsonExport jsonExport = new JsonExport();
        XmlExport xmlExport = new XmlExport();


        System.out.println(jsonExport.export(circle));
        System.out.println(jsonExport.export(rectangle));

        System.out.println(xmlExport.export(circle));
        System.out.println(xmlExport.export(rectangle));


    }

}
