
allprojects {
    group = "net.codinux.log"
    version = "1.1.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }


    ext["sourceCodeRepositoryBaseUrl"] = "github.com/codinux-gmbh/LogData"

    ext["projectDescription"] = "Basic model for Loggers like LogLevel, LogEvent, ..."
}