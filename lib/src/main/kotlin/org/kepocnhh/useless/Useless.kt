package org.kepocnhh.useless

object Useless {
    fun getOne(): Int {
        return 1
    }

    private fun getTwo(): Int {
        return getOne() + 1
    }

    private fun getThree(): Int {
        return getTwo() + 1
    }
}
