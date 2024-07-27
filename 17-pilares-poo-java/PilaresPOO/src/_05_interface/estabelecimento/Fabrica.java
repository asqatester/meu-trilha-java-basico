package _05_interface.estabelecimento;

import _05_interface.equipamentos.digitalizadora.Digitalizadora;
import _05_interface.equipamentos.impressora.Deskjet;
import _05_interface.equipamentos.impressora.Impressora;
import _05_interface.equipamentos.impressora.Laserjet;
import _05_interface.equipamentos.copiadora.Copiadora;
import _05_interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora1 = new Deskjet();
		impressora1.imprimir();
		
		Impressora impressora2 = new Laserjet();
		impressora2.imprimir();
		
		Impressora impressora3 = new EquipamentoMultifuncional();
		impressora3.imprimir();
		
		Digitalizadora digitalizadora = new EquipamentoMultifuncional();
		digitalizadora.digitalizar();
		
		Copiadora copiadora = new EquipamentoMultifuncional();
		copiadora.copiar();
		
		System.out.println("ABAIXO UMA OUTRA FORMA DE TESTAR A IMPLEMENTAÇÃO EquipamentoMultifuncional");
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora_teste = em;
		Digitalizadora digitalizadora_teste = em;
		Copiadora copiadora_teste = em;
		
		impressora_teste.imprimir();
		digitalizadora_teste.digitalizar();
		copiadora_teste.copiar();
	
	}

}
