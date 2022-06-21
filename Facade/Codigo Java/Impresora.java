package Facade;
public class Impresora {

 	private String tipoDocumento;

 	private String hoja;

	private boolean color;

	private String texto;

	private Impresora impresora;

	public String getTipoDocumento() {

		return tipoDocumento;

	}

	public void setTipoDocumento(String tipoDocumento) {

		this.tipoDocumento = tipoDocumento;

	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	public String getHoja() {

		return hoja;

	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public boolean getColor() {

		return color;

	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTexto() {

		return texto;

	}

	public String imprimirDocumento(){
		return "Imprimiendo...";
	}

	public void imprimir() {
		impresora.imprimirDocumento();
	}
}