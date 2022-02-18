class File( val id: Int,
            val ownerId: Int,
            val title: String,
            val size: Int,
            val ext: String,
            val url: String,
            val date: Int,
            _type: Int,
            val preview: Preview) : Attachment {
    override val typeAttachment: String = "file"
    private val type: Int
    init {
        if (_type in 0..8) {
            type = _type
        } else {
            error("Не корректный тип данных")
        }
    }
}

data class Preview(
    val photo: PhotoFile,
    val graffiti: Graffiti,
    val audio_message: AudioMessage
)

data class PhotoFile(
    val sizes: Sizes
)

data class Graffiti(
    val src: String,
    val width: Int,
    val height: Int,
)

data class AudioMessage(
    val duration: Int,
    val waveform: Array<Int>,
    val linkOgg: String,
    val linkMp3: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AudioMessage

        if (duration != other.duration) return false
        if (!waveform.contentEquals(other.waveform)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = duration
        result = 31 * result + waveform.contentHashCode()
        return result
    }
}