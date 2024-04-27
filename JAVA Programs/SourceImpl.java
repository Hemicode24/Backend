interface Source{  
    boolean validate(String username, String password);  
}  
  
public class SourceImpl {  
    public static void main(String[] args) {  
          
      
          
          
        Source resultFlag=(String username,String password)->{  
                            return ("ABC".equals(username)&& "DEF". equals(password));   
                            };  
        System.out.println(resultFlag.validate("ABC","DEF"));  
    }  
}