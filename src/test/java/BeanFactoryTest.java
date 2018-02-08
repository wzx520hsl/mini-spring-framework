import beans.BeanDefinition;
import beans.factory.AutowireCapableBeanFactory;
import beans.factory.BeanFactory;
import org.junit.Test;

/**
 * @author limengyu
 * @create 2017/12/29
 */
public class BeanFactoryTest {

    @Test
    public void getBeanTest(){
        //构建bean容器
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("UserServiceImpl");
        beanFactory.registerBean("user",beanDefinition);
        //获取bean
        UserServiceImpl user = (UserServiceImpl)beanFactory.getBean("user");
        user.say();
    }
}
