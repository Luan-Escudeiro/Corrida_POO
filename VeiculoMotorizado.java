public abstract class VeiculoMotorizado extends Veiculo{  //Subclasse derivada de veículo e ao mesmo tempo superclasse de carro,moto e ferrari.
	private float comb;       //Atributo que determina o combustível no veículo.

	public void setComb(float quant){ //Seta o valor do combustível de acordo com a quantidade informada.
		this.comb=quant;
	}

	public float getComb(){           //Recebe o valor do atributo comb que indica o quanto de combustivel há no veiculo.
		return this.comb;
	}

	@Override
	public abstract void andar();     //Método abstrato que será construido pelas subclasses.

	@Override
	public abstract void print();     //Método abstrato que será construido pelas subclasses.
}