/**
 * GeolocatesvcTest.java
 */
package org.geolocate;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;

/**
 * @author mole
 *
 */
public class GeolocatesvcTest extends TestCase {

	private static final Log logger = LogFactory.getLog(GeolocatesvcTest.class);

	/**
	 * Test method for {@link org.geolocate.Geolocatesvc#Geolocatesvc()}.
	 */
	public void testGeolocatesvc() {
		
		Geolocatesvc service = new Geolocatesvc();
		
		GeorefResultSet response = service.getGeolocatesvcSoap().georef2("United States", "Massachusetts", "Middlesex", "Fresh Pond, Cambridge", false, false, false, false, false, false, false, 0);
		List<GeorefResult> results = response.getResultSet();
		System.out.println("Number of Results: " + results.size());
		Iterator<GeorefResult> i = results.iterator();
		int counter = 0;
		while (i.hasNext()) {
			GeorefResult result = i.next();
			counter ++;
			System.out.println("Item " + counter + " in results:");
			System.out.println(result.getDebug());
			System.out.println(result.getReferenceLocation());
			System.out.println(result.getPrecision());
			System.out.println(result.getDisplacedDistanceMiles());
			System.out.println(result.getDisplacedHeadingDegrees());
			System.out.println(result.getWGS84Coordinate().getLatitude());
			System.out.println(result.getWGS84Coordinate().getLongitude());
			System.out.println(result.getScore());
			System.out.println(result.getUncertaintyRadiusMeters());
			System.out.println(result.getReferenceLocation());
			System.out.println(result.getUncertaintyPolygon());
		}
		
		assertTrue(results.size() > 0);
		
	}

}
