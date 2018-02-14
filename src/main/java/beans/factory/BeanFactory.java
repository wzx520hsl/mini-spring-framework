package beans.factory;


import beans.BeanDefinition;

/**
 * @author Zixi Wang
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    public Object getBean(String beanName) throws Exception;

    /**
     * 注册bean
     * @param beanName  org.apache.kafka.xxx
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;
}
