/**
* vars/timeit.groovy
* Simple step to measure execution time
*/
import java.time.Clock

def call(Closure body) {
    def clock = Clock.systemDefaultZone()
    def timeStart = clock.millis()
    body()
    def timeStop = clock.millis()
    def duration = timeStop - timeStart
    echo "${duration} seconds elapsed"
}
