package aop;


import beans.factory.BeanFactory;

/**
 * @author Zixi Wang
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
