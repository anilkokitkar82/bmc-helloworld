#pull latest code from git
echo "get latest code from git--------------------------"
git pull

#maven build 
echo "build and execute JUnit---------------------------"
mvn clean package

#copy war file to tomcats webapps

cd target 

echo "deploy war file to Tomcat--------------------------"
cp helloworld.war /Users/akokitka/Documents/Anil\ Backup/Installables/apache-tomcat-9.0.37/webapps/
