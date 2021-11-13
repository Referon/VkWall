object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<ReportComment>()
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

    fun createComment(comment: Comment) {
        var commentAdd = false

        for ((index, itemPost) in posts.withIndex()) {

            if (itemPost.id == comment.postId) {
                comments += comment
                commentAdd = true
            }
        }
        if (commentAdd == false) {
            throw PostNotFoundException("Пост не найден")
        }

    }

    fun reportComment(report: ReportComment) {
        var reportAdd = false
        for ((id, itemComment) in comments.withIndex()) {

            if (report.commentId == itemComment.id && (report.reason in 0..8)) {
                reports += report
                reportAdd = true
            } else if (report.reason < 0 || report.reason > 8) {
                throw ReasonNotFoundException("Причина указана не верно")
            }
        }
        if (reportAdd == false) {
            throw CommentIdNotFoundException("Комментарий не найден")
        }
    }
}

