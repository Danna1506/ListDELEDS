package co.edu.umanizales.listdeleds.model;

import lombok.Data;

import java.time.LocalTime;

@Data
public class ListDE {
    private NodeDE head;
    private int size;



/*si la lista no esta vacia, creo un nodo nuevo nodo con la referencia de led
* le pido al nuevo nodo que se posicione antes de cabeza y que se enlace a esta,
* le pido a cabeza que se enlace al nuevo nodo
* y que nuevo nodo tome el valor de cabeza
* si la lista esta vacia creo un nodo que va a ser cabeza */
    public void addLedToStart(Led led) {
        if (head != null) {
            NodeDE newNodeDE = new NodeDE(led);
            newNodeDE.setNext(head);
            head.setPrev(newNodeDE);
            head = newNodeDE;
        } else {
            head = new NodeDE(led);
        }
        size++;
    }
    /* si la lista no esta vacia le pido a temporal que se pare en la cabeza
    * y mientras mientras el siguiente sea diferente a null recorra la lista, tome los datos de cada led
    * y si temporal toma toma el dato que se va a añadir es igual a algun nodo que ya este, si es asi
    * sigue con los otros nodos, agrego el nuevo nodo y le pido a temporal que se enlace al nodo anterior
    * si no creo el nuevo nodo como cabeza,size se incrementa para saber sobre los elmentos en la lista   */
    public void addLed(Led led){
        if (this.head != null) {
            NodeDE temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            NodeDE newLed = new NodeDE(led);
            temp.setNext(newLed);
            temp.setPrev(newLed);
        } else {
            this.head = new NodeDE(led);
        }
        size++;
    }
    /* si cabeza es diferente a vacio, le pido a temporal que se pare en la cabeza que me imprima la lista
    * y mientras temporal sea null, tome el id de la led, que siga recorriendo la lista y me imprima la lista
    *  */
    public void listarLeds() throws InterruptedException {
        if (head != null){
        NodeDE temp = head;
        System.out.print("Lista de Leds: ");
        while (temp != null) {
            System.out.print(temp.getData().getId() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
        /* le pido a temp que inicie en cabeza, con el boolean verifico si se encontro algun le con id que busco
        y mientras temporal sea diferente a null, recorra la lista
        tome los datos y si algun id es igual al que busco reinicie el led */

        public void reiniciarLeds() {
            if(head != null){
        }

        /**/
        public void buscarMitad() {
            if (this. == 0) {
                return;
            }

            NodeDE nodeAc = this.head;
            NodeDE Mit = this.head;

            int contador = 0;
            while (nodeAc != null) {
                if (contador % 2 == 1) {
                    Mit = Mit.getNext();
                }
                nodeAc = nodeAc.getNext();
                size++;
            }

            return;
        }
        public void encenderLed()  {
            NodeDE temp = this.head;
            int cont = 1;
            while (temp != null) {
                if (cont == size() / 2) {
                    System.out.println("Bombillo encendido a las " + temp.getData() + " horas");
                    temp.data(LocalTime.now().getHour());
                    System.out.println("Hora actualizada a las " + temp.getData() + " horas");
                    Thread.sleep(1000); // Esperar 1 segundo
                    break;
                }
                temp = temp.getNext();
                size++;
            }
        }

    }
}

