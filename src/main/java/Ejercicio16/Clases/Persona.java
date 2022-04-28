package Ejercicio16.Clases;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;
    private String sexo;
    private Double peso;
    private Double altura;


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = "H";
        this.peso = 0.0;
        this.altura = 0.0;

    }

    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
    }

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }



    public Integer calcularIMC(){
        Integer resultado = 1;
        double valorIMC = this.peso/(Math.pow(this.altura,2));
        if (valorIMC <20){
            return resultado = -1;
        } else if (valorIMC >= 20 && valorIMC <= 25){
            return resultado = 0;
        } return resultado;
    }

    public Boolean esMayorDeEdad(){
        return (this.edad >= 18) ? true: false;
    }

    public void comprobarSexo(String sexo){
         if (!this.sexo.equals("H"))
             setSexo("H");
    }

    private String generarDNI() {
        Integer numRandom;
        Character letra;

        numRandom = numeroDNI();
        letra = letraDNI(numRandom);

        return String.valueOf(numRandom) + letra;
    }
    private Integer numeroDNI(){
        return (int) (Math.random()*100000000);
    }

    private Character letraDNI(Integer numeroDNI){

        Integer residuo = numeroDNI % 23;

        Character [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letras[residuo];

    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Edad: " + edad + " años" + "\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg" + "\n" +
                "Altura: " + altura + " m" ;

    }
}
