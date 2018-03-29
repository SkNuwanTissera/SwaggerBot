/**
 * Created by Sk
 */
import io.swagger.parser.SwaggerParser;
import io.swagger.models.Swagger;

public class SwaggerParser {

    public static void main(String [] args){
        Swagger parser = new SwaggerParser().read("http://petstore.swagger.io/v2/swagger.json");

        //You can read from a file location as well:
        //Swagger swagger = new SwaggerParser().read("./path/to/swagger.json");

        //swagger-compat-spec-parser module, you can read older formats, and convert them into swagger 2.0:
        //Swagger swagger = new SwaggerCompatConverter().read("http://petstore.swagger.io/api/api-docs");

        String swaggerString = Json.pretty(swagger);



    }

}
