package com.graalvm.graalvm;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GraalVMRestController}.
 */
public class GraalVMRestController__BeanDefinitions {
  /**
   * Get the bean definition for 'graalVMRestController'.
   */
  public static BeanDefinition getGraalVMRestControllerBeanDefinition() {
    Class<?> beanType = GraalVMRestController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(GraalVMRestController::new);
    return beanDefinition;
  }
}
