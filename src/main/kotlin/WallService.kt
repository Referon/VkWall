object WallService {

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post

        if (posts.isEmpty()) {
            post.id = 0
        } else {
            posts.last().id + 1
        }
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

