package sistemaSmartTv;

public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();
		
		
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
