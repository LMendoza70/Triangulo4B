package com.example.triangulo4b.Modelos

import com.example.triangulo4b.Contratos.ContratoRectangulo

class RectanguloModelo: ContratoRectangulo.Modelo {
    override fun calculaArea(base: Float, altura: Float): Float {
        return base*altura
    }

    override fun calculaPerimetro(base: Float, altura: Float): Float {
        return 2*(base+altura)
    }

    override fun verificaRectangulo(base: Float, altura: Float): Boolean {
        if(base!=altura)
            return true
        else
            return false
    }
}