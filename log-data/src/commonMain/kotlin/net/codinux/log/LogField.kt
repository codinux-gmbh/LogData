package net.codinux.log

/**
 * Lists all data properties that a [LogEvent] can have.
 */
enum class LogField {
    Message,
    Level,
    Timestamp,
    LoggerName,
    ThreadName,
    Exception,
}