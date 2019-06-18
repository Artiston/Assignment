# Assignment
Prerequisites!
Tomcat 9 installed -> https://tomcat.apache.org/download-90.cgi
Java 8 installed:
  JRE -> https://www.oracle.com/technetwork/java/javase/downloads/server-jre8-downloads-2133154.html
  JDK -> https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Eclipse IDE installed -> https://www.eclipse.org/downloads/
Postman installed -> https://www.getpostman.com/downloads/

NOTE: Do not start Tomcat on your machine, we'll use Tomcat on Eclipse.

Instructions!
1. Configure Tomcat9 on Eclipse:
  1.1. https://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.stardust.docs.wst%2Fhtml%2Fwst-integration%2Fconfiguration.html
2. Clone this repository into your machine
3. Import the maven project into Eclipse
4. Build the maven project:
  4.1 Right click on the name of the project
  4.2 Select Run As -> Maven build
  4.3 On Goals write, clean install
  4.4 Click Apply then click Run
5. Deploy the build into Eclipse's Tomcat
  5.1 Go to Servers tab
  5.2 Right click on the Tomcat9 server and select Add and Remove
  5.3 Add the resource to configured and click Finish
6. Start the Tomcat9 server
7. Call the endpoints using Postman

How to use this piece of software!
1. On Postman you can make a PUT request for the first 2 endpoints and a GET for the third endpoint:
  1.1 http://localhost:8080/WaesComparator/comparator/v1/diff/<ID>/right?json=<YOUR_JSON>
    1.1.1 Where ID is a numeric value representing the index for the pair of JSONs to compare. YOUR_JSON is the right portion of the pair
          to compare. Example = { "wins":"1", "losses":"0", "ties": "1"}
  1.2 http://localhost:8080/WaesComparator/comparator/v1/diff/<ID>/left?json=<YOUR_JSON>
    1.2.1 Where ID is a numeric value representing the index for the pair of JSONs to compare. YOUR_JSON is the left portion of the pair
          to compare. Example = { "wins":"1", "losses":"0", "ties": "1"}
  NOTE: You must use the same ID on both calls to get a valid pair to compare.
  
  1.3 http://localhost:8080/WaesComparator/comparator/v1/diff/<ID>
    1.3.1 Where ID is a numeric value matching the ID from the previous calls. Use this ID to select the JSONs pair to compare.

What to expect!
From the 2 first calls you can expect simple strings indicating if the storage of the left or right portion was a Success!!! or any error that may occur during the process.
The Thirs call, comparator, will show you the following:
  1. If both JSONs are equal, it will return a JSON containing the key result and the value equals
  2. If both JSONs are equal in size but different in keys or values, it will return a JSON with all keys that differs form each other or the values that differs from each other.
  3. If both JSONs are different in size and content, it will return the same JSON as point on but with value not equals.
  
Improvements!
We can add a JSON validator in order to suggest to the user to fix any JSON that is not on a valid format. Also we can stablish a format for the returned JSON and strings from all endpoints. We can create custom Exceptions for better error handling.
