package `fun`.fantasea.nano.bangumiapi.exception

class BangumiApiException(message: String?, throwable: Throwable?) : Exception(message, throwable) {
    constructor(message: String) : this(message, null)
    constructor(throwable: Throwable) : this(null, throwable)
}
