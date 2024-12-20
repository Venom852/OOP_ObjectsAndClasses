package ru.netology

import junit.framework.TestCase.*
import org.junit.Before
import org.junit.Test

import java.time.LocalDate

class WallServiceTest {

    @Test
    fun add_post() {
        val post = Post()
        val result = WallService.add(post)

        assertEquals(Post(id = 1), result)
    }

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun update_existingId() {
        val post = Post(id = 1)
        WallService.add(Post())

        val result = WallService.update(post)

        assertTrue(result)
    }

    @Test
    fun update_notExistingId() {
        val post = Post()
        WallService.add(Post())

        val result = WallService.update(post)

        assertFalse(result)
    }
}