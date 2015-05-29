package abstraccion;
import javax.swing.JFrame;
/**
 *
 * @author T-107
 */
public class InterfazImc {
 
    public static void main(String[]oso){
        
        Imc imc=new Imc(80,1.67f);
        imc.setPeso(90);
        System.out.println(imc.calcular());
        System.out.println(imc.getPeso);
        
        
        //primitivos integrales
        byte b=2;// 2^8 el integral mas importante de java
        short s=2; //2^16 char
        int i=2; //2^32 es el integral por defecto
        long l=2; //2^64
        b=(byte)s;
        s=b;
        i=(int)l;
        i=s;
        s=(short)i;
        
        float f=2.0F;
        double d=2.0;
        
        boolean valor=false;
        
        Imc otro=new Imc();
        otro.setFlaco(true);
        System.out.println(otro.isFlaco());

    }
}
