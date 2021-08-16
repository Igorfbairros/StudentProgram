package classeauxiliares;

import interfaces.PermitirAcesso;

//It is really only to receive someone who has the AllowAccess interface contract, and call the authenticate
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
        return permitirAcesso.autenticar();

    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;

    }

    
}
