package com.aswini.assisted;

public class stringBuffer{
	 
    
    public static void main(String[] args)
    {
     
        String str = "mounika";
 
        
        
        StringBuffer sbr = new StringBuffer(str);
 
        
        sbr.reverse();
 
        
        System.out.println(sbr);
 
        
        StringBuilder sbl = new StringBuilder(str);
 
        
        sbl.append("ForReddy");
 
       
        System.out.println(sbl);
    }
}

