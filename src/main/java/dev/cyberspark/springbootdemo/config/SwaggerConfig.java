package dev.cyberspark.springbootdemo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import io.swagger.v3.oas.models.OpenAPI;
import java.util.Arrays;


@Configuration
public class SwaggerConfig {


//    @Bean
//    public OpenAPI springDocOpenAPI() {
//        return (new OpenAPI()).info((new Info()).title("Fleet Configurator API").description("Fleet Configurator API endpoints - providing data for UI")).components((new Components()).addSecuritySchemes("spring_oauth", (new SecurityScheme()).type(Type.OAUTH2).description("Oauth2 flow").flows((new OAuthFlows()).authorizationCode((new OAuthFlow()).authorizationUrl(this.authUrl).refreshUrl(this.tokenUrl).tokenUrl(this.tokenUrl).scopes(new Scopes())))).addSecuritySchemes("api_key", (new SecurityScheme()).type(Type.APIKEY).description("Api Key access").in(In.HEADER).name("API-KEY")).addSecuritySchemes("basic_auth", (new SecurityScheme()).type(Type.HTTP).scheme("basic"))).security(Arrays.asList((new SecurityRequirement()).addList("spring_oauth"), (new SecurityRequirement()).addList("basic_auth"), (new SecurityRequirement()).addList("api_key")));
//    }

}
