# gen_geolocate_client
Artifacts to generate client code for geolocate's SOAP service.

## Generate sources

mvn clean jaxws:wsimport

mvn jaxws:help

mvn jaxws:help -Ddetail=true -Dgoal=wsimport
