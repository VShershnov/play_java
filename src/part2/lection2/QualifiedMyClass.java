/**
 * Цей клас доступається до іншого класу, що знаходиться в іншому пакеті напряму і створює
 * його екземпляр
 */
package part2.lection2;

public class QualifiedMyClass {

	public static void main(String[] args){
		//Дуже не зручний спосіб, але він також має право на життя
		part2.lection2.access.MyClass m = new part2.lection2.access.MyClass(); 
	}
}
