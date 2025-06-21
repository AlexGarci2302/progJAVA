package inicio.ejercicio1Arrays;

public class Agenda {
    private int indice;
    private static final int CAPACIDAD = 10;
    private Contacto[] contactos;

    public Agenda(){
        this.indice = 0;
        this.contactos = new Contacto[CAPACIDAD];
    }

    public Agenda(int capacidad){
        this.indice = 0;
        this.contactos = new Contacto[capacidad];
    }

    //Método insertar

    public void insertarContacto(Contacto nuevoContacto){
        if(indice > contactos.length){
            System.out.println("Error.");
        }
        contactos[indice] = nuevoContacto;
        indice++;
    }

    //Método buscar

    public Contacto buscarContacto(String nombre){
        for (int i = 0; i < indice; i++) {
            Contacto c = contactos[i];
            if (c.getNombre().equals(nombre)){
                return c;
            }
        }
        return null;
    }

    //Método buscarPorIndice

    private int buscarPorIndice(String nombre){
        int res = -1;
        for (int i = 0; i < indice; i++) {
            Contacto c = contactos[i];
            if (c.getNombre().equals(nombre)){
                res = i;
                break;
            }
        }
        return res;
    }

    //Método borrar
    public void borrarContacto(String nombre){
        int indiceABorrar = buscarPorIndice(nombre);
        if (indiceABorrar >= 0){
            for (int i = indiceABorrar; i < indice; i++) {
                contactos[i] = contactos[i+1];
            }
            indice--;
        }
    }

    //Imprimir contactos

    public void imprimirContactos(){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null){
                System.out.println(contactos[i].imprimir());
            }
        }
    }
}
