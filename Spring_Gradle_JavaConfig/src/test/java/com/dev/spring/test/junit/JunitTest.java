package com.dev.spring.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JunitTest {

	final Logger log = LoggerFactory.getLogger(JunitTest.class);
	
	@Before
	public void beforeTest() throws Exception{
			log.info(" ***** BEFORE TEST CASE ***** ");
			log.info(" ***** END OF BEFORE TEST CASE ***** ");
	}
	
	@Test
	public void eastarCallTest() throws Exception {
		log.error("********** TestCase Start ********** ");
		log.info(" ** jUnit TEST");
		log.error("********** TestCase End ********** ");
	}
	
	@After
	public void afterTest() throws Exception{
			log.info(" ***** AFTER TEST CASE ***** ");
			log.info(" ***** END OF AFTER TEST CASE ***** ");
	}

}
