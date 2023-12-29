package com.larisantos.aulamodulos.di

import com.larisantos.domain.GetPedidoUseCase

object DomainModule {

    fun providePedidoUseCase() : GetPedidoUseCase{

        return GetPedidoUseCase()

    }
}