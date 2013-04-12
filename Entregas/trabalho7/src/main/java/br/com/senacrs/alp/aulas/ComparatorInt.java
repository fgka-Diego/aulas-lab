package br.com.senacrs.alp.aulas;

import java.util.Comparator;



public class MeuComparatorInt implements Comparator<Integer> {

Comparator<Integer> comparator = ComparatorFactory.getInstancia().criarComparatorParesAntesDeImparesCrescente();

@Override

public int compare(Integer arg0, Integer arg1) {

if (arg0 % 2 == 0 && arg1 % 2 == 0) {

		if (arg0 < arg1) {

		return arg0 - arg1;

		}

		if (arg0 == arg1) {

			return arg0 - arg1;

		}

		if (arg0 > arg1) {

			return arg0 - arg1;

		}

	}

if (arg0 % 2 == 1 && arg1 % 2 == 1) {

if (arg0 < arg1) {

return arg0 - arg1;

}

if (arg0 == arg1) {

return arg0 - arg1;

}

if (arg0 > arg1) {

return arg0 - arg1;

}

}

return 0;

}

}