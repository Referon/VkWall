class DocAttachment(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int
) :Attachment("Doc") {
}