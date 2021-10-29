import org.junit.Test

import org.junit.Assert.*

class WallServiceKtTest {

    @Test
    fun add() {
        val post1 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2))
        val post2 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2))
        val post3 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2))
        val post4 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2))
        val result = WallService.add(
            post = post1
        )
        assertEquals(true,result.id != 0)
    }

    @Test
    fun update() {
        val post1 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2))
        val resultTrue = WallService.update(
            post = post1
        )
        assertEquals(true,resultTrue)

        val resultFalse = WallService.update(
            post = Post(7,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2)
        )
        assertEquals(false,resultFalse)

    }

}