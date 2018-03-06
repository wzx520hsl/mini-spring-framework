package aop;

/**
 * @author Zixi Wang
 */
public interface PointcutAdvisor extends Advisor{

   Pointcut getPointcut();

}
