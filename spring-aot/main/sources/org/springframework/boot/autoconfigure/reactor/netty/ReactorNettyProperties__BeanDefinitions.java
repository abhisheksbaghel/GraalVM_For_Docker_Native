package org.springframework.boot.autoconfigure.reactor.netty;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReactorNettyProperties}.
 */
public class ReactorNettyProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'reactorNettyProperties'.
   */
  public static BeanDefinition getReactorNettyPropertiesBeanDefinition() {
    Class<?> beanType = ReactorNettyProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ReactorNettyProperties::new);
    return beanDefinition;
  }
}
