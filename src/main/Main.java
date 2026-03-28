package main;

import dao.OperarioDAO;
import modelo.Operario;
import util.Validaciones;

public class Main {

    public static void main(String[] args) {

        OperarioDAO dao = new OperarioDAO();
        int op;

        do {
            System.out.println("\n=== SISTEMA ENSAMBLE ===");
            System.out.println("1. Insertar");
            System.out.println("2. Listar");
            System.out.println("3. Salir");

            op = Validaciones.numero("Seleccione: ");

            switch (op) {
                case 1:
                    dao.insertar(new Operario(0,
                        Validaciones.texto("Nombre: "),
                        Validaciones.texto("Turno: ")
                    ));
                    break;

                case 2:
                    dao.listar().forEach(o ->
                        System.out.println(o.getId() + " - " + o.getNombre())
                    );
                    break;
            }

        } while (op != 3);
    }
}
