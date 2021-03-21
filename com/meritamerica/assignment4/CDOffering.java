package com.meritamerica.assignment4;

public class CDOffering extends AccountHolder {
  
	String FirstOffering;
	String SecondOffering ;
	String ThirdOffering ;
	
	public void CDOffering() {
		
	}
	
	
	
public void CDOffering (String FirstOffering, String SecondOffering, String ThirdOffering) {
		
	  this.FirstOffering = FirstOffering;
	 this.SecondOffering = SecondOffering;
	   this.ThirdOffering= ThirdOffering;
	


}
	
	public String getFirstOffering() {
	
		String FirstOffering="1, 0.018";
		return FirstOffering;

	
	}



public void setFirstOffering(String firstOffering) {
	FirstOffering = firstOffering;
}



public String getSecondOffering() {
	return SecondOffering;
}



public void setSecondOffering(String secondOffering) {
	SecondOffering = secondOffering;
}



public String getThirdOffering() {
	return ThirdOffering;
}



public void setThirdOffering(String thirdOffering) {
	ThirdOffering = thirdOffering;
}





@Override
public String toString() {
return "CDOffering [FirstOffering=" + FirstOffering + ", SecondOffering=" + SecondOffering + ", ThirdOffering="
		+ ThirdOffering + "]";
}



public CDOffering(String cdaccount, String cdoffering, String savingaccount, String checkingaccount) {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CDOffering() {
	// TODO Auto-generated constructor stub
}



	public void CDAccount(String string) {
		// TODO Auto-generated method stub
		
		
	}

}
