package org.springframework.boot.autoconfigure.web.reactive.function.client;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.client.reactive.ReactorResourceFactory;

/**
 * Bean definitions for {@link ClientHttpConnectorFactoryConfiguration}.
 */
public class ClientHttpConnectorFactoryConfiguration__BeanDefinitions {
  /**
   * Bean definitions for {@link ClientHttpConnectorFactoryConfiguration.ReactorNetty}.
   */
  public static class ReactorNetty {
    /**
     * Get the bean definition for 'reactorNetty'.
     */
    public static BeanDefinition getReactorNettyBeanDefinition() {
      Class<?> beanType = ClientHttpConnectorFactoryConfiguration.ReactorNetty.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ClientHttpConnectorFactoryConfiguration.ReactorNetty::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'reactorClientHttpConnectorFactory'.
     */
    private static BeanInstanceSupplier<ReactorClientHttpConnectorFactory> getReactorClientHttpConnectorFactoryInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ReactorClientHttpConnectorFactory>forFactoryMethod(ClientHttpConnectorFactoryConfiguration.ReactorNetty.class, "reactorClientHttpConnectorFactory", ReactorResourceFactory.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ClientHttpConnectorFactoryConfiguration.ReactorNetty.class).reactorClientHttpConnectorFactory(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'reactorClientHttpConnectorFactory'.
     */
    public static BeanDefinition getReactorClientHttpConnectorFactoryBeanDefinition() {
      Class<?> beanType = ReactorClientHttpConnectorFactory.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getReactorClientHttpConnectorFactoryInstanceSupplier());
      return beanDefinition;
    }
  }
}
