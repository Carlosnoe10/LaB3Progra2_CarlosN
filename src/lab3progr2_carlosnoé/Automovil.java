package lab3progr2_carlosnoé;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculos{
    public String TipoCombu;
    public String TipoTrans;
    public int NumeroDePuertas;
    public int NumeroDeAsientos;

    public Automovil(String TipoCombu, String TipoTrans, int NumeroDePuertas, int NumeroDeAsientos) {
        this.TipoCombu = TipoCombu;
        this.TipoTrans = TipoTrans;
        this.NumeroDePuertas = NumeroDePuertas;
        this.NumeroDeAsientos = NumeroDeAsientos;
    }

    public Automovil(String TipoCombu, String TipoTrans, int NumeroDePuertas, int NumeroDeAsientos, String NumeroPlaca, String Modelo, String Marca, char Tipo, Color color, Date Anio) {
        super(NumeroPlaca, Modelo, Marca, Tipo, color, Anio);
        this.TipoCombu = TipoCombu;
        this.TipoTrans = TipoTrans;
        this.NumeroDePuertas = NumeroDePuertas;
        this.NumeroDeAsientos = NumeroDeAsientos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }



    public String getTipoCombu() {
        return TipoCombu;
    }

    public void setTipoCombu(String TipoCombu) {
        this.TipoCombu = TipoCombu;
    }

    public String getTipoTrans() {
        return TipoTrans;
    }

    public void setTipoTrans(String TipoTrans) {
        this.TipoTrans = TipoTrans;
    }

    public int getNumeroDePuertas() {
        return NumeroDePuertas;
    }

    public void setNumeroDePuertas(int NumeroDePuertas) {
        this.NumeroDePuertas = NumeroDePuertas;
    }

    public int getNumeroDeAsientos() {
        return NumeroDeAsientos;
    }

    public void setNumeroDeAsientos(int NumeroDeAsientos) {
        this.NumeroDeAsientos = NumeroDeAsientos;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
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

    @Override
    public String toString() {
        return "Automovil{" + "TipoCombu=" + TipoCombu + ", TipoTrans=" + TipoTrans + ", NumeroDePuertas=" + NumeroDePuertas + ", NumeroDeAsientos=" + NumeroDeAsientos + '}';
    }
    
    
    
    
    
    
    
}
