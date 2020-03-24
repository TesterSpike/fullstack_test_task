package page;

import model.People;

import static common.EnvironmentVariables.baseUrl;

public class PeoplePage extends BasePage {

    public People GET() {
        return request.get(baseUrl + "/people").as(People.class);
    }
}
