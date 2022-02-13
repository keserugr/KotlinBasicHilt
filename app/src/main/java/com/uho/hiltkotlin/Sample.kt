package com.uho.hiltkotlin

import javax.inject.Inject

class Sample
@Inject constructor(@FirstImplementor private val myInterfaceImp: MyInterface,
                    @SecondImplementor private val mySecondInterfaceImp: MyInterface)
{
    fun myFunction(): String{
        return "working ${myInterfaceImp.myPrintFunction()}"
    }

    fun mySecondFunction(): String{
        return "working ${mySecondInterfaceImp.myPrintFunction()}"
    }




}