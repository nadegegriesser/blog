package de.griesser.rest.services;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import de.griesser.rest.resources.PersonResource;

@Path("/persons")
public interface PersonService {

	@GET
	@Produces(APPLICATION_JSON)
	Collection<PersonResource> getAll();

	@GET
	@Path("/{id}")
	@Produces(APPLICATION_JSON)
	PersonResource get(@PathParam(value = "id") String id);

	@POST
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	PersonResource create(PersonResource person);

	@PUT
	@Path("/{id}")
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	PersonResource update(@PathParam(value = "id") String id, PersonResource person);

	@DELETE
	@Path("/{id}")
	void delete(@PathParam(value = "id") String id);

}
