package org.upskilling.schoolmanagement;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SchoolManagementResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/students")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}