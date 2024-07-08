
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmail {
     public static Boolean ValidatingEmail( String Email){

        //"ok" boolean is true if the email is valid, and false if the email is invalid!
        boolean ok=true;
      
        //must have @
        if( Email.contains("@")!=true){
            ok=false;
            return ok;

        }
        //musn`t have ".."
        if(Email.contains("..")==true){
            ok=false;
            return ok;
        }
        //may have ".com"
        if( Email.contains(".com")==true){
            ok=true;

        }
        else{

            //may have ".cc"
            if( Email.contains(".cc")==true){
                ok=true;
            }
                
            else{
                
                //may have ".org"
                if( Email.contains(".org")==true){
                    ok=true;
                }
                else{
                    ok=false;
                }
            }
            

        }
            
        //musnt have this simbols at all " !#$%&*()+=|<>?{}\\[\\]~-]" ".
        //this checks if theses simbols are present or not on the Email
        Pattern special = Pattern.compile ("[!#$%&*()+=|<>?{}\\[\\]~]");
        Matcher hasSpecial = special.matcher(Email);
        boolean musnthave= hasSpecial.find();

        if(musnthave==true){
            ok=false;
        }

        //verifying if "@" appears more than 1 time:

        int count=0;

        for (int i = 0; i < Email.length(); i++) {
            if (Email.charAt(i) == '@') {
                count++;
            }
        }
        //if it appears more than one time, the email is invalid!
        if(count>1){
            ok=false;
        }
        //verifying if there`s an empty space in the email
        int counting=0;
        for (int i = 0; i < Email.length(); i++) {
            if (Email.charAt(i) == ' ') {
                counting++;
            }
        }
        //if there`s an empty space the email is invalid!
        if(counting>0){
            ok=false;
        }

        //cheking if the character after the "@" have these prohibited simbols "[!#$%&*()+=|_<>?{}\\[\\]~-]"
        int size= Email.length();
        int atindex= Email.indexOf("@");

        if(atindex<(size-1)){
            Pattern sign = Pattern.compile ("[!#$%&*()+=|_<>?{}\\[\\]~-]");
            Matcher hasSign = sign.matcher(Email);
            boolean canthave= hasSign.find(atindex);

            if(canthave==true){
                ok=false;
            }

        }

        //checking if the character before the "@" are the prohibited signs "- _"

        if(Email.charAt(atindex-1)=='-' || Email.charAt(atindex-1)=='_'){
            ok=false;

        }

        return ok;
    }
}
