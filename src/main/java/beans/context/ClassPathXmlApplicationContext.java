package beans.context;




import beans.BeanDefinition;
import beans.factory.AbstractBeanFactory;
import beans.factory.AutowireCapableBeanFactory;
import beans.io.ResourceLoader;
import beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author Zixi Wang
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

	private String configLocation;

	public ClassPathXmlApplicationContext(String configLocation) throws Exception {
		this(configLocation, new AutowireCapableBeanFactory());
	}

	public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
		super(beanFactory);
		this.configLocation = configLocation;
		refresh();
	}

	@Override
	public void refresh() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
		for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
			beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}
	}


	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception {

	}
}
