package formvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import hello.Application;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	  protected Class<?>[] getRootConfigClasses() {
	    return new Class[] { MyWebApplicationInitializer.class };
	  }

	  @Override
	  protected Class<?>[] getServletConfigClasses() {
	    return new Class[] { Application.class };
	  }

	  @Override
	  protected String[] getServletMappings() {
	    return new String[] { "/app1/*" };
	  }

}
