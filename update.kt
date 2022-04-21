/* Canary.Kotlin | update */

package update

import CanaryAPI
import errorhandler
import kotlin

func main(args: Array<String>) {
	
	CanaryAPI.checkForUpdates()

	for (updates in updates) {

	    CanaryAPI.validateUpdates()
	    CanaryAPI.waitForValidation("5")


	    if (CanaryAPI.validation = null) {

	        println("No updates found, continuing build...")


	        if (errorhandler.ErrorFound = true) {

	            CanaryAPI.stopBuild()
	            CanaryAPI.RunClass("errorhandler.kt")

	        }
	        else {

	            CanaryAPI.continueBuild()

	        }

	    }
	    else {

	        println("Update found, please wait...")
	        println("Updating your canary.kotlin version")

	        CanaryAPI.updateModule("canary.module.kotlin")
	        CanaryAPI.updateModule("canary.krn32")
	        CanaryAPI.updateModule("canary.krn64")

	        CanaryAPI.updateFinish(rule.AfterUpdate, CanaryAPI.continueBuild())

	        println("Update finished. Building...")

	    }

	}

}
