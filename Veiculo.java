public abstract class Veiculo{     //Superclasse
	private int id;                //Atributo que define o ID do veículo.
	private int passos;            //Atributo que define o número de passos dados na pista pelo veículo.
	private Roda[] roda;           //Vetor de classe Roda que está agregado por associacao aos veículos.
	private int quantRodas;        //Atributo que define o número de rodas do veículo.
	private String tipo;           //Atributo que especifica o tipo do veículo(Bicicleta,Moto,Carro ou Ferrari).
	private static int quant=1;    //Atributo que informa o número de veículos.

	public Veiculo(){              //Método construtor do Veiculo
		this.id=quant;
		quant++;
	}

	public int getId(){           //Método que retorna o ID do veículo.
		return this.id;
	}

	public boolean isRodasCalibr(){          //Método que retorna se as rodas do veículo estão calibradas.
		for(int i=0;i<this.quantRodas;i++){        //Checa se cada uma das quantRodas do veículo está calibrada.
			if(this.roda[i].getCalibr()==false){   //Caso alguma única roda não esteja calibrada, retorna falsa(Vazia).
				return false;
			}
		}
		return true;
	}

	public void setRoda(Roda[] rodas){      //Método que seta o vetor de rodas.
		this.roda=rodas;
	}

	public void createRodas(){             //Cria objetos Roda de acordo com a quantidade de rodas do veículo
		Roda[] pneu=new Roda[quantRodas];  //Instacia cada uma das rodas.
		for(int i=0;i<quantRodas;i++){
			pneu[i]=new Roda();              
		}
		setRoda(pneu);                     //Seta o atributo vetor de Roda de acordo com as rodas criadas pelo método.
	}

	public void calibrRodas(){                //Calibra as rodas do veículo usando um método da classe Roda.
		for(int i=0;i<this.quantRodas;i++){
			this.roda[i].setCalibr();
		}
	}

	public void esvaziarRodas(){             //Esvazia as rodas do veículo usando um método da classe Roda.
		for (int i=0;i<this.quantRodas;i++){
			this.roda[i].setEsvaziar();
		}
	}

	public int getPassos(){                 //Recebe o valor do atributo passos do veículo.
		return this.passos;
	}

	public void setPassos(int andar){       //Seta o valor de passos do veículo de acordo com o valor informado.
		this.passos=andar;
	}

	public String getTipo(){                //Recebe o valor do atributo tipo do veículo,
		return this.tipo;                   //que indica se é uma bicicleta, moto, carro ou ferrari.
	}

	public void setTipo(String nome){       //Seta o tipo do veículo de acordo com o nome informado.
		this.tipo=nome;
	}

	public int getQuantRodas(){            //Recebe o valor do atributo quantRodas do veículo,
		return this.quantRodas;            //que indica a quantidade de rodas que o veículo tem.
	}

	public void setQuantRodas(int quantidadeRodas){ //Seta a quantidade de rodas do veículo de acordo com o valor informado.
		this.quantRodas=quantidadeRodas;
	}


	public abstract void andar();       //Método abstrato que será construido pelas subclasses.

	public abstract void print();       //Método abstrato que será construido pelas subclasses.

}
