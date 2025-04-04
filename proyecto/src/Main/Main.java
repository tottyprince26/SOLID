package Main;
import SOLID.S.*;
import SOLID.O.*;
import SOLID.L.*;
import SOLID.I.*;
import SOLID.D.*;
import PatronDiseño.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== Bienvenido al sistema ===");
        System.out.print("Por favor, ingresa tu nombre: ");
        String name = scanner.nextLine();
        User user = new User(name);
        UserService userService = new UserService();
        userService.printUser(user);

        while (!salir) {
            System.out.println("\n Menu Principal:");
            System.out.println("1. Generar un reporte");
            System.out.println("2. Encender un vehiculo");
            System.out.println("3. Usar la impresora multifuncion");
            System.out.println("4. Enviar una notificacion");
            System.out.println("5. Crear un vehiculo");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    generarReporte(scanner);
                    break;
                case 2:
                    encenderVehiculo();
                    break;
                case 3:
                    usarImpresora();
                    break;
                case 4:
                    enviarNotificacion(user.getName());
                    break;
                case 5:
                    crearVehiculo(scanner);
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    private static void generarReporte(Scanner scanner) {
        System.out.println("\nGeneracion de Reportes");
        System.out.print("Elige el tipo de reporte (1. Reporte de texto): ");
        int reportOption = scanner.nextInt();
        scanner.nextLine(); 

        String contenido = "Reporte generado de tipo: ";

        if (reportOption == 1) {
            contenido += "Reporte de texto.";
        }

        imprimirReporte(contenido);
    }

    private static void imprimirReporte(String contenido) {
        
        System.out.println("\n Reporte Generado");
        System.out.println("******************************");
        System.out.println(contenido);
        System.out.println("******************************");
        System.out.println("✅ Reporte impreso exitosamente.");
    }

    private static void encenderVehiculo() {
        System.out.println("\n Encendiendo un vehiculo");
        Vehicle electric = new ElectricCar();
        electric.startEngine();
    }

    private static void usarImpresora() {
        System.out.println("\n Usando impresora multifuncion");
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print();
        printer.scan();
    }

    private static void enviarNotificacion(String userName) {
        System.out.println("\n Enviando notificacion");
        NotificationService notificationService = new NotificationService(new EmailNotification());
        notificationService.notifyUser("Hola " + userName + ", esta es tu notificacion.");
    }

    private static void crearVehiculo(Scanner scanner) {
        System.out.println("\n️ Crear vehiculo con Factory Method");
        System.out.print("¿Que tipo de vehiculo quieres crear? (1. Normal / 2. Electrico): ");
        int vehicleOption = scanner.nextInt();

        VehicleFactory factory;
        if (vehicleOption == 2) {
            factory = new ElectricCarFactory();
        } else {
            factory = new CarFactory();
        }

        Vehicle myCar = factory.createVehicle();
        myCar.startEngine();
    }
}
