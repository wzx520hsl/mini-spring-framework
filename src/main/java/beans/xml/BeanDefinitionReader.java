package beans.xml;

/**
 * 从配置中读取BeanDefinitionReader
 * @author Zixi Wang
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
