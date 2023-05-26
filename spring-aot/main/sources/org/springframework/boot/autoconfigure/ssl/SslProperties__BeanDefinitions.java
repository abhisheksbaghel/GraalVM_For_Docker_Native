package org.springframework.boot.autoconfigure.ssl;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SslProperties}.
 */
public class SslProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'sslProperties'.
   */
  public static BeanDefinition getSslPropertiesBeanDefinition() {
    Class<?> beanType = SslProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SslProperties::new);
    return beanDefinition;
  }
}
