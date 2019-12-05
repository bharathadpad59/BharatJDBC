package com.bharat3.amiti3;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

public class ServiceClass 
{
	 String value1, value2, value3, value4, value5, value6;
	public ModelAndView conditionscheck(String a,String b ) 
	{
		
		ModelAndView mav=new ModelAndView();
		
		String a1="bharathadpad59@gmail.com";
		String b1="bharat@97";
		String c="Login Succes";
		String d="";
		
		
		if(a.equals(a1) && b.equals(b1))
		{
			mav.addObject("LoginStatus",c);
			mav.setViewName("index1.jsp");
			return mav; 
		}
		else
		{
			d="Login Fails";
			mav.addObject("LoginStatus",d);
			mav.setViewName("index.jsp");	
			return mav;
		}
		
		
	}
	
	public ModelAndView optionselection(String opt)
	{
		ModelAndView mav=new ModelAndView();
		if(opt.equals("Insertingdata"))
		{
			mav.setViewName("index2.jsp");
			return mav;	
		}
		else 
		{
			mav.setViewName("index3.jsp");
			return mav;
		}	
	}
	
	
		public ModelAndView datacheckinsert(String value1, String value2, String value3, String value4, String value5, String value6)
		{
			String s2 = null;
			String comment="DATA INSERTION SUCCESFULL \n ENTER NEW DATA";
			ModelAndView mav=new ModelAndView();
			
			
			BasicDataSource d1 = new BasicDataSource();
			d1.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			d1.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			d1.setUsername("SYSTEM");
			d1.setPassword("password");
			
			JdbcTemplate jdbcTemplate = new JdbcTemplate(d1);
			try {
				jdbcTemplate.update("INSERT INTO STUDDS 	VALUES('"+value1+"',"+value2+",'"+value3+"',"+value4+",'"+value5+"','"+value6+"')");
		
				mav.addObject("Result",comment);
				mav.setViewName("index2.jsp");
				return mav;
				
				
			}

			catch(Exception e){
				System.out.println("Exception ");
				e.printStackTrace();
				return null;
			}
			
			
		}
			
		
		public ModelAndView datacheckretrieve(String value1)
		{
			String s2 = "";
			ModelAndView mav=new ModelAndView();
			
			
			BasicDataSource d1 = new BasicDataSource();
			d1.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			d1.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			d1.setUsername("SYSTEM");
			d1.setPassword("password");
			
			JdbcTemplate jdbcTemplate = new JdbcTemplate(d1);
	try {
				List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from studds where name='"+value1+"'");
				for(int i=0;i<list.size();i++) 
				{
					String a[]=(""+list.get(i)).split(",");
					s2+=a[0].substring(1)+ "    "+a[1]+"   "+a[2]+"  "+a[3]+"  "+a[4]+"   "+a[5].substring(0,a[5].indexOf('}'));
				
				}
				
				if(s2.length()>0)
				mav.addObject("Resultofretrieve",s2);
				else
					mav.addObject("Resultofretrieve", "No data avaliable for this name");
				
				mav.setViewName("index3.jsp");
				return mav;
				
		 }
				

	catch(Exception e)
		{
				System.out.println("Exception ");
				e.printStackTrace();
				return null;
	    }
			
			
			
		}
		
		
}
		
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			