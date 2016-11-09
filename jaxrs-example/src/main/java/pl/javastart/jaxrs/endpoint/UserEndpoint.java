package pl.javastart.jaxrs.endpoint;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.javastart.jaxrs.model.User;

@Path("/users")
public class UserEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAll() {
        List<User> users = Arrays.asList(
                new User("jankowal1", "jankowal1@gmail.com"),
                new User("alamak", "jankowal1@tlen.pl"),
                new User("karolak", "karolak@uu1.com")
                );
        return users;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(User user) {
        System.out.println(user);
        return Response.ok().build();
    }
}
