package org.kepocnhh.useless

/**
 * @author [Stanley Wintergreen](https://github.com/kepocnhh)
 * @since 0.6.0
 */
object Useless {
    private const val One = 1

    /**
     * This function should always return exactly 1.
     *
     * Usage:
     * ```
     * val expected = 1
     * val actual = Useless.getOne()
     * assertEquals(expected, actual)
     * ```
     * @author [Stanley Wintergreen](https://github.com/kepocnhh)
     * @since 0.6.0
     */
    fun getOne(): Int {
        return One
    }

    private fun getTwo(): Int {
        return getOne() + One
    }

    /**
     * This function should always return exactly 3.
     *
     * Usage:
     * ```
     * val expected = 3
     * val actual = Useless.getThree()
     * assertEquals(expected, actual)
     * ```
     * @author [Stanley Wintergreen](https://github.com/kepocnhh)
     * @since 0.6.0
     */
    fun getThree(): Int {
        return getTwo() + One
    }
}
