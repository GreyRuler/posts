import org.junit.Test

import org.junit.Assert.*
import java.util.*

class WallServiceTest {

    @Test
    fun add_shouldAddPost() {
        val service = WallService

        service.add(Post(id = UUID.randomUUID().toString(),
                         fromIs = (0..10000).random(),
                         createdBy = (0..10000).random(),
                         text = "",
                         replyOwnerId = (0..10000).random(),
                         replyPostId = (0..10000).random(),
                         friendsOnly = true,
                         comments = Comment(
                             (0..10000).random(),
                             canPost = true,
                             groupsCanPost = true,
                             canClose = true,
                             canOpen = true
                         ),
                         copyright = Copyright(
                             (0..10000).random(),
                             "",
                             "",
                             ""
                         ),
                         likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
                         reposts = Reposts((0..10000).random(), true),
                         views = Views((0..10000).random()),
                         postType = "post",
                         signerId = (0..10000).random(),
                         canPin = true,
                         canDelete = true,
                         canEdit = true,
                         isInteger = (0..10000).random(),
                         markedAsAds = true,
                         isFavorite = true,
                         donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
                         postponedId = (0..10000).random(),
                         attachment = null))

        assertTrue(WallService.array.any())
        WallService.clear()
    }

    @Test
    fun update_shouldUpdatePost() {
        val service = WallService

        service.add(Post(id = UUID.randomUUID().toString(),
            fromIs = (0..10000).random(),
            createdBy = (0..10000).random(),
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts((0..10000).random(), true),
            views = Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = null))
        service.add(Post(id = UUID.randomUUID().toString(),
            fromIs = (0..10000).random(),
            createdBy = (0..10000).random(),
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts((0..10000).random(), true),
            views = Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = null))
        val updateTrue = service.add(Post(id = UUID.randomUUID().toString(),
            fromIs = (0..10000).random(),
            createdBy = (0..10000).random(),
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts((0..10000).random(), true),
            views = Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = null))

        val updateFalse = Post(id = UUID.randomUUID().toString(),
            fromIs = (0..10000).random(),
            createdBy = (0..10000).random(),
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts((0..10000).random(), true),
            views = Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = null)

        val resultFalse = service.update(updateFalse)
        val resultTrue = service.update(updateTrue)

        assertFalse(resultFalse)
        assertTrue(resultTrue)
        WallService.clear()
    }

    @Test
    fun clear() {
        val service = WallService

        service.add(Post(id = UUID.randomUUID().toString(),
            fromIs = (0..10000).random(),
            createdBy = (0..10000).random(),
            text = "",
            replyOwnerId = (0..10000).random(),
            replyPostId = (0..10000).random(),
            friendsOnly = true,
            comments = Comment(
                (0..10000).random(),
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                (0..10000).random(),
                "",
                "",
                ""
            ),
            likes = Likes((0..10000).random(), userLikes = true, canLike = true, canPublish = true),
            reposts = Reposts((0..10000).random(), true),
            views = Views((0..10000).random()),
            postType = "post",
            signerId = (0..10000).random(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isInteger = (0..10000).random(),
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, (0..10000).random(), Placeholder(), true, ""),
            postponedId = (0..10000).random(),
            attachment = null))

        WallService.clear()
        assertTrue(WallService.array.isEmpty())
    }
}