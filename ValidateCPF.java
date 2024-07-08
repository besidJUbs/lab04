

public class ValidateCPF {
    
    //Validating CPF
    public static Boolean ValidatingCPF(String CPF){
        //replacing non digts with an empty space ("")
        CPF=CPF.replaceAll("[^0-9]+", "");
        int length = CPF.length();

        //"sucess" boolean is true if the email is valid, and false if the email is invalid!
        boolean sucess=true;

        //if the CPF has 11 digits
        if (length==11){

            //analysing the case when the CPF digits are ALL the same:
            int count=0;
            for (int i=1; i<length; i++){
                if (CPF.charAt(0)==CPF.charAt(i)){
                    count++;
                }
            }
            //if the CPF has the same 11 digits
            if (count==10){
                sucess= false;
            }

            else{
                sucess= true;
            }
        }
        else{
            sucess= false;
        }
        return sucess;

    }
}
