package net.codinux.log

open class LogEvent(
    open val level: LogLevel,
    open val message: String,
    open val loggerName: String,
    open val threadName: String? = null,
    open val exception: Throwable? = null,
) {
    override fun toString() = "$level [$loggerName] $message"
}