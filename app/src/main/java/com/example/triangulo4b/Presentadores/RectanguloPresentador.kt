package com.example.triangulo4b.Presentadores

import com.example.triangulo4b.Contratos.ContratoRectangulo
import com.example.triangulo4b.Modelos.RectanguloModelo

class RectanguloPresentador(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador {
    private val modelo: ContratoRectangulo.Modelo = RectanguloModelo()

    override fun calculaArea(base: Float, altura: Float) {
        if(modelo.verificaRectangulo(base,altura)){
            val area =modelo.calculaArea(base,altura)
            vista.muestraArea(area)
        }else{
            vista.muestraError("Datos no validos")
        }
    }

    override fun calculaPerimetro(base: Float, altura: Float) {
        if(modelo.verificaRectangulo(base,altura)){
            val perimetro =modelo.calculaPerimetro(base,altura)
            vista.muestraPerimetro(perimetro)
        }else{
            vista.muestraError("Datos no validos")
        }
    }
}