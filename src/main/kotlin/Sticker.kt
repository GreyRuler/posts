class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<Image>,
    val imagesWithBackground: Array<Image>,
    val animationUrl: String,
    val isAllowed: Boolean
) : Attachment {
    override val typeAttachment: String = "sticker"
}