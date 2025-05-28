package net.codinux.log

import net.dankito.datetime.Instant

open class LogEvent(
    open val timestamp: Instant? = null,
    open val level: LogLevel,
    open val message: String,
    open val loggerName: String,
    open val threadName: String? = null,
    open val exception: Throwable? = null,
) {

    // for systems without timestamp
    constructor(level: LogLevel, message: String, loggerName: String, threadName: String? = null, exception: Throwable? = null)
            : this(null, level, message, loggerName, threadName, exception)


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LogEvent) return false

        if (timestamp != other.timestamp) return false
        if (level != other.level) return false
        if (message != other.message) return false
        if (loggerName != other.loggerName) return false
        if (threadName != other.threadName) return false
        if (exception != other.exception) return false

        return true
    }

    override fun hashCode(): Int {
        var result = timestamp?.hashCode() ?: 0
        result = 31 * result + level.hashCode()
        result = 31 * result + message.hashCode()
        result = 31 * result + loggerName.hashCode()
        result = 31 * result + (threadName?.hashCode() ?: 0)
        result = 31 * result + (exception?.hashCode() ?: 0)
        return result
    }


    override fun toString() = "$level [$loggerName] $message"

}