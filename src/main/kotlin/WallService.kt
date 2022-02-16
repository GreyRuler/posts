import java.util.*

object WallService {

    var array = mutableListOf<Post>()

    fun add(post: Post): Post {
        post.id = UUID.randomUUID().toString()
        array += post
        return post
    }

    fun update(post: Post): Boolean {
        for (postFromArr in array) {
            if (postFromArr.id == post.id) {
                postFromArr.id = UUID.randomUUID().toString()
                postFromArr.fromIs = (0..10000).random()
                postFromArr.createdBy = (0..10000).random()
                postFromArr.text = ""
                postFromArr.replyOwnerId = (0..10000).random()
                postFromArr.replyPostId = (0..10000).random()
                postFromArr.friendsOnly = true
                postFromArr.comments = Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                )
                postFromArr.copyright = Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                )
                postFromArr.likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true)
                postFromArr.reposts = Reposts((0..10000).random(), true)
                postFromArr.views = Views((0..10000).random())
                postFromArr.postType = "post"
                postFromArr.signerId = (0..10000).random()
                postFromArr.canPin = true
                postFromArr.canDelete = true
                postFromArr.canEdit = true
                postFromArr.isInteger = (0..10000).random()
                postFromArr.markedAsAds = true
                postFromArr.isFavorite = true
                postFromArr.donut = Donut(true, (0..10000).random(), Placeholder(), true, "")
                postFromArr.postponedId = (0..10000).random()
                return true
            }
        }
        return false
    }

    fun clear() {
        array = mutableListOf()
    }
}