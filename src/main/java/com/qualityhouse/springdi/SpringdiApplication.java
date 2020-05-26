package com.qualityhouse.springdi;

import com.qualityhouse.springdi.beans.Planet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);

		CommandLineStartupRunner clsr = ctx.getBean(CommandLineStartupRunner.class);

		String[] planetNames = clsr.getPlanetNames();
		Planet[] planets = new Planet[planetNames.length];

		for (int i = 0; i < planets.length; i++) {
			planets[i] = ctx.getBean(Planet.class);
			planets[i].setName(planetNames[i]);
		}

		// check names
		for (Planet planet : planets) {
			System.out.println(planet);
		}
	}

}
