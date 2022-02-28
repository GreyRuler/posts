object WallService {

    val list = mutableListOf<Post>()
    const val MAXID = 0 // обусловленно предположением в 1 млрд постов

    fun add(post: Post): Post {
        var id: Int
        do {
            id = (0..MAXID).random()
        } while (list.any { it.id == id })

        val olderPost = post.copy(id = id)
        list.add(olderPost)

        return olderPost
    }

    fun update(post: Post): Boolean {
        for (postFromArr in list) {
            if (postFromArr.id == post.id) {
                val copy = postFromArr.copy(
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isInteger = post.isInteger,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                list.set(list.indexOf(postFromArr), copy)
                return true
            }
        }
        return false
    }
}