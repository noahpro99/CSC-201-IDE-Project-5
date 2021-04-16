
class DvdSubscription extends RentFlixSubscription{

  public DvdSubscription(String n,String a,int r){
      super(n,a,r);



  }

  // set address method
   public void setAddress(String a){
    if (a.length() > 1){
      // if input has more than one digit set address and rate accordingly 
      super.address = a;
      super.rate = 20;
    } else{
      // if less than one digit display error and set rate accordingly
      System.out.println("address not larger than 1");
      super.rate = 0;
    }
  }
  
}