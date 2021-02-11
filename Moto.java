public final class Moto extends VeiculoMotorizado{         //Subclasse derivada de VeiculoMotorizado
	private final int quantPassos=3;
	private final float quantGasta=(float)0.5;

	public Moto(){ 
		super.setPassos(0);     //Seta a variavel passos usando um método da superclasse de qual moto deriva.
		super.setQuantRodas(2); //Seta a variavel quantRodas usando um método da superclasse de qual moto deriva.
		super.setTipo("M");     //Seta a variavel tipo usando um método da superclasse de qual moto deriva.
		super.createRodas();    //Usa o método da superclasse que cria as rodas do veículo.
		super.setComb(0);       //Seta a variavel comb (combustível do veículo) como 0 usando um método da superclasse de qual o carro deriva.
	}

	@Override
	public void andar(){                   //Método que constrói o metodo abstrado da superclasse.
		if(super.isRodasCalibr()==true){
			if(super.getComb()>=this.quantGasta*(float)this.quantPassos){
				super.setComb(super.getComb()-(this.quantGasta*(float)this.quantPassos));
				System.out.printf("Combustível restante:"+super.getComb()+"\n");
				super.setPassos(getPassos()+this.quantPassos);
				System.out.println("\n"+super.getTipo()+super.getId()+"-Movimentado com sucesso.");
			}
			else{
				System.out.printf("\n"+super.getTipo()+super.getId()+"-Não há combustível o suficiente.\n");
			}
		}
		else{
			System.out.println("\n"+super.getTipo()+super.getId()+"-Pneus não calibrados.");
		}
	}

	@Override
	public void print(){ //Utiliza os gets da superclasse para informar seu nome, tipo, quantidade de rodas e se estão calibradas.
		System.out.printf("\n Nome:M"+super.getId()+"   Quantidade de rodas:"+super.getQuantRodas()+"   Quantidade de combustível:"+super.getComb());
		if(super.isRodasCalibr()==true)
			System.out.printf("   Pneus:Calibrados.\n");
		else
			System.out.printf("   Pneus:Vazios.\n");
	}
}