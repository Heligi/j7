package workshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PetclinicConfig.class);
        Menu menu = context.getBean(Menu.class);
        menu.start();
        context.registerShutdownHook();


    }
}

