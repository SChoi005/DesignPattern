package project.stratege;

public class AppendStrategy implements EncodingStrategy{
    public String encode(String text){
        return "ABCD"+text;
    }
}