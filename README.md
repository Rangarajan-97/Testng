#You can run the program using eclipse.
The development tools which i used is eclipse , selenium and used a framework called Testng.
You can begin to read the code from loginpage where i have written the entire code and runner file is used to run the all the methods.
JAVA Setup for MacOS:

Check Java version in Terminal (Use Command  java -version)whether Java installed or not. If it is not installed, it would show “No Java runtime present, requesting to install” message.

Install latest version of java in official oracle website mentioned below.,
https://www.oracle.com/in/java/technologies/javase-downloads.html
Download the  jdk version 8 of Macos installer with .dmg file.
Run and Install the downloaded jdk file on Macos.
Setup java home environment variable using below steps(for MAC OS -  version below 11):
Open Terminal and execute below commands
Go to Java home path using “/usr/libexec/java_home -v8” command (please note that java version may change at the time of your installation)
Run the command “vim ~/.bash_profile”
Use command “ls -al” to check list of files in base profile. (Optional)

Set java home environment variable using “export JAVA_HOME=$(/usr/libexec/java_home) command.
To refresh bash profile run the command “source ~/.bash_profile“ .
Execute “echo $JAVA_HOME” command to check whether java home variable set or not. The result will be “/Library/Java/JavaVirtualMachines/jdk-8.0.1.jdk/Contents/Home.
Check java version using “java -version” command.
Setup java home environment variable using below steps(for MAC OS -  version above 11):
Follow the above steps, changes only in environment variable window as given below.,
Add env var in ~/.zshrc_profile as follows; (path varies based on your JDK version)
export JAVA_HOME = /Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home
source ~/.zshrc_profile

Steps to Install Eclipse:
Download Eclipse using the link - https://www.eclipse.org/downloads/
Click Download Packages link as shown below
Click MacOS as highlighted below.,
Click download button
Install and run the downloaded file.
Select “Eclipse IDE for Java Developer” option and then proceed to launch.


Steps to install selenium :
Download selenium using the link - https://www.selenium.dev/downloads/
Uzip the selenium files and go to  eclipse --> Right click on Project ---> properties--> java build path--> click class and add the external jar files of selenium and click apply and close.

Steps to install Testng:
Go to help and click on eclipse marketplace and search for testng and click on download and it will be installed and ask you restart your eclipse, give ok and everything will be installed.
