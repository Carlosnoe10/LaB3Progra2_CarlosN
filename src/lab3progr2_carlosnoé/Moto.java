package lab3progr2_carlosnoé;

import java.awt.Color;
import java.util.Date;

public class Moto extends Vehiculos{
    public double LimVeloz;
    public double Peso;
    public double ConsumoDCumbus;

    public Moto(double LimVeloz, double Peso, double ConsumoDCumbus) {
        this.LimVeloz = LimVeloz;
        this.Peso = Peso;
        this.ConsumoDCumbus = ConsumoDCumbus;
    }

    public Moto(double LimVeloz, double Peso, double ConsumoDCumbus, String NumeroPlaca, String Modelo, char Tipo, Color color, Date Anio) {
        super(NumeroPlaca, Modelo, Tipo, color, Anio);
        this.LimVeloz = LimVeloz;
        this.Peso = Peso;
        this.ConsumoDCumbus = ConsumoDCumbus;
    }

    public double getLimVeloz() {
        return LimVeloz;
    }

    public void setLimVeloz(double LimVeloz) {
        this.LimVeloz = LimVeloz;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getConsumoDCumbus() {
        return ConsumoDCumbus;
    }

    public void setConsumoDCumbus(double ConsumoDCumbus) {
        this.ConsumoDCumbus = ConsumoDCumbus;
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
        return "Moto{" + "LimVeloz=" + LimVeloz + ", Peso=" + Peso + ", ConsumoDCumbus=" + ConsumoDCumbus + '}';
    }
    
}
