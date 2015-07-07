package collections;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeUsuarios {

    List<Usuario>usuarios;
    public GeneradorDeUsuarios(){
    Usuario u1=new Usuario("Juan", 42, "jc@gmail.com");
    Usuario u2=new Usuario("Ana", 22, "ana@outlook.com");
    Usuario u3=new Usuario("Pedro",33,"pedro@yahoo.com");
    
    usuarios=new ArrayList<Usuario>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
