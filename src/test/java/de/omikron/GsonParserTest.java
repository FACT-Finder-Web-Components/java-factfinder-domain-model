package de.omikron;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.codahale.metrics.Timer.Context;

import de.factfinder.FactFinderGsonParser;
import de.factfinder.FactFinderParser;
import de.factfinder.services.SearchResponse;

public class GsonParserTest {

	static final MetricRegistry metrics = new MetricRegistry();

	// @Test
	public void testSearchResult() throws IOException, URISyntaxException {
		String file = "searchResult.json";
		URL url = this.getClass().getResource(file);
		byte[] readAllBytes = Files.readAllBytes(Paths.get(url.toURI()));
		System.out.println(file + " size(byte's): " + readAllBytes.length);
		String json = new String(readAllBytes);
		FactFinderParser parser = new FactFinderGsonParser();

		final ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).convertRatesTo(TimeUnit.SECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS).build();
		int testTime = 1000 * 10;// 10 sec
		try {
			Timer timer = metrics.timer("parse");
			long end = System.currentTimeMillis() + testTime;
			while (System.currentTimeMillis() < end) {
				Context time = timer.time();
				SearchResponse parse = (SearchResponse) parser.parse(json, FactFinderGsonParser.SERVICE_SEARCH);
				parser.asJson(parse);
				time.stop();
			}
			reporter.report();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception");
		}
	}

	// @Test
	public void testBigSearchResult() throws IOException, URISyntaxException {
		String file = "searchResultNavigation.json";
		URL url = this.getClass().getResource(file);
		byte[] readAllBytes = Files.readAllBytes(Paths.get(url.toURI()));
		System.out.println(file + " size(byte's): " + readAllBytes.length);
		String json = new String(readAllBytes);
		FactFinderParser parser = new FactFinderGsonParser();
		int testTime = 1000 * 10;// 10 sec
		try {
			final ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).convertRatesTo(TimeUnit.SECONDS)
					.convertDurationsTo(TimeUnit.MILLISECONDS).build();
			Timer timer = metrics.timer("parse big");
			long end = System.currentTimeMillis() + testTime;
			while (System.currentTimeMillis() < end) {
				Context time = timer.time();
				SearchResponse parse = (SearchResponse) parser.parse(json, FactFinderGsonParser.SERVICE_SEARCH);
				parser.asJson(parse);
				time.stop();
			}
			reporter.report();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception");
		}
	}

	@Test
	public void testGenericParsing() throws IOException, URISyntaxException {
		String file = "searchResult.json";
		URL url = this.getClass().getResource(file);
		byte[] readAllBytes = Files.readAllBytes(Paths.get(url.toURI()));
		System.out.println(file + " size(byte's): " + readAllBytes.length);
		String json = new String(readAllBytes);
		FactFinderParser parser = new FactFinderGsonParser();

		try {
			SearchResponse parse = (SearchResponse) parser.parse(json, FactFinderGsonParser.SERVICE_SEARCH);
			parser.asJson(parse);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception");
		}
	}

}
