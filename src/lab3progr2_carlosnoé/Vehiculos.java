package lab3progr2_carlosnoé;

import java.awt.Color;
import java.util.Date;

public class Vehiculos {

    public String NumeroPlaca;
    public String Modelo;
    public String Marca;
    public char Tipo;
    public Color color;
    public Date Anio;

    public Vehiculos() {
    }

    public Vehiculos(String NumeroPlaca, String Modelo, String Marca, char Tipo, Color color, Date Anio) {
        this.NumeroPlaca = NumeroPlaca;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Tipo = Tipo;
        this.color = color;
        this.Anio = Anio;
    }



    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public char getTipo(char Type1) {
        return Tipo;
    }

    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAnio() {
        return Anio;
    }

    public void setAnio(Date Anio) {
        this.Anio = Anio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return ". Vehiculo Mostrado tiene" + "NumeroPlaca= " + NumeroPlaca + "\n"+ "Modelo= " + Modelo + "\n"+"Tipo= " + Tipo + "\n"+ "color= " + color + "\n"+ "Anio= " + Anio + '}';
    }

}
