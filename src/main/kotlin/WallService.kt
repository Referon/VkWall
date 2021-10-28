object WallService {

    private var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post

        for ((id, post) in posts.withIndex()) {
            if (post.id != this.id) {
                posts[id] = post.copy(id = post.id + 1)
            }
        }
        id++
        return posts.component1()

    }

    fun update(post: Post): Boolean {
        for ((id, post) in posts.withIndex()) {

            if (post.id == this.id - 1) {
                posts[id] = post.copy(id = this.id, date = post.date)
                return true
            }
        }
        return false
    }
}

