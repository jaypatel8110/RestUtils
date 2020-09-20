package com.jay.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface StaticObjects {


 default Logger getLogger(){
     Logger logger= LoggerFactory.getLogger(getClass());
     return logger;
 }
}
