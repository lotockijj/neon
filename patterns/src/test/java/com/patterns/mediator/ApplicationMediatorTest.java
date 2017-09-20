package com.patterns.mediator;

import org.junit.Test;

public class ApplicationMediatorTest {

	@Test
	public void test() {
		ApplicationMediator mediator = new ApplicationMediator();
		Colleague desktop = new ConcreteColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		Colleague mobile2 = new MobileColleague(mediator);
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		mediator.addColleague(mobile2);
		desktop.send("Hello world");
		mobile.send("Hello Roman :) :) :) "); 
	}

}
