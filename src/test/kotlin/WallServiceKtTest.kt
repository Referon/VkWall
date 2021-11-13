import org.junit.Test

import org.junit.Assert.*

class WallServiceKtTest {

    @Test
    fun add() {
        val post1 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,3,3,3))
        val post2 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,2,2,2))
        val post3 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,2,2,2))
        val post4 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,2,2,2))
        val result = WallService.add(
            post = post1
        )
        assertTrue(post3.id != 0)
    }

    @Test
    fun updateTrue() {
        val post1 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,2,2,2))
        val resultTrue = WallService.update(
            post = post1
        )
        assertTrue(resultTrue)
    }
    @Test
    fun updateFalse() {
        val resultFalse = WallService.update(
            post = Post(7, 2, 2, 2, 2, "2", 2, 2, 2, 2, 2, 2, 2, 2, "2", 2, true, true, true, true, true, true, 2, 2,2,2,2)
        )
        assertFalse(resultFalse)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val result = WallService.createComment(
            comment = Comment(1, 6, 2, 2, "2", 2, 2, 2, 2, 2)
        )
    }

    @Test
    fun createCommentIsTrue() {
        val post1 = WallService.add(Post(0,2,2,2,2,"2",2,2,2,2,2,2,2,2,"2",2,true,true,true,true,true,true,2,2,2,2,2))
        val coment1 = Comment(1, 0, 2, 2, "2", 2, 2, 2, 2, 2)

        val result = WallService.createComment(
            comment = coment1
        )
    }




}