## Run tests
With a specified url  
*gradlew test --tests "DarthVaderTest" -PbaseUrl="https://swapi.co/api"*  
Defaults to "https://swapi.co/api" if none is provided  
*gradlew test --tests "DarthVaderTest"*

## Tech
| Tech | Reason |
| ---- | ------ |
| Rest-Assured | Business standard Java library for making API calls|
| GSON | A lightweight JSON handler for Java.  Good general use handler that needs less code for simple POJO.  |


## Changes to the API
Generally the API is behaving adequately but for ease of use I would ask that they add 
the entity id to the results list so that it is easier to go from the results to the 
full entity details.

If they wanted to keep the payload size small they could replace the results with just the 
entity name and id or api call.  The downside is that the responsiveness would be reduced as 
multiple API calls would need to be made. However this could be mitigated with a 'lastUpdate' 
field so the record could be cached on the device.

```json
{
"results": [{
    "name": "Darth Vader",
    "id": 4,
    "url": "/people/4",
    "lastUpdate": "18/03/2020"     
  }]
}
```

A swagger or openapi specification would be useful as well so that devs who want to use the API 
would know what the shape of the API is and can make informed decisions about how to code their own 
apps.