package com.larisantos.aulamodulos.presentation

import com.larisantos.aulamodulos.di.DomainModule

class PedidosViewModel {

    fun recuperarDadosPedido(){

        fun recuperarDadosPedido(){
            val useCase = DomainModule.providePedidoUseCase()
            useCase.getPedido()
        }
    }
}