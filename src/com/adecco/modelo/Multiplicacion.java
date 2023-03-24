package com.adecco.modelo;

public class Multiplicacion {
    //Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe
    //contar con un constructor que indica la tabla que se va a mostrar. Debe contar con un
    //método que dé como resultado un string para mostrar diez líneas de la tabla del
    //número dado en el constructor

    //1.ATRIBUTOS
    private int numero; //aquí numero es ATRIBUTO pq está dentro de una clase

    //2. METODO

    public String calcularTabla (){
        String resultado = "La tabla de multiplicar del " +numero +"\n"; //el \n es para hacer salto de línea
        //tenemos que meter una conficion FOR - Aquí resultado se me convirtió en VARIABLE pq está dentro
        //de un método
        for (int i=1; i<=10; i++){
            //ahora debo concatenar:
            resultado = resultado +i + "x" +numero + " = " +(i*numero) + "\n";
            //esta línea la podría resumir con:
            //resultado += i + "x" +numero + " = " +(i*numero) + "\n";
        }
        return resultado;
    }
    //3.Constructor (siempre con el nombre de la clase)
    public Multiplicacion (int numero){
        //ahora le tengo que dar valor a mi atributo:
        this.numero = numero;
    }
}
