/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
*
* @author Conor Ward
*/
@Path("/w")
public class ProxyWeather {

@GET
@Path("/{city}")
@Produces (MediaType.APPLICATION_JSON)
public Response getWeatherData(@PathParam("city") String city) {

String URL = "http://api.openweathermap.org/data/2.5/weather?q=" +city+ "&mode=json&appid=5b63c828fb64fe38943bc6654f1a522c";
Client c = ClientBuilder.newClient();
Response r = c.target(URL).request().get();
return r;
}
}

















