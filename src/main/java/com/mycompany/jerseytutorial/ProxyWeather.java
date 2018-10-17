/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam; 
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
/**
*
* @author Conor Ward
*/
@Path("/geocode")
public class ProxyWeather {
@GET
@Path("/{param}") 
public Response GetGeocodeInfo(@PathParam("param") String city) {
String URL = "http://maps.googleapis.com/maps/api/geocode/json?address="+city;
Client c = ClientBuilder.newClient();
Response r = c.target(URL).request().get();
return r;
} 
}


