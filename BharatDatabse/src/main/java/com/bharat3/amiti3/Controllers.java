package com.bharat3.amiti3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {
	
	@RequestMapping("Authentication")
	public ModelAndView checkloginstatus(HttpServletRequest request, HttpServletResponse response)
	{
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		ServiceClass s1= new ServiceClass();
		
		return s1.conditionscheck(a,b);
		
	}
	
	@RequestMapping("/Datahandling")
	
	public ModelAndView datahandling(HttpServletRequest request, HttpServletResponse response)
	{
		
		ServiceClass s1= new ServiceClass();
		
		String option=request.getParameter("DATA");
		

		System.out.println(option);
		
		return s1.optionselection(option);
		
	}
		
		@RequestMapping("/Detailsofinsertion")
		
		public ModelAndView datainsertion(HttpServletRequest request, HttpServletResponse response) 
		{
			
			ServiceClass s1= new ServiceClass();
			
			String Name=request.getParameter("NAME");
			String Id=request.getParameter("ID");
			String Skills=request.getParameter("SKILLS");
			String Yearofpassout=request.getParameter("YEAR_OF_PASSOUT");
			String Nativeplace=request.getParameter("NATIVE_PLACE");
			String Favsubject=request.getParameter("FAVSUBJECT");
			
			return s1.datacheckinsert(Name, Id, Skills, Yearofpassout, Nativeplace, Favsubject);	
		}
		
		@RequestMapping("/Detailsofretriveal")
		
		public ModelAndView dataretrieval(HttpServletRequest request, HttpServletResponse response) 
		{
			
			ServiceClass s1= new ServiceClass();
			
			String Name=request.getParameter("NAME");
			
			
			return s1.datacheckretrieve(Name);
		}
	
	
	

}
