package com.example.demo;

public class AccountFactory {

	
		final String CURRENT_ACCOUNT = "CURRENT";
		final String SAVING_ACCOUNT  = "SAVING";
		//use getAccount method to get object of type Account   
		//It is factory method for object of type Account
	    public Account getAccount(String accountType){  
	    	if(CURRENT_ACCOUNT.equals(accountType)) {  
	    		return new CurrentAccount();  
	    	}else if(SAVING_ACCOUNT.equals(accountType)){  
	    		return new SavingAccount();  
	    	}   
	    	return null;  
	    }  
		
		
	

}
