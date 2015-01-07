/*

 * Servlet Filters are Java classes that can be used in Servlet Programming for the following purposes:
	 1. To intercept requests from a client before they access a resource at back end.
	 2. To manipulate responses from server before they are sent back to the client.
	 
* Filters are deployed in the deployment descriptor file web.xml and then map to either 
servlet names or URL patterns in your application's deployment descriptor.
Filters are defined and then mapped to a URL or Servlet, in much the same way as Servlet 
is defined and then mapped to a URL pattern. Create the following entry for filter tag in 
the deployment descriptor file web.xml
<filter>
   <filter-name>FilterExample</filter-name>
   <filter-class>com.souroorg.filter.FilterExample</filter-class>
   <init-param>
	  <param-name>test-param</param-name>
	  <param-value>Initialization Paramter</param-value>
   </init-param>
</filter>
<filter-mapping>
   <filter-name>FilterExample</filter-name>
   <url-pattern>/*</url-pattern>
</filter-mapping>
The above filter would apply to all the servlets because we specified /* in our configuration. 
You can specicy a particular servlet path if you want to apply filter on few servlets only.
When the web container starts up your web application, 
it creates an instance of each filter that you have declared in the deployment descriptor. 
The filters execute in the order that they are declared in the deployment descriptor(web.xml).

 */

package org.souro.filter;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class FilterExample implements Filter {

	public void  init(FilterConfig config) 
            throws ServletException{
		// Get init parameter 
		String testParam = config.getInitParameter("test-param"); 
		//Print the init parameter 
		System.out.println("Test Param: " + testParam); 
	}
	public void  doFilter(ServletRequest request, 
	    ServletResponse response,
	    FilterChain chain) 
	    throws java.io.IOException, ServletException {
	
		// Get the IP address of client machine.   
		String ipAddress = request.getRemoteAddr();
		
		// Log the IP address and current timestamp.
		System.out.println("IP "+ ipAddress + ", Time "
		                          + new Date().toString());
		
		// Pass request back down the filter chain
		chain.doFilter(request,response);
	}
	public void destroy( ){
		/* Called before the Filter instance is removed 
		from service by the web container*/
	}
}