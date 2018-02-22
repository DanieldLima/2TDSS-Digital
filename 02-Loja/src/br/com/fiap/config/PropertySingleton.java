package br.com.fiap.config;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {
	
	private static final Logger log = LoggerFactory.getLogger(PropertySingleton.class);

	private static Properties p;
	
	private PropertySingleton() {}
	
	public static Properties getInstance() {
		if (p == null) {
			log.info("Carregando o arquivo de propriedade do sistema");
			p = new Properties();
			try {
				log.error("Arquivo de configuração não carregado");
				p.load(PropertySingleton.class
					.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		log.debug("Retornando as configurações do sistema");
		return p;
	}
	
}
