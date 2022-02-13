package com.uho.hiltkotlin

import javax.inject.Inject

class MySecondInterfaceImp
@Inject constructor() : MyInterface{
    override fun myPrintFunction(): String {
        return "My second Interface Implementation"
    }
}