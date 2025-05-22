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


    override fun toString() = "$level [$loggerName] $message"
}