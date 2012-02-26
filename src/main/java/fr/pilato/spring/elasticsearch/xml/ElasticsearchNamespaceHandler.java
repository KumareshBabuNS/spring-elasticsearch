package fr.pilato.spring.elasticsearch.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ElasticsearchNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		// registerBeanDefinitionParser("client", new DatabaseBeanDefinitionParser());
		registerBeanDefinitionParser("node", new NodeBeanDefinitionParser());
	}

}
