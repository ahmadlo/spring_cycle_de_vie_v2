package com.objis.demo;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Configuration
public class ApplicationAnnotationConfig {

	private static final Logger LOGGER = Logger.getLogger(ApplicationAnnotationConfig.class);

	public static void main(String[] args) {

		////////////////////////////////////////////////
		// (01.) CHARGER LE CONTEXTE DE L'APPLICATION
		//       -> A partir du fichier de dï¿½finition de beans
		////////////////////////////////////////////////
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SocieteDevLogicielConfig.class);

		////////////////////////////////////////////////
		// (02.) RECUPERER UN BEAN
		//       -> A partir du contexte de l'application
		////////////////////////////////////////////////
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean(SocieteDevLogiciel.class);

		////////////////////////////////////////////////
		// (03.) EXTRAIRE LES PROPRIETES DU BEAN
		////////////////////////////////////////////////
		Developpeur devDebutant = societe.getDeveloppeurDebutant();
		Developpeur chefDev = societe.getChefDeveloppeur();

		////////////////////////////////////////////////
		// (04.) AFFICHER LES PROPRIETES DU BEAN
		////////////////////////////////////////////////
		LOGGER.info("+-------------+------------------------------+");
		LOGGER.info("| NOM DU BEAN | VALEUR DU BEAN               |");
		LOGGER.info("+-------------+------------------------------+");
		LOGGER.info("| devDebutant | " + devDebutant);
		LOGGER.info("| chefDev     | " + chefDev);
		LOGGER.info("+-------------+------------------------------+");
		
////////////////////////////////////////////////
//(05.) Libérer Le Contexte
////////////////////////////////////////////////
((AbstractApplicationContext) appContext).registerShutdownHook();
	}

}
