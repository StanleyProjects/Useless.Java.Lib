package org.kepocnhh.useless

object Useless {
    private const val One = 1

    fun getOne(): Int {
        return One
    }

    private fun getTwo(): Int {
        return getOne() + One
    }

    fun getThree(): Int {
        return getTwo() + One
    }
}
