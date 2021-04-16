class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Rentflix!");

// create an object of each type as a sereal number
    DvdSubscription abc124 = new DvdSubscription("Noah", "pro@gmail", 55);
    StreamingSubscription tjh574 = new StreamingSubscription("Seth", "beepbop@gmail", 16);

// display all data for both simply 
    System.out.println(abc124.name);
    System.out.println(abc124.address);
    System.out.println(abc124.rate);

    System.out.println(tjh574.name);
    System.out.println(tjh574.address);
    System.out.println(tjh574.rate);

// use set address that will error then a correct one for both 
    abc124.setAddress("");
    abc124.setAddress("hello@gmail");
    tjh574.setAddress("meepgmail");
    tjh574.setAddress("meep@gmail");

// reprint all updated data
    System.out.println(abc124.name);
    System.out.println(abc124.address);
    System.out.println(abc124.rate);

    System.out.println(tjh574.name);
    System.out.println(tjh574.address);
    System.out.println(tjh574.rate);
  
  }
}