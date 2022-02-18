class Photo( val id: Int,
             val albumId: Int,
             val ownerId: Int,
             val userId: Int,
             val text: String,
             val date: String,
             val sizes: Sizes,
             val width: Int,
             val height: Int) : Attachment{
    override val typeAttachment: String = "photo"
}

data class Sizes (
    val type: String,
    val url: String,
    val width: Int,
    val height: Int)