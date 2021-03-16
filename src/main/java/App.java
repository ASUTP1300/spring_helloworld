import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean11 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean12 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean21 =
                (Cat) applicationContext.getBean("cat");
        Cat bean22 =
                (Cat) applicationContext.getBean("cat");
        System.out.println((bean11 == bean12) + "\tBins of HW");
        System.out.println((bean21 == bean22) + "\tBins of Cat");
        System.out.println(bean12.getMessage());
        System.out.println(bean22.getName());
    }
}
