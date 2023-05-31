package firstDuplicate;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		int tamanhoDaArray=100000;
		int escopoDaAleatoriedade=100000;
		long inicioDeContagemDeTempo = System.currentTimeMillis();
		Integer[] a = new Integer[tamanhoDaArray];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(escopoDaAleatoriedade);
		}
		long tempoDecorrido = System.currentTimeMillis()-inicioDeContagemDeTempo;
		System.out.printf("criou a array de %s numeros aleatorios de 0 a %s em %s millissegundos  \n",tamanhoDaArray,escopoDaAleatoriedade,tempoDecorrido);

		System.out.println("inicio");
		try {
			System.out.printf("primeira duplicata: %d\n", getFirstDuplicate(a));
		} catch (Exception e) {
			
			System.out.println("não ha duplicatas");;
		}
		float tempoTotalDecorrido = System.currentTimeMillis()-inicioDeContagemDeTempo;
		System.out.printf("tempo total decorrido:%.2f segundos",(tempoTotalDecorrido)/1000);
	}

	private static int getFirstDuplicate(Integer[] a) throws Exception {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(a));
		int firtIndexOfDuplicate = -1;
		int lastIndexOfDuplicate = a.length;
		boolean checkNextDuplicate;
		long iterações = 0;
		// System.out.println(numbers.toString());
		do {
			checkNextDuplicate = false;
			loopExterno: for (int i = firtIndexOfDuplicate + 1; i < lastIndexOfDuplicate; i++) {
				iterações++;
				for (int j = i + 1; j < lastIndexOfDuplicate; j++) {
					iterações++;
					if (numbers.get(i) == numbers.get(j)) {
						firtIndexOfDuplicate = i;
						lastIndexOfDuplicate = j;
						checkNextDuplicate = true;
						break loopExterno;
					}
				}
			}
		} while (checkNextDuplicate);
		System.out.println("iterações "+iterações);
		System.out.printf("primeiro indice da duplicata:%d \n" + "segundo indice da duplicata:%d\n",
				firtIndexOfDuplicate, lastIndexOfDuplicate);
		return numbers.get(firtIndexOfDuplicate);
	}
	
}
