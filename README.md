## Java FACTFinder Domain Model

This project is a simple Java Domain Object Model of the response's from a FACTFinder Service. We parse the response with [Gson](https://github.com/google/gson) for easy use in your projects.

# How to use
Just create a FactFinderParser Object and give it the JSON String and which Service response to parse.  

```java
	String json = "...";//form the FactFinder response
	FactFinderParser parser = new FactFinderGsonParser();
	SearchResponse searchResult = (SearchResponse) parser.parse(json, FactFinderGsonParser.SERVICE_SEARCH);
	//work with searchResult...
	String jsonAgain =	parser.asJson(parse);
```

We have Response classes for all the suported FACTFinder services: 

```java
 	SearchResponse.class;
	SuggestResponse.class;
	RecommendationResponse.class;
	SimilarRecordsResponse.class;
	ProductCampaignResponse.class;
```

You can quickly access them with the static constants in the FactFinderParser, for example:

```java
	FactFinderParser.SERVICE_SEARCH
```

## Service detection
 In combination with the [java-proxy-utils](https://github.com/FACT-Finder-Web-Components/java-proxy-utils) project, you can quickly find the right service of each request:
 
 ```java
	private ProxyUtils				utils 	=	new ProxyUtils(settings);
    private FactFinderParser 		parser 	= 	new FactFinderGsonParser();
  
  	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  	
  	utils.copyHeaders(req, resp);
  	FACTFinderService service = utils.extractService(req);
  	String json = utils.sendRequest(req).getData();
  	Class<?> serviceClass = parser.getServiceResponseClass(service.name());
  	SearchResponse searchResult = (SearchResponse) parser.parse(json,serviceClass);
  	//work with searchResult...
  	}
  	
```

## Customize parsing
If you want to customize the parsing settings, you can just initialize the  FactFinderGsonParser with a 'Gson' Object:

```java
	GsonBuilder builder = new GsonBuilder()
	builder.serializeNulls();
	//builder.setSomeOtherSettings...
	Gson gson = builder.create()
	FactFinderParser parser = FactFinderGsonParser(gson);
```

## JSON Schema (optional)
In the **/src/main/resources** folder are all the JSON schema files the FACTFinder services. If you want you can generate some POJO's from them with the **jsonschema2pojo-maven-plugin** which is commented in the pom.xml
Just uncomment hte plugin and the two dependencie's **commons-lang** and  **jackson-databind** and run maven with:

`mvn generate`

You can define where the generated POJO's are located in the plugin configuration. For more info see: [jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo)

