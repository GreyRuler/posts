import java.time.LocalDateTime
import java.util.*

data class Post(
    var id: String = "0",
    val ownerId: String = UUID.randomUUID().toString(),
    var fromIs: Int,
    var createdBy: Int,
    val date: LocalDateTime = LocalDateTime.now(),
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Comment,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var postType: String,
    var signerId: Int,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isInteger: Int,
    var markedAsAds: Boolean,
    var isFavorite: Boolean,
    var donut: Donut,
    var postponedId: Int
)

data class Comment(
    var count: Int,
    var canPost: Boolean,
    var groupsCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
)

data class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

data class Reposts(
    val count: Int,
    val userReposted: Boolean
)

data class Views(
    val count: Int
)

data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

class Placeholder