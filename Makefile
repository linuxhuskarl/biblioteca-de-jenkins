build :
	echo "Building!"
	sleep 5
	echo "Done!"

check : passing failing
	echo "Testing!"
	sleep 5
	echo "Done!"

passing :
	true

failing :
	false

publish :
	echo "Publishing!"
	sleep 1
	echo "Done!"

clean :
