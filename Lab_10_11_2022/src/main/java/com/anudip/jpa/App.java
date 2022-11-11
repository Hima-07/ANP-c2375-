package com.anudip.jpa;

import com.anudip.jpa.daoimpl.JpaDAOimpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        JpaDAOimpl dao  = new JpaDAOimpl();
        
        dao.emp();
        dao.proj();
        		
    }
}
