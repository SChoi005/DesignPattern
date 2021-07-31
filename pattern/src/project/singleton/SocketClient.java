package project.singleton;


public class SocketClient{
    
    // 변수는 static으로 설정
    private static SocketClient socketClient = null;
    
    //생성자를 private 로 막는다.
    private SocketClient() {
        
    }
    
    //객체가 없을경우 새로 만들어주고 있다면 원래 자기 객체를 반환함
    public static SocketClient getInstance(){
        if(socketClient == null){
             socketClient = new SocketClient();   
        }
        return socketClient;
    }
    
    public void connect(){
        System.out.println("connect");
    }
    
}