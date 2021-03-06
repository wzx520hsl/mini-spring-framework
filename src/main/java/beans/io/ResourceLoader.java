package beans.io;

import java.net.URL;

/**
 * @author Zixi Wang
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
