package com.osgo;

public class Triangle
{
	private String type;
	
	
	public String getType()
	{
		return type;
	} // end method getType

	
	public void setType(String type)
	{
		this.type = type;
	} // end method setType
	
	
	public void draw()
	{
		System.out.println(getType() + " Triangle drawn.");
		
	} // end method draw()
	
} // end Class Triangle
