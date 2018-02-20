package aop;

import java.lang.reflect.Method;

/**
 * @author Zixi
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);
}
