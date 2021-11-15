package sandbox;

import java.io.File;
import org.json.*;

public class CrearJson {

    private static String dir_json = new File("equipos.json").getAbsolutePath();
    private static String dir_json = new File("usuarios.json").getAbsolutePath();
    private static String dir_json = new File("prestamos.json").getAbsolutePath();
}

public class Sandbox {

    //Generamos el array equipos

    public static void main(String[] args){

        JSONArray equipos = new JSONArray();

        //Agregamos los valores al array

        equipos.put("id");
        equipos.put("tipo");
        equipos.put("marca");
        equipos.put("uso del equipo");
        equipos.put("sistema del equipo");
        equipos.put("hardware");
        equipos.put("software");
    }

    public static void main(String[] args){

        JSONArray usuarios = new JSONArray();

        //Agregamos los valores al array

        usuarios.put("id");
        usuarios.put("nombre");
        usuarios.put("departamento");
        usuarios.put("telefono del contacto");
        usuarios.put("correo electronico");
        usuarios.put("ubicacion");
    }

    public static void main(String[] args){

        JSONArray prestamos = new JSONArray();

        //Agregamos los valores al array

        prestamos.put("id");
        prestamos.put("usuario");
        prestamos.put("equipo");
        prestamos.put("fecha de inicio prestamo");
        prestamos.put("fecha fin prestamo");
        prestamos.put("fecha real de devolucion");
        prestamos.put("comentarios");
    }
}