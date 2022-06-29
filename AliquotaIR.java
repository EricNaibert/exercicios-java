
public class AliquotaIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		System.out.println("Calculadora de Imposto de Renda:");

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR e de 7,5%, pode deduzir R$142.");
		} else {

			if (salario >= 2800.1 && salario <= 3751) {
				System.out.println("O IR e de 15%, pode deduzir R$350.");
			} else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					System.out.println("O IR e de 22.5%, pode deduzir R$636.");
				}
			}
		}

	}

}
