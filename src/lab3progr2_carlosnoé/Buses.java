package lab3progr2_carlosnoé;

import java.awt.Color;
import java.util.Date;

public class Buses extends Vehiculos{
    public int CapacidadPassa;
    public int NumeroEjes;
    public double Longitud;

    public Buses(int CapacidadPassa, int NumeroEjes, double Longitud) {
        this.CapacidadPassa = CapacidadPassa;
        this.NumeroEjes = NumeroEjes;
        this.Longitud = Longitud;
    }

    public Buses(int CapacidadPassa, int NumeroEjes, double Longitud, String NumeroPlaca, String Modelo, char Tipo, Color color, Date Anio) {
        super(NumeroPlaca, Modelo, Tipo, color, Anio);
        this.CapacidadPassa = CapacidadPassa;
        this.NumeroEjes = NumeroEjes;
        this.Longitud = Longitud;
    }

    public int getCapacidadPassa() {
        return CapacidadPassa;
    }

    public void setCapacidadPassa(int CapacidadPassa) {
        this.CapacidadPassa = CapacidadPassa;
    }

    public int getNumeroEjes() {
        return NumeroEjes;
    }

    public void setNumeroEjes(int NumeroEjes) {
        this.NumeroEjes = NumeroEjes;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
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

    public char getTipo() {
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

    @Override
    public String toString() {
        return "Buses{" + "CapacidadPassa=" + CapacidadPassa + ", NumeroEjes=" + NumeroEjes + ", Longitud=" + Longitud + '}';
    }
    
    
    
}
