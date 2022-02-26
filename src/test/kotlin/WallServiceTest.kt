import org.junit.After
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_shouldAddPost() {

        val post = WallService.add(
            Post(
                id = null,
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
        )

        assertNotEquals(post.id, 0)
    }

    @Test
    fun update_shouldUpdatePostTrue() {

        val post1 = WallService.add(
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
        val post2 = WallService.add(
            Post(
                id = 0,
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
        )

        val resultTrue = WallService.update(post2)

        assertTrue(resultTrue)
    }

    @Test
    fun update_shouldUpdatePostFalse() {

        val post1 = WallService.add(
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
        val post2 = WallService.add(
            Post(
                id = 0,
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
        )
        val post3 = Post(
            id = 7,
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

        val resultFalse = WallService.update(post3)
        assertFalse(resultFalse)
    }

    @Test
    fun clear() {

        WallService.add(
            Post(
                id = 0,
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
        )

        WallService.clear()
        assertTrue(WallService.array.isEmpty())
    }

    @After
    fun clearArray() {
        WallService.clear()
    }
}