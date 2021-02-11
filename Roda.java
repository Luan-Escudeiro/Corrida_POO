public class Roda{             //Classe associada ao veiculo
	private boolean calibr;  //Atributo que define se a roda está calibrada.

	public void Roda(){      //Método construtor da Roda
		this.calibr=false;
	}
	public void setCalibr(){ //Método utilizado para setar a variável como true que diz que o pneu foi calibrado.
		this.calibr=true;
	}

	public void setEsvaziar(){ //Método utilizado para setar a variável como false que diz que o pneu foi esvaziado.
		this.calibr=false;
	}

	public boolean getCalibr(){ //Retorna a situacao atual da roda(True para calibrada,False para vazio).
		return this.calibr;
	}
}