package com.als.gblesson2.expiriment

import com.als.gblesson2.data.Weather

class TestClass {

    fun job(): Unit {
        var notNullable: String = ""

        var nullable: String? = ""
        //nullable = null

        //nullable = notNullable

        if (nullable != null) {
            val len = nullable.length
            notNullable = nullable
        }
        val lenSafe = nullable?.length

        val w: Weather?
        w = Weather()
        val lenCity: Int = w?.city?.city?.length ?: 0
        val lenNotNull: Int = nullable!!.length
        notNullable = nullable!!
        TestJavaClass.i?.length
        val any = Any()

        var array: Array<String> = arrayOf("fsdgsd", "sdgsd", "sfdsf")
        array[2] = "fsdfergs"
        val value = array[0]
        array.size

        val list: List<String> = mutableListOf("ds", "sdfsdfrg", "sdfdsfsdf", "", "")
        val resultList = list.filter { element -> element.length > 3 }

        val intList = list.map { it.length }
        val strList = intList.map { intToStr(it) }
        val filteredIntList =
            list.filter { element -> element.length > 3 }
                .map { it.length }
                .filter { it > 4 }
                .sortedBy { it }

        val findVal = list.find { it == "sdfsdfrg" }
        val count = list.count { it == ""}
        val ktStr = "${w.feelsLike} oshushenie ${w.temperature}fdsgfsg ${count}"
        val str = w.feelsLike.toString() + " oshushenie" + w.temperature.toString() + "fdsgfsg"
        val viewState : BaseViewState<Any, Int> = BaseViewState<String, Int>()
        val obj : Any = viewState.doIt()
    }

    private fun star(l: List<*>){

    }

    private fun intToStr(i: Int): String =
        when (i) {
            0 -> "nol"
            1 -> "odin"
            else -> "mnogo"
        }

}