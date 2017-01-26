## FACTFinder Json parser

This project is a simple ObjectModel of the response's from FACTFinder. We parse the response with [Gson](https://github.com/google/gson)

# How to use
Just create a FactFinderParser Object and give it the JSON String and which Service response to parse.  

```
	String json = "...";
	FactFinderParser parser = new FactFinderGsonParser();
	SearchResponse searchResult = (SearchResponse) parser.parse(json, FactFinderGsonParser.SERVICE_SEARCH);
	//work with searchResult...
	String jsonAgain =	parser.asJson(parse);
```

For the following Service there are Response Classes defined:

 	SearchResponse.class;
	SuggestResponse.class;
	RecommendationResponse.class;
	SimilarRecordsResponse.class;
	ProductCampaignResponse.class;
	
You can quickly accsess them with the static constants in the FactFinderParser for example:

`FactFinderParser.SERVICE_SEARCH`

## Service detection
 In combination with the [Helper SDK](https://github.com/FACT-Finder/ff-wc-helper-sdk) for the FACTFinder Webcomponents you can quickly find the right service of each request:
 
 ```
	private HelperSDK				sdk 	=	new HelperSDK(settings);
    private FactFinderParser 		parser 	= 	new FactFinderGsonParser();
  
  	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  	
  	sdk.copyHeaders(req, resp);
  	FFService service = sdk.extractService(req);
  	String json = sdk.sendRequest(req).getData();
  	Class<?> serviceClass = parser.getServiceResponseClass(service.name());
  	SearchResponse searchResult = (SearchResponse) parser.parse(json,serviceClass);
  	//work with searchResult...
  	}
  	
```

## Customize parsing
If you want to cutomize the parsing setting you can just initialize the  FactFinderGsonParser with a 'Gson' Object:

```
	GsonBuilder builder = new GsonBuilder()
	builder.serializeNulls();
	//builder.setSomeOtherSettings
	Gson gson = builder.create()
	FactFinderParser parser = FactFinderGsonParser(gson);
```

