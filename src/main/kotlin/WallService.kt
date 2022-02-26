object WallService {

    var array = mutableListOf<Post>()
    var arrayID = mutableListOf<Int>()

    fun add(post: Post): Post {

        var id = (0..100000).random()
        while (arrayID.contains(id)) {
            id = (0..100000).random()
        }
        arrayID += id
        val olderPost = post.copy(id = id)
        arrayID += id

        array += olderPost

        return olderPost
    }

    fun update(post: Post): Boolean {
        for (postFromArr in array) {
            if (postFromArr.id == post.id) {
                postFromArr.copy(ownerId = post.ownerId,
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
                return true
            }
        }
        return false
    }

    fun clear() {
        array = mutableListOf()
    }
}