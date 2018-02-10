import beans.BeanDefinition;
import beans.PropertyValue;
import beans.PropertyValues;
import beans.factory.AutowireCapableBeanFactory;
import beans.factory.BeanFactory;
import org.junit.Test;

/**
 * @author limengyu
 * @create 2017/12/29
 */
public class BeanFactoryTest {

    @Test
    public void getBeanTest() throws Exception {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("HelloWorldService");

        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成bean
        beanFactory.registerBean("helloWorldService", beanDefinition);

        // 5.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
