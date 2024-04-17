package `fun`.fantasea.bangumiapi.entity.respentity

data class Image(
    val byteArray: ByteArray,
) : ApiByteArrayResponseEntity {
    companion object {
        @JvmStatic
        fun fromByteArray(byteArray: ByteArray): Image {
            return Image(byteArray)
        }

        fun ByteArray.toImage(): Image {
            return Image(this)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Image

        return byteArray.contentEquals(other.byteArray)
    }

    override fun hashCode(): Int {
        return byteArray.contentHashCode()
    }
}
