package OOPS;
class  Account{
//    Data Security
    private  double balance;
//    method : : public
    public  double getBalance(String username, String password,double balance){
//        withdraw the money
        return 0.0f;

    }
    //    method : : public
    public  void setBalance(double balance){
//        perform authentication
       boolean result= validate("shivam","shivam123");
       if(result==true){
//           depositing the money
       }
       else {
//           throw the meaningful message to the user

       }

    }
    private boolean validate(String userName,String password){
//        logic for authentication
        return  true;
    }
}
public class TestApp {
    public static void main(String[] args) {
       Account acc=new Account();
       acc.setBalance(1000.0);
    }
}
