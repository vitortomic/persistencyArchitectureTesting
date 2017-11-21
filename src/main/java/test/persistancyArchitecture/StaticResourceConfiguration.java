package test.persistancyArchitecture;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author vitor.tomic
 *
 */
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/" };
	/*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
            .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }*/
}
