package encapsulation;

//Entity
class User
{
   private int    UID = 0;//create
   private long   aadhar;//create , view
   private String name;//create , update , view
   private String email;//create , update , view
   private String pwd;//create , update
   private long   mob;//create , update , view
   
   public void setUid(int UID)//create
   {
	   if(this.UID == 0)
	   {
	     this.UID = UID; 
	   }
	   else
	   {
		  System.out.println("UID already created and CANNOT be MODIFIED");
	   }
   }
   
   public void setAadhar(long aadhar)//create
   {
	  if(this.aadhar == 0)
	  {
	   this.aadhar = aadhar;
	  }
	  else
	  {
		  System.out.println("Aadhar already created and CANNOT be MODIFIED"); 
	  }
   }
   
   public long getAadhar()
   {
	   return this.aadhar;
   }
   
   
}


public class Mainclass 
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
      
	   User u1 = new User();
       u1.setUid(1234);//create
       u1.setUid(7190);//update
       
       u1.setAadhar(978198291122l);//create
       u1.setAadhar(290198291231l);//update
       
       long aadhar = u1.getAadhar();//view
       System.out.println(aadhar);
       
       System.out.println("Program ends...");
	}
}







