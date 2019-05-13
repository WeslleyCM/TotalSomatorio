package controller;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/Filter")
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
    public Filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			HttpServletResponse responsee = (HttpServletResponse) response;
			responsee.setHeader("Access-Control-Allow-Origin","*");
			responsee.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
			responsee.setHeader("Access-Control-Max-Age","3600");
			responsee.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
			responsee.setHeader("Access-Control-Expose-Headers", "Location");
			chain.doFilter(request, responsee);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
