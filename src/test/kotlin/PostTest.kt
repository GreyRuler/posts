import org.junit.Test

import org.junit.Assert.*

class PostTest {

    @Test
    fun testToString() {
        val string = "id: 1\n" +
                    "ownerId: 1\n" +
                    "fromIs: null\n" +
                    "createdBy: null\n" +
                    "date: 17.02.2022\n" +
                    "text: \n" +
                    "replyOwnerId: 1\n" +
                    "replyPostId: 1\n" +
                    "friendsOnly: true\n" +
                    "comments: Comment(count=1, canPost=true, groupsCanPost=true, canClose=true, canOpen=true)\n" +
                    "copyright: Copyright(id=1, link=, name=, type=),\n" +
                    "likes: Likes(count=1, userLikes=true, canLike=true, canPublish=true)\n" +
                    "reposts: Reposts(count=1, userReposted=true)\n" +
                    "views: Views(count=1)\n" +
                    "postType: post\n" +
                    "signerId: 1\n" +
                    "canPin: true\n" +
                    "canDelete: true\n" +
                    "canEdit: true\n" +
                    "isInteger: 1\n" +
                    "markedAsAds: true\n" +
                    "isFavorite: true\n" +
                    "donut: null\n" +
                    "postponedId: 1"
        val post = Post(id = "1",
                        ownerId = "1",
                        fromIs = null,
                        createdBy = null,
                        date = "17.02.2022",
                        text = "",
                        replyOwnerId = 1,
                        replyPostId = 1,
                        friendsOnly = true,
                        comments = Comment(
                            1,
                            canPost = true,
                            groupsCanPost = true,
                            canClose = true,
                            canOpen = true
                        ),
                        copyright = Copyright(
                            1,
                            "",
                            "",
                            ""
                        ),
                        likes = Likes(1, userLikes = true, canLike = true, canPublish = true),
                        reposts = Reposts(1, true),
                        views = Views(1),
                        postType = "post",
                        signerId = 1,
                        canPin = true,
                        canDelete = true,
                        canEdit = true,
                        isInteger = 1,
                        markedAsAds = true,
                        isFavorite = true,
                        donut = null,
                        postponedId = 1)

        val result = post.toString()

        assertEquals(result, string)
    }
}