package Dominio;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Robert
 */
public class ListaJugador {

    private List <Jugador> ElJugador;

    public ListaJugador()   //Constructor de ListaJugador
    {
        ElJugador = new ArrayList();
    }

    public Object []  Devolver_lista_completa(){
        Object [] arreglo;
        arreglo=ElJugador.toArray();
        return arreglo;
    }
    /**
     * Método iprimirListaJugador: Este método imprime el contenido de la
     * lista Jugador
     */

        public Iterator getIterator()
    {
        return ElJugador.iterator();
    }


    public void imprimirListaJugador()
    {
        int i;
        Jugador registro;

        /*
         * Se define un arreglo de tipo Object (la clase genérica Java)
         */
        Object [] arreglo;

        /*
         * Se convierte la colección pasada como parámetro a un array, que
         * es asignado al arreglo de tipo Object
         */
        arreglo = ElJugador.toArray();

        System.out.println("DATOS");

        /*
         * Se hace un recorrido del arreglo de tipo Object y se imprime
         * la información de la casilla i
         */
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Jugador) arreglo[i];

            System.out.println("Nombre: " + registro.getNombre());
            System.out.println("Apellido: " + registro.getApellido());
            System.out.println("Fecha Nacimiento: " + registro.getFecha_nac());
            System.out.println("Score: " + registro.getScore());
            System.out.println("Nro de Igresos: " + registro.getCont_ingreso());
            System.out.println("Nro Partidas Creadas: " + registro.getPartidas_creadas());
            System.out.println("Nro Partidas Ganadas: " + registro.getPartidas_ganadas());
            System.out.println("NickName: " + registro.getNickname());
            System.out.println("NickName: " + registro.getPassword());
            System.out.println();
        }

        System.out.println("\n\n");
    }



    public void imprimirlistaOrdenada()
    {
        int i;
        Jugador registro;

        /*
         * Se define un arreglo de tipo Object (la clase genérica Java)
         */
        Object [] arreglo;

        Comparator comparadorAtributo = new ComparaObjeto();
        SortedSet setOrdenado = new TreeSet(comparadorAtributo);
        //setOrdenado.addAll(new HashSet(this.ElJugador));
        setOrdenado.addAll(this.ElJugador);

        /*
         * Se convierte la colección pasada como parámetro a un array, que
         * es asignado al arreglo de tipo Object
         */
        arreglo = setOrdenado.toArray();

        System.out.println("DATOS");

        /*
         * Se hace un recorrido del arreglo de tipo Object y se imprime
         * la información de la casilla i
         */
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Jugador) arreglo[i];

            System.out.println(registro);
        }

        System.out.println("\n\n");
    }


    /**
     *
     * Método public boolean agregarElemento(Nodo objeto): Este método agrega
     * el Nodo "objeto" a la colección miSet
     */
    public boolean agregarElemento(Jugador objeto)
    {
        return ElJugador.add(objeto);
    }

    /**
     *
     * Método Boolean Buscar Usuario: Este método Busca en la clase Lista Usuario
     *a un usuario recibiendo el nombre y el NickName del mismo
     *si se encuentra en la lista retorna TRUE
    */
    public Jugador buscar_jugador (String nombre,String nickName){
        int i = 0;
        Object[] a = ElJugador.toArray();
        Jugador buscado = null;
        while (i < a.length)
        {
            buscado = (Jugador) a[i];
            String nom = buscado.getNickname();
            String nick = buscado.getPassword();
            if ((nom.equals(nombre) == true) && (nick.equals(nickName) == true))
               return buscado;
            i++;
        }
        return null;
}

    public Jugador buscar_mayor (){
        int i = 0;
        Object[] a = ElJugador.toArray();
        Jugador buscado = null;
        Jugador alto = null;
        while (i < a.length)
        {
            buscado = (Jugador) a[i];
            if ((alto == null)||(alto.getScore() < buscado.getScore()))
                alto = buscado;
            i++;
        }
        return alto;

    }


    /**
     *
     * Método public boolean removerElemento(Nodo objeto): Este método elimina
     * el Nodo "objeto" de la colección miSet
     */
    public boolean removerElemento(Jugador objeto)
    {
        boolean encontrado = false;
        Jugador auxiliar = null;

        /*
         * Se define un iterador inicializado con el iterador de la colección
         */
        Iterator iterador = ElJugador.iterator();

        /*
         * Mientras no se encuentre el elemento y existan mas elementos en la
         * colección, se sigue entrando en el ciclo
         */
        while (!encontrado && iterador.hasNext())
        {
            /*
             *  Se obtiene el siguiente objeto del iterador y se le hace un cast
             *  para asignarlo al objeto de tipo Nodo
             */
            auxiliar = (Jugador) iterador.next();

            /*
             * Se invoca al método equals de la clase Nodo para determinar si son
             * iguales. En caso de serlo, se encontró el elemento buscado
             */
            if (objeto.equals(auxiliar))
                encontrado = true;
        }

        /*
         * Si se encontró el elemento, se procede a ejecutar el remove
         */
        if (encontrado)
        {
            if (ElJugador.remove(auxiliar))
                return true;
        }

        return false;
    }

}