# Log File Parser

You work at a devops company, and you need to parse log files.

You get log files that are in this format:

    W, [2014-05-10T13:49:19.049260 #83516]  WARN -- : deliver B2C systems
    W, [2014-05-10T13:49:19.049408 #83516]  WARN -- : transition sticky bandwidth

That is...

    [log level char], [<date> #<processid>]  <log level> -- : <message>

## Logic

You need to write code that can parse these logs and be able answer questions like:

* What are all the dates the log covers
* How many log messages were added on a given date
* How many log messages were there of each type (DEBUG / WARN etc...)

## File IO

In your `bin` directory, write some code that reads the `data/log.log` file and passes it into your class, then
prints the results of the various reports to STDOUT.
