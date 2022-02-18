class History(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val expiresAt: Int,
    val isExpires: Boolean,
    val isDeleted: Boolean,
    val canSee: Int,
    val seen: Int,
    _type: String,
    val photo: Photo,
    val video: Video,
    val link: Link,
    val parentStoryOwnerId: Int,
    val parentStoryId: Int,
    val parentStory: Int,
    val replies: Replies,
    val canReply: Boolean,
    val canShare: Boolean,
    val canComment: Boolean,
    val clickableStickers: ClickableStickers,
    val views: Int,
    val accessKey: String
) : Attachment {
    override val typeAttachment: String = "history"
    private val type: String
    init {
        if (arrayListOf("photo", "video").contains(_type)) {
            type = _type
        } else {
            error("Не корректный тип данных")
        }
    }
}

data class Link(
    val text: String,
    val url: String
)

data class Replies(
    val count: Int,
    val new: Int
)

data class ClickableStickers(
    val originalWidth: Int,
    val originalHeight: Int,
    val clickableStickers: Array<ClickableStickers>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClickableStickers

        if (originalWidth != other.originalWidth) return false
        if (originalHeight != other.originalHeight) return false
        if (!clickableStickers.contentEquals(other.clickableStickers)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = originalWidth
        result = 31 * result + originalHeight
        result = 31 * result + clickableStickers.contentHashCode()
        return result
    }
}