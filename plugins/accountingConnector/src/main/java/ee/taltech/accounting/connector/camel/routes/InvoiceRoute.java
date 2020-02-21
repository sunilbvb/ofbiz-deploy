package ee.taltech.accounting.connector.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public class InvoiceRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration("rest-api")
                .component("restlet")
                .host("localhost")
                //.port("9000")
                .bindingMode(RestBindingMode.auto);

        rest("/api/test")
                .get()
                .to("direct:./hello");
    }
}
