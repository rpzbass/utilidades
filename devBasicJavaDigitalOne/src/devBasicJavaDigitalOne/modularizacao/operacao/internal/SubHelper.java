package devBasicJavaDigitalOne.modularizacao.operacao.internal;

import devBasicJavaDigitalOne.modularizacao.operacao.Operacao;

public class SubHelper implements Operacao {

	@Override
	public int execute(int a, int b) {
		
		return a - b;
	}

}
