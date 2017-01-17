package br.com.suitability.exception;

@SuppressWarnings("serial")
public class ErroSistema extends Exception {
	
	public ErroSistema(String message) {
        super(message);
    }

    public ErroSistema(String message, Throwable cause) {
        super(message, cause);    
    }  
}
