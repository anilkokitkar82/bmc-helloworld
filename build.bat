echo "get latest code from git--------------------------"
git pull

echo "build and execute JUnit---------------------------"
mvn clean package

cd C:\git_repo\mit_code\target 

echo "deploy war file to Tomcat--------------------------"
cp helloworld.war C:\DEM_LAB_scripts\apache-tomcat-9.0.37\webapps