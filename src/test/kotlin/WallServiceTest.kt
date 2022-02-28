import org.junit.After
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_shouldAddPost() {

        val post = Post(
            id = 0,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random()
        )

        val result = WallService.add(post)

        assertNotEquals(result.id, 0)
    }

    @Test
    fun update_shouldUpdatePostTrue() {

        val post = WallService.add(
            Post(
                id = 0,
                ownerId = 1,
                fromId = (0..10000).random(),
                createdBy = (0..10000).random(),
                date = 1645866739,
                text = "Hi!",
                replyOwnerId = (0..10000).random(),
                replyPostId = (0..10000).random(),
                friendsOnly = true,
                comments = Post.Comment(
                    (0..10000).random(),
                    canPost = true,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
                ),
                copyright = Post.Copyright(
                    (0..10000).random(),
                    "",
                    "",
                    ""
                ),
                likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                reposts = Post.Reposts((0..10000).random(), true),
                views = Post.Views((0..10000).random()),
                postType = "post",
                signerId = (0..10000).random(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isInteger = (0..10000).random(),
                markedAsAds = true,
                isFavorite = true,
                donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
                postponedId = (0..10000).random()
            )
        )

        val resultTrue = WallService.update(post)

        assertTrue(resultTrue)
    }

    @Test
    fun update_shouldUpdatePostFalse() {

        val post1 = Post(
            id = 0,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "Hi!",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random()
        )
        var id: Int
        do {
            id = (0..WallService.MAXID).random()
        } while (WallService.list.any { it.id == id })
        val post2 = Post(
            id = id,
            ownerId = 1,
            fromId = (0..10000).random(),
            createdBy = (0..10000).random(),
            date = 1645866739,
            text = "Hello",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Post.Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Post.Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Post.Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts((0..10000).random(), true),
            views = Post.Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, (0..10000).random(), Post.Donut.Placeholder(), true, ""),
            postponedId = (0..10000).random()
        )

        WallService.add(post1)
        val resultFalse = WallService.update(post2)

        assertFalse(resultFalse)
    }

    @After
    fun clearArray() {
        WallService.list.clear()
    }
}