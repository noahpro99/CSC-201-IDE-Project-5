
class StreamingSubscription extends RentFlixSubscription{



  public StreamingSubscription(String n,String a,int r){
      super(n,a,r);



  }
  public void setAddress(String a){
    if (a.contains("@")){
      // if input contains @ set address and rate accordingly 
      super.address = a;
      super.rate = 12;
    } else{
      // otherwise display errror
      System.out.println("Address must contain a \"@\"");
    }
  }
  
}