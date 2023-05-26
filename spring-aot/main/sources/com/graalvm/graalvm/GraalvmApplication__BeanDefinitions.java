package com.graalvm.graalvm;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link GraalvmApplication}.
 */
public class GraalvmApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'graalvmApplication'.
   */
  public static BeanDefinition getGraalvmApplicationBeanDefinition() {
    Class<?> beanType = GraalvmApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(GraalvmApplication.class);
    beanDefinition.setInstanceSupplier(GraalvmApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
