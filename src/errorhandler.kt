/* Canary.Kotlin | errorhandler */

package errorhandler

import CanaryAPI
import kotlin

var ErrorFound = false
val errors = listOf("Invalid Syntax", "Unexpected Format", "Undefined variable", "Unknown Error")


func main(args: Array<String>) {
    
    CanaryAPI.checkForErrors()
    CanaryAPI.returnErrorStatus() // returns the error status "true" or "false".

	if (ErrorFound = true) {


	    println("Error found on line $errorLine . $error .") // errorLine implemented from CanaryAPI.

	    for (error in errors) {

	        println(errors)

	        CanaryAPI.stopBuild()
	        CanaryAPI.awaitForRun()

	    }

	}
	else {

	    // println("") | No need to print anything since there was no error

	    CanaryAPI.continueBuild()

	}

}
