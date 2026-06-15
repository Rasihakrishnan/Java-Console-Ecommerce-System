import java.util.*;
import java.time.*;
class Address{
     private String doorNo;
     private String area;
     private String city;
     private String state;
     private String pincode;
    public Address(
     String doorNo,
     String area,
     String city,
     String state,
     String pincode
     ){
      this.doorNo=doorNo;
      this.area=area;
      this.city=city;
      this.state=state;
      this.pincode=pincode;
     }
     public  String getDoorNo(){
        return doorNo;
     }
     public String getArea(){
         return area;
     }
     public String getCity(){
          return city;
      }
     public String getState(){
         return state;
      }
     public String getPincode(){
         return pincode;
     }
     public void setDoorNo(String doorNo){
        if(doorNo.length()>5){
        System.out.println("Invalid DoorNo");
        return;
        }
        this.doorNo=doorNo;
     }
     public void setArea(String area){
        this.area=area;
     }
     public void setCity(String city){
          this.city=city;
      }
     public void setState(String state){
        this.state=state;
      }
     public void setPincode(String pincode){
         this.pincode=pincode;
     }
     @Override
    public String toString(){
  return "\nDoor No : " + doorNo +
       "\nArea    : " + area +
       "\nCity    : " + city +
       "\nState   : " + state +
       "\nPincode : " + pincode;
      }
     }
 class Category{
         private int categoryId;
         private String categoryName;
         public Category(int categoryId,String categoryName){
         this.categoryId=categoryId;
         this.categoryName=categoryName;
         }
         public int getCategoryId(){
          return categoryId;
         }
         public String getCategoryName(){
          return categoryName;
         } 
         public void setCategoryId(int categoryId){
          this.categoryId=categoryId;
         }
         public void setCategoryName(String categoryName){
          this.categoryName=categoryName;
         }
         @Override
        public String toString(){
        return categoryName;
        }
        }
 class Seller{
         private int sellerId;
         private String sellerName;
         private String email;
         private String phone;
         private Address address;
         public Seller( 
         int sellerId,
         String sellerName,
         String email,
         String phone,
         Address address
         ){
         this.sellerId=sellerId;
         this.sellerName=sellerName;
         this.email=email;
         this.phone=phone;
         this.address=address;
         }
         public int getSellerId(){
              return sellerId;
         }
         public String getSellerName(){
              return sellerName;
         }
         public String getSellerEmail(){
              return email;
         }
         public String getSellerPhone(){
              return phone;
         }
         public Address getSellerAddress(){
              return address;
         }
         public void setSellerId(int sellerId){
             this.sellerId=sellerId;
         }
         public void setSellerName(String sellerName){
              this.sellerName= sellerName;
         }
         public void setSellerEmail(String email){
              this.email=email;
         }
         public void setSellerPhone(String phone){
              this.phone=phone;
         }
         public void setSellerAddress(Address address){
               this.address=address;
          }
          @Override
          public String toString(){
           return "SellerId : "+ sellerId +
           " \nSellerName : "+ sellerName +
           " \nSellerEmail : "+ email +
            " \nSellerPhone : "+ phone +
            " \nSellerAddress : "+ address;
           }
            
        }
         class Customer{
          private int customerId;
          private String customerName;
          private String gender;
          private LocalDate dob;
          private String customerPhone;
          private Address address; 

          public Customer(int customerId,
          String customerName,
          String gender,
          LocalDate dob,
          String customerPhone,
          Address address){
          this.customerId=customerId;
          this.customerName=customerName;
          this.gender=gender;
          this.dob=dob;
          this.customerPhone=customerPhone;
          this.address=address;
          }

          public int getCustomerId(){
              return customerId;
          }
          public String getCustomerName(){
              return customerName;
          }
          public String getCustomerGender(){
              return gender;
          }
          public LocalDate getCustomerDob(){
              return dob;
          }
          public String getCustomerPhone(){
            return customerPhone;
          }
          public Address getCustomerAddress(){
              return address;
          }

          public void setCustomerId(int customerId){
                 this.customerId=customerId;
           }
          public void setCustomerName(String customerName){
                 this.customerName=customerName;
            }
          public void setCustomerGender(String gender){
                 this.gender=gender;
           }
          public void setCustomerDob(LocalDate dob){
                 this.dob=dob;
          }
          public void setCustomerPhone(String customerPhone){
            this.customerPhone=customerPhone;
          }
          public void setCustomerAddress(Address address){
                 this.address=address;
          }
          @Override
          public String toString(){
                return"\nCustomer Id      : " + customerId +
           "\nCustomer Name    : " + customerName +
           "\nGender           : " + gender +
           "\nDOB              : " + dob +
           "\nPhone Number     : " + customerPhone +
           "\nAddress          : " + address;
            }

         }
          class Product{
                  private int productId;
                  private String productName;
                  private String description;
                  private double price; 
                  private Category category;
                  private int stock;
                  private Seller seller;

                  public Product( int productId,
                  String productName,
                  String description,
                  double price,
                  Category category,
                  Seller seller,
                  int stock){
                         this.productId=productId;
                         this.productName=productName;
                         this.description=description;
                         this.price=price;
                         this.category=category;
                         this.seller=seller;
                         this.stock=stock;
                  }
                  public int getProductId(){
                           return productId;
                  }
                  public String getProductName(){
                           return productName;
                  }
                  public String getProductDesc(){
                           return description;
                  }
                  public double getPrice(){
                           return price;
                  }
                  public Category getCategory(){
                           return category;
                  }
                  public int getStock(){
                            return stock;
                  }
                  public Seller getSeller(){
                            return seller;
                   }
                  public void setProductId(int productId){
                           this.productId= productId;
                  }
                  public void setProductName(String productName){
                           this.productName= productName;
                  }
                  public void setProductDesc(String description){
                           this.description= description;
                  }
                  public void setPrice(double price){
                           if(price <= 0){
                           System.out.println("Invalid Price");
                           return;
                           }
                           this.price= price;
                  }
                  public void setCategory(Category category){
                           this.category= category;
                  }
                  public void setStock(int stock){
                            if(stock < 0){
                            System.out.println("Invalid Stock");
                            return;
                            }
                            this.stock= stock;
                  }
                  public void setSeller(Seller seller){
                           this.seller= seller;
                   }
                   @Override 
                    public String toString(){
                                 return "Product Id : "+ productId +
                                 "\nProduct Name : "+ productName + 
                                 "\nProduct Description : "+description +
                                 "\nPrice : "+ price +
                                 "\nCategory : "+ category +
                                 "\nStock : "+ stock +
                                "\nSeller : "+ seller;
                   }
                  } 
                  class Review{
                  private int reviewId;
                  private int rating;
                  private String comment;
                  private Product product;
                  private Customer customer;
                  public Review(
                  int reviewId,
                  int rating,
                  String comment,
                  Product product,
                  Customer customer){
                  this.reviewId=reviewId;
                  this.rating=rating;
                  this.comment=comment;
                  this.product=product;
                  this.customer=customer;
                  }
                  public int getReviewId(){
                     return reviewId;
                  }
                  public int getRating(){
                     return rating;
                  }
                  public Product getProduct(){
                     return product;
                  }
                  public Customer getCustomer(){
                     return customer;
                  }
                  public String getComment(){
                     return comment;
                  }
                  public void setReviewId(int reviewId){
                     this.reviewId= reviewId;
                  }
                  public void setRating(int rating){
                     if(rating >5 || rating<1){
                     System.out.println("Invalid Rating");
                     return;
                     } 
                     this.rating= rating;
                  }
                  public void setProduct(Product product){
                    this.product= product;
                  }
                  public void setCustomer(Customer customer){
                     this.customer= customer;
                  }
                  public void setComment(String comment){
                     this.comment=comment;
                  }
                  @Override
                  public String toString(){
                     return "\nReview Id : "+ reviewId +
                     "\nRating : "+ rating +
                     "\nComment : "+ comment +
                     "\nProduct : "+product +
                     "\nCustomer : "+customer;
                  }
                 } 
             class Payment{
                 private int paymentId;
                 private String paymentMethod;
                 private String paymentStatus;
                 private double totalAmount;
                 private LocalDate paymentDate;
               public Payment(
                int paymentId,
                 String paymentMethod,
                  String paymentStatus,
                  double totalAmount,
                 LocalDate paymentDate){
                 this.paymentId=paymentId;
                 this.paymentMethod=paymentMethod;
                 this.paymentStatus=paymentStatus;
                 this.totalAmount=totalAmount;
                 this.paymentDate=paymentDate;
                 }
                 public int getPaymentId(){
                       return paymentId;
                 }
                 public String getPaymentMethod(){
                       return paymentMethod;
                 }
                 public String getPaymentStatus(){
                       return paymentStatus;
                 }
                 public double getTotalAmount(){
                       return totalAmount;
                 }
                 public LocalDate getPaymentDate(){
                       return paymentDate;
                 }
                 public void setPaymentId(int paymentId){
                       this.paymentId= paymentId;
                 }
                 public void setPaymentMethod(String paymentMethod){
                    if(!paymentMethod.equalsIgnoreCase("UPI") &&
                       !paymentMethod.equalsIgnoreCase("COD") &&
                         !paymentMethod.equalsIgnoreCase("NB") &&
                          !paymentMethod.equalsIgnoreCase("CASH") &&
                           !paymentMethod.equalsIgnoreCase("CARD")){
                           System.out.println("Invalid Method");
                             return;
                            }              
                       this.paymentMethod= paymentMethod;
                 }
                 public void setPaymentStatus(String paymentStatus){
                        if(!paymentStatus.equalsIgnoreCase("SUCCESS") &&
                           !paymentStatus.equalsIgnoreCase("FAILED") &&
                           !paymentStatus.equalsIgnoreCase("PENDING")){
                        System.out.println("Invalid Status");
                        return;
                        }
                       this.paymentStatus=paymentStatus;
                 }
                 public void setTotalAmount(double totalAmount){ 
                 if(totalAmount <= 0){
                 System.out.println("Invalid Amount");
                 return;
                 }
                  this.totalAmount = totalAmount;
                 }
                 public void setPaymentDate(LocalDate paymentDate){
                     this.paymentDate=paymentDate;
                 }
                 @Override
                 public String toString(){

                 return "\nPayment Id     : " + paymentId +
                 "\nPayment Method : " + paymentMethod +
                 "\nPayment Status : " + paymentStatus +
                 "\nTotal Amount   : " + totalAmount +
                 "\nPayment Date   : " + paymentDate;
                  }  
               }
               class OrderItem{
                     private int orderItemId;
                     private Product product;
                     private int quantity;
                     private double purchasePrice;
                     public OrderItem(
                        int orderItemId,
                        Product product,
                        int quantity,
                        double purchasePrice){
                         this.orderItemId=orderItemId;
                         this.product=product;
                         this.quantity=quantity;
                         this.purchasePrice=purchasePrice;
                        }
                     public int getOrderItemId(){
                               return orderItemId;
                      }
                     public int getQuantity(){
                               return quantity;
                      }
                     public Product getProduct(){
                              return product;
                     }
                     public double getPurchasePrice(){
                              return purchasePrice;
                     }
                     public void setOrderItemId(int orderItemId){
                              this.orderItemId=orderItemId;
                      }
                     public void setQuantity(int quantity){
                               if(quantity<=0){
                               System.out.println("Invalid Quantity");
                               return;
                               }
                               this.quantity= quantity;
                      }
                     public void setProduct(Product product){
                              this.product=product;
                     }
                     public void setPurchasePrice(double purchasePrice){
                              if(purchasePrice<=0){
                              System.out.println("Invalid PurchasePrice");
                              return;
                              }
                              this.purchasePrice= purchasePrice;
                     }
                     @Override
                     public String toString(){
                       return "\nOrderItemId : "+orderItemId+
                              "\nProduct Name : "+product+
                              "\nPurchase Price : "+purchasePrice+
                              "\nQuantity : "+quantity;
                         }
                     }
                     class Order{
                      private int orderId;
                      private Customer customer;
                      private Payment payment;
                      private List<OrderItem> orderItems;
                      private LocalDate orderDate;
                     public Order(  
                       int orderId,
                       Customer customer,
                       Payment payment,
                       List<OrderItem> orderItems,
                       LocalDate orderDate
                       )
                     {
                       this.orderId=orderId;
                       this.customer=customer;
                       this.payment=payment;
                       this.orderItems=orderItems;
                       this.orderDate=orderDate;
                      }
                      public int getOrderId(){
                               return orderId;
                      }
                      public Customer getCustomer(){
                               return customer;
                      }
                      public Payment  getPayment(){
                               return payment;
                       }
                      public List<OrderItem> getOrderItems(){
                               return orderItems;
                       }
                      public LocalDate getOrderDate(){
                               return orderDate;    
                      }
                      public void setOrderId(int orderId){
                               this.orderId=orderId;
                      }
                      public void setCustomer(Customer customer){
                               this.customer=customer;
                      }
                      public void setPayment(Payment payment){
                               this.payment=payment;
                       }
                      public void setOrderItem(List<OrderItem> orderItems){
                              this.orderItems= orderItems;
                       }
                      public void setOrderDate(LocalDate orderDate){
                               this.orderDate=orderDate;    
                      }
                      @Override
                      public String toString(){
                         return "\nOrder Id : " + orderId +
                         "\nCustomer : "+ customer +
                         "\nPayment   : "+ payment +
                         "\nOrder Items : "+ orderItems +
                         "\nOrder Date : "+ orderDate;
                         }
                         }
                      class SellerService{
                        private List<Seller> sellers;
                        public SellerService(){
                           sellers=new ArrayList<>();
                        }
                        public String addSeller(Seller seller){
                           for(Seller Exist:sellers){
                              if(Exist.getSellerId()==seller.getSellerId()){
                              return "Seller Already Exists";
                           }
                           }
                           sellers.add(seller);
                           return "Seller added Successfully";
                        }
                        public Seller searchSellerById(int sellerId){
                           for(Seller exist:sellers){
                              if(exist.getSellerId()==sellerId){
                                 return exist;
                              }
                           }
                           return null;
                        }
                        public String deleteSellerById(int sellerId){
                            Seller seller=searchSellerById(sellerId);
                            if(seller==null){
                              return "Seller Not Found";
                            }
                            
                              sellers.remove(seller);
                           
                            return "Seller Removed Successfully";
                        }
                        public String updateSellerById(int sellerId,String name,String email,String phone,Address address){
                              Seller seller=searchSellerById(sellerId);
                              if(seller==null){
                                 return "Seller Not Found";
                              }
                              seller.setSellerName(name);
                              seller.setSellerAddress( address);
                              seller.setSellerPhone( phone);
                              seller.setSellerEmail( email);
                              return "Seller Updated Successfully";
                        }
                        public List<Seller> showSellers(){
                              return sellers;
                        }
                     }
                     class ProductService{
                        private List<Product> products;
                        public ProductService(){
                           products=new ArrayList<>();
                        }
                        public String addProduct(Product product){
                             for(Product exist:products){
                              if(exist.getProductId()==product.getProductId()){
                                 return "Product Already Exists";
                              }
                             }
                             products.add(product);
                             return "Product added Successfully";
                        }
                         public Product searchProductById(int productId){
                                  for(Product exist:products){
                                    if(exist.getProductId()==productId){
                                       return exist;
                                    }
                                  }
                                  return null;
                        }
                        public String deleteProductById(int productId,int sellerId){
                                 Product product=searchProductById(productId);
                                 if(product==null){
                                    return "Product doesnt Exist";
                                 }
                                 if(product.getSeller().getSellerId() == sellerId){
                                    products.remove(product);
                                    return "Product Deleted Successfully";
                                 }
                                 return "UnAuthorized Access";
                        }
                         public String updateProductById(int productId,int sellerId,String name,String description,double price,Category category,int stock){
                                    Product product =searchProductById(productId);
                                    if(product==null){
                                       return "Product Not Found";
                                    }
                                     if(product.getSeller().getSellerId() == sellerId) {

                                     product.setProductName(name);
                                     product.setProductDesc(description);
                                     product.setPrice(price);
                                     product.setCategory(category);
                                     product.setStock(stock);
                                     return "Product Updated Successfully";
                                    }

                                    return "UnAuthorized Access";
                        }
                        public List<Product> showProducts(){
                                 return products;
                        }
                     }
                     class CustomerService{
                        private List<Customer> customers;
                        public CustomerService(){
                           customers=new ArrayList<>();
                        }
                        public String addCustomer(Customer cust){
                           for(Customer c:customers){
                              if(c.getCustomerId()==cust.getCustomerId()){
                                 return "Customer Already Exists";
                              }
                           }
                           customers.add(cust);
                           return "Customers added Successfully";
                        }
                        public Customer searchCustomerById(int customerId){
                           for(Customer c:customers){
                              if(c.getCustomerId()==customerId){
                                 return c;
                              }
                           }
                           return null;
                        }
                        public String updateCustomerByID(int customerId,String name,String gender,LocalDate dob,String customerPhone,Address address){
                           Customer cust=searchCustomerById(customerId);
                           if(cust==null){
                           return "Customer doesnt Exists";
                           }
                           cust.setCustomerName(name);
                           cust.setCustomerGender(gender);
                           cust.setCustomerDob(dob);
                           cust.setCustomerPhone(customerPhone);
                           cust.setCustomerAddress(address);
                           return "Customer Updated Successfully";
                        }
                        public String deleteCustomerById(int customerId){
                           Customer cust=searchCustomerById(customerId);
                           if(cust==null){
                                 return "Customer doesnt Exists";
                              }
                                 customers.remove(cust);
                           return "Customer Deleted Successfully";
                        }
                        public List<Customer> showAllCustomers(){
                           return customers;
                        }
                     }
                     class ReviewService{
                     private List<Review> reviews;
                         public ReviewService(){
                            reviews=new ArrayList<>();
                            }
                     public String addReview(Review review){
                     for(Review r:reviews) {
                        if (r.getReviewId()==review.getReviewId()){
                                  return "Review Already Exists";
                        }
                      }
                     reviews.add(review);
                     return "Review Added Successfully";
                     }
                     public Review searchReviewById(int reviewId){
                      for(Review r:reviews){
                     if(r.getReviewId()==reviewId){
                     return r;
                     }
                     }
                      return null;
                     }
                     public String updateReviewById(int reviewId, int rating, String comment){
                       Review review=searchReviewById(reviewId);
                          if(review==null){
                              return "Review Not Found";
                           }
                           review.setRating(rating);
                           review.setComment(comment);
                           return "Review Updated Successfully";
                     }
                     public String deleteReviewById(int reviewId){
                     Review review=searchReviewById(reviewId);
                     if(review==null){
                     return "Review Not Found";
                     }
                      reviews.remove(review);
                      return "Review Deleted Successfully";
                     }
                     public List<Review> showReviews(){
                     return reviews;
                     }
                     }
                      class OrderService{
                        private List<Order> orders;
                        OrderService(){
                           orders=new ArrayList<>();
                        }
                        public String addOrder(Order o){
                           for(Order order:orders){
                                   if(order.getOrderId()==o.getOrderId()){
                                    return "Order Already Exists";
                                   }
                           }
                           orders.add(o);
                           return "Order added Successfully";
                        }
                        public Order searchOrderById(int orderId){
                           for(Order o:orders){
                               if(o.getOrderId()==orderId){
                                 return o;
                               }
                           }
                           return null;
                        }
                        public String cancelOrderById(int orderId){
                           Order order=searchOrderById(orderId);
                           if(order==null) return "Order Doesnt Exist";
                           orders.remove(order);
                           return "Order Cancelled Successfully";
                        }
                        public List<Order> showAllOrders(){
                              return orders;
                        }
                     }
                     public class Ecommerce{
                        public static void main(String[] args){
                           Scanner sc=new Scanner(System.in);
                           SellerService sellerservice=new SellerService();
                           CustomerService customerservice=new CustomerService();
                           ReviewService reviewservice=new ReviewService();
                           ProductService productservice=new ProductService();
                           OrderService orderservice=new OrderService();
                           while(true){
                              System.out.println("===== E-COMMERCE SYSTEM =====");
                              System.out.println("1. Seller Management");
                              System.out.println("2. Product Management");
                              System.out.println("3. Customer Management");
                              System.out.println("4. Review Management");
                              System.out.println("5. Order Management");
                              System.out.println("6. Exit");
                              int choice=sc.nextInt();
                              switch(choice){
                                 case 1:
boolean sellerFlag=true;

while(sellerFlag){

System.out.println("===== SELLER MANAGEMENT =====");
System.out.println("1.Add Seller");
System.out.println("2.Search Seller");
System.out.println("3.Update Seller");
System.out.println("4.Delete Seller");
System.out.println("5.Show All Sellers");
System.out.println("6.Back");

int sellerChoice=sc.nextInt();

switch(sellerChoice){

case 1:
System.out.println("Enter Seller Id:");
int sellerId=sc.nextInt();
sc.nextLine();

System.out.println("Enter Seller Name:");
String sellerName=sc.nextLine();

System.out.println("Enter Seller Email:");
String sellerEmail=sc.nextLine();

System.out.println("Enter Seller Phone:");
String sellerPhone=sc.nextLine();

System.out.println("Enter Door No:");
String doorNo=sc.nextLine();

System.out.println("Enter Area:");
String area=sc.nextLine();

System.out.println("Enter City:");
String city=sc.nextLine();

System.out.println("Enter State:");
String state=sc.nextLine();

System.out.println("Enter Pincode:");
String pincode=sc.nextLine();

Address address=new Address(doorNo,area,city,state,pincode);

Seller seller=new Seller(
sellerId,
sellerName,
sellerEmail,
sellerPhone,
address
);

System.out.println(sellerservice.addSeller(seller));

break;


case 2:

System.out.println("Enter Seller Id:");
int searchId=sc.nextInt();

Seller foundSeller=sellerservice.searchSellerById(searchId);

if(foundSeller==null){
System.out.println("Seller Not Found");
}
else{
System.out.println(foundSeller);
}

break;
case 3:

System.out.println("Enter Seller Id to Update:");
int updateId=sc.nextInt();
sc.nextLine();

System.out.println("Enter New Seller Name:");
String updateName=sc.nextLine();

System.out.println("Enter New Seller Email:");
String updateEmail=sc.nextLine();

System.out.println("Enter New Seller Phone:");
String updatePhone=sc.nextLine();

System.out.println("Enter New Door No:");
String updateDoorNo=sc.nextLine();

System.out.println("Enter New Area:");
String updateArea=sc.nextLine();

System.out.println("Enter New City:");
String updateCity=sc.nextLine();

System.out.println("Enter New State:");
String updateState=sc.nextLine();

System.out.println("Enter New Pincode:");
String updatePincode=sc.nextLine();

Address updateAddress=new Address(
updateDoorNo,
updateArea,
updateCity,
updateState,
updatePincode
);

System.out.println(
sellerservice.updateSellerById(
updateId,
updateName,
updateEmail,
updatePhone,
updateAddress
)
);

break;
case 4:

System.out.println("Enter Seller Id to Delete:");
int deleteId=sc.nextInt();

System.out.println(
sellerservice.deleteSellerById(deleteId)
);

break;

case 5:

List<Seller> sellers=sellerservice.showSellers();

if(sellers.isEmpty()){
System.out.println("No Sellers Available");
}
else{
for(Seller s:sellers){
System.out.println(s);
}
}

break;


case 6:

sellerFlag=false;
break;


default:
System.out.println("Invalid Choice");

}
}
break;
case 2:

boolean productFlag=true;

while(productFlag){

System.out.println("===== PRODUCT MANAGEMENT =====");
System.out.println("1.Add Product");
System.out.println("2.Search Product");
System.out.println("3.Update Product");
System.out.println("4.Delete Product");
System.out.println("5.Show All Products");
System.out.println("6.Back");

int productChoice=sc.nextInt();

switch(productChoice){

case 1:

System.out.println("Enter Product Id:");
int pid=sc.nextInt();
sc.nextLine();

System.out.println("Enter Product Name:");
String pname=sc.nextLine();

System.out.println("Enter Description:");
String desc=sc.nextLine();

System.out.println("Enter Price:");
double price=sc.nextDouble();

System.out.println("Enter Stock:");
int stock=sc.nextInt();

System.out.println("Enter Category Id:");
int categoryId=sc.nextInt();
sc.nextLine();

System.out.println("Enter Category Name:");
String categoryName=sc.nextLine();

Category category=new Category(
categoryId,
categoryName
);

System.out.println("Enter Seller Id:");
int sellerId=sc.nextInt();

Seller seller= sellerservice.searchSellerById(sellerId);

if(seller==null){
System.out.println("Seller Not Found");
break;
}

Product product=new Product(
pid,
pname,
desc,
price,
category,
seller,
stock
);

System.out.println(
productservice.addProduct(product)
);

break;


case 2:

System.out.println("Enter Product Id:");
int searchProductId=sc.nextInt();

Product foundProduct =
productservice.searchProductById(searchProductId);

if(foundProduct==null){
System.out.println("Product Not Found");
}
else{
System.out.println(foundProduct);
}

break;


case 3:

System.out.println("Enter Product Id:");
int updatePid=sc.nextInt();

System.out.println("Enter Seller Id:");
int updateSellerId=sc.nextInt();

sc.nextLine();

System.out.println("Enter New Product Name:");
String newName=sc.nextLine();

System.out.println("Enter New Description:");
String newDesc=sc.nextLine();

System.out.println("Enter New Price:");
double newPrice=sc.nextDouble();

System.out.println("Enter New Stock:");
int newStock=sc.nextInt();

System.out.println("Enter New Category Id:");
int newCategoryId=sc.nextInt();

sc.nextLine();

System.out.println("Enter New Category Name:");
String newCategoryName=sc.nextLine();


Category newCategory=new Category(
newCategoryId,
newCategoryName
);


System.out.println(
productservice.updateProductById(
updatePid,
updateSellerId,
newName,
newDesc,
newPrice,
newCategory,
newStock
)
);

break;


case 4:

System.out.println("Enter Product Id:");
int deleteProductId=sc.nextInt();

System.out.println("Enter Seller Id:");
int deleteSellerId=sc.nextInt();


System.out.println(
productservice.deleteProductById(
deleteProductId,
deleteSellerId
)
);

break;


case 5:

List<Product> products =
productservice.showProducts();

if(products.isEmpty()){
System.out.println("No Products Available");
}
else{
for(Product p:products){
System.out.println(p);
}
}

break;


case 6:

productFlag=false;
break;


default:

System.out.println("Invalid Choice");

}

}

break;
case 3:

boolean customerFlag=true;

while(customerFlag){

System.out.println("===== CUSTOMER MANAGEMENT =====");
System.out.println("1.Add Customer");
System.out.println("2.Search Customer");
System.out.println("3.Update Customer");
System.out.println("4.Delete Customer");
System.out.println("5.Show All Customers");
System.out.println("6.Back");

int customerChoice=sc.nextInt();

switch(customerChoice){

case 1:

System.out.println("Enter Customer Id:");
int cid=sc.nextInt();
sc.nextLine();

System.out.println("Enter Customer Name:");
String cname=sc.nextLine();

System.out.println("Enter Gender:");
String gender=sc.nextLine();

System.out.println("Enter DOB (YYYY-MM-DD):");
LocalDate dob=LocalDate.parse(sc.nextLine());

System.out.println("Enter Phone:");
String phone=sc.nextLine();

System.out.println("Enter Door No:");
String door=sc.nextLine();

System.out.println("Enter Area:");
String area=sc.nextLine();

System.out.println("Enter City:");
String city=sc.nextLine();

System.out.println("Enter State:");
String state=sc.nextLine();

System.out.println("Enter Pincode:");
String pincode=sc.nextLine();

Address address=new Address(
door,
area,
city,
state,
pincode
);

Customer customer=new Customer(
cid,
cname,
gender,
dob,
phone,
address
);

System.out.println(
customerservice.addCustomer(customer)
);

break;


case 2:

System.out.println("Enter Customer Id:");
int searchId=sc.nextInt();

Customer foundCustomer=
customerservice.searchCustomerById(searchId);

if(foundCustomer==null){
System.out.println("Customer Not Found");
}
else{
System.out.println(foundCustomer);
}

break;


case 3:

System.out.println("Enter Customer Id:");
int updateId=sc.nextInt();
sc.nextLine();

System.out.println("Enter New Name:");
String newName=sc.nextLine();

System.out.println("Enter New Gender:");
String newGender=sc.nextLine();

System.out.println("Enter New DOB (YYYY-MM-DD):");
LocalDate newDob=LocalDate.parse(sc.nextLine());

System.out.println("Enter New Phone:");
String newPhone=sc.nextLine();

System.out.println("Enter New Door No:");
String newDoor=sc.nextLine();

System.out.println("Enter New Area:");
String newArea=sc.nextLine();

System.out.println("Enter New City:");
String newCity=sc.nextLine();

System.out.println("Enter New State:");
String newState=sc.nextLine();

System.out.println("Enter New Pincode:");
String newPincode=sc.nextLine();

Address newAddress=new Address(
newDoor,
newArea,
newCity,
newState,
newPincode
);

System.out.println(
customerservice.updateCustomerByID(
updateId,
newName,
newGender,
newDob,
newPhone,
newAddress
)
);

break;


case 4:

System.out.println("Enter Customer Id:");
int deleteId=sc.nextInt();

System.out.println(
customerservice.deleteCustomerById(deleteId)
);

break;


case 5:

List<Customer> customers=
customerservice.showAllCustomers();

if(customers.isEmpty()){
System.out.println("No Customers Available");
}
else{
for(Customer c:customers){
System.out.println(c);
}
}

break;


case 6:

customerFlag=false;

break;


default:

System.out.println("Invalid Choice");

}

}

break;
case 4:

boolean reviewFlag=true;

while(reviewFlag){

System.out.println("===== REVIEW MANAGEMENT =====");
System.out.println("1.Add Review");
System.out.println("2.Search Review");
System.out.println("3.Update Review");
System.out.println("4.Delete Review");
System.out.println("5.Show All Reviews");
System.out.println("6.Back");

int reviewChoice=sc.nextInt();

switch(reviewChoice){

case 1:

System.out.println("Enter Review Id:");
int reviewId=sc.nextInt();
sc.nextLine();

System.out.println("Enter Customer Id:");
int customerId=sc.nextInt();

Customer customer=customerservice.searchCustomerById(customerId);

if(customer==null){
System.out.println("Customer Not Found");
break;
}

System.out.println("Enter Product Id:");
int productId=sc.nextInt();
sc.nextLine();

Product product=productservice.searchProductById(productId);

if(product==null){
System.out.println("Product Not Found");
break;
}

System.out.println("Enter Rating:");
int rating=sc.nextInt();
sc.nextLine();

System.out.println("Enter Comment:");
String comment=sc.nextLine();

Review review=new Review(
reviewId,
rating,
comment,
product,
customer
);

System.out.println(
reviewservice.addReview(review)
);

break;


case 2:

System.out.println("Enter Review Id:");
int searchReviewId=sc.nextInt();

Review foundReview=
reviewservice.searchReviewById(searchReviewId);

if(foundReview==null){
System.out.println("Review Not Found");
}
else{
System.out.println(foundReview);
}

break;


case 3:

System.out.println("Enter Review Id:");
int updateReviewId=sc.nextInt();
sc.nextLine();

System.out.println("Enter New Rating:");
int newRating=sc.nextInt();
sc.nextLine();

System.out.println("Enter New Comment:");
String newComment=sc.nextLine();

System.out.println(
reviewservice.updateReviewById(
updateReviewId,
newRating,
newComment
)
);

break;


case 4:

System.out.println("Enter Review Id:");
int deleteReviewId=sc.nextInt();

System.out.println(
reviewservice.deleteReviewById(deleteReviewId)
);

break;


case 5:

List<Review> reviews=
reviewservice.showReviews();

if(reviews.isEmpty()){
System.out.println("No Reviews Available");
}
else{
for(Review r:reviews){
System.out.println(r);
}
}

break;


case 6:

reviewFlag=false;

break;


default:

System.out.println("Invalid Choice");

}

}

break;
case 5:

boolean orderFlag=true;

while(orderFlag){

System.out.println("===== ORDER MANAGEMENT =====");
System.out.println("1.Place Order");
System.out.println("2.Search Order");
System.out.println("3.Cancel Order");
System.out.println("4.Show All Orders");
System.out.println("5.Back");

int orderChoice=sc.nextInt();

switch(orderChoice){

case 1:

System.out.println("Enter Order Id:");
int orderId=sc.nextInt();

System.out.println("Enter Customer Id:");
int customerId=sc.nextInt();

Customer customer=customerservice.searchCustomerById(customerId);

if(customer==null){
System.out.println("Customer Not Found");
break;
}

System.out.println("How Many Products Do You Want To Buy?");
int count=sc.nextInt();

List<OrderItem> orderItems=new ArrayList<>();

for(int i=1;i<=count;i++){

System.out.println("Enter Product Id:");
int productId=sc.nextInt();

Product product=productservice.searchProductById(productId);

if(product==null){
System.out.println("Product Not Found");
continue;
}

System.out.println("Enter Quantity:");
int quantity=sc.nextInt();

double purchasePrice=product.getPrice()*quantity;

OrderItem item=new OrderItem(
i,
product,
quantity,
purchasePrice
);

orderItems.add(item);

}

sc.nextLine();

System.out.println("Enter Payment Id:");
int paymentId=sc.nextInt();
sc.nextLine();

System.out.println("Enter Payment Method:");
String method=sc.nextLine();

System.out.println("Enter Payment Status:");
String status=sc.nextLine();

System.out.println("Enter Total Amount:");
double totalAmount=sc.nextDouble();

sc.nextLine();

System.out.println("Enter Payment Date (YYYY-MM-DD):");
LocalDate paymentDate=LocalDate.parse(sc.nextLine());


Payment payment=new Payment(
paymentId,
method,
status,
totalAmount,
paymentDate
);


System.out.println("Enter Order Date (YYYY-MM-DD):");

LocalDate orderDate=LocalDate.parse(sc.nextLine());


Order order=new Order(
orderId,
customer,
payment,
orderItems,
orderDate
);

System.out.println(
orderservice.addOrder(order)
);

break;


case 2:

System.out.println("Enter Order Id:");

int searchOrderId=sc.nextInt();

Order foundOrder=
orderservice.searchOrderById(searchOrderId);

if(foundOrder==null){
System.out.println("Order Not Found");
}
else{
System.out.println(foundOrder);
}

break;


case 3:

System.out.println("Enter Order Id:");

int cancelId=sc.nextInt();

System.out.println(
orderservice.cancelOrderById(cancelId)
);

break;


case 4:

List<Order> orders=orderservice.showAllOrders();

if(orders.isEmpty()){
System.out.println("No Orders Available");
}
else{
for(Order o:orders){
System.out.println(o);
}
}

break;


case 5:

orderFlag=false;

break;


default:

System.out.println("Invalid Choice");

}

}

break;
                              }
                           }
                        }
                     }