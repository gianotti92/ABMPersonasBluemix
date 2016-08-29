package ar.com.lucas.bluemixdb;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;





@Path("personal")
public class PersonaResource {
	CloudantDBSingleton cloudant = CloudantDBSingleton.getInstance();
	Database db = cloudant.getDatabase();
	
	
	 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("dame")
	public List<Persona> getPersona(){
		return db.findByIndex("\"selector\": { \"_id\": { \"$gt\": 0} }", Persona.class);	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("dame/{personaId}")
	public Persona getById(@PathParam("personaId") String id){
		return db.findByIndex("\"selector\": { \"nombre\": \""+id+"\"}",Persona.class).get(0);		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("tedoy")
	public Persona add(Persona p){
		db.post(p);
		return p;
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("modifi/{nombre}")
	public Persona update(Persona p){	 
		db.update(p);
		 return p;
		
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("teborro/{nombre}")
	public Persona delete(Persona persona){
		db.remove(persona);
	return persona;
	
	}
	
	
		
	
	

	
}
