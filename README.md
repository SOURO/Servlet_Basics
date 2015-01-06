Servlet_Basics
==============
It will conatins few basics examples and a theory to start with Servlet.
For details please visit "http://www.tutorialspoint.com/servlets/index.htm".
-------------------------------------------------------------------------
a. Install jdk.
b. Install eclipse ide.
c. Install tomcat.
d. In eclipse set classpath the jar "...apache-tomcat/lib/servlet-api.jar".

Each and Every Code you find here, do the followings,
1. If it is a java class in the list that i have given then copy the folder "..bin/com" listed here in tomcat
<Tomcat-installation-directory>/webapps/ROOT/WEB-INF/classes...if you dont find "classes"
then create it under "WEB-INF". Then within "classes" folder put your copied "com" folder.
2. create following entries in web.xml file located in
<Tomcat-installation-directory>/webapps/ROOT/WEB-INF/....
<servlet>
    <servlet-name>Servlet Name</servlet-name>
    <servlet-class>Servlet Class details like ..com.x.x....classname</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>Servlet Name</servlet-name>
    <url-pattern>/Servlet Name</url-pattern>
</servlet-mapping>
  now access it through the url "http://localhost:8080/your servlet name".
3. If you find any html in the list that i have given...then put it in " <Tomcat-installation-directory>/webapps/ROOT/put html here".
now access it like this " http://localhost:8080/your html name.html.
