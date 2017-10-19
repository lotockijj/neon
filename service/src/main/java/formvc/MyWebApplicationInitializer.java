package formvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import hello.Application;

public class MyWebApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletCxt) throws ServletException {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
		cxt.register(Application.class);
		cxt.refresh();
		DispatcherServlet servlet = new DispatcherServlet();
		ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/app/*");
		
	}
	

}
