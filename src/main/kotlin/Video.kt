class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int = 0,
    val image: Array<Image>,
    val firstFrame: Array<FirstFrame>,
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
    _type: String,
    val balance: Int,
    _liveStatus: String,
    val live: Int = 1,
    val upcoming: Int,
    val spectators: Int,
    val likes: Likes,
    val reposts: Reposts
) : Attachment {
    override val typeAttachment: String = "video"
    private val type: String
    init {
        if (arrayListOf("video", "music_video", "movie").contains(_type)) {
            type = _type
        } else {
            error("Не корректный тип данных")
        }
    }
    private val liveStatus: String
    init {
        if (arrayListOf("waiting", "started", "finished", "failed", "upcoming").contains(_liveStatus)) {
            liveStatus = _liveStatus
        } else {
            error("Не корректный тип данных")
        }
    }
}

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
