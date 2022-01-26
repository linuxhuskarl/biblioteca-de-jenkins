/**
* vars/timeit.groovy
* Simple step to measure execution time
*/
import groovy.time.Date
import groovy.time.TimeCategory

def call(Closure body) {
    def timeStart = new Date()
    body()
    def timeStop = new Date()
    def duration = TimeCategory.minus(timeStop, timeStart)
    echo "${duration} seconds elapsed"
}
