import Presentation.ClientController;
import model.CarteFidelio;
import model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class applicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) ctx.getBean("cont1");

        Client client = new Client("OMAR");
        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctrl.save(client);
    }

}
