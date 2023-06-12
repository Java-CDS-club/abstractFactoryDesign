package pac;

public class Test {

	public static void main(String[] args) throws Exception {
		//instanciation statique
		AbstractFactory factory= new FactoryImplA();
		AbstractPlugin plugin=factory.getInstance();
		plugin.traitement();
		
		
		//instanciation dynamique
		AbstractFactory factory2= (AbstractFactory) Class.forName("pac.FactoryImplB").newInstance(); //charger une class
		AbstractPlugin plugin2=factory2.getInstance();
		plugin2.traitement();
	}

}
