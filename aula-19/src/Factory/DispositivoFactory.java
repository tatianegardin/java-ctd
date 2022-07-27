package Factory;

public class DispositivoFactory {

    public Dispositivo fazerUmIphone(String modelo){
        Dispositivo iphone = null;
        if(modelo.equals("x")){
            return new IphoneX();
        }else if(modelo.equals("11")){
            return new Iphone11();
        }
        return null;
    }
}
