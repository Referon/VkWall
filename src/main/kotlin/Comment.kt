data class Comment(
    val id: Int,
    val postId: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Any,
    val replyToUser: Int,
    val attachments: Int,
    val parentsStack: Any,
    val thread: Any
) {
}