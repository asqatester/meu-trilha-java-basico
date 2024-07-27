package _05_interface.equipamentos.multifuncional;

import _05_interface.equipamentos.copiadora.Copiadora;
import _05_interface.equipamentos.digitalizadora.Digitalizadora;
import _05_interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
		
	}
	

}
