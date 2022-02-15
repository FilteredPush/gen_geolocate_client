# gen_geolocate_client
Artifacts to generate java client code for geolocate's SOAP service.

## Generate sources

    mvn clean jaxws:wsimport

The pom is configured to generate these sources into src/main/java

After generation, run 

    mvn test 

for a minimal test of the generated client code against the geo-locate.org service.

See src/test/java/org/geolocate/GeolocatesvcTest.java for the source code of this test and 
an example of invocation of the georef2 service call.

### To see the com.sun.xml.ws jaxws-maven-plugin documentation for other configuration options: 

   mvn jaxws:help

   mvn jaxws:help -Ddetail=true -Dgoal=wsimport
