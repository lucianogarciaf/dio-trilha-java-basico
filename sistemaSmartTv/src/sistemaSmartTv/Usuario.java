package sistemaSmartTv;

public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();
		SmartTv minhaSmart = new SmartTv();
	
		System.out.println("minha nova tv esta ligada? " + minhaSmart.ligada);
		minhaSmart.ligar();
		System.out.println("agora minha nova tv esta ligada? " + minhaSmart.ligada);
		minhaSmart.diminuirVolume();
				
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(13);
		
		
		System.out.println("Tv ligada ? " + smartTv.ligada);
		System.out.println("Canal atual ? " + smartTv.canal);
		System.out.println("Volume atual ? " + smartTv.volume);
		System.out.println(smartTv.somar(30,40));
		
		
		
		
		
		
	}

}
