package poligonos;

public class Circle { // salvar como "Circle.java"
	
	// vari�veis de instancia privadas, isto �, n�o acess�veis de fora desta classe.
	private double radius;
	private String color;
	
	// primeiro construtor o qual atribui valores iniciais a ambos: radius e color .
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	// Segundo construtor que inicia radius com o par�metro recebido, e matem color com
	// o valor padr�o definido.
	public Circle(double r) {
		this( ); // cria o objeto com o primeiro construtor:.Circle()
		color = "red";
	}
	
	// Metodo de acesso para obter o valor armazenado em radius
	public double getRadius() {
		return radius;
	}
	
	// Metodo de acesso para computar a �rea de um circulo.
	public double getArea() {
		return radius*radius*Math.PI; // PI � a constante �. Math � a classe onde PI � definido �.
	}
}
