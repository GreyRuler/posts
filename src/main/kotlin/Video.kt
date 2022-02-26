class Video(
    val id: Int?,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int = 0,
    val image: Array<Image>?,
    val firstFrame: Array<FirstFrame>?,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Int,
    val accessKey: String,
    val processing: Int = 1,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubscribe: Boolean,
    val canAddToFaves: Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int = 1,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Int = 1,
    val upcoming: Int,
    val spectators: Int,
    val likes: Post.Likes,
    val reposts: Post.Reposts) : Attachment {

    data class Image(
        val height: Int,
        val url: String,
        val width: Int,
        val withPadding: Int = 1
    )

    data class FirstFrame(
        val height: Int,
        val url: String,
        val width: Int,
    )
}

