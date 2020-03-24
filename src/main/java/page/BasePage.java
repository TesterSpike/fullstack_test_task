package page;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BasePage {
    final RequestSpecification request;

    public BasePage() {
        request = RestAssured.with().log().uri().accept("application/json");
    }
}
