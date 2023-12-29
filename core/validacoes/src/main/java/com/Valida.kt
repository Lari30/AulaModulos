package com

import com.larisantos.validacoes.ValidacaoCampos

//Pública ou aberta aos módulos
object Valida {

    fun validarData(){

    }
    fun validarEmail(){
        ValidacaoCampos.validarCampoEmail()
        ValidacaoCampos.validarCampoVazio()
    }
}