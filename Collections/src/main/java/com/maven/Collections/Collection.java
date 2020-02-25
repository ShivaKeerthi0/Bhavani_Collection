package com.maven.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Collection
{
	private static Logger LOGGER=LogManager.getLogger(Collection.class); 
    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>();
 
  
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        LOGGER.info(list);
      
        list.remove(2);
        LOGGER.info(list);
        
        LOGGER.info( list.get(0) );
        LOGGER.info( list.get(4) );
        LOGGER.info( list.get(6) );
        LOGGER.info( list.get(8) );
       

 
  
        LOGGER.info(list.size());
    }
}