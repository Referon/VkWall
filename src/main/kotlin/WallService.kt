object WallService {

    private var posts = emptyArray<Post>()
    private var nextId = 0

    fun add(post: Post): Post {

        if (posts.isEmpty()) {
            posts += post.copy(id = 0)
        } else {
            posts += post.copy(id = nextId)
        }
        nextId++
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((id, itemPost) in posts.withIndex()) {
            if (itemPost.id == post.id) {
                posts[id] = itemPost.copy(ownerId = itemPost.ownerId, date = itemPost.date)
                return true
            }
        }
        return false
    }
}

