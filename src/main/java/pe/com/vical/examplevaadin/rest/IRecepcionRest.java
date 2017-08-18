package pe.com.vical.examplevaadin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/recepcion")
public interface IRecepcionRest {
	
	@GET
	@Path("/verificar")
	@Produces(MediaType.APPLICATION_JSON)
	public String verificarService(@QueryParam("argument") String argumento);

}
