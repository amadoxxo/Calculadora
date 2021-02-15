package com.example.calculadora;

public class Resultado {

    double numUno = 0;
    double numDos = 0;
    double res = 0;

    public Resultado(double numUno, double numDos, double res) {
        this.numUno = numUno;
        this.numDos = numDos;
        this.res = res;
    }

    public double sumar(double numUno, double numDos) {

        this.res = this.numUno + this.numDos;

        return this.res;
    }

    public double restar(double numUno, double numDos) {

        this.res = this.numUno - this.numDos;

        return this.res;
    }

    public double multiplicar(double numUno, double numDos) {

        this.res = this.numUno * this.numDos;

        return this.res;
    }

    public double dividir(double numUno, double numDos) {

        this.res = this.numUno / this.numDos;

        return this.res;
    }
}
