package com.niit.ShoppingCart;

public class LoginDAO {
	
	public boolean isValidUser(String userId,String password)
	{
		
		if (userId.equals("niit")&&password.equals("niit"))
			
		{
			return true;
		}
		else 
			
			return false;
	}

}
