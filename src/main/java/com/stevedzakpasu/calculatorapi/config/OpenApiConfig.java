package com.stevedzakpasu.calculatorapi.config;


import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
/**
 * This class is used to configure the OpenAPI documentation for the Calculator API.
 */
@OpenAPIDefinition(info = @Info(title = "Calculator API", version = "1.0", description = "Calculator API"), servers = {
   @Server( url = "http://3.132.216.26", description = "Deployed server") })
public class OpenApiConfig {
}
