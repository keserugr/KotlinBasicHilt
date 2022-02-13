package com.uho.hiltkotlin

import javax.inject.Inject

class MyFirstInterfaceImp
    @Inject constructor(): MyInterface {
    override fun myPrintFunction(): String {
        return "My First Interface Implementation"
    }
}